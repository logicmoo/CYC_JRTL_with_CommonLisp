/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.assertion_handles.assertion_p;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg_position;
import static com.cyc.cycjava.cycl.el_utilities.term_occurs_as_formula_argument;
import static com.cyc.cycjava.cycl.formula_pattern_match.formula_matches_pattern;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.lexicon_utilities.language_of_lexicon;
import static com.cyc.cycjava.cycl.pph_drs.pph_discourse_context_copy;
import static com.cyc.cycjava.cycl.pph_drs.pph_discourse_context_rms;
import static com.cyc.cycjava.cycl.pph_drs.pph_discourse_number_for_cycl;
import static com.cyc.cycjava.cycl.pph_drs.pph_discourse_person_for_cycl;
import static com.cyc.cycjava.cycl.pph_drs.pph_discourse_referentP;
import static com.cyc.cycjava.cycl.pph_drs.pph_ensure_rms_are_in_discourse_context;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_element_list;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.set.set_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_downcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.rem;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 * module:      PPH-METHODS
 * source file: /cyc/top/cycl/pph-methods.lisp
 * created:     2019/07/03 17:38:20
 */
public final class pph_methods extends SubLTranslatedFile implements V12 {
    /**
     * Set up ordered list of namestring predicates to check
     */
    @LispMethod(comment = "Set up ordered list of namestring predicates to check")
    public static final SubLObject init_pph_name_string_preds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    pph_vars.$pph_name_string_preds$.setDynamicValue(remove($$preferredNameString, delete_duplicates(append(isa.all_fort_instances($$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED), genl_predicates.all_spec_preds($$nameString, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    {
                        SubLObject dispreferred_name_string_preds = nconc(list_utilities.fast_set_difference(pph_vars.$pph_name_string_preds$.getDynamicValue(thread), isa.all_fort_instances($$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED), UNPROVIDED), $dispreferred_pph_name_string_preds$.getGlobalValue());
                        pph_vars.$pph_name_string_preds$.setDynamicValue(list_utilities.delete_if_not($sym220$VALID_CONSTANT_, delete_if($sym194$HL_PROTOTYPICAL_INSTANCE_, set_difference(pph_vars.$pph_name_string_preds$.getDynamicValue(thread), dispreferred_name_string_preds, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    }
                    pph_vars.$pph_name_string_preds$.setDynamicValue(cons($$preferredNameString, pph_vars.$pph_name_string_preds$.getDynamicValue(thread)), thread);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    /**
     * Generate an appropriate string for the term #$True.
     */
    @LispMethod(comment = "Generate an appropriate string for the term #$True.")
    public static final SubLObject generate_true(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = $$$some_statement_in_the_KB_is_true;
                if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                    string = pph_html.string_term_anchor(string, $$True);
                }
                pph_phrase.pph_phrase_set_string(phrase, string);
            }
            return phrase;
        }
    }

    /**
     * Try to paraphrase a NART based on good lexifications for its args.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on good lexifications for its args.")
    public static final SubLObject generate_nart_as_naut_tight(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(TWO_INTEGER)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt89$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt90$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(TWO_INTEGER), new SubLObject[]{ $str_alt158$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                try {
                    pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
                    com.cyc.cycjava.cycl.pph_methods.generate_nart_as_naut(phrase);
                } finally {
                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                }
            }
            return phrase;
        }
    }

    /**
     * Generate an appropriate string for the term #$False.
     */
    @LispMethod(comment = "Generate an appropriate string for the term #$False.")
    public static final SubLObject generate_false(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = $$$some_statement_in_the_KB_is_false;
                if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                    string = pph_html.string_term_anchor(string, $$False);
                }
                pph_phrase.pph_phrase_set_string(phrase, string);
            }
            return phrase;
        }
    }

    static private final SubLString $str_alt266$ = makeString("");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_term_string_preds$ = makeSymbol("*PPH-TERM-STRING-PREDS*");

    public static final SubLFile me = new pph_methods();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $generate_skolem_ids$ = makeSymbol("*GENERATE-SKOLEM-IDS*");

    // defparameter
    /**
     * NIL or POSITIVE-INTEGER-P; We don't back off to collections that have at
     * least this many faceting collections.
     */
    @LispMethod(comment = "NIL or POSITIVE-INTEGER-P; We don\'t back off to collections that have at\r\nleast this many faceting collections.\ndefparameter\nNIL or POSITIVE-INTEGER-P; We don\'t back off to collections that have at\nleast this many faceting collections.")
    public static final SubLSymbol $pph_facet_threshold$ = makeSymbol("*PPH-FACET-THRESHOLD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pph_assume_distinct_vars_require_different_bindingsP$ = makeSymbol("*PPH-ASSUME-DISTINCT-VARS-REQUIRE-DIFFERENT-BINDINGS?*");

    // defparameter
    /**
     * *SELECT-STRING-METHODS* is an ordered list of function names. The functions
     * are tried in sequence. Each returns a list: (<string>|NIL <pos-pred>|NIL).
     */
    @LispMethod(comment = "*SELECT-STRING-METHODS* is an ordered list of function names. The functions\r\nare tried in sequence. Each returns a list: (<string>|NIL <pos-pred>|NIL).\ndefparameter\n*SELECT-STRING-METHODS* is an ordered list of function names. The functions\nare tried in sequence. Each returns a list: (<string>|NIL <pos-pred>|NIL).")
    private static final SubLSymbol $select_string_methods$ = makeSymbol("*SELECT-STRING-METHODS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $dispreferred_pph_name_string_preds$ = makeSymbol("*DISPREFERRED-PPH-NAME-STRING-PREDS*");

    // deflexical
    /**
     * English paraphrases for integers under 20. Not in KB due to lack of indexing
     * for numbers, and to avoid requiring the lexicon for this.
     */
    @LispMethod(comment = "English paraphrases for integers under 20. Not in KB due to lack of indexing\r\nfor numbers, and to avoid requiring the lexicon for this.\ndeflexical\nEnglish paraphrases for integers under 20. Not in KB due to lack of indexing\nfor numbers, and to avoid requiring the lexicon for this.")
    private static final SubLSymbol $english_integer_paraphrases$ = makeSymbol("*ENGLISH-INTEGER-PARAPHRASES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $english_tens_paraphrases$ = makeSymbol("*ENGLISH-TENS-PARAPHRASES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ignore_misleading_time_parametersP$ = makeSymbol("*IGNORE-MISLEADING-TIME-PARAMETERS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bad_collections_for_genitive_paraphrase$ = makeSymbol("*BAD-COLLECTIONS-FOR-GENITIVE-PARAPHRASE*");

    // defparameter
    /**
     * Use the constant name broken apart into constituent words for generation of
     * instances of these
     */
    @LispMethod(comment = "Use the constant name broken apart into constituent words for generation of\r\ninstances of these\ndefparameter\nUse the constant name broken apart into constituent words for generation of\ninstances of these")
    private static final SubLSymbol $use_unlexified_form_for_instances$ = makeSymbol("*USE-UNLEXIFIED-FORM-FOR-INSTANCES*");

    // defparameter
    /**
     * Use the constant name broken apart into constituent words for generation of
     * these
     */
    @LispMethod(comment = "Use the constant name broken apart into constituent words for generation of\r\nthese\ndefparameter\nUse the constant name broken apart into constituent words for generation of\nthese")
    private static final SubLSymbol $use_unlexified_form$ = makeSymbol("*USE-UNLEXIFIED-FORM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $known_english_variants$ = makeSymbol("*KNOWN-ENGLISH-VARIANTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_default_grammatical_gender$ = makeSymbol("*PPH-DEFAULT-GRAMMATICAL-GENDER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GENERATE_CONSTANT_DEFAULT = makeSymbol("GENERATE-CONSTANT-DEFAULT");

    private static final SubLSymbol GENERATE_ATOMIC_FORMULA = makeSymbol("GENERATE-ATOMIC-FORMULA");

    private static final SubLSymbol GENERATE_CYCL_LIST = makeSymbol("GENERATE-CYCL-LIST");

    private static final SubLSymbol GENERATE_CYCL_VARIABLE = makeSymbol("GENERATE-CYCL-VARIABLE");

    private static final SubLSymbol GENERATE_NART_AS_NAUT = makeSymbol("GENERATE-NART-AS-NAUT");

    private static final SubLSymbol GENERATE_NART_LEXIFIED_IMPRECISE = makeSymbol("GENERATE-NART-LEXIFIED-IMPRECISE");

    private static final SubLSymbol GENERATE_NART_LEXIFIED_TIGHT = makeSymbol("GENERATE-NART-LEXIFIED-TIGHT");

    private static final SubLSymbol GENERATE_PHRASE_FROM_TEMPLATE = makeSymbol("GENERATE-PHRASE-FROM-TEMPLATE");

    private static final SubLSymbol GENERATE_STRING = makeSymbol("GENERATE-STRING");

    private static final SubLSymbol GENERATE_SKOLEM_TERM_WITH_NAME = makeSymbol("GENERATE-SKOLEM-TERM-WITH-NAME");



    private static final SubLSymbol GENERATE_SKOLEM_NAME = makeSymbol("GENERATE-SKOLEM-NAME");





    private static final SubLString $$$Object = makeString("Object");

    private static final SubLList $list19 = list(reader_make_constant_shell("singular"), reader_make_constant_shell("massNumber"));

    private static final SubLString $str20$_ = makeString("-");

    private static final SubLSymbol $generate_skolem_name_caching_state$ = makeSymbol("*GENERATE-SKOLEM-NAME-CACHING-STATE*");

    private static final SubLSymbol GENERATE_SKOLEM_TERM_EXISTENTIALLY = makeSymbol("GENERATE-SKOLEM-TERM-EXISTENTIALLY");

    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell("nonPlural-Generic");

    private static final SubLSymbol $sym25$_X = makeSymbol("?X");

    private static final SubLSymbol $sym26$TOU_ATOMIC_SENTENCE_ = makeSymbol("TOU-ATOMIC-SENTENCE?");

    private static final SubLList $list27 = list(makeSymbol("HL-VAR"), makeSymbol("NAUT"));

    private static final SubLSymbol NAT_FUNCTION = makeSymbol("NAT-FUNCTION");

    private static final SubLList $list29 = list(makeKeyword("MODES"), list(reader_make_constant_shell("ReformulatorMode-Tersify")));





    private static final SubLSymbol GENERATE_HYPOTHETICAL = makeSymbol("GENERATE-HYPOTHETICAL");

    private static final SubLSymbol NAME_STRING_METHOD = makeSymbol("NAME-STRING-METHOD");

    private static final SubLObject $$singular_Generic = reader_make_constant_shell("singular-Generic");

    private static final SubLList $list40 = cons(makeSymbol("FROM-PREFIX"), makeSymbol("TO-PREFIX"));

    private static final SubLObject $$Instance_TheWord = reader_make_constant_shell("Instance-TheWord");



    private static final SubLString $$$instance = makeString("instance");

    private static final SubLString $$$_of = makeString(" of");

    private static final SubLString $$$some = makeString("some");

    private static final SubLString $$$every = makeString("every");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $$$any = makeString("any");

    private static final SubLSymbol $sym52$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");

    private static final SubLString $str53$__Paraphrasing__S_as__S_in_contex = makeString("~&Paraphrasing ~S as ~S in context ~S.~%");



    private static final SubLList $list55 = list(reader_make_constant_shell("PhraseFn"), reader_make_constant_shell("Determiner"));

    private static final SubLSymbol PPH_NBAR_CYCL_TEMPLATE_FOR_TERM_TYPE = makeSymbol("PPH-NBAR-CYCL-TEMPLATE-FOR-TERM-TYPE");

    private static final SubLSymbol PPH_DETP_CYCL_TEMPLATE_FOR_TERM_TYPE = makeSymbol("PPH-DETP-CYCL-TEMPLATE-FOR-TERM-TYPE");

    private static final SubLSymbol PPH_NP_CYCL_TEMPLATE_FOR_TERM_TYPE = makeSymbol("PPH-NP-CYCL-TEMPLATE-FOR-TERM-TYPE");



    private static final SubLString $str60$Can_t_reconcile__S_with__S = makeString("Can't reconcile ~S with ~S");



    private static final SubLSymbol $sym62$_TG = makeSymbol("?TG");



    private static final SubLList $list64 = list(makeSymbol("?TG"));

    private static final SubLSymbol $sym65$PPH_GENL_ = makeSymbol("PPH-GENL?");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str73$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str78$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str80$Skipping__S_as_too_highly_faceted = makeString("Skipping ~S as too highly faceted (threshold = ~S).");

    private static final SubLString $str81$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str82$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str83$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol DETERMINER_TYPE_FOR_VAR_PHRASE = makeSymbol("DETERMINER-TYPE-FOR-VAR-PHRASE");

    private static final SubLList $list88 = list($CODE, makeSymbol("UNIVERSAL-INTRODUCTION"), list($BIND, makeSymbol("VARS")));

    private static final SubLString $str90$Bound_by_universal_introduction__ = makeString("Bound by universal introduction: ~S");

    private static final SubLString $$$if = makeString("if");

    private static final SubLSymbol $FOUND_VAR_DTR = makeKeyword("FOUND-VAR-DTR");

    private static final SubLString $str95$_ = makeString(",");

    private static final SubLString $str96$Arg_position__S_applied_to_top_le = makeString("Arg position ~S applied to top-level cycl ~S does not yield correct var ~S but rather ~S!~%*pph-cycls*: ~S~%");





    private static final SubLString $str99$Var__S_at_arg_position__S_in_cycl = makeString("Var ~S at arg-position ~S in cycl ~S not in non-veridical environment.~%");

    private static final SubLString $str100$Quantifier_for_var__S_not_found_i = makeString("Quantifier for var ~S not found in top-level cycl!~%");

    private static final SubLList $list101 = list(reader_make_constant_shell("implies"), reader_make_constant_shell("not"), reader_make_constant_shell("unknownSentence"));

    private static final SubLList $list102 = cons(makeSymbol("FIRST-ITEM"), makeSymbol("REST-ITEMS"));

    private static final SubLString $$$it = makeString("it");

    private static final SubLString $$$the = makeString("the");

    private static final SubLString $$$thing = makeString("thing");

    private static final SubLString $$$something = makeString("something");

    private static final SubLString $$$everything = makeString("everything");

    private static final SubLString $$$other = makeString("other");

    private static final SubLString $$$another = makeString("another");

    private static final SubLString $str110$Explicitifying__S = makeString("Explicitifying ~S");

    private static final SubLSymbol GENERATE_KEYWORD = makeSymbol("GENERATE-KEYWORD");

    private static final SubLSymbol GENERATE_CYCL_SYMBOL = makeSymbol("GENERATE-CYCL-SYMBOL");

    private static final SubLString $$$the_SubL_symbol_ = makeString("the SubL symbol ");

    private static final SubLSymbol GENERATE_NON_CYCL_SYMBOL = makeSymbol("GENERATE-NON-CYCL-SYMBOL");

    private static final SubLSymbol $NON_CYCL_SYMBOL = makeKeyword("NON-CYCL-SYMBOL");

    private static final SubLString $$$the_symbol_ = makeString("the symbol ");

    private static final SubLSymbol SCIENTIFIC_NAME_METHOD = makeSymbol("SCIENTIFIC-NAME-METHOD");

    private static final SubLString $str122$__Shadowing_discourse_context____ = makeString("~&Shadowing discourse context...~%");

    private static final SubLString $str124$__GENERATE_CONSTANT_DEFAULT__Tryi = makeString("~&GENERATE-CONSTANT-DEFAULT: Trying again with :ANY quality.~%");

    private static final SubLSymbol GENERATE_LEXICAL_WORD = makeSymbol("GENERATE-LEXICAL-WORD");

    private static final SubLString $str127$_TheWord = makeString("-TheWord");

    private static final SubLString $str128$_MWW = makeString("-MWW");

    private static final SubLString $str129$RKF_ = makeString("RKF-");



    private static final SubLString $$$the_word_ = makeString("the word ");



    static private final SubLList $list133 = list(makeSymbol("ELEMENT-LIST"), makeSymbol("QUANTITY-LIST"));



    private static final SubLList $list135 = list(reader_make_constant_shell("ElementalSubstanceFn"), $FORT);



    private static final SubLList $list137 = list(list(reader_make_constant_shell("TheList"), ONE_INTEGER));

    static private final SubLList $list138 = list(makeSymbol("?ELEMENTS"), makeSymbol("?QUANTITIES"));

    private static final SubLObject $$completeAtomicComposition_List = reader_make_constant_shell("completeAtomicComposition-List");



    private static final SubLSymbol $sym141$_CHARGE = makeSymbol("?CHARGE");



    private static final SubLList $list143 = list(makeSymbol("?CHARGE"));

    private static final SubLSymbol $sym144$_MOLECULE_TYPE = makeSymbol("?MOLECULE-TYPE");



    private static final SubLList $list146 = list(makeSymbol("?MOLECULE-TYPE"));



    private static final SubLSymbol $select_string_method_count$ = makeSymbol("*SELECT-STRING-METHOD-COUNT*");

    private static final SubLList $list150 = list(new SubLObject[]{ makeSymbol("LICENSED-DEFINITE-DESCRIPTION-METHOD"), makeSymbol("NL-GENERATION-CACHE-METHOD"), makeSymbol("GEN-PHRASE-METHOD"), makeSymbol("PREFERRED-GEN-UNIT-METHOD"), makeSymbol("PREFERRED-LEXIFICATION-METHOD"), makeSymbol("USE-AS-IS-METHOD"), makeSymbol("PREFER-UNLEXIFIED-FORM-METHOD"), makeSymbol("PASSED-PREDS-SUCCEED-METHOD"), makeSymbol("NAME-STRING-METHOD-NON-ACRONYM"), makeSymbol("CHEMICAL-FORMULA-METHOD"), cons(makeSymbol("DEMERITS"), TWO_INTEGER), makeSymbol("RDF-LABEL-METHOD"), makeSymbol("NOUN-FROM-ADJECTIVE-METHOD"), makeSymbol("NAME-STRING-METHOD"), makeSymbol("SCIENTIFIC-NAME-METHOD"), makeSymbol("ANY-NAME-STRING-METHOD"), makeSymbol("PRETTY-STRING-METHOD"), cons(makeSymbol("DEMERITS"), ONE_INTEGER), makeSymbol("ANY-PREDS-SUCCEED-METHOD"), makeSymbol("GENITIVE-PARAPHRASE-METHOD"), makeSymbol("COERCED-DEFINITE-DESCRIPTION-METHOD"), makeSymbol("TERM-STRING-METHOD"), cons(makeSymbol("DEMERITS"), ONE_INTEGER), makeSymbol("UNLEXIFIED-TERM-METHOD"), makeSymbol("COERCE-NAME-METHOD") });

    private static final SubLString $str151$__SELECT_STRING_METHOD__NL_PREDS_ = makeString("~&SELECT-STRING-METHOD: NL-PREDS is ~S.~%");

    private static final SubLString $str152$__SELECT_STRING_METHOD__Precision = makeString("~&SELECT-STRING-METHOD: Precision is ~S.~%");

    private static final SubLList $list153 = list(makeSymbol("GEN-STRING-ASSERTION-PRECISE-METHOD"));

    private static final SubLSymbol DEMERITS = makeSymbol("DEMERITS");

    private static final SubLString $str156$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLString $str157$Added__S_alternatives_for____S = makeString("Added ~S alternatives for~% ~S");

    private static final SubLString $str158$__SELECT_STRING_METHOD__the_funct = makeString("~&SELECT-STRING-METHOD: the function ~S returned NIL for ~S.~%");

    private static final SubLString $str159$PPH_timeout_time_reached_ = makeString("PPH timeout time reached.");

    private static final SubLSymbol SELECT_STRING_METHOD = makeSymbol("SELECT-STRING-METHOD");

    private static final SubLString $str166$__SELECT_STRING_METHOD__Calling__ = makeString("~&SELECT-STRING-METHOD: Calling ~S on ~S.~%");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_STRING = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");

    private static final SubLList $list168 = list(makeSymbol("STRING"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEMERITS"), ZERO_INTEGER), makeSymbol("JUSTIFICATION"));

    private static final SubLString $str169$__SELECT_STRING_METHOD__Function_ = makeString("~&SELECT-STRING-METHOD: Function ~S returned ~S.~%");





    private static final SubLString $$$the_ = makeString("the ");

    private static final SubLString $str174$Removing_determiner_to_form_Nbar_ = makeString("Removing determiner to form Nbar.");

    private static final SubLString $str175$Paraphrasing__S_as_an_NP_ = makeString("Paraphrasing ~S as an NP.");

    private static final SubLList $list176 = list(reader_make_constant_shell("nonSingular-Generic"), reader_make_constant_shell("properNameStrings"));

    private static final SubLList $list177 = list(reader_make_constant_shell("plural-Generic"));

    static private final SubLList $list178 = list(reader_make_constant_shell("singular-Generic"));

    static private final SubLList $list179 = list(reader_make_constant_shell("massNumber-Generic"));



    private static final SubLSymbol $sym181$PPH_SPEC_PREDICATE_ = makeSymbol("PPH-SPEC-PREDICATE?");

    private static final SubLString $str182$Adding___properNameStrings_to__S = makeString("Adding #$properNameStrings to ~S");

    private static final SubLSymbol $sym183$PPH_PRED_LICENSED_BY_PRED_ = makeSymbol("PPH-PRED-LICENSED-BY-PRED?");

    private static final SubLSymbol SELECT_STRING_FOR_TERM = makeSymbol("SELECT-STRING-FOR-TERM");

    private static final SubLString $str186$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str187$__ = makeString(") ");

    private static final SubLString $str188$Trying_to_paraphrase__S_with_no_N = makeString("Trying to paraphrase ~S with no NL preds.");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol PPH_NAME_STRING_PREDS = makeSymbol("PPH-NAME-STRING-PREDS");



    private static final SubLObject $$ProperNamePredicate_Strict = reader_make_constant_shell("ProperNamePredicate-Strict");

    private static final SubLSymbol $sym194$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol $sym195$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    private static final SubLSymbol $pph_name_string_preds_caching_state$ = makeSymbol("*PPH-NAME-STRING-PREDS-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol CLEAR_PPH_NAME_STRING_PREDS = makeSymbol("CLEAR-PPH-NAME-STRING-PREDS");

    private static final SubLSymbol PPH_TERM_STRING_PREDS = makeSymbol("PPH-TERM-STRING-PREDS");



    private static final SubLObject $$ProperNamePredicate_Loose = reader_make_constant_shell("ProperNamePredicate-Loose");

    private static final SubLSymbol $pph_term_string_preds_caching_state$ = makeSymbol("*PPH-TERM-STRING-PREDS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_PPH_TERM_STRING_PREDS = makeSymbol("CLEAR-PPH-TERM-STRING-PREDS");

    private static final SubLString $str204$Broadening__PPH_LANGUAGE_MT__to__ = makeString("Broadening *PPH-LANGUAGE-MT* to ~S");

    private static final SubLList $list205 = cons(makeSymbol("STRING"), makeSymbol("PRED"));

    private static final SubLSymbol $sym206$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");



    private static final SubLSymbol PPH_ENHANCED_DOMAIN_MT = makeSymbol("PPH-ENHANCED-DOMAIN-MT");



    private static final SubLSymbol $pph_enhanced_domain_mt_caching_state$ = makeSymbol("*PPH-ENHANCED-DOMAIN-MT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_PPH_ENHANCED_DOMAIN_MT = makeSymbol("CLEAR-PPH-ENHANCED-DOMAIN-MT");





    private static final SubLString $str214$__Got__S = makeString("~%Got ~S");

    private static final SubLString $str215$Generated_name_for__S_from____S = makeString("Generated name for ~S from~% ~S");



    private static final SubLString $str217$__No__S_assertions___for__S___fro = makeString("~%No ~S assertions~% for ~S~% from ~S");

    private static final SubLSymbol NAME_STRING_GAF_STRINGS = makeSymbol("NAME-STRING-GAF-STRINGS");

    private static final SubLSymbol $sym219$PPH_NON_ABBREVIATION_NAME_PRED_ = makeSymbol("PPH-NON-ABBREVIATION-NAME-PRED?");

    private static final SubLSymbol PPH_ABBREVIATION_PREDS = makeSymbol("PPH-ABBREVIATION-PREDS");

    private static final SubLObject $$abbreviationString_PN = reader_make_constant_shell("abbreviationString-PN");

    private static final SubLSymbol $pph_abbreviation_preds_caching_state$ = makeSymbol("*PPH-ABBREVIATION-PREDS-CACHING-STATE*");



    private static final SubLSymbol CLEAR_PPH_ABBREVIATION_PREDS = makeSymbol("CLEAR-PPH-ABBREVIATION-PREDS");



    private static final SubLList $list227 = list(makeString("The "), makeString("A "), makeString("An "));

    private static final SubLObject $$Artifact_Generic = reader_make_constant_shell("Artifact-Generic");

    private static final SubLList $list229 = list(new SubLObject[]{ reader_make_constant_shell("middleName"), reader_make_constant_shell("scientificName"), reader_make_constant_shell("nicknames"), reader_make_constant_shell("firstName"), reader_make_constant_shell("givenNames"), reader_make_constant_shell("familyName"), reader_make_constant_shell("formerName"), reader_make_constant_shell("placeName-LocalLongForm"), reader_make_constant_shell("placeName-LocalShortForm"), reader_make_constant_shell("countryName-LocalLongForm"), reader_make_constant_shell("countryName-LocalShortForm"), reader_make_constant_shell("epistleAddresseeText"), reader_make_constant_shell("abbreviationString-PN"), reader_make_constant_shell("internetCountryCode"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("geopoliticalEntityCodeDigraph") });

    private static final SubLSymbol $sym230$PPH_PREFER_NAME_STRING_PRED_ = makeSymbol("PPH-PREFER-NAME-STRING-PRED?");

    private static final SubLSymbol $sym231$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");



    private static final SubLList $list233 = list(reader_make_constant_shell("prettyString-Canonical"), reader_make_constant_shell("prettyString"));

    private static final SubLList $list235 = list(makeSymbol("GENITIVE-PARAPHRASE-METHOD"));



    private static final SubLString $str239$Couldn_t_find__S_lexification_wit = makeString("Couldn't find ~S lexification with preds ~S for~% ~S");

    private static final SubLString $str240$Reverted_to_original_phrase_ = makeString("Reverted to original phrase.");

    private static final SubLString $str242$__GENERATE_NART_AS_NAUT_paraphras = makeString("~&GENERATE-NART-AS-NAUT paraphrasing ~S with category ~S.~%");

    private static final SubLString $str243$__GENERATE_NART_AS_NAUT_found_unj = makeString("~&GENERATE-NART-AS-NAUT found unjustified string ~S for ~S.~%");

    private static final SubLSymbol $OK_NAT_TEMPLATE = makeKeyword("OK-NAT-TEMPLATE");

    private static final SubLSymbol $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_ = makeSymbol("OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?");

    private static final SubLSymbol $sym246$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$genTemplate_Constrained = reader_make_constant_shell("genTemplate-Constrained");



    private static final SubLSymbol GENERATE_UNIVERSAL_DATE = makeSymbol("GENERATE-UNIVERSAL-DATE");

    private static final SubLSymbol GENERATE_UNIVERSAL_DATE_NUMBERS = makeSymbol("GENERATE-UNIVERSAL-DATE-NUMBERS");

    private static final SubLSymbol GENERATE_UNIVERSAL_SECOND = makeSymbol("GENERATE-UNIVERSAL-SECOND");

    private static final SubLString $str257$_00 = makeString(":00");

    private static final SubLSymbol GENERATE_FLOAT = makeSymbol("GENERATE-FLOAT");

    private static final SubLString $$$E0 = makeString("E0");

    private static final SubLString $str262$_0 = makeString(".0");

    private static final SubLObject $$MultiplicationSign_TheSymbol = reader_make_constant_shell("MultiplicationSign-TheSymbol");

    private static final SubLString $$$10 = makeString("10");

    private static final SubLString $str265$_ = makeString("+");

    private static final SubLString $$$E = makeString("E");

    private static final SubLString $$$D = makeString("D");

    private static final SubLString $$$0 = makeString("0");

    private static final SubLString $str269$_ = makeString(".");

    private static final SubLString $$$d = makeString("d");

    private static final SubLString $str271$__D = makeString("~:D");

    private static final SubLList $list272 = list(new SubLObject[]{ makeString("no"), makeString("one"), makeString("two"), makeString("three"), makeString("four"), makeString("five"), makeString("six"), makeString("seven"), makeString("eight"), makeString("nine"), makeString("ten"), makeString("eleven"), makeString("twelve"), makeString("thirteen"), makeString("fourteen"), makeString("fifteen"), makeString("sixteen"), makeString("seventeen"), makeString("eighteen"), makeString("nineteen") });

    private static final SubLList $list273 = list(cons(TWENTY_INTEGER, makeString("twenty")), cons(makeInteger(30), makeString("thirty")), cons(makeInteger(40), makeString("forty")), cons(makeInteger(50), makeString("fifty")), cons(makeInteger(60), makeString("sixty")), cons(makeInteger(70), makeString("seventy")), cons(makeInteger(80), makeString("eighty")), cons(makeInteger(90), makeString("ninety")));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol GENERATE_NUMBER_DEFAULT = makeSymbol("GENERATE-NUMBER-DEFAULT");

    private static final SubLString $str279$Was_anticipating_a_singleton_outp = makeString("Was anticipating a singleton output list, got: ~S.  Not adding disambiguation string.");



    private static final SubLSymbol $sym281$_STRING = makeSymbol("?STRING");



    private static final SubLList $list283 = list(makeSymbol("?STRING"));

    private static final SubLList $list284 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));

    private static final SubLSymbol GENERATE_IMAGE_URL = makeSymbol("GENERATE-IMAGE-URL");

    private static final SubLString $str287$_img_src___A__ = makeString("<img src=\"~A\">");

    private static final SubLString $str288$ = makeString("");

    private static final SubLSymbol GENERATE_PRINC = makeSymbol("GENERATE-PRINC");

    private static final SubLSymbol $pph_default_mt_time_index$ = makeSymbol("*PPH-DEFAULT-MT-TIME-INDEX*");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");

    private static final SubLSymbol GENERATE_ASSERTION = makeSymbol("GENERATE-ASSERTION");





    private static final SubLList $list298 = list($SELF);

    private static final SubLSymbol $sym300$_DATE = makeSymbol("?DATE");



    static private final SubLList $list302 = list(makeSymbol("?DATE"));



    private static final SubLList $list304 = list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list($BIND, makeSymbol("START-DATE")), list($BIND, makeSymbol("END-DATE")));

    private static final SubLSymbol END_DATE = makeSymbol("END-DATE");

    private static final SubLSymbol START_DATE = makeSymbol("START-DATE");

    private static final SubLObject $$IntervalStartedByFn_Inclusive = reader_make_constant_shell("IntervalStartedByFn-Inclusive");

    private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell("IntervalEndedByFn-Inclusive");

    private static final SubLList $list309 = list(reader_make_constant_shell("SomeTimeInIntervalFn"), list(reader_make_constant_shell("TimeIntervalBetweenFn"), list($BIND, makeSymbol("START-DATE")), list($BIND, makeSymbol("END-DATE"))), list($BIND, makeSymbol("GUID")));







    private static final SubLList $list314 = list(reader_make_constant_shell("SomeTimeInIntervalFn"), list(reader_make_constant_shell("IntervalEndedByFn"), list($BIND, makeSymbol("DATE"))), makeKeyword("ANYTHING"));

    private static final SubLSymbol PPH_SUPPORT_CREATION_DATES = makeSymbol("PPH-SUPPORT-CREATION-DATES");



    private static final SubLSymbol $sym319$_TIME_INDEX = makeSymbol("?TIME-INDEX");



    private static final SubLList $list321 = list(makeSymbol("?TIME-INDEX"));





    private static final SubLSymbol PPH_MT_TIME_INDEX = makeSymbol("PPH-MT-TIME-INDEX");

    static private final SubLList $list328 = list(makeSymbol("PPH-TEST-CASE-TABLES"));

    private static final SubLList $list332 = list(list(list(reader_make_constant_shell("CIAWorldFactbook1995Mt")), list(reader_make_constant_shell("YearFn"), makeInteger(1994))), list(list(list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("BaseKB"), list(reader_make_constant_shell("MtTimeDimFn"), list(reader_make_constant_shell("YearFn"), makeInteger(1994))))), list(reader_make_constant_shell("YearFn"), makeInteger(1994))));





    private static final SubLList $list336 = list(reader_make_constant_shell("SomeTimeInIntervalFn"), list(reader_make_constant_shell("IntervalEndedByFn"), list($BIND, makeSymbol("END-DATE"))), makeKeyword("ANYTHING"));

    private static final SubLList $list338 = list(ONE_INTEGER, ONE_INTEGER);



    private static final SubLSymbol PPH_ADJUST_MT_DATE_GRANULARITY = makeSymbol("PPH-ADJUST-MT-DATE-GRANULARITY");



    private static final SubLList $list343 = list(reader_make_constant_shell("DaysDuration"), ONE_INTEGER);





    private static final SubLList $list346 = list(reader_make_constant_shell("YearsDuration"), ONE_INTEGER);



    private static final SubLSymbol PPH_ADJUST_MT_TIME_INDEX_GRANULARITY = makeSymbol("PPH-ADJUST-MT-TIME-INDEX-GRANULARITY");

    static private final SubLList $list349 = list(list(list(list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(1956)))), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(1956)))), list(list(list(reader_make_constant_shell("SecondFn"), SIXTEEN_INTEGER, list(reader_make_constant_shell("MinuteFn"), makeInteger(42), list(reader_make_constant_shell("HourFn"), TWENTY_INTEGER, list(reader_make_constant_shell("DayFn"), ELEVEN_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("August"), list(reader_make_constant_shell("YearFn"), makeInteger(2004)))))))), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("August"), list(reader_make_constant_shell("YearFn"), makeInteger(2004)))), list(list(list(reader_make_constant_shell("DecadeFn"), makeInteger(198))), list(reader_make_constant_shell("DecadeFn"), makeInteger(198))));





    private static final SubLSymbol ASSERTION_OUTPUT_LIST_INFO_P = makeSymbol("ASSERTION-OUTPUT-LIST-INFO-P");

    private static final SubLList $list354 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-POSITION"), list(makeSymbol("PPH-UNKNOWN-ARG-POSITION"))), makeSymbol("OPEN-TAG"), makeSymbol("CLOSE-TAG"));

    private static final SubLSymbol GENERATE_ROP_EXPRESSION = makeSymbol("GENERATE-ROP-EXPRESSION");





    private static final SubLList $list362 = list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Relation"), reader_make_constant_shell("GAFGathering"), reader_make_constant_shell("StringBasedSearching"), reader_make_constant_shell("ObtainingAStringBasedSearchResult"), reader_make_constant_shell("LexicalItem"), reader_make_constant_shell("SKSSchema-LogicalOrPhysical"));

    private static final SubLSymbol PPH_POSSESSIVE_PREDS = makeSymbol("PPH-POSSESSIVE-PREDS");



    private static final SubLSymbol $pph_possessive_preds_caching_state$ = makeSymbol("*PPH-POSSESSIVE-PREDS-CACHING-STATE*");

    private static final SubLSymbol PPH_FIND_POSSESSIVE_SENTENCE = makeSymbol("PPH-FIND-POSSESSIVE-SENTENCE");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $sym368$_POSSESSOR = makeSymbol("?POSSESSOR");

    static private final SubLList $list369 = list(reader_make_constant_shell("FirstPerson-NLAttr"), reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Ungendered-NLAttr"));

    private static final SubLObject $$PossessivePronoun_Pre = reader_make_constant_shell("PossessivePronoun-Pre");

    private static final SubLString $str371$Couldn_t_find_possessor_for__S = makeString("Couldn't find possessor for ~S");



    private static final SubLSymbol $sym373$_POSSESSED = makeSymbol("?POSSESSED");

    private static final SubLList $list374 = list(makeSymbol("POSSESSIVE-PRED"), makeSymbol("POSSESSOR"), makeSymbol("POSSESSED"));

    private static final SubLList $list375 = list(reader_make_constant_shell("Individual"));

    private static final SubLString $str376$_S_is_an_instance_of__S__so_using = makeString("~S is an instance of ~S, so using unlexified form.~%");

    private static final SubLList $list377 = list(NIL);

    private static final SubLSymbol PPH_GENDER_P = makeSymbol("PPH-GENDER-P");



    private static final SubLString $str380$Defaulting_to_English_gender_unif = makeString("Defaulting to English gender unification in non-English context");

    private static final SubLObject $$Masculine_NLAttr = reader_make_constant_shell("Masculine-NLAttr");

    private static final SubLObject $$Feminine_NLAttr = reader_make_constant_shell("Feminine-NLAttr");

    private static final SubLObject $$Neuter_NLAttr = reader_make_constant_shell("Neuter-NLAttr");

    private static final SubLObject $$Ungendered_NLAttr = reader_make_constant_shell("Ungendered-NLAttr");

    private static final SubLObject $$Plural_NLAttr = reader_make_constant_shell("Plural-NLAttr");

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell("Singular-NLAttr");

    private static final SubLObject $$ThirdPerson_NLAttr = reader_make_constant_shell("ThirdPerson-NLAttr");

    private static final SubLObject $$FirstPerson_NLAttr = reader_make_constant_shell("FirstPerson-NLAttr");

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell("SecondPerson-NLAttr");

    private static final SubLSymbol $sym390$_GENDER = makeSymbol("?GENDER");



    private static final SubLList $list392 = list(makeSymbol("?GENDER"));

    private static final SubLList $list393 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLString $str394$Couldn_t_find_gender_for__S_in__S = makeString("Couldn't find gender for ~S in ~S");

    private static final SubLList $list395 = list(reader_make_constant_shell("EnglishLanguage"));







    private static final SubLSymbol PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE = makeSymbol("PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE");





    private static final SubLString $str402$pph_number_of_var_guessing_that__ = makeString("pph-number-of-var guessing that ~S is singular because it's not a discourse referent~%");



    private static final SubLObject $$Agent_Generic = reader_make_constant_shell("Agent-Generic");





    private static final SubLString $str407$Couldn_t_find_a_gender_for__S_in_ = makeString("Couldn't find a gender for ~S in ~S");

    private static final SubLList $list408 = cons(makeSymbol("TYPE"), makeSymbol("ADJUSTED-GENDER"));

    private static final SubLSymbol $sym409$SPEC_ = makeSymbol("SPEC?");

    private static final SubLList $list410 = cons(makeSymbol("?TYPE"), makeSymbol("?GENDER"));

    private static final SubLList $list411 = list(makeSymbol("?TYPE"), makeSymbol("?GENDER"));

    // Definitions
    public static final SubLObject funcall_pph_method_alt(SubLObject method_symbol, SubLObject phrase) {
        {
            SubLObject pcase_var = method_symbol;
            if (pcase_var.eql(GENERATE_CONSTANT_DEFAULT)) {
                return com.cyc.cycjava.cycl.pph_methods.generate_constant_default(phrase);
            } else {
                if (pcase_var.eql(GENERATE_ATOMIC_FORMULA)) {
                    return pph_methods_formulas.generate_atomic_formula(phrase);
                } else {
                    if (pcase_var.eql(GENERATE_CYCL_LIST)) {
                        return com.cyc.cycjava.cycl.pph_methods.generate_cycl_list(phrase);
                    } else {
                        if (pcase_var.eql(GENERATE_CYCL_VARIABLE)) {
                            return com.cyc.cycjava.cycl.pph_methods.generate_cycl_variable(phrase);
                        } else {
                            if (pcase_var.eql(GENERATE_NART_AS_NAUT)) {
                                return com.cyc.cycjava.cycl.pph_methods.generate_nart_as_naut(phrase);
                            } else {
                                if (pcase_var.eql(GENERATE_NART_AS_NAUT_TIGHT)) {
                                    return com.cyc.cycjava.cycl.pph_methods.generate_nart_as_naut_tight(phrase);
                                } else {
                                    if (pcase_var.eql(GENERATE_NART_LEXIFIED_IMPRECISE)) {
                                        return com.cyc.cycjava.cycl.pph_methods.generate_nart_lexified_imprecise(phrase);
                                    } else {
                                        if (pcase_var.eql(GENERATE_NART_LEXIFIED_TIGHT)) {
                                            return com.cyc.cycjava.cycl.pph_methods.generate_nart_lexified_tight(phrase);
                                        } else {
                                            if (pcase_var.eql(GENERATE_PHRASE_FROM_TEMPLATE)) {
                                                return pph_methods_formulas.generate_phrase_from_template(phrase);
                                            } else {
                                                if (pcase_var.eql(GENERATE_STRING)) {
                                                    return com.cyc.cycjava.cycl.pph_methods.generate_string(phrase);
                                                } else {
                                                    return funcall(method_symbol, phrase);
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

    // Definitions
    public static SubLObject funcall_pph_method(final SubLObject method_symbol, final SubLObject phrase) {
        if (method_symbol.eql(GENERATE_CONSTANT_DEFAULT)) {
            return generate_constant_default(phrase);
        }
        if (method_symbol.eql(GENERATE_ATOMIC_FORMULA)) {
            return pph_methods_formulas.generate_atomic_formula(phrase);
        }
        if (method_symbol.eql(GENERATE_CYCL_LIST)) {
            return generate_cycl_list(phrase);
        }
        if (method_symbol.eql(GENERATE_CYCL_VARIABLE)) {
            return generate_cycl_variable(phrase);
        }
        if (method_symbol.eql(GENERATE_NART_AS_NAUT)) {
            return generate_nart_as_naut(phrase);
        }
        if (method_symbol.eql(GENERATE_NART_LEXIFIED_IMPRECISE)) {
            return generate_nart_lexified_imprecise(phrase);
        }
        if (method_symbol.eql(GENERATE_NART_LEXIFIED_TIGHT)) {
            return generate_nart_lexified_tight(phrase);
        }
        if (method_symbol.eql(GENERATE_PHRASE_FROM_TEMPLATE)) {
            return pph_methods_formulas.generate_phrase_from_template(phrase);
        }
        if (method_symbol.eql(GENERATE_STRING)) {
            return generate_string(phrase);
        }
        return funcall(method_symbol, phrase);
    }

    /**
     * Generate a unique name for the skolem term denoted by PHRASE.
     */
    @LispMethod(comment = "Generate a unique name for the skolem term denoted by PHRASE.")
    public static final SubLObject generate_skolem_term_with_name_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject string = com.cyc.cycjava.cycl.pph_methods.generate_skolem_name(cycl_utilities.hl_to_el(v_object));
                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                if ((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) && (NIL != pph_vars.$pph_italicize_skolems_in_html_modeP$.getDynamicValue(thread))) {
                    pph_html.pph_phrase_italicize(phrase);
                }
                pph_phrase.pph_phrase_set_string(phrase, string);
                pph_phrase.pph_phrase_set_agr_pred(phrase, $$nameString, UNPROVIDED);
            }
            return phrase;
        }
    }

    /**
     * Generate a unique name for the skolem term denoted by PHRASE.
     */
    @LispMethod(comment = "Generate a unique name for the skolem term denoted by PHRASE.")
    public static SubLObject generate_skolem_term_with_name(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject string = generate_skolem_name(cycl_utilities.hl_to_el(v_object));
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        if ((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) && (NIL != pph_vars.$pph_italicize_skolems_in_html_modeP$.getDynamicValue(thread))) {
            pph_html.pph_phrase_italicize(phrase);
        }
        pph_phrase.pph_phrase_set_string(phrase, string);
        pph_phrase.pph_phrase_set_agr_pred(phrase, $$nameString, UNPROVIDED);
        return phrase;
    }

    public static final SubLObject clear_generate_skolem_name_alt() {
        {
            SubLObject cs = $generate_skolem_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_generate_skolem_name() {
        final SubLObject cs = $generate_skolem_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_generate_skolem_name_alt(SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($generate_skolem_name_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_generate_skolem_name(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($generate_skolem_name_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Generate a unique name for the skolem term OBJECT.
     *
     * @unknown This function is cached so we paraphrase the same term consistently.
     */
    @LispMethod(comment = "Generate a unique name for the skolem term OBJECT.\r\n\r\n@unknown This function is cached so we paraphrase the same term consistently.")
    public static final SubLObject generate_skolem_name_internal_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    try {
                        pph_vars.$pph_domain_mt$.bind($$InferencePSC, thread);
                        {
                            SubLObject isa_col = com.cyc.cycjava.cycl.pph_methods.pph_min_isa(v_object, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                try {
                                    pph_vars.$paraphrase_mode$.bind($TEXT, thread);
                                    {
                                        SubLObject isa_string = (isa_col.eql($$Thing)) ? ((SubLObject) ($$$Object)) : com.cyc.cycjava.cycl.pph_methods.pph_capitalize_smart(pph_main.pph_phrase_generate_string_from_cycl(isa_col, $list_alt20, UNPROVIDED));
                                        SubLObject id = dictionary.dictionary_lookup_without_values($generate_skolem_ids$.getGlobalValue(), isa_string, ONE_INTEGER);
                                        SubLObject id_string = string_utilities.str(id);
                                        dictionary_utilities.dictionary_increment($generate_skolem_ids$.getGlobalValue(), isa_string, UNPROVIDED);
                                        ans = cconcatenate(isa_string, new SubLObject[]{ $str_alt21$_, id_string });
                                    }
                                } finally {
                                    pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Generate a unique name for the skolem term OBJECT.
     *
     * @unknown This function is cached so we paraphrase the same term consistently.
     */
    @LispMethod(comment = "Generate a unique name for the skolem term OBJECT.\r\n\r\n@unknown This function is cached so we paraphrase the same term consistently.")
    public static SubLObject generate_skolem_name_internal(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind($$InferencePSC, thread);
            final SubLObject isa_col = pph_min_isa(v_object, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = pph_vars.$paraphrase_mode$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_mode$.bind($TEXT, thread);
                final SubLObject isa_string = (isa_col.eql($$Thing)) ? $$$Object : pph_capitalize_smart(pph_main.pph_phrase_generate_string_from_cycl(isa_col, $list19, UNPROVIDED));
                final SubLObject id = dictionary.dictionary_lookup_without_values($generate_skolem_ids$.getGlobalValue(), isa_string, ONE_INTEGER);
                final SubLObject id_string = string_utilities.str(id);
                dictionary_utilities.dictionary_increment($generate_skolem_ids$.getGlobalValue(), isa_string, UNPROVIDED);
                ans = cconcatenate(isa_string, new SubLObject[]{ $str20$_, id_string });
            } finally {
                pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject generate_skolem_name_alt(SubLObject v_object) {
        {
            SubLObject caching_state = $generate_skolem_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GENERATE_SKOLEM_NAME, $generate_skolem_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, $kw23$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.generate_skolem_name_internal(v_object)));
                    memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject generate_skolem_name(final SubLObject v_object) {
        SubLObject caching_state = $generate_skolem_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GENERATE_SKOLEM_NAME, $generate_skolem_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(generate_skolem_name_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject pph_capitalize_smart_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject capitalized = NIL;
                SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
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
                                            Errors.error($str_alt24$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                capitalized = string_utilities.capitalize_smart(string);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return capitalized;
            }
        }
    }

    public static SubLObject pph_capitalize_smart(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject capitalized = NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                capitalized = string_utilities.capitalize_smart(string);
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return capitalized;
    }

    /**
     * Generate English for the skolem term denoted by PHRASE as 'some WHATEVER'.
     */
    @LispMethod(comment = "Generate English for the skolem term denoted by PHRASE as \'some WHATEVER\'.")
    public static final SubLObject generate_skolem_term_existentially_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nart = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject string = com.cyc.cycjava.cycl.pph_methods.generate_skolem_term_existentially_int(nart);
                    SubLObject agr_pred = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != string) {
                        pph_phrase.pph_phrase_set_string(phrase, string);
                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                        pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
                    }
                }
            }
            return phrase;
        }
    }

    /**
     * Generate English for the skolem term denoted by PHRASE as 'some WHATEVER'.
     */
    @LispMethod(comment = "Generate English for the skolem term denoted by PHRASE as \'some WHATEVER\'.")
    public static SubLObject generate_skolem_term_existentially(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject string = generate_skolem_term_existentially_int(nart);
        final SubLObject agr_pred = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != string) {
            pph_phrase.pph_phrase_set_string(phrase, string);
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
            pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
        }
        return phrase;
    }

    public static final SubLObject generate_skolem_term_existentially_int_alt(SubLObject skolem_nat) {
        {
            SubLObject coll = com.cyc.cycjava.cycl.pph_methods.pph_skolem_nat_find_type(skolem_nat);
            if (NIL == coll) {
                return NIL;
            }
            {
                SubLObject np_cycl = pph_utilities.pph_np_cycl_for_term_type(coll, $INDEFINITE, $$nonPlural_Generic);
                return pph_main.pph_phrase_generate_string_from_cycl(np_cycl, list($$nonPlural_Generic), UNPROVIDED);
            }
        }
    }

    public static SubLObject generate_skolem_term_existentially_int(final SubLObject skolem_nat) {
        final SubLObject coll = pph_skolem_nat_find_type(skolem_nat);
        if (NIL == coll) {
            return NIL;
        }
        final SubLObject np_cycl = pph_utilities.pph_np_cycl_for_term_type(coll, $INDEFINITE, $$nonPlural_Generic);
        return pph_main.pph_phrase_generate_string_from_cycl(np_cycl, list($$nonPlural_Generic), UNPROVIDED);
    }

    /**
     *
     *
     * @return CycL expression or NIL; A collection-denoting expression
    of which SKOLEM-NAT is an instance
     */
    @LispMethod(comment = "@return CycL expression or NIL; A collection-denoting expression\r\nof which SKOLEM-NAT is an instance")
    public static final SubLObject pph_skolem_nat_find_type_alt(SubLObject skolem_nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject skolem_fn = cycl_utilities.nat_function(skolem_nat);
                SubLObject coll = NIL;
                SubLObject var = $sym28$_X;
                SubLObject constraint_lits = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = kb_mapping.gather_function_rule_index(skolem_fn, UNPROVIDED, UNPROVIDED);
                            SubLObject rule = NIL;
                            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                {
                                    SubLObject cnf = assertions_high.assertion_cnf(rule);
                                    SubLObject toufs = list_utilities.tree_gather(cnf, $sym29$TOU_ATOMIC_SENTENCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var_3 = toufs;
                                        SubLObject touf = NIL;
                                        for (touf = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , touf = cdolist_list_var_3.first()) {
                                            {
                                                SubLObject datum = cycl_utilities.formula_args(touf, UNPROVIDED);
                                                SubLObject current = datum;
                                                SubLObject hl_var = NIL;
                                                SubLObject naut = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt30);
                                                hl_var = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt30);
                                                naut = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    cnf = subst(naut, hl_var, cnf, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt30);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var_4 = clauses.pos_lits(cnf);
                                        SubLObject pos_lit = NIL;
                                        for (pos_lit = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , pos_lit = cdolist_list_var_4.first()) {
                                            if (NIL == pph_utilities.tou_atomic_sentenceP(pos_lit)) {
                                                {
                                                    SubLObject skolem_naut_from_rule = cycl_utilities.expression_find(skolem_fn, pos_lit, NIL, symbol_function(EQ), NAT_FUNCTION);
                                                    if (NIL != skolem_naut_from_rule) {
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject arg = NIL;
                                                            SubLObject n = NIL;
                                                            for (list_var = cycl_utilities.nat_args(skolem_naut_from_rule, UNPROVIDED), arg = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , n = add(ONE_INTEGER, n)) {
                                                                pos_lit = subst(function_terms.nart_to_naut(cycl_utilities.nat_arg(skolem_nat, number_utilities.f_1X(n), UNPROVIDED)), arg, pos_lit, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                        pos_lit = subst(var, function_terms.nart_to_naut(skolem_nat), pos_lit, symbol_function(EQUAL), UNPROVIDED);
                                                        if ((NIL == coll) && (NIL != pph_utilities.pph_var_typing_clauseP(pos_lit, var, UNPROVIDED))) {
                                                            coll = cycl_utilities.formula_arg2(pos_lit, UNPROVIDED);
                                                        } else {
                                                            constraint_lits = cons(pos_lit, constraint_lits);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == coll) {
                                coll = com.cyc.cycjava.cycl.pph_methods.pph_min_isa(skolem_nat, UNPROVIDED);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject formula = parsing_utilities.make_collection_expression(coll, var, constraint_lits);
                    if (NIL != list_utilities.singletonP(constraint_lits)) {
                        formula = reformulator_hub.reformulate_cycl(formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), $list_alt32);
                    }
                    return formula == $$Thing ? ((SubLObject) (NIL)) : formula;
                }
            }
        }
    }

    /**
     *
     *
     * @return CycL expression or NIL; A collection-denoting expression
    of which SKOLEM-NAT is an instance
     */
    @LispMethod(comment = "@return CycL expression or NIL; A collection-denoting expression\r\nof which SKOLEM-NAT is an instance")
    public static SubLObject pph_skolem_nat_find_type(final SubLObject skolem_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject skolem_fn = cycl_utilities.nat_function(skolem_nat);
        SubLObject coll = NIL;
        final SubLObject var = $sym25$_X;
        SubLObject constraint_lits = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = kb_mapping.gather_function_rule_index(skolem_fn, UNPROVIDED, UNPROVIDED);
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                SubLObject cdolist_list_var_$3;
                final SubLObject toufs = cdolist_list_var_$3 = list_utilities.tree_gather(cnf, $sym26$TOU_ATOMIC_SENTENCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject touf = NIL;
                touf = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    SubLObject current;
                    final SubLObject datum = current = cycl_utilities.formula_args(touf, UNPROVIDED);
                    SubLObject hl_var = NIL;
                    SubLObject naut = NIL;
                    destructuring_bind_must_consp(current, datum, $list27);
                    hl_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list27);
                    naut = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        cnf = subst(naut, hl_var, cnf, UNPROVIDED, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list27);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    touf = cdolist_list_var_$3.first();
                } 
                SubLObject cdolist_list_var_$4 = clauses.pos_lits(cnf);
                SubLObject pos_lit = NIL;
                pos_lit = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL == pph_utilities.tou_atomic_sentenceP(pos_lit)) {
                        final SubLObject skolem_naut_from_rule = cycl_utilities.expression_find(skolem_fn, pos_lit, NIL, symbol_function(EQ), NAT_FUNCTION);
                        if (NIL != skolem_naut_from_rule) {
                            SubLObject list_var = NIL;
                            SubLObject arg = NIL;
                            SubLObject n = NIL;
                            list_var = cycl_utilities.nat_args(skolem_naut_from_rule, UNPROVIDED);
                            arg = list_var.first();
                            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , n = add(ONE_INTEGER, n)) {
                                pos_lit = subst(function_terms.nart_to_naut(cycl_utilities.nat_arg(skolem_nat, number_utilities.f_1X(n), UNPROVIDED)), arg, pos_lit, UNPROVIDED, UNPROVIDED);
                            }
                            pos_lit = subst(var, function_terms.nart_to_naut(skolem_nat), pos_lit, symbol_function(EQUAL), UNPROVIDED);
                            if ((NIL == coll) && (NIL != pph_utilities.pph_var_typing_clauseP(pos_lit, var, UNPROVIDED))) {
                                coll = cycl_utilities.formula_arg2(pos_lit, UNPROVIDED);
                            } else {
                                constraint_lits = cons(pos_lit, constraint_lits);
                            }
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    pos_lit = cdolist_list_var_$4.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
            if (NIL == coll) {
                coll = pph_min_isa(skolem_nat, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject formula = parsing_utilities.make_collection_expression(coll, var, constraint_lits);
        if (NIL != list_utilities.singletonP(constraint_lits)) {
            formula = reformulator_hub.reformulate_cycl(formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), $list29);
        }
        return formula.eql($$Thing) ? NIL : formula;
    }

    /**
     *
     *
     * @return fort-p; A minimal collection of which TERM is an instance.
     */
    @LispMethod(comment = "@return fort-p; A minimal collection of which TERM is an instance.")
    public static final SubLObject pph_min_isa_alt(SubLObject v_term, SubLObject exclude) {
        if (exclude == UNPROVIDED) {
            exclude = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject best = set_difference(isa.min_isa(v_term, UNPROVIDED, UNPROVIDED), exclude, UNPROVIDED, UNPROVIDED).first();
                            ans = (NIL != best) ? ((SubLObject) (best)) : $$Thing;
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return fort-p; A minimal collection of which TERM is an instance.
     */
    @LispMethod(comment = "@return fort-p; A minimal collection of which TERM is an instance.")
    public static SubLObject pph_min_isa(final SubLObject v_term, SubLObject exclude) {
        if (exclude == UNPROVIDED) {
            exclude = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject best = set_difference(isa.min_isa(v_term, UNPROVIDED, UNPROVIDED), exclude, UNPROVIDED, UNPROVIDED).first();
            ans = (NIL != best) ? best : $$Thing;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject arg_type_is_collection_p_alt(SubLObject pred, SubLObject arg_pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = NIL;
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        type = kb_accessors.argn_isa(pred, arg_pos, UNPROVIDED).first();
                        if (NIL != type) {
                            ans = pph_utilities.pph_genlP(type, $$Collection, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject arg_type_is_collection_p(final SubLObject pred, final SubLObject arg_pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            type = kb_accessors.argn_isa(pred, arg_pos, UNPROVIDED).first();
            if (NIL != type) {
                ans = pph_utilities.pph_genlP(type, $$Collection, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject generate_hypothetical_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hypothesized_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                SubLObject name_string_method_result = com.cyc.cycjava.cycl.pph_methods.pph_try_method(NAME_STRING_METHOD, hypothesized_term, nl_preds, $DECENT, pph_utilities.pph_np_category());
                if ((NIL != pph_data_structures.pph_phrase_output_item_loose_p(name_string_method_result)) && pph_data_structures.pph_phrase_output_item_string(name_string_method_result).isString()) {
                    pph_phrase.pph_phrase_set_output_list(phrase, list(name_string_method_result), UNPROVIDED);
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                    pph_phrase.pph_phrase_note_done(phrase);
                }
            }
            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                {
                    SubLObject hypothetical = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                    SubLObject var = bindings.apply_bindings_backwards(pph_vars.$pph_hypothetical_vars$.getDynamicValue(thread), hypothetical);
                    if (NIL != cycl_variables.el_varP(var)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject output_list = com.cyc.cycjava.cycl.pph_methods.pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED);
                            SubLObject pred = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != output_list) {
                                pph_phrase.pph_phrase_note_done(phrase);
                                pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                                com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_var_arg_position(var, phrase, UNPROVIDED);
                                pph_phrase.pph_phrase_set_agr_pred(phrase, NIL != pred ? ((SubLObject) (pred)) : $$singular_Generic, UNPROVIDED);
                                pph_phrase.pph_phrase_set_cycl(phrase, var);
                            }
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject generate_hypothetical(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hypothesized_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        final SubLObject name_string_method_result = pph_try_method(NAME_STRING_METHOD, hypothesized_term, nl_preds, $DECENT, pph_utilities.pph_np_category());
        if ((NIL != pph_data_structures.pph_phrase_output_item_loose_p(name_string_method_result)) && (NIL != pph_string.pph_string_p(pph_data_structures.pph_phrase_output_item_string(name_string_method_result)))) {
            pph_phrase.pph_phrase_set_output_list(phrase, list(name_string_method_result), UNPROVIDED);
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            final SubLObject hypothetical = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject var = bindings.apply_bindings_backwards(pph_vars.$pph_hypothetical_vars$.getDynamicValue(thread), hypothetical);
            if (NIL != cycl_variables.el_varP(var)) {
                thread.resetMultipleValues();
                final SubLObject output_list = pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED);
                final SubLObject pred = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != output_list) {
                    pph_phrase.pph_phrase_note_done(phrase);
                    pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                    pph_phrase_set_var_arg_position(var, phrase, UNPROVIDED);
                    pph_phrase.pph_phrase_set_agr_pred(phrase, NIL != pred ? pred : $$singular_Generic, UNPROVIDED);
                    pph_phrase.pph_phrase_set_cycl(phrase, var);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject generate_cycl_variable_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject output_list = (((((((NIL != pph_phrase.pph_phrase_npP(phrase)) || (NIL != pph_phrase_resolution.pph_phrase_determinerP(phrase))) || (NIL != pph_phrase_resolution.pph_phrase_detpP(phrase))) || (NIL == pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) || (NIL != pph_variable_handling.pph_var_previously_lexifiedP(var))) || ((NIL != pph_phrase.pph_phrase_nbarP(phrase)) && (NIL == pph_variable_handling.pph_var_registered_as_defaultP(var)))) && (NIL != com.cyc.cycjava.cycl.pph_methods.pph_var_ok_for_lexifyingP(var, UNPROVIDED))) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.pph_paraphrase_var_with_type(phrase))) : com.cyc.cycjava.cycl.pph_methods.pph_paraphrase_var_as_var(var, T, phrase);
                    SubLObject pred = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                    com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_var_arg_position(var, phrase, UNPROVIDED);
                    if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                        pph_phrase.pph_phrase_note_done(phrase);
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                        pph_phrase.pph_phrase_set_agr_pred(phrase, NIL != pred ? ((SubLObject) (pred)) : $$singular_Generic, UNPROVIDED);
                    } else {
                        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                            pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject generate_cycl_variable(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject output_list = ((T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)) && ((((((NIL != pph_phrase.pph_phrase_npP(phrase)) || (NIL != pph_phrase_resolution.pph_phrase_determinerP(phrase))) || (NIL != pph_phrase_resolution.pph_phrase_detpP(phrase))) || (NIL == pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) || (NIL != pph_variable_handling.pph_var_previously_lexifiedP(var))) || ((NIL != pph_phrase.pph_phrase_nbarP(phrase)) && (NIL == pph_variable_handling.pph_var_registered_as_defaultP(var))))) && (NIL != pph_var_ok_for_lexifyingP(var, UNPROVIDED))) ? pph_paraphrase_var_with_type(phrase) : pph_paraphrase_var_as_var(var, T, phrase);
        final SubLObject pred = thread.secondMultipleValue();
        thread.resetMultipleValues();
        pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
        pph_phrase_set_var_arg_position(var, phrase, UNPROVIDED);
        if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
            pph_phrase.pph_phrase_note_done(phrase);
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            pph_phrase.pph_phrase_set_agr_pred(phrase, NIL != pred ? pred : $$singular_Generic, UNPROVIDED);
        } else
            if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                pph_phrase.pph_phrase_remove_all_dtrs(phrase);
            }

        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Set the arg-position for VAR.
     */
    @LispMethod(comment = "Set the arg-position for VAR.")
    public static final SubLObject pph_phrase_set_var_arg_position_alt(SubLObject var, SubLObject phrase, SubLObject map) {
        if (map == UNPROVIDED) {
            map = pph_phrase.pph_phrase_arg_position_map(phrase);
        }
        {
            SubLObject var_arg_position = pph_utilities.pph_arg_position_lookup(NIL, map);
            return com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_arg_position_for_cycl(phrase, var, var_arg_position);
        }
    }

    /**
     * Set the arg-position for VAR.
     */
    @LispMethod(comment = "Set the arg-position for VAR.")
    public static SubLObject pph_phrase_set_var_arg_position(final SubLObject var, final SubLObject phrase, SubLObject map) {
        if (map == UNPROVIDED) {
            map = pph_phrase.pph_phrase_arg_position_map(phrase);
        }
        final SubLObject var_arg_position = pph_utilities.pph_arg_position_lookup(NIL, map);
        return pph_phrase_set_arg_position_for_cycl(phrase, var, var_arg_position);
    }

    /**
     * Set the arg-position for var-type items.
     */
    @LispMethod(comment = "Set the arg-position for var-type items.")
    public static final SubLObject pph_phrase_set_var_type_arg_positions_alt(SubLObject phrase, SubLObject type, SubLObject type_arg_position_map) {
        {
            SubLObject cdolist_list_var = type_arg_position_map;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject from_prefix = NIL;
                    SubLObject to_prefix = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    from_prefix = current.first();
                    current = current.rest();
                    to_prefix = current;
                    {
                        SubLObject subtype = pph_utilities.pph_dereference_arg_position(type, from_prefix);
                        if (NIL != subtype) {
                            com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_arg_position_for_cycl(phrase, subtype, to_prefix);
                        }
                    }
                }
            }
        }
        return phrase;
    }

    /**
     * Set the arg-position for var-type items.
     */
    @LispMethod(comment = "Set the arg-position for var-type items.")
    public static SubLObject pph_phrase_set_var_type_arg_positions(final SubLObject phrase, final SubLObject type, final SubLObject type_arg_position_map) {
        SubLObject cdolist_list_var = type_arg_position_map;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject from_prefix = NIL;
            SubLObject to_prefix = NIL;
            destructuring_bind_must_consp(current, datum, $list40);
            from_prefix = current.first();
            current = to_prefix = current.rest();
            final SubLObject subtype = pph_utilities.pph_dereference_arg_position(type, from_prefix);
            if (NIL != subtype) {
                pph_phrase_set_arg_position_for_cycl(phrase, subtype, to_prefix);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return phrase;
    }

    /**
     * Set the arg-position for var-type items.
     */
    @LispMethod(comment = "Set the arg-position for var-type items.")
    public static final SubLObject pph_phrase_set_var_type_arg_position_alt(SubLObject phrase, SubLObject type, SubLObject type_arg_position) {
        return com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_arg_position_for_cycl(phrase, type, type_arg_position);
    }

    /**
     * Set the arg-position for var-type items.
     */
    @LispMethod(comment = "Set the arg-position for var-type items.")
    public static SubLObject pph_phrase_set_var_type_arg_position(final SubLObject phrase, final SubLObject type, final SubLObject type_arg_position) {
        return pph_phrase_set_arg_position_for_cycl(phrase, type, type_arg_position);
    }

    /**
     * Set the arg-position for items in the output list of PHRASE whose cycl is CYCL to ARG-POSITION.
     */
    @LispMethod(comment = "Set the arg-position for items in the output list of PHRASE whose cycl is CYCL to ARG-POSITION.")
    public static final SubLObject pph_phrase_set_arg_position_for_cycl_alt(SubLObject phrase, SubLObject cycl, SubLObject arg_position) {
        {
            SubLObject foundP = NIL;
            SubLObject cant_consolidateP = NIL;
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(phrase);
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (cycl.equal(pph_data_structures.pph_phrase_output_item_cycl(item))) {
                    foundP = T;
                    pph_data_structures.pph_phrase_output_item_set_arg_position(item, arg_position);
                } else {
                    if (pph_data_structures.pph_phrase_output_item_html_open_tag(item).isString() || pph_data_structures.pph_phrase_output_item_html_close_tag(item).isString()) {
                        cant_consolidateP = T;
                    } else {
                        if ((NIL == pph_phrase.pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item))) && (NIL == pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item)))) {
                            cant_consolidateP = T;
                        }
                    }
                }
            }
            if (!((NIL != foundP) || (NIL != cant_consolidateP))) {
                pph_phrase.pph_phrase_consolidate_output_list(phrase, arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_phrase.pph_phrase_set_output_list_cycl(phrase, cycl);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Set the arg-position for items in the output list of PHRASE whose cycl is CYCL to ARG-POSITION.
     */
    @LispMethod(comment = "Set the arg-position for items in the output list of PHRASE whose cycl is CYCL to ARG-POSITION.")
    public static SubLObject pph_phrase_set_arg_position_for_cycl(final SubLObject phrase, final SubLObject cycl, final SubLObject arg_position) {
        SubLObject foundP = NIL;
        SubLObject cant_consolidateP = NIL;
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(phrase);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl.equal(pph_data_structures.pph_phrase_output_item_cycl(item))) {
                foundP = T;
                pph_data_structures.pph_phrase_output_item_set_arg_position(item, arg_position);
            } else
                if (pph_data_structures.pph_phrase_output_item_html_open_tag(item).isString() || pph_data_structures.pph_phrase_output_item_html_close_tag(item).isString()) {
                    cant_consolidateP = T;
                } else
                    if ((NIL == pph_phrase.pph_unknown_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item))) && (NIL == pph_utilities.pph_unknown_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item)))) {
                        cant_consolidateP = T;
                    }


            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if ((NIL == foundP) && (NIL == cant_consolidateP)) {
            pph_phrase.pph_phrase_consolidate_output_list(phrase, arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, cycl);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject pph_var_ok_for_lexifyingP_alt(SubLObject var, SubLObject require_quantificationP) {
        if (require_quantificationP == UNPROVIDED) {
            require_quantificationP = T;
        }
        return makeBoolean((((NIL == pph_methods_formulas.pph_exceptional_var_p(var)) && (NIL == pph_variable_handling.pph_use_explicit_varP(var))) && (((NIL == require_quantificationP) || (NIL != pph_variable_handling.pph_var_quantifiedP(var))) || (NIL != pph_variable_handling.pph_query_var_p(var)))) && (NIL == pph_variable_handling.pph_var_paraphrased_explicitlyP(var)));
    }

    public static SubLObject pph_var_ok_for_lexifyingP(final SubLObject var, SubLObject require_quantificationP) {
        if (require_quantificationP == UNPROVIDED) {
            require_quantificationP = T;
        }
        return makeBoolean((((NIL == pph_methods_formulas.pph_exceptional_var_p(var)) && (NIL == pph_variable_handling.pph_use_explicit_varP(var))) && (((NIL == require_quantificationP) || (NIL != pph_variable_handling.pph_var_quantifiedP(var))) || (NIL != pph_variable_handling.pph_query_var_p(var)))) && (NIL == pph_variable_handling.pph_var_paraphrased_explicitlyP(var)));
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P.")
    public static final SubLObject pph_paraphrase_var_as_var_alt(SubLObject var, SubLObject consider_quantificationP, SubLObject var_phrase) {
        if (consider_quantificationP == UNPROVIDED) {
            consider_quantificationP = NIL;
        }
        if (var_phrase == UNPROVIDED) {
            var_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $TEXT) ? ((SubLObject) (cycl_variables.el_var_name(var))) : cycl_variables.el_var_name_without_prefix(var);
                SubLObject pos_pred = $$singular_Generic;
                pph_phrase.pph_phrase_set_string(var_phrase, string);
                pph_phrase.pph_phrase_set_cycl(var_phrase, var);
                pph_phrase.pph_phrase_set_output_list_cycl(var_phrase, var);
                com.cyc.cycjava.cycl.pph_methods.pph_maybe_italicize_variable_phrase(var_phrase);
                if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
                    {
                        SubLObject prefix_items = NIL;
                        if ((((NIL != consider_quantificationP) && (NIL != pph_vars.$pph_quantify_varsP$.getDynamicValue(thread))) && (NIL == pph_variable_handling.pph_var_previously_explicitP(var))) && ((((NIL == pph_phrase.pph_phrase_category(var_phrase, UNPROVIDED)) || (NIL != pph_phrase.pph_phrase_npP(var_phrase))) || (NIL != pph_phrase_resolution.pph_phrase_determinerP(var_phrase))) || (NIL != pph_phrase_resolution.pph_phrase_detpP(var_phrase)))) {
                            prefix_items = com.cyc.cycjava.cycl.pph_methods.pph_var_phrase_prefix_items(var_phrase, UNPROVIDED);
                        }
                        if ((NIL != pph_utilities.pph_isaP(var, $$Collection, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_nbarP(var_phrase))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject instance_of_item = com.cyc.cycjava.cycl.pph_methods.pph_instance_of_item(pph_phrase.pph_phrase_agr_preds(var_phrase, UNPROVIDED));
                                SubLObject instance_of_pos_pred = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                prefix_items = cons(instance_of_item, prefix_items);
                                pos_pred = (NIL != instance_of_pos_pred) ? ((SubLObject) (instance_of_pos_pred)) : pos_pred;
                            }
                        }
                        pph_phrase.pph_phrase_set_output_list(var_phrase, append(prefix_items, pph_phrase.pph_phrase_output_list(var_phrase)), UNPROVIDED);
                    }
                }
                return values(pph_phrase.pph_phrase_output_list(var_phrase), pos_pred);
            }
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P.")
    public static SubLObject pph_paraphrase_var_as_var(final SubLObject var, SubLObject consider_quantificationP, SubLObject var_phrase) {
        if (consider_quantificationP == UNPROVIDED) {
            consider_quantificationP = NIL;
        }
        if (var_phrase == UNPROVIDED) {
            var_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $TEXT) ? cycl_variables.el_var_name(var) : cycl_variables.el_var_name_without_prefix(var);
        SubLObject pos_pred = $$singular_Generic;
        pph_phrase.pph_phrase_set_string(var_phrase, string);
        pph_phrase.pph_phrase_set_cycl(var_phrase, var);
        pph_phrase.pph_phrase_set_output_list_cycl(var_phrase, var);
        pph_maybe_italicize_variable_phrase(var_phrase);
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            SubLObject prefix_items = NIL;
            if ((((NIL != consider_quantificationP) && (NIL != pph_vars.$pph_quantify_varsP$.getDynamicValue(thread))) && (NIL == pph_variable_handling.pph_var_previously_explicitP(var))) && ((((NIL == pph_phrase.pph_phrase_category(var_phrase, UNPROVIDED)) || (NIL != pph_phrase.pph_phrase_npP(var_phrase))) || (NIL != pph_phrase_resolution.pph_phrase_determinerP(var_phrase))) || (NIL != pph_phrase_resolution.pph_phrase_detpP(var_phrase)))) {
                prefix_items = pph_var_phrase_prefix_items(var_phrase, UNPROVIDED);
            }
            if ((NIL != pph_utilities.pph_isaP(var, $$Collection, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_nbarP(var_phrase))) {
                thread.resetMultipleValues();
                final SubLObject instance_of_item = pph_instance_of_item(pph_phrase.pph_phrase_agr_preds(var_phrase, UNPROVIDED));
                final SubLObject instance_of_pos_pred = thread.secondMultipleValue();
                thread.resetMultipleValues();
                prefix_items = cons(instance_of_item, prefix_items);
                pos_pred = (NIL != instance_of_pos_pred) ? instance_of_pos_pred : pos_pred;
            }
            pph_phrase.pph_phrase_set_output_list(var_phrase, append(prefix_items, pph_phrase.pph_phrase_output_list(var_phrase)), UNPROVIDED);
        }
        return values(pph_phrase.pph_phrase_output_list(var_phrase), pos_pred);
    }

    /**
     *
     *
     * @return 0 PPH-PHRASE-OUTPUT-ITEM-P; 'instance(s) of' appropriate for AGR-PREDS.
     * @return 1 SPEECH-PART-PRED?; the speech part of the output item
     */
    @LispMethod(comment = "@return 0 PPH-PHRASE-OUTPUT-ITEM-P; \'instance(s) of\' appropriate for AGR-PREDS.\r\n@return 1 SPEECH-PART-PRED?; the speech part of the output item")
    public static final SubLObject pph_instance_of_item_alt(SubLObject agr_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject generated_string = NIL;
                SubLObject pos_pred = $$singular_Generic;
                thread.resetMultipleValues();
                {
                    SubLObject generated_string_5 = pph_methods_lexicon.pph_first_string_of_wordXspeech_part($$Instance_TheWord, $$CountNoun, agr_preds, UNPROVIDED);
                    SubLObject pos_pred_6 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    generated_string = generated_string_5;
                    pos_pred = pos_pred_6;
                }
                {
                    SubLObject instance_string = (NIL != generated_string) ? ((SubLObject) (generated_string)) : $$$instance;
                    SubLObject item_string = cconcatenate(format_nil.format_nil_a_no_copy(instance_string), $str_alt47$_of);
                    return values(pph_question.new_pph_phrase_filler_item(item_string), pos_pred);
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 PPH-PHRASE-OUTPUT-ITEM-P; 'instance(s) of' appropriate for AGR-PREDS.
     * @return 1 SPEECH-PART-PRED?; the speech part of the output item
     */
    @LispMethod(comment = "@return 0 PPH-PHRASE-OUTPUT-ITEM-P; \'instance(s) of\' appropriate for AGR-PREDS.\r\n@return 1 SPEECH-PART-PRED?; the speech part of the output item")
    public static SubLObject pph_instance_of_item(final SubLObject agr_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject generated_string = NIL;
        SubLObject pos_pred = $$singular_Generic;
        thread.resetMultipleValues();
        final SubLObject generated_string_$5 = pph_methods_lexicon.pph_first_string_of_wordXspeech_part($$Instance_TheWord, $$CountNoun, agr_preds, UNPROVIDED);
        final SubLObject pos_pred_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        generated_string = generated_string_$5;
        pos_pred = pos_pred_$6;
        final SubLObject instance_string = (NIL != generated_string) ? generated_string : $$$instance;
        final SubLObject item_string = cconcatenate(format_nil.format_nil_a_no_copy(instance_string), $$$_of);
        return values(pph_question.new_pph_phrase_filler_item(item_string), pos_pred);
    }

    public static final SubLObject pph_maybe_italicize_variable_phrase_alt(SubLObject var_phrase) {
        if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_italicize_variablesP()) {
            pph_html.pph_phrase_italicize(var_phrase);
        }
        return var_phrase;
    }

    public static SubLObject pph_maybe_italicize_variable_phrase(final SubLObject var_phrase) {
        if (NIL != pph_italicize_variablesP()) {
            pph_html.pph_phrase_italicize(var_phrase);
        }
        return var_phrase;
    }

    public static final SubLObject pph_italicize_variablesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) && (NIL != pph_vars.$pph_italicize_variables_in_html_modeP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject pph_italicize_variablesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) && (NIL != pph_vars.$pph_italicize_variables_in_html_modeP$.getDynamicValue(thread)));
    }

    public static final SubLObject pph_var_phrase_prefix_items_alt(SubLObject var_phrase, SubLObject determiner_type) {
        if (determiner_type == UNPROVIDED) {
            determiner_type = com.cyc.cycjava.cycl.pph_methods.determiner_type_for_var_phrase(var_phrase);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
                SubLObject prefix_items = NIL;
                if (NIL != pph_vars.$determiners_before_variables$.getDynamicValue(thread)) {
                    {
                        SubLObject pcase_var = determiner_type;
                        if (pcase_var.eql($INDEFINITE)) {
                            if (NIL == com.cyc.cycjava.cycl.pph_methods.var_functional_in_matrix_sentenceP(var)) {
                                prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$some, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            }
                        } else {
                            if (pcase_var.eql($UNIVERSAL)) {
                                prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$every, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            } else {
                                if (pcase_var.eql($NO)) {
                                    prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$no, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                } else {
                                    if (pcase_var.eql($ANY)) {
                                        prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$any, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    }
                                }
                            }
                        }
                    }
                }
                return prefix_items;
            }
        }
    }

    public static SubLObject pph_var_phrase_prefix_items(final SubLObject var_phrase, SubLObject determiner_type) {
        if (determiner_type == UNPROVIDED) {
            determiner_type = determiner_type_for_var_phrase(var_phrase);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
        SubLObject prefix_items = NIL;
        if (NIL != pph_vars.$determiners_before_variables$.getDynamicValue(thread)) {
            final SubLObject pcase_var = determiner_type;
            if (pcase_var.eql($INDEFINITE)) {
                if (NIL == var_functional_in_matrix_sentenceP(var)) {
                    prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$some, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            } else
                if (pcase_var.eql($UNIVERSAL)) {
                    prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$every, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else
                    if (pcase_var.eql($NO)) {
                        prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$no, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } else
                        if (pcase_var.eql($ANY)) {
                            prefix_items = list(pph_data_structures.new_pph_phrase_output_item($$$any, NIL, var, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }



        }
        return prefix_items;
    }

    public static final SubLObject var_functional_in_matrix_sentenceP_alt(SubLObject var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject matrix_sentence = find_if($sym55$ATOMIC_SENTENCE_, pph_vars.$pph_cycls$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject matrix_arg0 = (NIL != matrix_sentence) ? ((SubLObject) (cycl_utilities.sentence_arg0(matrix_sentence))) : NIL;
                SubLObject functional_args = (NIL != indexed_term_p(matrix_arg0)) ? ((SubLObject) (cycl_utilities.functional_in_arg_positions(matrix_arg0, UNPROVIDED))) : NIL;
                SubLObject functionalP = NIL;
                if (NIL == functionalP) {
                    {
                        SubLObject csome_list_var = functional_args;
                        SubLObject argnum = NIL;
                        for (argnum = csome_list_var.first(); !((NIL != functionalP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , argnum = csome_list_var.first()) {
                            if (var.eql(cycl_utilities.atomic_sentence_arg(matrix_sentence, argnum, UNPROVIDED))) {
                                functionalP = T;
                            }
                        }
                    }
                }
                return functionalP;
            }
        }
    }

    public static SubLObject var_functional_in_matrix_sentenceP(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject matrix_sentence = find_if($sym52$ATOMIC_SENTENCE_, pph_vars.$pph_cycls$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject matrix_arg0 = (NIL != matrix_sentence) ? cycl_utilities.sentence_arg0(matrix_sentence) : NIL;
        final SubLObject functional_args = (NIL != indexed_term_p(matrix_arg0)) ? cycl_utilities.functional_in_arg_positions(matrix_arg0, UNPROVIDED) : NIL;
        SubLObject functionalP = NIL;
        if (NIL == functionalP) {
            SubLObject csome_list_var = functional_args;
            SubLObject argnum = NIL;
            argnum = csome_list_var.first();
            while ((NIL == functionalP) && (NIL != csome_list_var)) {
                if (var.eql(cycl_utilities.atomic_sentence_arg(matrix_sentence, argnum, UNPROVIDED))) {
                    functionalP = T;
                }
                csome_list_var = csome_list_var.rest();
                argnum = csome_list_var.first();
            } 
        }
        return functionalP;
    }

    public static final SubLObject pph_paraphrase_var_with_type_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject cat = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
                SubLObject pred_from_phrase = (NIL != pph_phrase.pph_phrase_nominalP(phrase)) ? ((SubLObject) (pph_phrase.pph_phrase_agr_pred(phrase))) : NIL;
                SubLObject agr_pred = (NIL != pred_from_phrase) ? ((SubLObject) (pred_from_phrase)) : $$nonPlural_Generic;
                SubLObject type = pph_variable_handling.pph_var_type(var);
                SubLObject duplicate_typeP = (NIL != type) ? ((SubLObject) (pph_variable_handling.pph_duplicate_var_typeP(type))) : NIL;
                SubLObject previously_paraphrasedP = pph_variable_handling.pph_var_previously_paraphrasedP(var);
                SubLObject determiner_type = com.cyc.cycjava.cycl.pph_methods.determiner_type_for_var_phrase(phrase);
                SubLObject paraphrase_pred = NIL;
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt56$__Paraphrasing__S_as__S_in_contex, new SubLObject[]{ var, type, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread) });
                }
                if ((((((NIL != pph_phrase_resolution.anaphor_needed_for_phraseP(phrase)) && (NIL != type)) && (NIL != previously_paraphrasedP)) && (NIL == duplicate_typeP)) && (NIL == lexicon_accessors.nbarP(cat))) && ((NIL != pph_variable_handling.pph_var_previously_pronounP(var)) || (NIL == pph_methods_lexicon.pph_maybe_ambiguous_pronounP(var)))) {
                    {
                        SubLObject olist = pph_methods_lexicon.pph_generate_pronoun(phrase);
                        if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                            pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                            paraphrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                            pph_phrase.pph_phrase_note_done(phrase);
                        }
                    }
                }
                if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                    {
                        SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
                        SubLObject var_phrase = com.cyc.cycjava.cycl.pph_methods.pph_lexify_var(var, determiner_type, cat, agr_pred, map, phrase);
                        SubLObject lexified_output_list = pph_phrase.pph_phrase_output_list(var_phrase);
                        if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(lexified_output_list)) {
                            paraphrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                            pph_phrase.pph_phrase_copy(var_phrase, phrase, UNPROVIDED);
                            pph_phrase.pph_phrase_note_done(phrase);
                        }
                    }
                }
                return values(NIL != pph_phrase.pph_phrase_doneP(phrase) ? ((SubLObject) (pph_phrase.pph_phrase_output_list(phrase))) : NIL, NIL != pph_phrase.pph_phrase_doneP(phrase) ? ((SubLObject) (paraphrase_pred)) : NIL);
            }
        }
    }

    public static SubLObject pph_paraphrase_var_with_type(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject cat = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
        final SubLObject pred_from_phrase = (NIL != pph_phrase.pph_phrase_nominalP(phrase)) ? pph_phrase.pph_phrase_agr_pred(phrase) : NIL;
        final SubLObject agr_pred = (NIL != pred_from_phrase) ? pred_from_phrase : $$nonPlural_Generic;
        final SubLObject type = pph_variable_handling.pph_var_type(var);
        final SubLObject duplicate_typeP = (NIL != type) ? pph_variable_handling.pph_duplicate_var_typeP(type) : NIL;
        final SubLObject previously_paraphrasedP = pph_drs.pph_discourse_referentP(var);
        final SubLObject determiner_type = determiner_type_for_var_phrase(phrase);
        SubLObject paraphrase_pred = NIL;
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str53$__Paraphrasing__S_as__S_in_contex, var, type, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((((((NIL != pph_phrase_resolution.anaphor_needed_for_phraseP(phrase)) && (NIL != type)) && (NIL != previously_paraphrasedP)) && (NIL == duplicate_typeP)) && (NIL == lexicon_accessors.nbarP(cat))) && ((NIL != pph_variable_handling.pph_var_previously_pronounP(var)) || (NIL == pph_methods_lexicon.pph_maybe_ambiguous_pronounP(var)))) {
            final SubLObject olist = pph_methods_lexicon.pph_generate_pronoun(phrase);
            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                paraphrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject var_phrase = pph_lexify_var(var, determiner_type, cat, agr_pred, map, phrase);
            final SubLObject lexified_output_list = (NIL != pph_phrase.pph_phrase_doneP(var_phrase)) ? pph_phrase.pph_phrase_output_list(var_phrase) : NIL;
            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(lexified_output_list)) {
                paraphrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                pph_phrase.pph_phrase_copy(var_phrase, phrase, UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        return values(NIL != pph_phrase.pph_phrase_doneP(phrase) ? pph_phrase.pph_phrase_output_list(phrase) : NIL, NIL != pph_phrase.pph_phrase_doneP(phrase) ? paraphrase_pred : NIL);
    }

    public static final SubLObject pph_lexify_var_alt(SubLObject var, SubLObject determiner_type, SubLObject category, SubLObject agr_pred, SubLObject map, SubLObject mother) {
        if (agr_pred == UNPROVIDED) {
            agr_pred = NIL;
        }
        if (map == UNPROVIDED) {
            map = pph_utilities.pph_new_identity_map();
        }
        if (mother == UNPROVIDED) {
            mother = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mother) {
                mother = pph_phrase.new_pph_phrase_for_cycl(var, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject type = com.cyc.cycjava.cycl.pph_methods.pph_var_type_for_lexification(var, UNPROVIDED);
                SubLObject type_map = pph_variable_handling.pph_type_arg_position_map(var);
                SubLObject nbarP = lexicon_accessors.nbarP(category);
                SubLObject det_or_detpP = makeBoolean((NIL != category) && ((NIL != pph_utilities.pph_genl_posP(category, $$Determiner, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_posP(category, $list_alt58, UNPROVIDED))));
                SubLObject cycl_template_fn = (NIL != nbarP) ? ((SubLObject) (PPH_NBAR_CYCL_TEMPLATE_FOR_TERM_TYPE)) : NIL != det_or_detpP ? ((SubLObject) (PPH_DETP_CYCL_TEMPLATE_FOR_TERM_TYPE)) : PPH_NP_CYCL_TEMPLATE_FOR_TERM_TYPE;
                SubLObject agr_pred_to_use = (NIL != pph_utilities.pph_genl_pos_predP(agr_pred, $$nounStrings, UNPROVIDED)) ? ((SubLObject) (agr_pred)) : $$singular_Generic;
                SubLObject var_phrase_naut = funcall(cycl_template_fn, type, determiner_type, agr_pred_to_use);
                SubLObject agr_pred_okP = makeBoolean((NIL == agr_pred) || (NIL != pph_utilities.pph_filter_preds(list(agr_pred), list(agr_pred_to_use), UNPROVIDED)));
                SubLObject var_phrase = NIL;
                if (NIL == agr_pred_okP) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        Errors.warn($str_alt63$Can_t_reconcile__S_with__S, agr_pred, agr_pred_to_use);
                    }
                }
                if (NIL != agr_pred_okP) {
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                        try {
                            pph_vars.$pph_current_arg0$.bind(pph_phrase.pph_unknown_cycl(), thread);
                            var_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(var_phrase_naut, type_map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
                        }
                    }
                    pph_phrase.pph_phrase_add_dtr_to_terminal(mother, var_phrase);
                    pph_phrase_resolution.pph_phrase_replace_generic_args(var_phrase, type, type_map);
                    pph_phrase.pph_phrase_set_category(var_phrase, category, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_use_expansions_for_precisionP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_use_expansions_for_precisionP$.bind(NIL, thread);
                            pph_phrase_resolution.pph_phrase_get_string(mother, UNPROVIDED, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_use_expansions_for_precisionP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(mother)) {
                        pph_variable_handling.pph_update_var_type(var, type);
                        com.cyc.cycjava.cycl.pph_methods.pph_phrase_maybe_add_disambiguation(var, mother, determiner_type);
                        com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_var_type_arg_positions(mother, type, type_map);
                        com.cyc.cycjava.cycl.pph_methods.pph_phrase_set_var_arg_position(var, mother, map);
                    }
                }
                return mother;
            }
        }
    }

    public static SubLObject pph_lexify_var(final SubLObject var, final SubLObject determiner_type, final SubLObject category, SubLObject agr_pred, SubLObject map, SubLObject mother) {
        if (agr_pred == UNPROVIDED) {
            agr_pred = NIL;
        }
        if (map == UNPROVIDED) {
            map = pph_utilities.pph_new_identity_map();
        }
        if (mother == UNPROVIDED) {
            mother = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mother) {
            mother = pph_phrase.new_pph_phrase_for_cycl(var, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject type = pph_var_type_for_lexification(var, T);
        final SubLObject type_map = pph_variable_handling.pph_type_arg_position_map(var);
        final SubLObject nbarP = lexicon_accessors.nbarP(category);
        final SubLObject other_neededP = pph_use_other_for_varP(var);
        final SubLObject det_or_detpP = makeBoolean((NIL != category) && ((NIL != pph_utilities.pph_genl_posP(category, $$Determiner, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_posP(category, $list55, UNPROVIDED))));
        final SubLObject cycl_template_fn = (NIL != nbarP) ? PPH_NBAR_CYCL_TEMPLATE_FOR_TERM_TYPE : NIL != det_or_detpP ? PPH_DETP_CYCL_TEMPLATE_FOR_TERM_TYPE : PPH_NP_CYCL_TEMPLATE_FOR_TERM_TYPE;
        final SubLObject agr_pred_to_use = (NIL != pph_utilities.pph_genl_pos_predP(agr_pred, $$nounStrings, UNPROVIDED)) ? agr_pred : $$singular_Generic;
        final SubLObject var_phrase_naut = funcall(cycl_template_fn, type, determiner_type, agr_pred_to_use, other_neededP);
        final SubLObject agr_pred_okP = makeBoolean((NIL == agr_pred) || (NIL != pph_utilities.pph_filter_preds(list(agr_pred), list(agr_pred_to_use), UNPROVIDED)));
        SubLObject var_phrase = NIL;
        if (((NIL == agr_pred_okP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str60$Can_t_reconcile__S_with__S, agr_pred, agr_pred_to_use);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        if (NIL != agr_pred_okP) {
            SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind(pph_phrase.pph_unknown_cycl(), thread);
                var_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(var_phrase_naut, type_map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
            }
            pph_phrase.pph_phrase_add_dtr_to_terminal(mother, var_phrase);
            pph_phrase_resolution.pph_phrase_replace_generic_args(var_phrase, type, type_map);
            pph_phrase.pph_phrase_set_category(var_phrase, category, UNPROVIDED);
            _prev_bind_0 = pph_vars.$pph_use_expansions_for_precisionP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_expansions_for_precisionP$.bind(NIL, thread);
                pph_phrase_resolution.pph_phrase_get_string(mother, UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$pph_use_expansions_for_precisionP$.rebind(_prev_bind_0, thread);
            }
            if (NIL != pph_phrase.pph_phrase_doneP(mother)) {
                pph_variable_handling.pph_update_var_type(var, type);
                if (NIL == other_neededP) {
                    pph_phrase_maybe_explicitify_var_phrase(var_phrase, var, determiner_type);
                }
                pph_phrase_set_var_type_arg_positions(mother, type, type_map);
                pph_phrase_set_var_arg_position(var, mother, map);
            }
        }
        return mother;
    }

    public static SubLObject pph_use_other_for_varP(final SubLObject var) {
        return different_instance_same_typeP(var);
    }

    public static final SubLObject pph_var_type_for_lexification_alt(SubLObject var, SubLObject use_registered_type_directlyP) {
        if (use_registered_type_directlyP == UNPROVIDED) {
            use_registered_type_directlyP = makeBoolean((NIL != pph_utilities.pph_top_level_preciseP()) || (NIL != pph_vars.pph_inside_negation_scope_p()));
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject registered_type = pph_variable_handling.pph_var_type(var);
                SubLObject quantification = pph_variable_handling.pph_var_quantifier(var);
                return NIL != use_registered_type_directlyP ? ((SubLObject) (registered_type)) : com.cyc.cycjava.cycl.pph_methods.pph_var_type_for_lexification_internal(registered_type, quantification, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            }
        }
    }

    public static SubLObject pph_var_type_for_lexification(final SubLObject var, SubLObject use_registered_type_directlyP) {
        if (use_registered_type_directlyP == UNPROVIDED) {
            use_registered_type_directlyP = makeBoolean((NIL != pph_utilities.pph_top_level_preciseP()) || (NIL != pph_vars.pph_inside_negation_scope_p()));
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject registered_type = pph_variable_handling.pph_var_type(var);
        final SubLObject quantification = pph_variable_handling.pph_var_quantifier(var);
        return NIL != use_registered_type_directlyP ? registered_type : pph_var_type_for_lexification_internal(registered_type, quantification, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
    }

    public static final SubLObject pph_var_type_for_lexification_internal_alt(SubLObject registered_type, SubLObject quantification, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type_for_lexification = registered_type;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    try {
                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                        if (NIL != pph_utilities.pph_isaP(registered_type, $$FacetingCollectionType, UNPROVIDED)) {
                            {
                                SubLObject type_genlss = list_utilities.remove_subsumed_items(pph_utilities.pph_ask_variable_new($sym65$_TG, listS($$typeGenls, registered_type, $list_alt67), UNPROVIDED, UNPROVIDED), $sym68$PPH_GENL_, UNPROVIDED);
                                SubLObject doneP = NIL;
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = type_genlss;
                                        SubLObject type_genls = NIL;
                                        for (type_genls = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type_genls = csome_list_var.first()) {
                                            if (NIL == com.cyc.cycjava.cycl.pph_methods.pph_highly_faceted_typeP(type_genls)) {
                                                type_for_lexification = pph_utilities.pph_make_type_level(type_genls);
                                                doneP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (((quantification == $EXISTENTIAL) && (NIL == cycl_variables.el_varP(registered_type))) && (NIL == pph_utilities.pph_top_level_preciseP())) {
                                {
                                    SubLObject salient_generalization = pph_utilities.pph_salient_generalization(registered_type, domain_mt, NIL);
                                    type_for_lexification = (NIL != salient_generalization) ? ((SubLObject) (salient_generalization)) : registered_type;
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return type_for_lexification;
            }
        }
    }

    public static SubLObject pph_var_type_for_lexification_internal(final SubLObject registered_type, final SubLObject quantification, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type_for_lexification = registered_type;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            if (NIL != pph_utilities.pph_isaP(registered_type, $$FacetingCollectionType, UNPROVIDED)) {
                final SubLObject type_genlss = list_utilities.remove_subsumed_items(pph_utilities.pph_ask_variable_new($sym62$_TG, listS($$typeGenls, registered_type, $list64), UNPROVIDED, UNPROVIDED), $sym65$PPH_GENL_, UNPROVIDED);
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var = type_genlss;
                    SubLObject type_genls = NIL;
                    type_genls = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if (NIL == pph_highly_faceted_typeP(type_genls)) {
                            type_for_lexification = pph_utilities.pph_make_type_level(type_genls);
                            doneP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        type_genls = csome_list_var.first();
                    } 
                }
            } else
                if (((quantification == $EXISTENTIAL) && (NIL == cycl_variables.el_varP(registered_type))) && (NIL == pph_utilities.pph_top_level_preciseP())) {
                    final SubLObject salient_generalization = pph_utilities.pph_salient_generalization(registered_type, domain_mt, NIL);
                    type_for_lexification = (NIL != salient_generalization) ? salient_generalization : registered_type;
                }

        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return type_for_lexification;
    }

    public static final SubLObject pph_highly_faceted_typeP_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject count = ZERO_INTEGER;
                if (NIL != subl_promotions.positive_integer_p($pph_facet_threshold$.getDynamicValue(thread))) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL == ans) {
                                    {
                                        SubLObject node_var = $$typeGenls;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        SubLObject node_and_predicate_mode = NIL;
                                        {
                                            SubLObject _prev_bind_0_7 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = $$True_JustificationTruth;
                                                    {
                                                        SubLObject _prev_bind_0_8 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt81$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$typeGenls, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                node_and_predicate_mode = list($$typeGenls, sbhl_search_vars.genl_inverse_mode_p());
                                                                                while ((NIL != node_and_predicate_mode) && (NIL == ans)) {
                                                                                    {
                                                                                        SubLObject node_var_16 = node_and_predicate_mode.first();
                                                                                        SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                        SubLObject pred = node_var_16;
                                                                                        {
                                                                                            SubLObject _prev_bind_0_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                                {
                                                                                                    SubLObject inverseP = predicate_mode;
                                                                                                    SubLObject argnum = (NIL != inverseP) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                                                                                                    SubLObject facet_types = kb_mapping_utilities.pred_values_in_relevant_mts(type, pred, pph_vars.$pph_domain_mt$.getDynamicValue(thread), argnum, subtract(THREE_INTEGER, argnum), UNPROVIDED);
                                                                                                    if (NIL == ans) {
                                                                                                        {
                                                                                                            SubLObject csome_list_var = facet_types;
                                                                                                            SubLObject facet_type = NIL;
                                                                                                            for (facet_type = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , facet_type = csome_list_var.first()) {
                                                                                                                if (NIL != pph_utilities.pph_isaP(facet_type, $$FacetingCollectionType, UNPROVIDED)) {
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                    if (count.numGE($pph_facet_threshold$.getDynamicValue(thread))) {
                                                                                                                        ans = T;
                                                                                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                                                                            Errors.warn($str_alt83$Skipping__S_as_too_highly_faceted, type, $pph_facet_threshold$.getDynamicValue(thread));
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    {
                                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                        SubLObject rest = NIL;
                                                                                                        for (rest = accessible_modules; !((NIL != ans) || (NIL == rest)); rest = rest.rest()) {
                                                                                                            {
                                                                                                                SubLObject module_var = rest.first();
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                        {
                                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_16);
                                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                {
                                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != d_link) {
                                                                                                                                        {
                                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                            if (NIL != mt_links) {
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                    while (!((NIL != ans) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject iteration_state_21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                            while (!((NIL != ans) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_21)))) {
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_21);
                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                            try {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                    SubLObject rest_23 = NIL;
                                                                                                                                                                                                    for (rest_23 = new_list; !((NIL != ans) || (NIL == rest_23)); rest_23 = rest_23.rest()) {
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject node_vars_link_node = rest_23.first();
                                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } finally {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_22, thread);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    iteration_state_21 = dictionary_contents.do_dictionary_contents_next(iteration_state_21);
                                                                                                                                                                                }
                                                                                                                                                                            } 
                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_21);
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_20, thread);
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
                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt84$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                    {
                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        SubLObject rest_24 = NIL;
                                                                                                                                        for (rest_24 = new_list; !((NIL != ans) || (NIL == rest_24)); rest_24 = rest_24.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject generating_fn = rest_24.first();
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                            SubLObject new_list_26 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject rest_27 = NIL;
                                                                                                                                                            for (rest_27 = new_list_26; !((NIL != ans) || (NIL == rest_27)); rest_27 = rest_27.rest()) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject node_vars_link_node = rest_27.first();
                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_25, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_19, thread);
                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_18, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_17, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_15, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_14, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_13, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt85$Node__a_does_not_pass_sbhl_type_t, $$typeGenls, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_12, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_11, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_10, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_9, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject pph_highly_faceted_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject count = ZERO_INTEGER;
        if (NIL != subl_promotions.positive_integer_p($pph_facet_threshold$.getDynamicValue(thread))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == ans) {
                    final SubLObject node_var = $$typeGenls;
                    final SubLObject deck_type = $QUEUE;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = $$True_JustificationTruth;
                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$typeGenls, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            for (node_and_predicate_mode = list($$typeGenls, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == ans); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$16 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                final SubLObject pred = node_var_$16;
                                                final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    final SubLObject argnum = (NIL != inverseP) ? ONE_INTEGER : TWO_INTEGER;
                                                    final SubLObject facet_types = kb_mapping_utilities.pred_values_in_relevant_mts(type, pred, pph_vars.$pph_domain_mt$.getDynamicValue(thread), argnum, subtract(THREE_INTEGER, argnum), UNPROVIDED);
                                                    if (NIL == ans) {
                                                        SubLObject csome_list_var = facet_types;
                                                        SubLObject facet_type = NIL;
                                                        facet_type = csome_list_var.first();
                                                        while ((NIL == ans) && (NIL != csome_list_var)) {
                                                            if (NIL != pph_utilities.pph_isaP(facet_type, $$FacetingCollectionType, UNPROVIDED)) {
                                                                count = add(count, ONE_INTEGER);
                                                                if (count.numGE($pph_facet_threshold$.getDynamicValue(thread))) {
                                                                    ans = T;
                                                                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                                        Errors.warn($str80$Skipping__S_as_too_highly_faceted, type, $pph_facet_threshold$.getDynamicValue(thread));
                                                                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                                    }
                                                                }
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            facet_type = csome_list_var.first();
                                                        } 
                                                    }
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$12;
                                                    SubLObject _prev_bind_1_$12;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$13;
                                                    SubLObject iteration_state_$21;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$14;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var2;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$23;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$15;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == ans) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var_$16);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == ans) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == ans) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21)); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == ans) {
                                                                                                            csome_list_var2 = sol;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                            while ((NIL == ans) && (NIL != csome_list_var2)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str81$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str82$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$23 = NIL, rest_$23 = new_list; (NIL == ans) && (NIL != rest_$23); rest_$23 = rest_$23.rest()) {
                                                                        generating_fn = rest_$23.first();
                                                                        _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == ans) {
                                                                                        csome_list_var3 = sol2;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                        while ((NIL == ans) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str81$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$12, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$11, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$11, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, $$typeGenls, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$12, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$10, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$9, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$8, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    /**
     * Return a map that will let us map a top-level CycL expression to ARG-POSITION.
     */
    @LispMethod(comment = "Return a map that will let us map a top-level CycL expression to ARG-POSITION.")
    public static final SubLObject pph_var_arg_position_map_alt(SubLObject arg_position) {
        {
            SubLObject template = pph_utilities.pph_cycl_template_from_arg_position(arg_position);
            return pph_utilities.pph_figure_new_arg_position_map(pph_utilities.pph_new_identity_map(), template);
        }
    }

    /**
     * Return a map that will let us map a top-level CycL expression to ARG-POSITION.
     */
    @LispMethod(comment = "Return a map that will let us map a top-level CycL expression to ARG-POSITION.")
    public static SubLObject pph_var_arg_position_map(final SubLObject arg_position) {
        final SubLObject template = pph_utilities.pph_cycl_template_from_arg_position(arg_position);
        return pph_utilities.pph_figure_new_arg_position_map(pph_utilities.pph_new_identity_map(), template);
    }

    public static final SubLObject determiner_type_for_var_phrase_alt(SubLObject var_phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
                SubLObject npi_licensor = com.cyc.cycjava.cycl.pph_methods.pph_npi_licensor(var_phrase);
                if (ONE_INTEGER.numE(pph_variable_handling.pph_var_count_previous_paraphrases(var))) {
                    return $BACKREFERENCE_CLASSB;
                } else {
                    if (NIL != pph_variable_handling.pph_var_previously_paraphrasedP(var)) {
                        return $DEFINITE;
                    } else {
                        if ((NIL != pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread)) && (NIL != pph_variable_handling.pph_query_var_p(var))) {
                            return $WHAT;
                        } else {
                            if ((NIL != npi_licensor) && (NIL != find(npi_licensor, pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                pph_vars.$pph_unexpressed_negations$.setDynamicValue(remove(npi_licensor, pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                return $NO;
                            } else {
                                if (NIL != npi_licensor) {
                                    {
                                        SubLObject only_referenceP = pph_phrase.pph_sole_reference_p(var_phrase, var);
                                        return NIL != only_referenceP ? ((SubLObject) ($ANY)) : $INDEFINITE;
                                    }
                                } else {
                                    if (pph_variable_handling.pph_var_quantifier(var) == $UNIVERSAL) {
                                        return $UNIVERSAL;
                                    } else {
                                        return $INDEFINITE;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject determiner_type_for_var_phrase(final SubLObject var_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
        final SubLObject npi_licensor = pph_npi_licensor(var_phrase);
        if (ONE_INTEGER.numE(pph_drs.pph_count_previous_paraphrases(var))) {
            return $BACKREFERENCE_CLASSB;
        }
        if (NIL != pph_drs.pph_discourse_rm_lookup(var)) {
            return $DEFINITE;
        }
        if ((NIL != pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread)) && (NIL != pph_variable_handling.pph_query_var_p(var))) {
            return $WHAT;
        }
        if ((NIL != npi_licensor) && (NIL != pph_vars.unexpressed_negationP(npi_licensor))) {
            pph_vars.note_unexpressed_negation_expressed(npi_licensor, DETERMINER_TYPE_FOR_VAR_PHRASE);
            return $NO;
        }
        if ((NIL != npi_licensor) || ((NIL != pph_var_phrase_var_bound_by_universal_introductionP(var_phrase)) && (NIL != pph_var_phrase_in_if_clauseP(var_phrase)))) {
            final SubLObject only_referenceP = pph_phrase.pph_sole_reference_p(var_phrase, var);
            return NIL != only_referenceP ? $ANY : $INDEFINITE;
        }
        if (pph_variable_handling.pph_var_quantifier(var) == $UNIVERSAL) {
            return $UNIVERSAL;
        }
        return $INDEFINITE;
    }

    public static SubLObject pph_var_phrase_var_bound_by_universal_introductionP(final SubLObject var_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
        for (SubLObject mother = pph_phrase.pph_phrase_mother(var_phrase); NIL != pph_phrase.pph_phrase_p(mother, UNPROVIDED); mother = pph_phrase.pph_phrase_mother(mother)) {
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_justification(mother);
            SubLObject just = NIL;
            just = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(just, $list88);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject vars = list_utilities.alist_lookup_without_values(v_bindings, VARS, UNPROVIDED, UNPROVIDED);
                    if (NIL != subl_promotions.memberP(var, vars, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str90$Bound_by_universal_introduction__, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return T;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                just = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject pph_var_phrase_in_if_clauseP(final SubLObject var_phrase) {
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return NIL;
        }
        SubLObject var_dtr = var_phrase;
        for (SubLObject test_phrase = pph_phrase.pph_phrase_mother(var_phrase); NIL != pph_phrase.pph_phrase_p(test_phrase, UNPROVIDED); test_phrase = pph_phrase.pph_phrase_mother(test_phrase)) {
            SubLObject state = $START;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(test_phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(test_phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject pcase_var;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    pcase_var = state;
                    if (pcase_var.eql($START)) {
                        if ((NIL != pph_phrase.pph_phrase_doneP(dtr)) && pph_phrase.pph_phrase_string(dtr, UNPROVIDED).equalp($$$if)) {
                            state = $FOUND_IF;
                        }
                    } else
                        if (pcase_var.eql($FOUND_IF)) {
                            if (dtr.eql(var_dtr)) {
                                state = $FOUND_VAR_DTR;
                            }
                        } else
                            if ((pcase_var.eql($FOUND_VAR_DTR) && (NIL != pph_phrase.pph_phrase_doneP(dtr))) && pph_phrase.pph_phrase_string(dtr, UNPROVIDED).equalp($str95$_)) {
                                return T;
                            }


                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            var_dtr = test_phrase;
        }
        return NIL;
    }

    public static final SubLObject pph_npi_licensor_alt(SubLObject var_phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
                SubLObject arg_position = pph_phrase.pph_phrase_arg_position(var_phrase);
                SubLObject top_level_cycl = pph_vars.pph_top_level_cycl();
                SubLObject arg_position_cycl = (NIL != arg_position) ? ((SubLObject) (cycl_utilities.formula_arg_position(top_level_cycl, arg_position, UNPROVIDED))) : top_level_cycl;
                if ((!arg_position_cycl.equal(var)) && (NIL != arg_position)) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt89$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt90$__, format_nil.format_nil_a_no_copy($str_alt91$Arg_position__S_applied_to_top_le) });
                        pph_error.pph_handle_error(new_format_string, list(arg_position, pph_vars.pph_top_level_cycl(), var, arg_position_cycl, pph_vars.$pph_cycls$.getDynamicValue(thread)));
                    }
                    return NIL;
                }
                return com.cyc.cycjava.cycl.pph_methods.pph_npi_licensor_int(var, arg_position, top_level_cycl);
            }
        }
    }

    public static SubLObject pph_npi_licensor(final SubLObject var_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = pph_phrase.pph_phrase_cycl(var_phrase, UNPROVIDED);
        final SubLObject arg_position = pph_phrase.pph_phrase_arg_position(var_phrase);
        final SubLObject top_level_cycl = pph_vars.pph_top_level_cycl();
        if (NIL == el_formula_p(top_level_cycl)) {
            return NIL;
        }
        final SubLObject arg_position_cycl = (NIL != pph_utilities.pph_known_arg_position_p(arg_position)) ? cycl_utilities.formula_arg_position(top_level_cycl, arg_position, UNPROVIDED) : top_level_cycl;
        if (!arg_position_cycl.equal(var)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str96$Arg_position__S_applied_to_top_le, new SubLObject[]{ arg_position, pph_vars.pph_top_level_cycl(), var, arg_position_cycl, pph_vars.$pph_cycls$.getDynamicValue(thread) });
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return NIL;
        }
        return pph_npi_licensor_int(var, arg_position, top_level_cycl);
    }

    public static final SubLObject pph_npi_licensor_int_alt(SubLObject var, SubLObject arg_position, SubLObject cycl) {
        {
            SubLObject current_position = NIL;
            SubLObject remaining_arg_position = arg_position;
            SubLObject nonveridical_op = NIL;
            SubLObject quantifier_existentialP = NIL;
            SubLObject quantifier_universalP = NIL;
            if (NIL != member(var, obsolete.formula_free_variables(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                quantifier_universalP = T;
            }
            while (NIL != remaining_arg_position) {
                {
                    SubLObject current_cycl = cycl_utilities.formula_arg_position(cycl, current_position, UNPROVIDED);
                    SubLObject current_arg0 = cycl_utilities.formula_arg0(current_cycl);
                    if (var.equal(cycl_utilities.formula_arg1(current_cycl, UNPROVIDED))) {
                        if (current_arg0.equal($$thereExists)) {
                            quantifier_existentialP = T;
                            if (NIL != nonveridical_op) {
                                return nonveridical_op;
                            }
                        } else {
                            if (current_arg0.equal($$forAll)) {
                                quantifier_universalP = T;
                            }
                        }
                    }
                    if (remaining_arg_position.first().equal(com.cyc.cycjava.cycl.pph_methods.pph_operator_downward_entailing_in_which_arg(current_arg0))) {
                        if (NIL != quantifier_universalP) {
                            return append(current_position, list(ZERO_INTEGER));
                        }
                        nonveridical_op = append(current_position, list(ZERO_INTEGER));
                    }
                }
                current_position = append(current_position, list(remaining_arg_position.first()));
                remaining_arg_position = remaining_arg_position.rest();
            } 
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format(T, $str_alt94$Var__S_at_arg_position__S_in_cycl);
            }
            if (!((NIL != quantifier_existentialP) || (NIL != quantifier_universalP))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    Errors.warn($str_alt95$Quantifier_for_var__S_not_found_i);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pph_npi_licensor_int(final SubLObject var, final SubLObject arg_position, final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_position = NIL;
        SubLObject remaining_arg_position = arg_position;
        SubLObject nonveridical_op = NIL;
        SubLObject quantifier_existentialP = NIL;
        SubLObject quantifier_universalP = NIL;
        if (NIL != member(var, obsolete.formula_free_variables(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            quantifier_universalP = T;
        }
        while (NIL != remaining_arg_position) {
            final SubLObject current_cycl = cycl_utilities.formula_arg_position(cycl, current_position, UNPROVIDED);
            final SubLObject current_arg0 = cycl_utilities.formula_arg0(current_cycl);
            if (var.equal(cycl_utilities.formula_arg1(current_cycl, UNPROVIDED))) {
                if (current_arg0.equal($$thereExists)) {
                    quantifier_existentialP = T;
                    if (NIL != nonveridical_op) {
                        return nonveridical_op;
                    }
                } else
                    if (current_arg0.equal($$forAll)) {
                        quantifier_universalP = T;
                    }

            }
            if (remaining_arg_position.first().equal(pph_operator_downward_entailing_in_which_arg(current_arg0))) {
                if (NIL != quantifier_universalP) {
                    return append(current_position, list(ZERO_INTEGER));
                }
                nonveridical_op = append(current_position, list(ZERO_INTEGER));
            }
            current_position = append(current_position, list(remaining_arg_position.first()));
            remaining_arg_position = remaining_arg_position.rest();
        } 
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str99$Var__S_at_arg_position__S_in_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((((NIL == quantifier_existentialP) && (NIL == quantifier_universalP)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str100$Quantifier_for_var__S_not_found_i);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject pph_downward_entailing_operator_p_alt(SubLObject reln) {
        return subl_promotions.memberP(reln, $list_alt96, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_downward_entailing_operator_p(final SubLObject reln) {
        return subl_promotions.memberP(reln, $list101, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_operator_downward_entailing_in_which_arg_alt(SubLObject reln) {
        return NIL != com.cyc.cycjava.cycl.pph_methods.pph_downward_entailing_operator_p(reln) ? ((SubLObject) (ONE_INTEGER)) : NIL;
    }

    public static SubLObject pph_operator_downward_entailing_in_which_arg(final SubLObject reln) {
        return NIL != pph_downward_entailing_operator_p(reln) ? ONE_INTEGER : NIL;
    }

    /**
     *
     *
     * @return output list of VAR-PHRASE, possibly modified.
     */
    @LispMethod(comment = "@return output list of VAR-PHRASE, possibly modified.")
    public static final SubLObject pph_phrase_maybe_add_disambiguation_alt(SubLObject var, SubLObject var_phrase, SubLObject determiner_type) {
        {
            SubLObject otherP = com.cyc.cycjava.cycl.pph_methods.pph_phrase_maybe_add_other(var, var_phrase);
            if (NIL == otherP) {
                com.cyc.cycjava.cycl.pph_methods.pph_phrase_maybe_explicitify_var_phrase(var_phrase, var, determiner_type);
            }
        }
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    /**
     *
     *
     * @return output list of VAR-PHRASE, possibly modified.
     */
    @LispMethod(comment = "@return output list of VAR-PHRASE, possibly modified.")
    public static SubLObject pph_phrase_maybe_add_disambiguation(final SubLObject var, final SubLObject var_phrase, final SubLObject determiner_type) {
        final SubLObject otherP = pph_phrase_maybe_add_other(var, var_phrase);
        if (NIL == otherP) {
            pph_phrase_maybe_explicitify_var_phrase(var_phrase, var, determiner_type);
        }
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    /**
     * Put the word 'other' into VAR-PHRASE if appropriate.
     */
    @LispMethod(comment = "Put the word \'other\' into VAR-PHRASE if appropriate.")
    public static final SubLObject pph_phrase_maybe_add_other_alt(SubLObject var, SubLObject var_phrase) {
        if (NIL != com.cyc.cycjava.cycl.pph_methods.different_instance_same_typeP(var)) {
            return com.cyc.cycjava.cycl.pph_methods.pph_phrase_add_other(var_phrase);
        } else {
            return NIL;
        }
    }

    /**
     * Put the word 'other' into VAR-PHRASE if appropriate.
     */
    @LispMethod(comment = "Put the word \'other\' into VAR-PHRASE if appropriate.")
    public static SubLObject pph_phrase_maybe_add_other(final SubLObject var, final SubLObject var_phrase) {
        if (NIL != different_instance_same_typeP(var)) {
            return pph_phrase_add_other(var_phrase);
        }
        return NIL;
    }

    /**
     * Is VAR a second instance of its type?
     */
    @LispMethod(comment = "Is VAR a second instance of its type?")
    public static final SubLObject different_instance_same_typeP_alt(SubLObject var) {
        {
            SubLObject duplicateP = NIL;
            SubLObject strictP = NIL;
            if ((NIL == pph_variable_handling.pph_var_previously_paraphrasedP(var)) || (NIL != pph_variable_handling.pph_var_previously_paraphrased_with_otherP(var))) {
                if (NIL == duplicateP) {
                    {
                        SubLObject csome_list_var = pph_variable_handling.pph_other_vars_with_var_type(var);
                        SubLObject other_var = NIL;
                        for (other_var = csome_list_var.first(); !((NIL != duplicateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_var = csome_list_var.first()) {
                            if ((NIL != pph_variable_handling.pph_var_previously_paraphrasedP(other_var)) && (NIL != pph_variable_handling.pph_different_varsP(var, other_var, strictP))) {
                                duplicateP = T;
                            }
                        }
                    }
                }
            }
            return duplicateP;
        }
    }

    /**
     * Is VAR a second instance of its type?
     */
    @LispMethod(comment = "Is VAR a second instance of its type?")
    public static SubLObject different_instance_same_typeP(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject duplicateP = NIL;
        final SubLObject strictP = makeBoolean(NIL == $pph_assume_distinct_vars_require_different_bindingsP$.getDynamicValue(thread));
        if (((NIL == pph_drs.pph_discourse_referentP(var)) || (NIL != pph_variable_handling.pph_var_previously_paraphrased_with_otherP(var))) && (NIL == duplicateP)) {
            SubLObject csome_list_var = pph_variable_handling.pph_other_vars_with_var_type(var);
            SubLObject other_var = NIL;
            other_var = csome_list_var.first();
            while ((NIL == duplicateP) && (NIL != csome_list_var)) {
                if ((NIL != pph_drs.pph_discourse_referentP(other_var)) && (NIL != pph_variable_handling.pph_different_varsP(var, other_var, strictP))) {
                    duplicateP = T;
                }
                csome_list_var = csome_list_var.rest();
                other_var = csome_list_var.first();
            } 
        }
        return duplicateP;
    }

    public static final SubLObject pph_phrase_add_other_alt(SubLObject var_phrase) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            com.cyc.cycjava.cycl.pph_methods.pph_phrase_add_english_other(var_phrase);
        }
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    public static SubLObject pph_phrase_add_other(final SubLObject var_phrase) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            pph_phrase_add_english_other(var_phrase);
        }
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    /**
     * Insert the word 'other' into VAR-PHRASE
     */
    @LispMethod(comment = "Insert the word \'other\' into VAR-PHRASE")
    public static final SubLObject pph_phrase_add_english_other_alt(SubLObject var_phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject np_olist = pph_phrase.pph_phrase_output_list(var_phrase);
                thread.resetMultipleValues();
                {
                    SubLObject det_olist = com.cyc.cycjava.cycl.pph_methods.split_english_determiner_off(np_olist);
                    SubLObject nbar_olist = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject new_olist = com.cyc.cycjava.cycl.pph_methods.pph_add_english_other_to_olists(det_olist, nbar_olist);
                        pph_phrase.pph_phrase_set_output_list(var_phrase, new_olist, UNPROVIDED);
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(var_phrase);
        }
    }

    /**
     * Insert the word 'other' into VAR-PHRASE
     */
    @LispMethod(comment = "Insert the word \'other\' into VAR-PHRASE")
    public static SubLObject pph_phrase_add_english_other(final SubLObject var_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject np_olist = pph_phrase.pph_phrase_output_list(var_phrase);
        thread.resetMultipleValues();
        final SubLObject det_olist = split_english_determiner_off(np_olist);
        final SubLObject nbar_olist = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_olist = pph_add_english_other_to_olists(det_olist, nbar_olist);
        pph_phrase.pph_phrase_set_output_list(var_phrase, new_olist, UNPROVIDED);
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    /**
     * The determiner-olist separated from the nbar-olist in NP-OLIST
     */
    @LispMethod(comment = "The determiner-olist separated from the nbar-olist in NP-OLIST")
    public static final SubLObject split_english_determiner_off_alt(SubLObject np_olist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = np_olist;
                SubLObject current = datum;
                SubLObject first_item = NIL;
                SubLObject rest_items = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt97);
                first_item = current.first();
                current = current.rest();
                rest_items = current;
                thread.resetMultipleValues();
                {
                    SubLObject maybe_det_string = pph_utilities.pph_first_word(pph_data_structures.pph_phrase_output_item_string(first_item), UNPROVIDED);
                    SubLObject rest_of_first_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject np_string = pph_phrase.pph_phrase_output_list_string(np_olist, NIL);
                        SubLObject det_olist = NIL;
                        SubLObject nbar_olist = NIL;
                        if (NIL != pph_utilities.determiner_stringP(maybe_det_string)) {
                            if (NIL != string_utilities.non_empty_stringP(rest_of_first_string)) {
                                pph_data_structures.pph_phrase_output_item_set_string(first_item, maybe_det_string);
                                {
                                    SubLObject rest_item = pph_data_structures.pph_phrase_output_item_copy(first_item);
                                    pph_data_structures.pph_phrase_output_item_set_string(rest_item, rest_of_first_string);
                                    rest_items = cons(rest_item, rest_items);
                                }
                            }
                            det_olist = list(first_item);
                            nbar_olist = rest_items;
                        } else {
                            if (NIL != Strings.string_equal(np_string, $$$it, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                det_olist = list(pph_data_structures.new_pph_phrase_output_item($$$the, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                nbar_olist = list(pph_data_structures.new_pph_phrase_output_item($$$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            } else {
                                if (NIL != Strings.string_equal(np_string, $$$something, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    det_olist = list(pph_data_structures.new_pph_phrase_output_item($$$some, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    nbar_olist = list(pph_data_structures.new_pph_phrase_output_item($$$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                } else {
                                    if (NIL != Strings.string_equal(np_string, $$$everything, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        det_olist = list(pph_data_structures.new_pph_phrase_output_item($$$every, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        nbar_olist = list(pph_data_structures.new_pph_phrase_output_item($$$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    } else {
                                        nbar_olist = np_olist;
                                    }
                                }
                            }
                        }
                        return values(det_olist, nbar_olist);
                    }
                }
            }
        }
    }

    /**
     * The determiner-olist separated from the nbar-olist in NP-OLIST
     */
    @LispMethod(comment = "The determiner-olist separated from the nbar-olist in NP-OLIST")
    public static SubLObject split_english_determiner_off(final SubLObject np_olist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_item = NIL;
        SubLObject rest_items = NIL;
        destructuring_bind_must_consp(np_olist, np_olist, $list102);
        first_item = np_olist.first();
        final SubLObject current = rest_items = np_olist.rest();
        thread.resetMultipleValues();
        final SubLObject maybe_det_string = pph_utilities.pph_first_word(pph_data_structures.pph_phrase_output_item_string(first_item), UNPROVIDED);
        final SubLObject rest_of_first_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject np_string = pph_phrase.pph_phrase_output_list_string(np_olist, NIL);
        SubLObject det_olist = NIL;
        SubLObject nbar_olist = NIL;
        if (NIL != pph_utilities.determiner_stringP(maybe_det_string)) {
            if (NIL != string_utilities.non_empty_stringP(rest_of_first_string)) {
                pph_data_structures.pph_phrase_output_item_set_string(first_item, maybe_det_string);
                final SubLObject rest_item = pph_data_structures.pph_phrase_output_item_copy(first_item);
                pph_data_structures.pph_phrase_output_item_set_string(rest_item, rest_of_first_string);
                rest_items = cons(rest_item, rest_items);
            }
            det_olist = list(first_item);
            nbar_olist = rest_items;
        } else
            if (NIL != Strings.string_equal(np_string, $$$it, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                det_olist = list(pph_data_structures.new_pph_phrase_output_item($$$the, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                nbar_olist = list(pph_data_structures.new_pph_phrase_output_item($$$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else
                if (NIL != Strings.string_equal(np_string, $$$something, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    det_olist = list(pph_data_structures.new_pph_phrase_output_item($$$some, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    nbar_olist = list(pph_data_structures.new_pph_phrase_output_item($$$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else
                    if (NIL != Strings.string_equal(np_string, $$$everything, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        det_olist = list(pph_data_structures.new_pph_phrase_output_item($$$every, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        nbar_olist = list(pph_data_structures.new_pph_phrase_output_item($$$thing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } else {
                        nbar_olist = np_olist;
                    }



        return values(det_olist, nbar_olist);
    }

    public static final SubLObject pph_add_english_other_to_olists_alt(SubLObject det_olist, SubLObject nbar_olist) {
        if (NIL == det_olist) {
            return nbar_olist;
        }
        {
            SubLObject other_item = pph_question.new_pph_phrase_filler_item($$$other);
            if (NIL != pph_utilities.indefinite_determiner_stringP(pph_phrase.pph_phrase_output_list_string(det_olist, UNPROVIDED))) {
                pph_data_structures.pph_phrase_output_item_set_string(other_item, $$$another);
                return cons(other_item, nbar_olist);
            } else {
                return append(det_olist, cons(other_item, nbar_olist));
            }
        }
    }

    public static SubLObject pph_add_english_other_to_olists(final SubLObject det_olist, final SubLObject nbar_olist) {
        if (NIL == det_olist) {
            return nbar_olist;
        }
        final SubLObject other_item = pph_question.new_pph_phrase_filler_item($$$other);
        if (NIL != pph_utilities.indefinite_determiner_stringP(pph_phrase.pph_phrase_output_list_string(det_olist, UNPROVIDED))) {
            pph_data_structures.pph_phrase_output_item_set_string(other_item, $$$another);
            return cons(other_item, nbar_olist);
        }
        return append(det_olist, cons(other_item, nbar_olist));
    }

    /**
     *
     *
     * @param VAR-PHRASE
     * 		pph-phrase-p; a completely NL paraphrase of VAR.
     * 		Consider making it more explicitly refer to VAR.
     */
    @LispMethod(comment = "@param VAR-PHRASE\r\n\t\tpph-phrase-p; a completely NL paraphrase of VAR.\r\n\t\tConsider making it more explicitly refer to VAR.")
    public static final SubLObject pph_phrase_maybe_explicitify_var_phrase_alt(SubLObject var_phrase, SubLObject var, SubLObject determiner_type) {
        {
            SubLObject category = pph_phrase.pph_phrase_category(var_phrase, UNPROVIDED);
            if (!((NIL != pph_utilities.pph_genl_posP(category, $$Determiner, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_posP(category, $list_alt58, UNPROVIDED)))) {
                if ((NIL != pph_variable_handling.pph_use_explicit_varP(var)) || ((NIL != com.cyc.cycjava.cycl.pph_methods.different_instance_same_typeP(var)) && (NIL == pph_phrase.pph_sole_reference_p(var_phrase, var)))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt105$Explicitifying__S, var);
                    }
                    com.cyc.cycjava.cycl.pph_methods.pph_phrase_explicitify_var_phrase(var_phrase, var, determiner_type);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    /**
     *
     *
     * @param VAR-PHRASE
     * 		pph-phrase-p; a completely NL paraphrase of VAR.
     * 		Consider making it more explicitly refer to VAR.
     */
    @LispMethod(comment = "@param VAR-PHRASE\r\n\t\tpph-phrase-p; a completely NL paraphrase of VAR.\r\n\t\tConsider making it more explicitly refer to VAR.")
    public static SubLObject pph_phrase_maybe_explicitify_var_phrase(final SubLObject var_phrase, final SubLObject var, final SubLObject determiner_type) {
        final SubLObject category = pph_phrase.pph_phrase_category(var_phrase, UNPROVIDED);
        if (((NIL == pph_utilities.pph_genl_posP(category, $$Determiner, UNPROVIDED)) && (NIL == pph_utilities.pph_genl_posP(category, $list55, UNPROVIDED))) && ((NIL != pph_variable_handling.pph_use_explicit_varP(var)) || ((NIL != different_instance_same_typeP(var)) && (NIL == pph_phrase.pph_sole_reference_p(var_phrase, var))))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str110$Explicitifying__S, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase_explicitify_var_phrase(var_phrase, var, determiner_type);
        }
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    /**
     *
     *
     * @param VAR-PHRASE
     * 		pph-phrase-p; a completely NL paraphrase of VAR, which has been
     * 		deemed insufficiently disambiguatory.
     */
    @LispMethod(comment = "@param VAR-PHRASE\r\n\t\tpph-phrase-p; a completely NL paraphrase of VAR, which has been\r\n\t\tdeemed insufficiently disambiguatory.")
    public static final SubLObject pph_phrase_explicitify_var_phrase_alt(SubLObject var_phrase, SubLObject var, SubLObject determiner_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type_output_items = pph_phrase.pph_phrase_output_list(var_phrase);
                SubLObject var_output_items = com.cyc.cycjava.cycl.pph_methods.pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED);
                SubLObject skip_type_info_for_existential_default_type_varsP = NIL;
                SubLObject new_list = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject det_olist = com.cyc.cycjava.cycl.pph_methods.split_english_determiner_off(type_output_items);
                    SubLObject nbar_olist = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    type_output_items = append(det_olist, nbar_olist);
                    if (NIL != pph_variable_handling.pph_var_previously_explicitP(var)) {
                        new_list = var_output_items;
                    } else {
                        if (((NIL != skip_type_info_for_existential_default_type_varsP) && (NIL != pph_variable_handling.pph_var_registered_as_defaultP(var))) && (pph_variable_handling.pph_var_quantifier(var) == $EXISTENTIAL)) {
                            new_list = var_output_items;
                        } else {
                            if ((NIL != pph_variable_handling.pph_var_registered_as_defaultP(var)) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) {
                                {
                                    SubLObject var_prefix_items = com.cyc.cycjava.cycl.pph_methods.pph_var_phrase_prefix_items(var_phrase, determiner_type);
                                    SubLObject prefix_items = (NIL != var_prefix_items) ? ((SubLObject) (var_prefix_items)) : type_output_items;
                                    new_list = append(prefix_items, var_output_items);
                                }
                            } else {
                                new_list = append(type_output_items, var_output_items);
                            }
                        }
                    }
                    pph_phrase.pph_phrase_set_output_list(var_phrase, new_list, UNPROVIDED);
                }
            }
            return pph_phrase.pph_phrase_output_list(var_phrase);
        }
    }

    /**
     *
     *
     * @param VAR-PHRASE
     * 		pph-phrase-p; a completely NL paraphrase of VAR, which has been
     * 		deemed insufficiently disambiguatory.
     */
    @LispMethod(comment = "@param VAR-PHRASE\r\n\t\tpph-phrase-p; a completely NL paraphrase of VAR, which has been\r\n\t\tdeemed insufficiently disambiguatory.")
    public static SubLObject pph_phrase_explicitify_var_phrase(final SubLObject var_phrase, final SubLObject var, final SubLObject determiner_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type_output_items = pph_phrase.pph_phrase_output_list(var_phrase);
        final SubLObject var_output_items = pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED);
        final SubLObject skip_type_info_for_existential_default_type_varsP = NIL;
        SubLObject new_list = NIL;
        thread.resetMultipleValues();
        final SubLObject det_olist = split_english_determiner_off(type_output_items);
        final SubLObject nbar_olist = thread.secondMultipleValue();
        thread.resetMultipleValues();
        type_output_items = append(det_olist, nbar_olist);
        if (NIL != pph_variable_handling.pph_var_previously_explicitP(var)) {
            new_list = var_output_items;
        } else
            if (((NIL != skip_type_info_for_existential_default_type_varsP) && (NIL != pph_variable_handling.pph_var_registered_as_defaultP(var))) && (pph_variable_handling.pph_var_quantifier(var) == $EXISTENTIAL)) {
                new_list = var_output_items;
            } else
                if ((NIL != pph_variable_handling.pph_var_registered_as_defaultP(var)) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) {
                    final SubLObject var_prefix_items = pph_var_phrase_prefix_items(var_phrase, determiner_type);
                    final SubLObject prefix_items = (NIL != var_prefix_items) ? var_prefix_items : type_output_items;
                    new_list = append(prefix_items, var_output_items);
                } else {
                    new_list = append(type_output_items, var_output_items);
                }


        pph_phrase.pph_phrase_set_output_list(var_phrase, new_list, UNPROVIDED);
        return pph_phrase.pph_phrase_output_list(var_phrase);
    }

    public static final SubLObject generate_keyword_alt(SubLObject phrase) {
        pph_phrase.pph_phrase_set_string(phrase, pph_utilities.add_quotes_smart(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
        pph_phrase.pph_phrase_set_agr_pred(phrase, $$nonPlural_Generic, UNPROVIDED);
        return phrase;
    }

    public static SubLObject generate_keyword(final SubLObject phrase) {
        pph_phrase.pph_phrase_set_string(phrase, pph_utilities.add_quotes_smart(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
        pph_phrase.pph_phrase_set_agr_pred(phrase, $$nonPlural_Generic, UNPROVIDED);
        return phrase;
    }

    public static final SubLObject generate_cycl_symbol_alt(SubLObject phrase) {
        pph_phrase.pph_phrase_set_string(phrase, cconcatenate($str_alt110$the_SubL_symbol_, format_nil.format_nil_a_no_copy(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))));
        return phrase;
    }

    public static SubLObject generate_cycl_symbol(final SubLObject phrase) {
        pph_phrase.pph_phrase_set_string(phrase, cconcatenate($$$the_SubL_symbol_, format_nil.format_nil_a_no_copy(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))));
        return phrase;
    }

    public static final SubLObject generate_non_cycl_symbol_alt(SubLObject phrase) {
        pph_phrase.pph_phrase_set_string(phrase, cconcatenate($str_alt113$the_symbol_, format_nil.format_nil_a_no_copy(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))));
        return phrase;
    }

    public static SubLObject generate_non_cycl_symbol(final SubLObject phrase) {
        pph_phrase.pph_phrase_set_string(phrase, cconcatenate($$$the_symbol_, format_nil.format_nil_a_no_copy(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))));
        return phrase;
    }

    public static final SubLObject generate_constant_default_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                {
                    SubLObject pred = NIL;
                    SubLObject v_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                    if (NIL != pph_utilities.pph_top_level_preciseP()) {
                        {
                            SubLObject scientific_name_item = com.cyc.cycjava.cycl.pph_methods.pph_try_method(SCIENTIFIC_NAME_METHOD, v_term, $ANY, $PRECISE, pph_utilities.pph_np_category());
                            if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(scientific_name_item)) {
                                pph_phrase.pph_phrase_set_output_list(phrase, list(scientific_name_item), UNPROVIDED);
                                pred = pph_data_structures.pph_phrase_output_item_agr_pred(scientific_name_item);
                                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                pph_phrase.pph_phrase_note_done(phrase);
                            }
                        }
                    }
                    if (NIL != pred) {
                        pph_phrase.pph_phrase_set_agr_pred(phrase, pred, UNPROVIDED);
                    } else {
                        {
                            SubLObject new_rms = NIL;
                            if (NIL != pph_utilities.pph_top_level_preciseP()) {
                                {
                                    SubLObject matrix_rms = pph_discourse_context_rms(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_discourse_context$.bind(pph_discourse_context_copy(), thread);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format(T, $str_alt117$__Shadowing_discourse_context____);
                                            }
                                            com.cyc.cycjava.cycl.pph_methods.select_string_method(phrase, $PRECISE);
                                            new_rms = pph_macros.note_leaving_shadowed_discourse_context(pph_vars.$pph_discourse_context$.getDynamicValue(thread), matrix_rms);
                                        } finally {
                                            pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                {
                                    SubLObject matrix_rms = pph_discourse_context_rms(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_discourse_context$.bind(pph_discourse_context_copy(), thread);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format(T, $str_alt117$__Shadowing_discourse_context____);
                                            }
                                            com.cyc.cycjava.cycl.pph_methods.select_string_method(phrase, $GOOD);
                                            new_rms = pph_macros.note_leaving_shadowed_discourse_context(pph_vars.$pph_discourse_context$.getDynamicValue(thread), matrix_rms);
                                        } finally {
                                            pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                pph_ensure_rms_are_in_discourse_context(new_rms);
                            } else {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt119$__GENERATE_CONSTANT_DEFAULT__Tryi);
                                }
                                com.cyc.cycjava.cycl.pph_methods.select_string_method(phrase, $ANY);
                            }
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject generate_constant_default(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            SubLObject pred = NIL;
            final SubLObject v_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            if (NIL != pph_utilities.pph_top_level_preciseP()) {
                final SubLObject scientific_name_item = pph_try_method(SCIENTIFIC_NAME_METHOD, v_term, $ANY, $PRECISE, pph_utilities.pph_np_category());
                if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(scientific_name_item)) {
                    pph_phrase.pph_phrase_set_output_list(phrase, list(scientific_name_item), UNPROVIDED);
                    pred = pph_data_structures.pph_phrase_output_item_agr_pred(scientific_name_item);
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                    pph_phrase.pph_phrase_note_done(phrase);
                }
            }
            if (NIL != pred) {
                pph_phrase.pph_phrase_set_agr_pred(phrase, pred, UNPROVIDED);
            } else {
                SubLObject new_rms = NIL;
                if (NIL != pph_utilities.pph_top_level_preciseP()) {
                    final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms(UNPROVIDED);
                    final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                    try {
                        pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str122$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        select_string_method(phrase, $PRECISE);
                        new_rms = pph_macros.note_leaving_shadowed_discourse_context(pph_vars.$pph_discourse_context$.getDynamicValue(thread), matrix_rms);
                    } finally {
                        pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                    final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms(UNPROVIDED);
                    final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                    try {
                        pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str122$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        select_string_method(phrase, $GOOD);
                        new_rms = pph_macros.note_leaving_shadowed_discourse_context(pph_vars.$pph_discourse_context$.getDynamicValue(thread), matrix_rms);
                    } finally {
                        pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                    pph_drs.pph_ensure_rms_are_in_discourse_context(new_rms);
                } else {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str124$__GENERATE_CONSTANT_DEFAULT__Tryi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    select_string_method(phrase, $ANY);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     *
     *
     * @unknown Assumes WORD is CONSTANT-P.
     */
    @LispMethod(comment = "@unknown Assumes WORD is CONSTANT-P.")
    public static final SubLObject generate_lexical_word_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject wu_name = constants_high.constant_name(word);
                SubLObject base_form = string_utilities.post_remove(string_utilities.post_remove(wu_name, $str_alt122$_TheWord, UNPROVIDED), $str_alt123$_MWW, UNPROVIDED);
                base_form = string_utilities.pre_remove(base_form, $str_alt124$RKF_, UNPROVIDED);
                {
                    SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
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
                                                Errors.error($str_alt24$Invalid_attempt_to_reuse_memoizat);
                                            }
                                        }
                                    }
                                }
                                try {
                                    if (!((NIL != lexicon_accessors.names_from_spelling(base_form, UNPROVIDED, UNPROVIDED)) || (NIL != genls.any_specP($$ProperNoun, lexicon_accessors.pos_of_word(word, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
                                        base_form = string_utilities.downcase_leading(base_form);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject paraphrase = cconcatenate($str_alt126$the_word_, pph_utilities.add_quotes_smart(base_form));
                    pph_phrase.pph_phrase_set_string(phrase, paraphrase);
                }
            }
            return phrase;
        }
    }

    /**
     *
     *
     * @unknown Assumes WORD is CONSTANT-P.
     */
    @LispMethod(comment = "@unknown Assumes WORD is CONSTANT-P.")
    public static SubLObject generate_lexical_word(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject wu_name = constants_high.constant_name(word);
        SubLObject base_form = string_utilities.post_remove(string_utilities.post_remove(wu_name, $str127$_TheWord, UNPROVIDED), $str128$_MWW, UNPROVIDED);
        base_form = string_utilities.pre_remove(base_form, $str129$RKF_, UNPROVIDED);
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if ((NIL == lexicon_accessors.names_from_spelling(base_form, UNPROVIDED, UNPROVIDED)) && (NIL == genls.any_specP($$ProperNoun, lexicon_accessors.pos_of_word(word, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                    base_form = string_utilities.downcase_leading(base_form);
                }
            } finally {
                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        final SubLObject paraphrase = cconcatenate($$$the_word_, pph_utilities.add_quotes_smart(base_form));
        pph_phrase.pph_phrase_set_string(phrase, paraphrase);
        return phrase;
    }

    public static final SubLObject generate_chemical_substance_type_alt(SubLObject phrase) {
        {
            SubLObject substance_type = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject output_items = com.cyc.cycjava.cycl.pph_methods.do_generate_chemical_substance_type(substance_type);
            if (NIL != output_items) {
                {
                    SubLObject composite_item = output_items.first();
                    SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    SubLObject arg_position = pph_utilities.pph_top_level_arg_position(map);
                    pph_data_structures.pph_phrase_output_item_set_cycl(composite_item, substance_type);
                    pph_data_structures.pph_phrase_output_item_set_arg_position(composite_item, arg_position);
                    pph_phrase.pph_phrase_set_output_list(phrase, list(composite_item), UNPROVIDED);
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                    pph_phrase.pph_phrase_note_done(phrase);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_chemical_substance_type(final SubLObject phrase) {
        final SubLObject substance_type = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject output_items = do_generate_chemical_substance_type(substance_type);
        if (NIL != output_items) {
            final SubLObject composite_item = output_items.first();
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject arg_position = pph_utilities.pph_top_level_arg_position(map);
            pph_data_structures.pph_phrase_output_item_set_cycl(composite_item, substance_type);
            pph_data_structures.pph_phrase_output_item_set_arg_position(composite_item, arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, list(composite_item), UNPROVIDED);
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject do_generate_chemical_substance_type_alt(SubLObject substance_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject olist = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject formula_string = kb_mapping_utilities.fpred_value_in_relevant_mts(substance_type, $$chemicalFormulaString, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            olist = com.cyc.cycjava.cycl.pph_methods.generate_chemical_substance_type_from_formula_string(substance_type, formula_string);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return olist;
            }
        }
    }

    public static SubLObject do_generate_chemical_substance_type(final SubLObject substance_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject formula_string = kb_mapping_utilities.fpred_value_in_relevant_mts(substance_type, $$chemicalFormulaString, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != formula_string) {
                olist = generate_chemical_substance_type_from_formula_string(substance_type, pph_string.pph_string_from_cycl_string(formula_string));
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return olist;
    }

    public static final SubLObject generate_chemical_substance_type_from_formula_string_alt(SubLObject substance_type, SubLObject formula_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (formula_string.isString()) {
                {
                    SubLObject output_items = NIL;
                    if ($HTML == pph_vars.$paraphrase_mode$.getDynamicValue(thread)) {
                        output_items = com.cyc.cycjava.cycl.pph_methods.pph_chemical_formula_html_output_items(formula_string);
                    } else {
                        output_items = pph_phrase.new_pph_phrase_output_list(formula_string, NIL, NIL, $$chemicalFormulaString);
                    }
                    if (NIL != output_items) {
                        {
                            SubLObject composite_item = pph_data_structures.new_pph_phrase_output_item_nospace_group(output_items);
                            pph_data_structures.pph_phrase_output_item_set_cycl(composite_item, substance_type);
                            pph_data_structures.pph_phrase_output_item_set_agr_pred(composite_item, $$chemicalFormulaString);
                            return list(composite_item);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject generate_chemical_substance_type_from_formula_string(final SubLObject substance_type, final SubLObject formula_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_string.pph_string_p(formula_string)) {
            SubLObject output_items = NIL;
            if ($HTML == pph_vars.$paraphrase_mode$.getDynamicValue(thread)) {
                output_items = pph_chemical_formula_html_output_items(formula_string);
            } else {
                output_items = pph_phrase.new_pph_phrase_output_list(formula_string, NIL, NIL, $$chemicalFormulaString);
            }
            if (NIL != output_items) {
                final SubLObject composite_item = pph_data_structures.new_pph_phrase_output_item_nospace_group(output_items);
                pph_data_structures.pph_phrase_output_item_set_cycl(composite_item, substance_type);
                pph_data_structures.pph_phrase_output_item_set_agr_pred(composite_item, $$chemicalFormulaString);
                return list(composite_item);
            }
        }
        return NIL;
    }

    public static final SubLObject pph_chemical_formula_html_output_items_alt(SubLObject formula_string) {
        {
            SubLObject curr_string_chars = NIL;
            SubLObject in_subscriptP = NIL;
            SubLObject in_superscriptP = NIL;
            SubLObject output_items = NIL;
            SubLObject string_var = formula_string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_29 = end_var;
            SubLObject char_num = NIL;
            for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_29); char_num = number_utilities.f_1X(char_num)) {
                {
                    SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                    if ((NIL == digit_char_p(v_char, UNPROVIDED)) && (NIL != in_subscriptP)) {
                        {
                            SubLObject curr_string = string_utilities.char_list_to_string(nreverse(curr_string_chars));
                            SubLObject new_item = pph_question.new_pph_phrase_filler_item(curr_string);
                            pph_html.pph_phrase_output_item_subscript(new_item);
                            output_items = cons(new_item, output_items);
                        }
                        curr_string_chars = NIL;
                        in_subscriptP = NIL;
                    }
                    if (CHAR_space == v_char) {
                    } else {
                        if ((NIL != in_superscriptP) && (NIL != charE(v_char, CHAR_rparen))) {
                            {
                                SubLObject curr_string = string_utilities.char_list_to_string(nreverse(curr_string_chars));
                                SubLObject new_item = pph_question.new_pph_phrase_filler_item(curr_string);
                                pph_html.pph_phrase_output_item_superscript(new_item);
                                output_items = cons(new_item, output_items);
                            }
                            curr_string_chars = NIL;
                            in_superscriptP = NIL;
                        } else {
                            if (((NIL == in_subscriptP) && (NIL == in_superscriptP)) && (NIL != digit_char_p(v_char, UNPROVIDED))) {
                                if (NIL != curr_string_chars) {
                                    {
                                        SubLObject curr_string = string_utilities.char_list_to_string(nreverse(curr_string_chars));
                                        output_items = cons(pph_question.new_pph_phrase_filler_item(curr_string), output_items);
                                    }
                                }
                                curr_string_chars = list(v_char);
                                in_subscriptP = T;
                            } else {
                                if (((NIL == in_superscriptP) && (NIL != charE(v_char, CHAR_lparen))) && (NIL == alpha_char_p(Strings.sublisp_char(formula_string, number_utilities.f_1X(char_num))))) {
                                    if (NIL != curr_string_chars) {
                                        {
                                            SubLObject curr_string = string_utilities.char_list_to_string(nreverse(curr_string_chars));
                                            output_items = cons(pph_question.new_pph_phrase_filler_item(curr_string), output_items);
                                        }
                                    }
                                    curr_string_chars = NIL;
                                    in_superscriptP = T;
                                } else {
                                    curr_string_chars = cons(v_char, curr_string_chars);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != curr_string_chars) {
                {
                    SubLObject curr_string = string_utilities.char_list_to_string(nreverse(curr_string_chars));
                    SubLObject item_arg_position = pph_utilities.pph_unknown_arg_position();
                    SubLObject item_cycl = (NIL == output_items) ? ((SubLObject) (pph_phrase.pph_unknown_cycl())) : pph_phrase.pph_empty_cycl();
                    SubLObject final_item = pph_data_structures.new_pph_phrase_output_item(curr_string, item_arg_position, item_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != in_subscriptP) {
                        pph_html.pph_phrase_output_item_subscript(final_item);
                    }
                    output_items = cons(final_item, output_items);
                }
            }
            return nreverse(output_items);
        }
    }

    public static SubLObject pph_chemical_formula_html_output_items(final SubLObject formula_string) {
        SubLObject curr_string_chars = NIL;
        SubLObject in_subscriptP = NIL;
        SubLObject in_superscriptP = NIL;
        SubLObject output_items = NIL;
        for (SubLObject sequence_var = formula_string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), char_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var)) {
            final SubLObject item = subl_macros.do_sequence_index_valueP(char_num, sequence_var);
            if ((!char_num.isInteger()) || (!char_num.numL(ZERO_INTEGER))) {
                if (((!NIL.isInteger()) || (!char_num.isInteger())) || (!char_num.numGE(NIL))) {
                    final SubLObject v_char = (item.isChar()) ? item : pph_string.pph_code_char(item);
                    if (((!v_char.isInteger()) && (NIL == digit_char_p(v_char, UNPROVIDED))) && (NIL != in_subscriptP)) {
                        final SubLObject curr_string = pph_string.pph_string_from_char_list(nreverse(curr_string_chars));
                        final SubLObject new_item = pph_question.new_pph_phrase_filler_item(curr_string);
                        pph_html.pph_phrase_output_item_subscript(new_item);
                        output_items = cons(new_item, output_items);
                        curr_string_chars = NIL;
                        in_subscriptP = NIL;
                    }
                    if (v_char.isInteger()) {
                        curr_string_chars = cons(v_char, curr_string_chars);
                    } else
                        if (!CHAR_space.eql(v_char)) {
                            if ((NIL != in_superscriptP) && (NIL != pph_string.pph_char_E(v_char, CHAR_rparen))) {
                                final SubLObject curr_string = pph_string.pph_string_from_char_list(nreverse(curr_string_chars));
                                final SubLObject new_item = pph_question.new_pph_phrase_filler_item(curr_string);
                                pph_html.pph_phrase_output_item_superscript(new_item);
                                output_items = cons(new_item, output_items);
                                curr_string_chars = NIL;
                                in_superscriptP = NIL;
                            } else
                                if (((NIL == in_subscriptP) && (NIL == in_superscriptP)) && (NIL != digit_char_p(v_char, UNPROVIDED))) {
                                    if (NIL != curr_string_chars) {
                                        final SubLObject curr_string = pph_string.pph_string_from_char_list(nreverse(curr_string_chars));
                                        output_items = cons(pph_question.new_pph_phrase_filler_item(curr_string), output_items);
                                    }
                                    curr_string_chars = list(v_char);
                                    in_subscriptP = T;
                                } else
                                    if (((NIL == in_superscriptP) && (NIL != pph_string.pph_char_E(v_char, CHAR_lparen))) && (NIL == alpha_char_p(Strings.sublisp_char(formula_string, number_utilities.f_1X(char_num))))) {
                                        if (NIL != curr_string_chars) {
                                            final SubLObject curr_string = pph_string.pph_string_from_char_list(nreverse(curr_string_chars));
                                            output_items = cons(pph_question.new_pph_phrase_filler_item(curr_string), output_items);
                                        }
                                        curr_string_chars = NIL;
                                        in_superscriptP = T;
                                    } else {
                                        curr_string_chars = cons(v_char, curr_string_chars);
                                    }


                        }

                }
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            char_num = add(char_num, ONE_INTEGER);
        }
        if (NIL != curr_string_chars) {
            final SubLObject curr_string2 = pph_string.pph_string_from_char_list(nreverse(curr_string_chars));
            final SubLObject item_arg_position = pph_utilities.pph_unknown_arg_position();
            final SubLObject item_cycl = (NIL == output_items) ? pph_phrase.pph_unknown_cycl() : pph_phrase.pph_empty_cycl();
            final SubLObject final_item = pph_data_structures.new_pph_phrase_output_item(curr_string2, item_arg_position, item_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != in_subscriptP) {
                pph_html.pph_phrase_output_item_subscript(final_item);
            }
            output_items = cons(final_item, output_items);
        }
        return nreverse(output_items);
    }

    public static final SubLObject do_generate_chemical_substance_type_semantic_alt(SubLObject substance_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject atomic_composition_lists = com.cyc.cycjava.cycl.pph_methods.pph_chemical_composition(substance_type);
                SubLObject abortP = sublisp_null(atomic_composition_lists);
                SubLObject output_items = NIL;
                if (NIL == abortP) {
                    {
                        SubLObject datum = atomic_composition_lists;
                        SubLObject current = datum;
                        SubLObject element_list = NIL;
                        SubLObject quantity_list = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        element_list = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        quantity_list = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            output_items = list(pph_phrase_resolution.pph_output_item_from_atomic_composition_lists(element_list, quantity_list));
                            abortP = sublisp_null(output_items);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt128);
                        }
                    }
                    if (NIL == abortP) {
                        {
                            SubLObject charge = com.cyc.cycjava.cycl.pph_methods.pph_electrical_charge_of_substance_type(substance_type);
                            if ((NIL != narts_high.naut_p(charge)) && (cycl_utilities.nat_functor(charge) == $$ElectronicCharge)) {
                                {
                                    SubLObject charge_value = cycl_utilities.nat_arg1(charge, UNPROVIDED);
                                    SubLObject charge_item = pph_data_structures.new_pph_phrase_output_item(princ_to_string(charge_value), NIL, charge_value, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                                        pph_html.pph_phrase_output_item_superscript(charge_item);
                                    }
                                    output_items = cons(charge_item, output_items);
                                }
                            }
                        }
                    }
                }
                if (!((NIL != abortP) || (NIL == output_items))) {
                    {
                        SubLObject composite_item = pph_data_structures.new_pph_phrase_output_item_nospace_group(nreverse(output_items));
                        pph_data_structures.pph_phrase_output_item_set_cycl(composite_item, substance_type);
                        pph_data_structures.pph_phrase_output_item_set_agr_pred(composite_item, $$chemicalFormulaString);
                        return composite_item;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject do_generate_chemical_substance_type_semantic(final SubLObject substance_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject atomic_composition_lists = pph_chemical_composition(substance_type);
        SubLObject abortP = sublisp_null(atomic_composition_lists);
        SubLObject output_items = NIL;
        if (NIL == abortP) {
            SubLObject current;
            final SubLObject datum = current = atomic_composition_lists;
            SubLObject element_list = NIL;
            SubLObject quantity_list = NIL;
            destructuring_bind_must_consp(current, datum, $list133);
            element_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list133);
            quantity_list = current.first();
            current = current.rest();
            if (NIL == current) {
                output_items = list(pph_phrase_resolution.pph_output_item_from_atomic_composition_lists(element_list, quantity_list));
                abortP = sublisp_null(output_items);
            } else {
                cdestructuring_bind_error(datum, $list133);
            }
            if (NIL == abortP) {
                final SubLObject charge = pph_electrical_charge_of_substance_type(substance_type);
                if ((NIL != narts_high.naut_p(charge)) && cycl_utilities.nat_functor(charge).eql($$ElectronicCharge)) {
                    final SubLObject charge_value = cycl_utilities.nat_arg1(charge, UNPROVIDED);
                    final SubLObject charge_item = pph_data_structures.new_pph_phrase_output_item(princ_to_string(charge_value), NIL, charge_value, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                        pph_html.pph_phrase_output_item_superscript(charge_item);
                    }
                    output_items = cons(charge_item, output_items);
                }
            }
        }
        if ((NIL == abortP) && (NIL != output_items)) {
            final SubLObject composite_item = pph_data_structures.new_pph_phrase_output_item_nospace_group(nreverse(output_items));
            pph_data_structures.pph_phrase_output_item_set_cycl(composite_item, substance_type);
            pph_data_structures.pph_phrase_output_item_set_agr_pred(composite_item, $$chemicalFormulaString);
            return composite_item;
        }
        return NIL;
    }

    public static final SubLObject pph_chemical_composition_alt(SubLObject substance_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != formula_matches_pattern(function_terms.nart_to_naut(substance_type), $list_alt130)) {
                return bq_cons(list($$TheList, cycl_utilities.nat_arg1(substance_type, UNPROVIDED)), $list_alt132);
            } else {
                return pph_utilities.pph_ask_template($list_alt133, listS($$completeAtomicComposition_List, substance_type, $list_alt133), pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, ONE_INTEGER).first();
            }
        }
    }

    public static SubLObject pph_chemical_composition(final SubLObject substance_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_pattern_match.formula_matches_pattern(function_terms.nart_to_naut(substance_type), $list135)) {
            return bq_cons(list($$TheList, cycl_utilities.nat_arg1(substance_type, UNPROVIDED)), $list137);
        }
        return pph_utilities.pph_ask_template($list138, listS($$completeAtomicComposition_List, substance_type, $list138), pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, ONE_INTEGER).first();
    }

    public static final SubLObject pph_electrical_charge_of_substance_type_alt(SubLObject substance_type) {
        {
            SubLObject charge = NIL;
            if (NIL == charge) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.pph_methods.pph_molecule_types(substance_type);
                    SubLObject molecule_type = NIL;
                    for (molecule_type = csome_list_var.first(); !((NIL != charge) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , molecule_type = csome_list_var.first()) {
                        {
                            SubLObject molecule = make_unary_formula($$SomeFn, molecule_type);
                            if (NIL == charge) {
                                {
                                    SubLObject csome_list_var_30 = pph_utilities.pph_ask_variable($sym136$_CHARGE, listS($$chargeOfObject, molecule, $list_alt138), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject candidate_charge = NIL;
                                    for (candidate_charge = csome_list_var_30.first(); !((NIL != charge) || (NIL == csome_list_var_30)); csome_list_var_30 = csome_list_var_30.rest() , candidate_charge = csome_list_var_30.first()) {
                                        if ((NIL != narts_high.naut_p(candidate_charge)) && (cycl_utilities.nat_functor(candidate_charge) == $$ElectronicCharge)) {
                                            charge = candidate_charge;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return charge;
        }
    }

    public static SubLObject pph_electrical_charge_of_substance_type(final SubLObject substance_type) {
        SubLObject charge = NIL;
        if (NIL == charge) {
            SubLObject csome_list_var = pph_molecule_types(substance_type);
            SubLObject molecule_type = NIL;
            molecule_type = csome_list_var.first();
            while ((NIL == charge) && (NIL != csome_list_var)) {
                final SubLObject molecule = make_unary_formula($$SomeFn, molecule_type);
                if (NIL == charge) {
                    SubLObject csome_list_var_$27 = pph_utilities.pph_ask_variable($sym141$_CHARGE, listS($$chargeOfObject, molecule, $list143), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject candidate_charge = NIL;
                    candidate_charge = csome_list_var_$27.first();
                    while ((NIL == charge) && (NIL != csome_list_var_$27)) {
                        if ((NIL != narts_high.naut_p(candidate_charge)) && cycl_utilities.nat_functor(candidate_charge).eql($$ElectronicCharge)) {
                            charge = candidate_charge;
                        }
                        csome_list_var_$27 = csome_list_var_$27.rest();
                        candidate_charge = csome_list_var_$27.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                molecule_type = csome_list_var.first();
            } 
        }
        return charge;
    }

    public static final SubLObject pph_molecule_types_alt(SubLObject substance_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = pph_utilities.pph_ask_variable($sym139$_MOLECULE_TYPE, listS($$moleculesOfCompoundType, substance_type, $list_alt141), pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, ONE_INTEGER);
                if ((NIL != nart_handles.nart_p(substance_type)) && (cycl_utilities.nat_functor(substance_type) == $$ChemicalSubstanceFn)) {
                    ans = cons(cycl_utilities.nat_arg1(substance_type, UNPROVIDED), ans);
                }
                return ans;
            }
        }
    }

    public static SubLObject pph_molecule_types(final SubLObject substance_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = pph_utilities.pph_ask_variable($sym144$_MOLECULE_TYPE, listS($$moleculesOfCompoundType, substance_type, $list146), pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, ONE_INTEGER);
        if ((NIL != nart_handles.nart_p(substance_type)) && cycl_utilities.nat_functor(substance_type).eql($$ChemicalSubstanceFn)) {
            ans = cons(cycl_utilities.nat_arg1(substance_type, UNPROVIDED), ans);
        }
        return ans;
    }

    public static final SubLObject select_string_method_count_alt(SubLObject method_symbol) {
        return gethash(method_symbol, $select_string_method_count$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject select_string_method_count(final SubLObject method_symbol) {
        return gethash(method_symbol, $select_string_method_count$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Tries to return an appropriate English string for PHRASE
     * The selection process proceeds by evaluating in order the method functions in
     *
     * @unknown *select-string-methods* -- the first method to finish PHRASE wins.
     * @param QUALITY;
     * 		What is our threshold for accepting an answer?
     * @return PPH-PHRASE.
     */
    @LispMethod(comment = "Tries to return an appropriate English string for PHRASE\r\nThe selection process proceeds by evaluating in order the method functions in\r\n\r\n@unknown *select-string-methods* -- the first method to finish PHRASE wins.\r\n@param QUALITY;\r\n\t\tWhat is our threshold for accepting an answer?\r\n@return PPH-PHRASE.\nTries to return an appropriate English string for PHRASE\nThe selection process proceeds by evaluating in order the method functions in")
    public static final SubLObject select_string_method_alt(SubLObject phrase, SubLObject quality) {
        if (quality == UNPROVIDED) {
            quality = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = function_terms.naut_to_nart(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                SubLObject cat = pph_phrase.pph_phrase_find_or_set_category(phrase);
                SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, NIL);
                SubLObject doneP = pph_phrase.pph_phrase_doneP(phrase);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format(T, $str_alt155$__SELECT_STRING_METHOD__NL_PREDS_, nl_preds);
                }
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format(T, $str_alt156$__SELECT_STRING_METHOD__Precision, pph_utilities.pph_current_precision());
                }
                {
                    SubLObject inherited_demerits = pph_phrase.pph_phrase_contextualized_demerits(phrase);
                    SubLObject total_demerits = inherited_demerits;
                    SubLObject v_methods = (quality == $PRECISE) ? ((SubLObject) ($list_alt157)) : $select_string_methods$.getDynamicValue(thread);
                    SubLObject input_phrase = (NIL != pph_vars.pph_generate_alternative_phrasesP()) ? ((SubLObject) (pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED))) : NIL;
                    SubLObject demerit_cutoff = com.cyc.cycjava.cycl.pph_methods.pph_demerit_cutoff_for_quality(quality);
                    SubLObject used_items = NIL;
                    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(demerit_cutoff)))) {
                        {
                            SubLObject new_format_string = cconcatenate($str_alt89$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt90$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(demerit_cutoff), new SubLObject[]{ $str_alt158$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                        }
                    }
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(demerit_cutoff), thread);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = v_methods;
                                    SubLObject fun = NIL;
                                    for (fun = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fun = csome_list_var.first()) {
                                        if (fun.isCons() && (fun.first() == DEMERITS)) {
                                            {
                                                SubLObject additional_demerits = fun.rest();
                                                total_demerits = add(total_demerits, additional_demerits);
                                            }
                                            if (NIL != pph_vars.pph_too_many_demerits_p(total_demerits, UNPROVIDED)) {
                                                doneP = T;
                                            }
                                        } else {
                                            if ((NIL != fboundp(fun)) && (NIL == com.cyc.cycjava.cycl.pph_methods.omit_pph_select_string_method_p(fun))) {
                                                {
                                                    SubLObject error_message = NIL;
                                                    SubLObject preferred_item = NIL;
                                                    SubLObject alternative_items = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_31 = Errors.$continue_cerrorP$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                                                        try {
                                                            Errors.$continue_cerrorP$.bind(NIL, thread);
                                                            pph_error.$pph_error_handling_onP$.bind(T, thread);
                                                            if (NIL != pph_error.pph_break_on_errorP()) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject preferred_item_32 = com.cyc.cycjava.cycl.pph_methods.pph_try_method(fun, v_term, nl_preds, quality, cat);
                                                                    SubLObject alternative_items_33 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    preferred_item = preferred_item_32;
                                                                    alternative_items = alternative_items_33;
                                                                }
                                                            } else {
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_34 = Errors.$error_handler$.currentBinding(thread);
                                                                        try {
                                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                            try {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject preferred_item_35 = com.cyc.cycjava.cycl.pph_methods.pph_try_method(fun, v_term, nl_preds, quality, cat);
                                                                                    SubLObject alternative_items_36 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    preferred_item = preferred_item_35;
                                                                                    alternative_items = alternative_items_36;
                                                                                }
                                                                            } catch (Throwable catch_var) {
                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                            }
                                                                        } finally {
                                                                            Errors.$error_handler$.rebind(_prev_bind_0_34, thread);
                                                                        }
                                                                    }
                                                                } catch (Throwable ccatch_env_var) {
                                                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                }
                                                                if (error_message.isString()) {
                                                                    Errors.warn(error_message);
                                                                }
                                                            }
                                                        } finally {
                                                            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1, thread);
                                                            Errors.$continue_cerrorP$.rebind(_prev_bind_0_31, thread);
                                                        }
                                                    }
                                                    if (NIL != error_message) {
                                                    } else {
                                                        if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(preferred_item)) {
                                                            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                                                alternative_items = cons(preferred_item, alternative_items);
                                                            } else {
                                                                com.cyc.cycjava.cycl.pph_methods.pph_update_phrase_with_method_result(phrase, preferred_item, v_term, fun, cat, total_demerits, inherited_demerits, nl_preds, quality);
                                                                used_items = cons(preferred_item, used_items);
                                                            }
                                                            {
                                                                SubLObject added_count = ZERO_INTEGER;
                                                                SubLObject cdolist_list_var = alternative_items;
                                                                SubLObject alternative_item = NIL;
                                                                for (alternative_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , alternative_item = cdolist_list_var.first()) {
                                                                    if (NIL == subl_promotions.memberP(alternative_item, used_items, symbol_function(EQUALP), UNPROVIDED)) {
                                                                        used_items = cons(alternative_item, used_items);
                                                                        if ((NIL != pph_vars.pph_generate_alternative_phrasesP()) && (NIL != pph_data_structures.pph_phrase_output_item_loose_p(alternative_item))) {
                                                                            {
                                                                                SubLObject alternative_phrase = pph_phrase.pph_phrase_copy(input_phrase, UNPROVIDED, UNPROVIDED);
                                                                                com.cyc.cycjava.cycl.pph_methods.pph_update_phrase_with_method_result(alternative_phrase, alternative_item, v_term, fun, cat, total_demerits, inherited_demerits, nl_preds, quality);
                                                                                if (NIL != pph_phrase.pph_phrase_doneP(alternative_phrase)) {
                                                                                    pph_phrase.pph_phrase_add_alternative(phrase, alternative_phrase);
                                                                                    added_count = add(added_count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (added_count.isPositive()) {
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                        format(T, $str_alt162$Added__S_alternatives_for____S, added_count, phrase);
                                                                    }
                                                                }
                                                            }
                                                            if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                                                doneP = T;
                                                            }
                                                        } else {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                                                format(T, $str_alt163$__SELECT_STRING_METHOD__the_funct, fun, v_term);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (NIL != pph_macros.pph_timeout_time_reachedP()) {
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                        Errors.warn($str_alt164$PPH_timeout_time_reached_);
                                                    }
                                                    pph_main.pph_abort();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == doneP) {
                    {
                        SubLObject revised_nl_preds = com.cyc.cycjava.cycl.pph_methods.pph_revised_nl_preds_for_phrase(phrase, nl_preds);
                        if (NIL == com.cyc.cycjava.cycl.pph_methods.equal_pph_nl_predsP(revised_nl_preds, nl_preds)) {
                            pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                            com.cyc.cycjava.cycl.pph_methods.select_string_method(phrase, quality);
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    /**
     * Tries to return an appropriate English string for PHRASE
     * The selection process proceeds by evaluating in order the method functions in
     *
     * @unknown *select-string-methods* -- the first method to finish PHRASE wins.
     * @param QUALITY;
     * 		What is our threshold for accepting an answer?
     * @return PPH-PHRASE.
     */
    @LispMethod(comment = "Tries to return an appropriate English string for PHRASE\r\nThe selection process proceeds by evaluating in order the method functions in\r\n\r\n@unknown *select-string-methods* -- the first method to finish PHRASE wins.\r\n@param QUALITY;\r\n\t\tWhat is our threshold for accepting an answer?\r\n@return PPH-PHRASE.\nTries to return an appropriate English string for PHRASE\nThe selection process proceeds by evaluating in order the method functions in")
    public static SubLObject select_string_method(final SubLObject phrase, SubLObject quality) {
        if (quality == UNPROVIDED) {
            quality = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = function_terms.naut_to_nart(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        final SubLObject cat = pph_phrase.pph_phrase_find_or_set_category(phrase);
        final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, NIL);
        SubLObject doneP = pph_phrase.pph_phrase_doneP(phrase);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str151$__SELECT_STRING_METHOD__NL_PREDS_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str152$__SELECT_STRING_METHOD__Precision, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject total_demerits;
        final SubLObject inherited_demerits = total_demerits = pph_phrase.pph_phrase_contextualized_demerits(phrase);
        final SubLObject v_methods = (quality == $PRECISE) ? $list153 : $select_string_methods$.getDynamicValue(thread);
        final SubLObject input_phrase = (NIL != pph_vars.pph_generate_alternative_phrasesP()) ? pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject demerit_cutoff = pph_demerit_cutoff_for_quality(quality);
        SubLObject used_items = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(demerit_cutoff), thread);
            if (NIL == doneP) {
                SubLObject csome_list_var = v_methods;
                SubLObject fun = NIL;
                fun = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (fun.isCons() && (fun.first() == DEMERITS)) {
                        final SubLObject additional_demerits = fun.rest();
                        total_demerits = add(total_demerits, additional_demerits);
                        if (NIL != pph_vars.pph_too_many_demerits_p(total_demerits, UNPROVIDED)) {
                            doneP = T;
                        }
                    } else
                        if ((NIL != fboundp(fun)) && (NIL == omit_pph_select_string_method_p(fun))) {
                            SubLObject error_message = NIL;
                            SubLObject preferred_item = NIL;
                            SubLObject alternative_items = NIL;
                            final SubLObject _prev_bind_0_$28 = Errors.$continue_cerrorP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind(NIL, thread);
                                pph_error.$pph_error_handling_onP$.bind(T, thread);
                                if (NIL != pph_error.pph_break_on_errorP()) {
                                    thread.resetMultipleValues();
                                    final SubLObject preferred_item_$29 = pph_try_method(fun, v_term, nl_preds, quality, cat);
                                    final SubLObject alternative_items_$30 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    preferred_item = preferred_item_$29;
                                    alternative_items = alternative_items_$30;
                                } else {
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$29 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                thread.resetMultipleValues();
                                                final SubLObject preferred_item_$30 = pph_try_method(fun, v_term, nl_preds, quality, cat);
                                                final SubLObject alternative_items_$31 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                preferred_item = preferred_item_$30;
                                                alternative_items = alternative_items_$31;
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                                        Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str156$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                                    }
                                }
                            } finally {
                                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$28, thread);
                            }
                            if (NIL == error_message) {
                                if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(preferred_item)) {
                                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                        alternative_items = cons(preferred_item, alternative_items);
                                    } else {
                                        pph_update_phrase_with_method_result(phrase, preferred_item, v_term, fun, cat, total_demerits, inherited_demerits, nl_preds, quality);
                                        used_items = cons(preferred_item, used_items);
                                    }
                                    SubLObject added_count = ZERO_INTEGER;
                                    SubLObject cdolist_list_var = alternative_items;
                                    SubLObject alternative_item = NIL;
                                    alternative_item = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL == subl_promotions.memberP(alternative_item, used_items, symbol_function(EQUALP), UNPROVIDED)) {
                                            used_items = cons(alternative_item, used_items);
                                            if ((NIL != pph_vars.pph_generate_alternative_phrasesP()) && (NIL != pph_data_structures.pph_phrase_output_item_loose_p(alternative_item))) {
                                                final SubLObject alternative_phrase = pph_phrase.pph_phrase_copy(input_phrase, UNPROVIDED, UNPROVIDED);
                                                pph_update_phrase_with_method_result(alternative_phrase, alternative_item, v_term, fun, cat, total_demerits, inherited_demerits, nl_preds, quality);
                                                if (NIL != pph_phrase.pph_phrase_doneP(alternative_phrase)) {
                                                    pph_phrase.pph_phrase_add_alternative(phrase, alternative_phrase);
                                                    added_count = add(added_count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        alternative_item = cdolist_list_var.first();
                                    } 
                                    if (added_count.isPositive() && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                        format_nil.force_format(T, $str157$Added__S_alternatives_for____S, added_count, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                        doneP = T;
                                    }
                                } else
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                        format_nil.force_format(T, $str158$__SELECT_STRING_METHOD__the_funct, fun, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }

                            }
                        } else
                            if (NIL != pph_macros.pph_timeout_time_reachedP()) {
                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                    Errors.warn($str159$PPH_timeout_time_reached_);
                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                pph_main.pph_abort();
                            }


                    csome_list_var = csome_list_var.rest();
                    fun = csome_list_var.first();
                } 
            }
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        if (NIL == doneP) {
            final SubLObject revised_nl_preds = pph_revised_nl_preds_for_phrase(phrase, nl_preds);
            if (NIL == equal_pph_nl_predsP(revised_nl_preds, nl_preds)) {
                pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                select_string_method(phrase, quality);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject equal_pph_nl_predsP_alt(SubLObject preds1, SubLObject preds2) {
        if (preds2 == preds2) {
            return T;
        } else {
            if (preds1.isList() && preds2.isList()) {
                return list_utilities.sets_equalP(preds1, preds2, UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject equal_pph_nl_predsP(final SubLObject preds1, final SubLObject preds2) {
        if (preds2.eql(preds2)) {
            return T;
        }
        if (preds1.isList() && preds2.isList()) {
            return list_utilities.sets_equalP(preds1, preds2, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject omit_pph_select_string_method_p_alt(SubLObject method_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(method_symbol, pph_vars.$select_string_methods_to_omit$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject omit_pph_select_string_method_p(final SubLObject method_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(method_symbol, pph_vars.$select_string_methods_to_omit$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Update PHRASE with THIS-METHOD-ITEM.
     */
    @LispMethod(comment = "Update PHRASE with THIS-METHOD-ITEM.")
    public static final SubLObject pph_update_phrase_with_method_result_alt(SubLObject phrase, SubLObject this_method_item, SubLObject v_term, SubLObject fun, SubLObject cat, SubLObject total_demerits, SubLObject inherited_demerits, SubLObject nl_preds, SubLObject quality) {
        pph_diagnostics.pph_cinc_method_count(fun, $select_string_method_count$.getGlobalValue());
        {
            SubLObject this_method_pred = pph_data_structures.pph_phrase_output_item_agr_pred(this_method_item);
            if (NIL != this_method_pred) {
                pph_phrase.pph_phrase_set_agr_pred(phrase, this_method_pred, UNPROVIDED);
                if (NIL == cat) {
                    cat = pph_phrase.pph_phrase_find_or_set_category(phrase);
                }
            }
        }
        {
            SubLObject arg_position = pph_phrase.pph_phrase_arg_position(phrase);
            pph_data_structures.pph_phrase_output_item_set_arg_position(this_method_item, arg_position);
        }
        pph_phrase.pph_phrase_set_output_list(phrase, list(this_method_item), UNPROVIDED);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        pph_phrase.pph_phrase_add_justification(phrase, pph_phrase.pph_code_justification(fun, UNPROVIDED));
        pph_phrase.pph_phrase_add_justifications_from_item(phrase, this_method_item);
        pph_phrase.pph_phrase_note_done(phrase);
        {
            SubLObject incremental_demerits = subtract(total_demerits, inherited_demerits);
            if (incremental_demerits.isPositive()) {
                pph_phrase.pph_phrase_set_top_level_demerits(phrase, total_demerits, UNPROVIDED);
                pph_phrase.pph_phrase_maybe_note_problem(phrase, SELECT_STRING_METHOD, $DEMERITS, list($CYCL, v_term, $NL_PREDS, nl_preds, $INCREMENTAL_DEMERITS, incremental_demerits, $METHOD, fun));
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Update PHRASE with THIS-METHOD-ITEM.
     */
    @LispMethod(comment = "Update PHRASE with THIS-METHOD-ITEM.")
    public static SubLObject pph_update_phrase_with_method_result(final SubLObject phrase, final SubLObject this_method_item, final SubLObject v_term, final SubLObject fun, SubLObject cat, SubLObject total_demerits, final SubLObject inherited_demerits, final SubLObject nl_preds, final SubLObject quality) {
        final SubLObject this_method_pred = pph_data_structures.pph_phrase_output_item_agr_pred(this_method_item);
        if (NIL != this_method_pred) {
            pph_phrase.pph_phrase_set_agr_pred(phrase, this_method_pred, UNPROVIDED);
            if (NIL == cat) {
                cat = pph_phrase.pph_phrase_find_or_set_category(phrase);
            }
        }
        final SubLObject arg_position = pph_phrase.pph_phrase_arg_position(phrase);
        pph_data_structures.pph_phrase_output_item_set_arg_position(this_method_item, arg_position);
        pph_phrase.pph_phrase_set_output_list(phrase, list(this_method_item), UNPROVIDED);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        pph_phrase.pph_phrase_add_justification(phrase, pph_phrase.pph_code_justification(fun, UNPROVIDED));
        pph_phrase.pph_phrase_add_justifications_from_item(phrase, this_method_item);
        pph_phrase.pph_phrase_note_done(phrase);
        total_demerits = add(total_demerits, pph_data_structures.pph_phrase_output_item_demerits(this_method_item));
        final SubLObject incremental_demerits = subtract(total_demerits, inherited_demerits);
        if (incremental_demerits.isPositive()) {
            pph_phrase.pph_phrase_set_top_level_demerits(phrase, total_demerits, fun);
            pph_phrase.pph_phrase_maybe_note_problem(phrase, SELECT_STRING_METHOD, $DEMERITS, list($CYCL, v_term, $NL_PREDS, nl_preds, $INCREMENTAL_DEMERITS, incremental_demerits, $METHOD, fun));
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject pph_demerit_cutoff_for_quality_alt(SubLObject quality) {
        {
            SubLObject pcase_var = quality;
            if (pcase_var.eql($GOOD)) {
                return pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
            } else {
                return number_utilities.positive_infinity();
            }
        }
    }

    public static SubLObject pph_demerit_cutoff_for_quality(final SubLObject quality) {
        if (quality.eql($GOOD)) {
            return pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
        }
        return number_utilities.positive_infinity();
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-LOOSE-P or NIL; from calling METHOD on TERM.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-LOOSE-P or NIL; from calling METHOD on TERM.")
    public static final SubLObject pph_try_method_alt(SubLObject method, SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format(T, $str_alt171$__SELECT_STRING_METHOD__Calling__, method, v_term);
            }
            {
                SubLObject output_item = NIL;
                SubLObject alternative_output_items = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject preferred_result = funcall(method, v_term, nl_preds);
                    SubLObject alternative_results = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (!alternative_results.isList()) {
                        alternative_results = NIL;
                    }
                    output_item = com.cyc.cycjava.cycl.pph_methods.pph_process_method_result(preferred_result, v_term, category, quality, nl_preds, method);
                    {
                        SubLObject cdolist_list_var = alternative_results;
                        SubLObject alternative_result = NIL;
                        for (alternative_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , alternative_result = cdolist_list_var.first()) {
                            {
                                SubLObject var = com.cyc.cycjava.cycl.pph_methods.pph_process_method_result(alternative_result, v_term, category, quality, nl_preds, method);
                                if (NIL != var) {
                                    {
                                        SubLObject item_var = var;
                                        if (NIL == member(item_var, alternative_output_items, symbol_function(EQUAL), symbol_function(PPH_PHRASE_OUTPUT_ITEM_STRING))) {
                                            alternative_output_items = cons(item_var, alternative_output_items);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(output_item, nreverse(alternative_output_items));
            }
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-LOOSE-P or NIL; from calling METHOD on TERM.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-LOOSE-P or NIL; from calling METHOD on TERM.")
    public static SubLObject pph_try_method(final SubLObject method, final SubLObject v_term, final SubLObject nl_preds, final SubLObject quality, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
            format_nil.force_format(T, $str166$__SELECT_STRING_METHOD__Calling__, method, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject output_item = NIL;
        SubLObject alternative_output_items = NIL;
        thread.resetMultipleValues();
        final SubLObject preferred_result = funcall(method, v_term, nl_preds);
        SubLObject alternative_results = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!alternative_results.isList()) {
            alternative_results = NIL;
        }
        output_item = pph_process_method_result(preferred_result, v_term, category, quality, nl_preds, method);
        SubLObject cdolist_list_var = alternative_results;
        SubLObject alternative_result = NIL;
        alternative_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = pph_process_method_result(alternative_result, v_term, category, quality, nl_preds, method);
            if (NIL != var) {
                final SubLObject item_var = var;
                if (NIL == member(item_var, alternative_output_items, symbol_function(EQUAL), symbol_function(PPH_PHRASE_OUTPUT_ITEM_STRING))) {
                    alternative_output_items = cons(item_var, alternative_output_items);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            alternative_result = cdolist_list_var.first();
        } 
        return values(output_item, nreverse(alternative_output_items));
    }

    public static final SubLObject pph_process_method_result_alt(SubLObject preferred_result, SubLObject v_term, SubLObject category, SubLObject quality, SubLObject nl_preds, SubLObject method) {
        {
            SubLObject output_item = NIL;
            if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(preferred_result)) {
                output_item = preferred_result;
            } else {
                if ((NIL != list_utilities.proper_list_p(preferred_result)) && (NIL != list_utilities.lengthGE(preferred_result, TWO_INTEGER, UNPROVIDED))) {
                    {
                        SubLObject datum = preferred_result;
                        SubLObject current = datum;
                        SubLObject string = NIL;
                        SubLObject pred = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt173);
                        string = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt173);
                        pred = current.first();
                        current = current.rest();
                        {
                            SubLObject demerits = (current.isCons()) ? ((SubLObject) (current.first())) : ZERO_INTEGER;
                            destructuring_bind_must_listp(current, datum, $list_alt173);
                            current = current.rest();
                            {
                                SubLObject justification = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt173);
                                current = current.rest();
                                if (NIL == current) {
                                    if (string.isString() && (NIL == pph_vars.pph_too_many_demerits_p(demerits, UNPROVIDED))) {
                                        output_item = pph_data_structures.new_enhanced_pph_output_item(pph_data_structures.new_pph_phrase_output_item(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), demerits, justification);
                                        pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, pred);
                                        pph_data_structures.pph_phrase_output_item_set_cycl(output_item, v_term);
                                        if (NIL == pph_utilities.pph_string_ok_for_termP(string, v_term)) {
                                            pph_disambiguation.pph_possibly_add_disambiguation_string(output_item, com.cyc.cycjava.cycl.pph_methods.pph_category_for_disambiguation(category, method));
                                            if (NIL == pph_utilities.pph_string_ok_for_termP(pph_data_structures.pph_phrase_output_item_string(output_item), v_term)) {
                                                output_item = NIL;
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt173);
                                }
                            }
                        }
                    }
                }
            }
            if ((NIL != output_item) && (NIL != category)) {
                pph_disambiguation.pph_possibly_add_disambiguation_string(output_item, com.cyc.cycjava.cycl.pph_methods.pph_category_for_disambiguation(category, method));
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt174$__SELECT_STRING_METHOD__Function_, method, output_item);
            }
            if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(output_item)) {
                if (method.eql(NL_GENERATION_CACHE_METHOD) && nl_preds.equal(nl_generation_fort_cache.nl_generation_fort_cache_nl_preds(UNPROVIDED))) {
                    nl_preds = $ANY;
                }
                output_item = com.cyc.cycjava.cycl.pph_methods.pph_filter_method_results(output_item, quality, nl_preds, category);
            }
            return output_item;
        }
    }

    public static SubLObject pph_process_method_result(final SubLObject preferred_result, final SubLObject v_term, final SubLObject category, final SubLObject quality, SubLObject nl_preds, final SubLObject method) {
        SubLObject output_item = NIL;
        if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(preferred_result)) {
            output_item = preferred_result;
        } else
            if ((NIL != list_utilities.proper_list_p(preferred_result)) && (NIL != list_utilities.lengthGE(preferred_result, TWO_INTEGER, UNPROVIDED))) {
                SubLObject string = NIL;
                SubLObject pred = NIL;
                destructuring_bind_must_consp(preferred_result, preferred_result, $list168);
                string = preferred_result.first();
                SubLObject current = preferred_result.rest();
                destructuring_bind_must_consp(current, preferred_result, $list168);
                pred = current.first();
                current = current.rest();
                final SubLObject demerits = (current.isCons()) ? current.first() : ZERO_INTEGER;
                destructuring_bind_must_listp(current, preferred_result, $list168);
                current = current.rest();
                final SubLObject justification = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, preferred_result, $list168);
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != pph_string.pph_string_p(string)) && (NIL == pph_vars.pph_too_many_demerits_p(demerits, UNPROVIDED))) {
                        output_item = pph_data_structures.new_enhanced_pph_output_item(pph_data_structures.new_pph_phrase_output_item(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), demerits, justification);
                        pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, pred);
                        pph_data_structures.pph_phrase_output_item_set_cycl(output_item, v_term);
                        if (NIL == pph_utilities.pph_string_ok_for_termP(string, v_term)) {
                            pph_disambiguation.pph_possibly_add_disambiguation_string(output_item, pph_category_for_disambiguation(category, method));
                            if (NIL == pph_utilities.pph_string_ok_for_termP(pph_data_structures.pph_phrase_output_item_string(output_item), v_term)) {
                                output_item = NIL;
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(preferred_result, $list168);
                }
            }

        if ((NIL != output_item) && (NIL != category)) {
            pph_disambiguation.pph_possibly_add_disambiguation_string(output_item, pph_category_for_disambiguation(category, method));
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str169$__SELECT_STRING_METHOD__Function_, method, output_item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_data_structures.pph_phrase_output_item_loose_p(output_item)) {
            if (method.eql(NL_GENERATION_CACHE_METHOD) && nl_preds.equal(nl_generation_fort_cache.nl_generation_fort_cache_nl_preds(UNPROVIDED))) {
                nl_preds = $ANY;
            }
            output_item = pph_filter_method_results(output_item, quality, nl_preds, category);
        }
        return output_item;
    }

    public static final SubLObject pph_category_for_disambiguation_alt(SubLObject phrase_category, SubLObject method) {
        if (method == NL_GENERATION_CACHE_METHOD) {
            return $$Noun;
        } else {
            return phrase_category;
        }
    }

    public static SubLObject pph_category_for_disambiguation(final SubLObject phrase_category, final SubLObject method) {
        if (method == NL_GENERATION_CACHE_METHOD) {
            return $$Noun;
        }
        return phrase_category;
    }

    public static final SubLObject pph_filter_method_results_alt(SubLObject output_item, SubLObject quality, SubLObject nl_preds, SubLObject category) {
        {
            SubLObject pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
            if (!((NIL != com.cyc.cycjava.cycl.pph_methods.pph_pred_ok_for_qualityP(pred, quality, nl_preds, output_item)) && ((!((quality != $ANY) && (NIL != pph_utilities.pph_nbarP(category)))) || (NIL == pph_utilities.pph_name_string_predP(pred))))) {
                output_item = NIL;
            }
        }
        return output_item;
    }

    public static SubLObject pph_filter_method_results(SubLObject output_item, final SubLObject quality, final SubLObject nl_preds, final SubLObject category) {
        final SubLObject pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
        SubLObject okP = T;
        if (NIL == pph_pred_ok_for_qualityP(pred, quality, nl_preds, output_item)) {
            okP = NIL;
        } else
            if (quality != $ANY) {
                if (NIL != pph_utilities.pph_name_string_predP(pred)) {
                    if (NIL != pph_utilities.pph_nbarP(category)) {
                        if (((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && $$definiteDescriptions.eql(pred)) && (NIL != string_utilities.starts_with_by_test(pph_data_structures.pph_phrase_output_item_string(output_item), $$$the_, symbol_function(EQUALP)))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str174$Removing_determiner_to_form_Nbar_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_data_structures.pph_phrase_output_item_set_string(output_item, string_utilities.pre_remove(pph_data_structures.pph_phrase_output_item_string(output_item), $$$the_, symbol_function(EQUALP)));
                        } else {
                            okP = NIL;
                        }
                    }
                }
            }

        if (NIL == okP) {
            output_item = NIL;
        }
        return output_item;
    }

    public static final SubLObject pph_revised_nl_preds_for_phrase_alt(SubLObject phrase, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_nl_preds = nl_preds;
                if (((NIL != pph_phrase.pph_phrase_npP(phrase)) && (NIL == pph_types.pph_phrase_nautP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL != pph_utilities.pph_collectionP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt177$Paraphrasing__S_as_an_NP_, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                    }
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject non_singular_nl_preds = pph_utilities.pph_filter_preds(nl_preds, $list_alt178, UNPROVIDED);
                                    new_nl_preds = (NIL != non_singular_nl_preds) ? ((SubLObject) (non_singular_nl_preds)) : pph_utilities.pph_filter_preds(nl_preds, $list_alt179, UNPROVIDED);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    if ((((((NIL != list_utilities.proper_list_p(nl_preds)) && (NIL == pph_phrase.pph_phrase_nbarP(phrase))) && (NIL != pph_utilities.pph_filter_preds($list_alt180, nl_preds, UNPROVIDED))) && (NIL != pph_utilities.pph_filter_preds($list_alt181, nl_preds, UNPROVIDED))) && (NIL != pph_utilities.pph_filter_preds($list_alt182, nl_preds, UNPROVIDED))) && (NIL == subl_promotions.memberP($$properNameStrings, nl_preds, $sym184$PPH_SPEC_PREDICATE_, UNPROVIDED))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt185$Adding___properNameStrings_to__S, nl_preds);
                        }
                        new_nl_preds = cons($$properNameStrings, nl_preds);
                    } else {
                        if ((NIL == nl_preds) && (NIL != pph_phrase.pph_phrase_nbarP(phrase))) {
                            new_nl_preds = lexicon_accessors.top_level_nl_preds();
                        }
                    }
                }
                return new_nl_preds;
            }
        }
    }

    public static SubLObject pph_revised_nl_preds_for_phrase(final SubLObject phrase, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_nl_preds = nl_preds;
        if (((NIL != pph_phrase.pph_phrase_npP(phrase)) && (NIL == pph_types.pph_phrase_nautP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL != pph_utilities.pph_collectionP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str175$Paraphrasing__S_as_an_NP_, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                new_nl_preds = pph_utilities.pph_filter_preds(nl_preds, $list176, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else
            if ((((((NIL != list_utilities.proper_list_p(nl_preds)) && (NIL == pph_phrase.pph_phrase_nbarP(phrase))) && (NIL != pph_utilities.pph_filter_preds($list177, nl_preds, UNPROVIDED))) && (NIL != pph_utilities.pph_filter_preds($list178, nl_preds, UNPROVIDED))) && (NIL != pph_utilities.pph_filter_preds($list179, nl_preds, UNPROVIDED))) && (NIL == subl_promotions.memberP($$properNameStrings, nl_preds, $sym181$PPH_SPEC_PREDICATE_, UNPROVIDED))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str182$Adding___properNameStrings_to__S, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                new_nl_preds = cons($$properNameStrings, nl_preds);
            } else
                if ((NIL == nl_preds) && (NIL != pph_phrase.pph_phrase_nbarP(phrase))) {
                    new_nl_preds = lexicon_accessors.top_level_nl_preds();
                }


        return new_nl_preds;
    }

    public static final SubLObject pph_pred_ok_for_qualityP_alt(SubLObject pred, SubLObject quality, SubLObject nl_preds, SubLObject output_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (quality == $ANY) {
                return T;
            } else {
                if (nl_preds == $ANY) {
                    return T;
                } else {
                    if ((NIL == nl_preds) && (NIL != lexicon_accessors.closed_lexical_class_stringP(pph_data_structures.pph_phrase_output_item_string(output_item), pph_vars.$pph_language_mt$.getDynamicValue(thread)))) {
                        return T;
                    } else {
                        if (NIL == pred) {
                            return NIL;
                        } else {
                            if ((NIL != pph_utilities.pph_speech_part_predP(pred)) || (NIL != pph_utilities.pph_name_string_predP(pred))) {
                                return makeBoolean((quality == $DECENT) || (NIL != member(pred, nl_preds, $sym186$PPH_PRED_LICENSED_BY_PRED_, UNPROVIDED)));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject pph_pred_ok_for_qualityP(final SubLObject pred, final SubLObject quality, final SubLObject nl_preds, final SubLObject output_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (quality == $ANY) {
            return T;
        }
        if (nl_preds == $ANY) {
            return T;
        }
        if ((NIL == nl_preds) && (NIL != lexicon_accessors.closed_lexical_class_stringP(pph_data_structures.pph_phrase_output_item_string(output_item), pph_vars.$pph_language_mt$.getDynamicValue(thread)))) {
            return T;
        }
        if (NIL == pred) {
            return NIL;
        }
        if ((NIL != pph_utilities.pph_speech_part_predP(pred)) || (NIL != pph_utilities.pph_name_string_predP(pred))) {
            return makeBoolean((quality == $DECENT) || (NIL != member(pred, nl_preds, $sym183$PPH_PRED_LICENSED_BY_PRED_, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject pph_genl_lexicon_predicateP_alt(SubLObject pred1, SubLObject pred2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_genl_predicateP(pred1, pred2, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject pph_genl_lexicon_predicateP(final SubLObject pred1, final SubLObject pred2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_predicateP(pred1, pred2, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }

    /**
     * Try to find the best string for TERM, using @xref SELECT-STRING-METHOD.
     * Note that if the lexicon is loaded, we favor any lexicon preds
     * that are passed in via NL-PREDS, then try all other lexicon preds in the order
     * they appear in @xref *all-lexicon-string-predicates*.
     *
     * @param QUALITY;
     * 		What is our threshold for accepting an answer?
     * @return PPH-PHRASE-OUTPUT-LIST-P
     */
    @LispMethod(comment = "Try to find the best string for TERM, using @xref SELECT-STRING-METHOD.\r\nNote that if the lexicon is loaded, we favor any lexicon preds\r\nthat are passed in via NL-PREDS, then try all other lexicon preds in the order\r\nthey appear in @xref *all-lexicon-string-predicates*.\r\n\r\n@param QUALITY;\r\n\t\tWhat is our threshold for accepting an answer?\r\n@return PPH-PHRASE-OUTPUT-LIST-P\nTry to find the best string for TERM, using @xref SELECT-STRING-METHOD.\nNote that if the lexicon is loaded, we favor any lexicon preds\nthat are passed in via NL-PREDS, then try all other lexicon preds in the order\nthey appear in @xref *all-lexicon-string-predicates*.")
    public static final SubLObject select_string_for_term_internal_alt(SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject precision, SubLObject mode) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (quality == UNPROVIDED) {
            quality = $ANY;
        }
        if (precision == UNPROVIDED) {
            precision = pph_utilities.pph_current_precision();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == nl_preds) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt89$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt90$__, format_nil.format_nil_a_no_copy($str_alt189$Trying_to_paraphrase__S_with_no_N) });
                    pph_error.pph_handle_error(new_format_string, list(v_term));
                }
            }
            if (nl_preds == $DEFAULT) {
                nl_preds = pph_utilities.pph_default_nl_preds_for_term(v_term);
            }
            {
                SubLObject fort = function_terms.naut_to_nart(v_term);
                SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_phrase.pph_phrase_set_cycl(phrase, fort);
                if (NIL != nl_preds) {
                    pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                }
                SubLTrampolineFile.checkType(precision, PPH_PRECISION_P);
                {
                    SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(precision, thread);
                        pph_vars.$paraphrase_mode$.bind(mode, thread);
                        com.cyc.cycjava.cycl.pph_methods.select_string_method(phrase, quality);
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_1, thread);
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
                    }
                }
                return pph_phrase.pph_phrase_output_list(phrase);
            }
        }
    }

    /**
     * Try to find the best string for TERM, using @xref SELECT-STRING-METHOD.
     * Note that if the lexicon is loaded, we favor any lexicon preds
     * that are passed in via NL-PREDS, then try all other lexicon preds in the order
     * they appear in @xref *all-lexicon-string-predicates*.
     *
     * @param QUALITY;
     * 		What is our threshold for accepting an answer?
     * @return PPH-PHRASE-OUTPUT-LIST-P
     */
    @LispMethod(comment = "Try to find the best string for TERM, using @xref SELECT-STRING-METHOD.\r\nNote that if the lexicon is loaded, we favor any lexicon preds\r\nthat are passed in via NL-PREDS, then try all other lexicon preds in the order\r\nthey appear in @xref *all-lexicon-string-predicates*.\r\n\r\n@param QUALITY;\r\n\t\tWhat is our threshold for accepting an answer?\r\n@return PPH-PHRASE-OUTPUT-LIST-P\nTry to find the best string for TERM, using @xref SELECT-STRING-METHOD.\nNote that if the lexicon is loaded, we favor any lexicon preds\nthat are passed in via NL-PREDS, then try all other lexicon preds in the order\nthey appear in @xref *all-lexicon-string-predicates*.")
    public static SubLObject select_string_for_term_internal(final SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject precision, SubLObject mode) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (quality == UNPROVIDED) {
            quality = $ANY;
        }
        if (precision == UNPROVIDED) {
            precision = pph_utilities.pph_current_precision();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_preds) {
            final SubLObject new_format_string = cconcatenate($str186$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str187$__, format_nil.format_nil_a_no_copy($str188$Trying_to_paraphrase__S_with_no_N) });
            pph_error.pph_handle_error(new_format_string, list(v_term));
        }
        if (nl_preds == $DEFAULT) {
            nl_preds = pph_utilities.pph_default_nl_preds_for_term(v_term);
        }
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_set_cycl(phrase, fort);
        if (NIL != nl_preds) {
            pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
        }
        assert NIL != pph_utilities.pph_precision_p(precision) : "! pph_utilities.pph_precision_p(precision) " + ("pph_utilities.pph_precision_p(precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(precision) ") + precision;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(precision, thread);
            pph_vars.$paraphrase_mode$.bind(mode, thread);
            select_string_method(phrase, quality);
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject select_string_for_term_alt(SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject precision, SubLObject mode) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (quality == UNPROVIDED) {
            quality = $ANY;
        }
        if (precision == UNPROVIDED) {
            precision = pph_utilities.pph_current_precision();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_methods.select_string_for_term_internal(v_term, nl_preds, quality, precision, mode);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SELECT_STRING_FOR_TERM, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SELECT_STRING_FOR_TERM, FIVE_INTEGER, $int$500, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SELECT_STRING_FOR_TERM, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(v_term, nl_preds, quality, precision, mode);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (nl_preds.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (quality.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (precision.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mode.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.select_string_for_term_internal(v_term, nl_preds, quality, precision, mode)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, nl_preds, quality, precision, mode));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject select_string_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject quality, SubLObject precision, SubLObject mode) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $DEFAULT;
        }
        if (quality == UNPROVIDED) {
            quality = $ANY;
        }
        if (precision == UNPROVIDED) {
            precision = pph_utilities.pph_current_precision();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return select_string_for_term_internal(v_term, nl_preds, quality, precision, mode);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SELECT_STRING_FOR_TERM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SELECT_STRING_FOR_TERM, FIVE_INTEGER, $int$500, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SELECT_STRING_FOR_TERM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(v_term, nl_preds, quality, precision, mode);
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
                    if (nl_preds.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (quality.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (precision.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mode.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(select_string_for_term_internal(v_term, nl_preds, quality, precision, mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, nl_preds, quality, precision, mode));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_pph_name_string_preds() {
        final SubLObject cs = $pph_name_string_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pph_name_string_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_name_string_preds_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_name_string_preds_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            preds = remove($$preferredNameString, delete_duplicates(append(isa.all_fort_instances($$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED), genl_predicates.all_spec_preds($$nameString, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject dispreferred_name_string_preds = nconc(list_utilities.fast_set_difference(preds, isa.all_fort_instances($$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED), UNPROVIDED), $dispreferred_pph_name_string_preds$.getGlobalValue());
            preds = list_utilities.delete_if_not($sym194$VALID_CONSTANT_, delete_if($sym195$HL_PROTOTYPICAL_INSTANCE_, set_difference(preds, dispreferred_name_string_preds, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            preds = pph_sort_name_string_preds(preds);
            preds = cons($$preferredNameString, preds);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static final SubLObject pph_name_string_preds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == pph_vars.$pph_name_string_preds$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.pph_methods.init_pph_name_string_preds();
            }
            return pph_vars.$pph_name_string_preds$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_name_string_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pph_name_string_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_NAME_STRING_PREDS, $pph_name_string_preds_caching_state$, $int$128, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_PPH_NAME_STRING_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_name_string_preds_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_pph_term_string_preds() {
        final SubLObject cs = $pph_term_string_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pph_term_string_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_term_string_preds_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_term_string_preds_internal(final SubLObject mt) {
        return cons($$preferredTermStrings, remove($$preferredTermStrings, isa.all_non_prototypical_fort_instances($$ProperNamePredicate_Loose, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject pph_term_string_preds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $pph_term_string_preds$.getDynamicValue(thread)) {
                {
                    SubLObject termstring_preds = isa.all_fort_instances($$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED);
                    $pph_term_string_preds$.setDynamicValue(cons($$preferredTermStrings, remove_if($sym194$HL_PROTOTYPICAL_INSTANCE_, remove($$preferredTermStrings, termstring_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), thread);
                }
            }
            return $pph_term_string_preds$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_term_string_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pph_term_string_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_TERM_STRING_PREDS, $pph_term_string_preds_caching_state$, $int$128, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_PPH_TERM_STRING_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_term_string_preds_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * If term has a string associated with it via a spec-pred of #$properNameStrings
     * that is also an instance of #$ProperNamePredicate-Strict,
     * return the list (namestring predicate), else return nil.
     * #$preferredNameString is checked first, and then the others,
     * with more-specific predicates preceding their genl-preds.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a string associated with it via a spec-pred of #$properNameStrings\r\nthat is also an instance of #$ProperNamePredicate-Strict,\r\nreturn the list (namestring predicate), else return nil.\r\n#$preferredNameString is checked first, and then the others,\r\nwith more-specific predicates preceding their genl-preds.\r\n\r\n@unknown SELECT-STRING-METHODS\nIf term has a string associated with it via a spec-pred of #$properNameStrings\nthat is also an instance of #$ProperNamePredicate-Strict,\nreturn the list (namestring predicate), else return nil.\n#$preferredNameString is checked first, and then the others,\nwith more-specific predicates preceding their genl-preds.")
    public static final SubLObject name_string_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                if ((NIL != indexed_term_p(v_term)) && (NIL != nl_preds)) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                results = com.cyc.cycjava.cycl.pph_methods.name_string_method_int(v_term, nl_preds, results);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if ((NIL != list_utilities.empty_list_p(results)) || (NIL != pph_vars.pph_generate_alternative_phrasesP())) {
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(com.cyc.cycjava.cycl.pph_methods.pph_enhanced_domain_mt(UNPROVIDED, UNPROVIDED));
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    results = com.cyc.cycjava.cycl.pph_methods.name_string_method_int(v_term, nl_preds, results);
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        if ((NIL != pph_vars.$allow_pph_language_mt_broadeningP$.getDynamicValue(thread)) && ((NIL != list_utilities.empty_list_p(results)) || (NIL != pph_vars.pph_generate_alternative_phrasesP()))) {
                            {
                                SubLObject broadened_language_mt = com.cyc.cycjava.cycl.pph_methods.pph_broaden_language_mt();
                                if (NIL == hlmt.hlmt_equalP(broadened_language_mt, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
                                    {
                                        SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_language_mt$.bind(broadened_language_mt, thread);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                Errors.warn($str_alt195$Broadening__PPH_LANGUAGE_MT__to__, pph_vars.$pph_language_mt$.getDynamicValue(thread));
                                            }
                                            {
                                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(com.cyc.cycjava.cycl.pph_methods.pph_enhanced_domain_mt(UNPROVIDED, UNPROVIDED));
                                                {
                                                    SubLObject _prev_bind_0_37 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                        results = com.cyc.cycjava.cycl.pph_methods.name_string_method_int(v_term, nl_preds, results);
                                                    } finally {
                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                results = nreverse(results);
                return NIL != list_utilities.empty_list_p(results) ? ((SubLObject) (values(list(NIL, NIL), NIL))) : values(results.first(), results.rest());
            }
        }
    }

    /**
     * If term has a string associated with it via a spec-pred of #$properNameStrings
     * that is also an instance of #$ProperNamePredicate-Strict,
     * return the list (namestring predicate), else return nil.
     * #$preferredNameString is checked first, and then the others,
     * with more-specific predicates preceding their genl-preds.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a string associated with it via a spec-pred of #$properNameStrings\r\nthat is also an instance of #$ProperNamePredicate-Strict,\r\nreturn the list (namestring predicate), else return nil.\r\n#$preferredNameString is checked first, and then the others,\r\nwith more-specific predicates preceding their genl-preds.\r\n\r\n@unknown SELECT-STRING-METHODS\nIf term has a string associated with it via a spec-pred of #$properNameStrings\nthat is also an instance of #$ProperNamePredicate-Strict,\nreturn the list (namestring predicate), else return nil.\n#$preferredNameString is checked first, and then the others,\nwith more-specific predicates preceding their genl-preds.")
    public static SubLObject name_string_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preferred_results = NIL;
        SubLObject dispreferred_results = NIL;
        if ((NIL != indexed_term_p(v_term)) && (NIL != nl_preds)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                thread.resetMultipleValues();
                final SubLObject preferred_results_$34 = name_string_method_int(v_term, nl_preds, preferred_results, UNPROVIDED);
                final SubLObject dispreferred_results_$35 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                preferred_results = preferred_results_$34;
                dispreferred_results = dispreferred_results_$35;
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if ((NIL != list_utilities.empty_list_p(preferred_results)) || (NIL != pph_vars.pph_generate_alternative_phrasesP())) {
                thread.resetMultipleValues();
                final SubLObject preferred_results_$35 = name_string_method_int(v_term, nl_preds, preferred_results, T);
                final SubLObject dispreferred_results_$36 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                preferred_results = preferred_results_$35;
                dispreferred_results = dispreferred_results_$36;
                if ((NIL != pph_vars.$allow_pph_language_mt_broadeningP$.getDynamicValue(thread)) && ((NIL != list_utilities.empty_list_p(preferred_results)) || (NIL != pph_vars.pph_generate_alternative_phrasesP()))) {
                    final SubLObject broadened_language_mt = pph_broaden_language_mt();
                    if (NIL == hlmt.hlmt_equalP(broadened_language_mt, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
                        _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        try {
                            pph_vars.$pph_language_mt$.bind(broadened_language_mt, thread);
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str204$Broadening__PPH_LANGUAGE_MT__to__, pph_vars.$pph_language_mt$.getDynamicValue(thread));
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            thread.resetMultipleValues();
                            final SubLObject preferred_results_$36 = name_string_method_int(v_term, nl_preds, preferred_results, T);
                            final SubLObject dispreferred_results_$37 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            preferred_results = preferred_results_$36;
                            dispreferred_results = dispreferred_results_$37;
                        } finally {
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
        }
        preferred_results = nreverse(preferred_results);
        dispreferred_results = nreverse(dispreferred_results);
        return values(preferred_results.first(), append(preferred_results.rest(), dispreferred_results));
    }

    public static final SubLObject name_string_method_int(SubLObject v_term, SubLObject nl_preds, SubLObject results_so_far) {
        {
            SubLObject results = results_so_far;
            SubLObject preds = com.cyc.cycjava.cycl.pph_methods.pph_name_string_preds_from_nl_pred_specification(nl_preds);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = preds;
                    SubLObject name_string_pred = NIL;
                    for (name_string_pred = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , name_string_pred = csome_list_var.first()) {
                        if (NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP(name_string_pred, v_term, ONE_INTEGER, T)) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_38 = com.cyc.cycjava.cycl.pph_methods.pph_do_name_string_method(v_term, name_string_pred);
                                    SubLObject pair = NIL;
                                    for (pair = csome_list_var_38.first(); !((NIL != doneP) || (NIL == csome_list_var_38)); csome_list_var_38 = csome_list_var_38.rest() , pair = csome_list_var_38.first()) {
                                        {
                                            SubLObject datum = pair;
                                            SubLObject current = datum;
                                            SubLObject string = NIL;
                                            SubLObject pred = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt196);
                                            string = current.first();
                                            current = current.rest();
                                            pred = current;
                                            if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_name_ok_for_preds_and_cyclP(string, v_term, pred, nl_preds)) {
                                                string = com.cyc.cycjava.cycl.pph_methods.smart_decapitalize(string, v_term);
                                                {
                                                    SubLObject item_var = list(string, pred);
                                                    if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        results = cons(item_var, results);
                                                    }
                                                }
                                                if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                                    doneP = T;
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
            return results;
        }
    }

    public static SubLObject name_string_method_int(final SubLObject v_term, final SubLObject nl_preds, final SubLObject results_so_far, SubLObject allow_domain_mt_for_namesP) {
        if (allow_domain_mt_for_namesP == UNPROVIDED) {
            allow_domain_mt_for_namesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = results_so_far;
        SubLObject dispreferred_results = NIL;
        final SubLObject preds = pph_name_string_preds_from_nl_pred_specification(nl_preds);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = preds;
            SubLObject name_string_pred = NIL;
            name_string_pred = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP(name_string_pred, v_term, ONE_INTEGER, T)) {
                    thread.resetMultipleValues();
                    final SubLObject preferred_pairs = pph_do_name_string_method(v_term, name_string_pred, allow_domain_mt_for_namesP);
                    final SubLObject dispreferred_pairs = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject pairs = NIL;
                    SubLObject pairs_$40 = NIL;
                    SubLObject dispreferredP = NIL;
                    SubLObject dispreferredP_$41 = NIL;
                    pairs = list(preferred_pairs, dispreferred_pairs);
                    pairs_$40 = pairs.first();
                    dispreferredP = list(NIL, T);
                    dispreferredP_$41 = dispreferredP.first();
                    while ((NIL != dispreferredP) || (NIL != pairs)) {
                        if (NIL == doneP) {
                            SubLObject csome_list_var_$42 = pairs_$40;
                            SubLObject pair = NIL;
                            pair = csome_list_var_$42.first();
                            while ((NIL == doneP) && (NIL != csome_list_var_$42)) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject string = NIL;
                                SubLObject pred = NIL;
                                destructuring_bind_must_consp(current, datum, $list205);
                                string = current.first();
                                current = pred = current.rest();
                                if (NIL != pph_name_ok_for_preds_and_cyclP(string, v_term, pred, nl_preds)) {
                                    string = smart_decapitalize(string, v_term);
                                    if (NIL != dispreferredP_$41) {
                                        final SubLObject item_var = list(string, pred);
                                        if (NIL == member(item_var, dispreferred_results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            dispreferred_results = cons(item_var, dispreferred_results);
                                        }
                                    } else {
                                        final SubLObject item_var = list(string, pred);
                                        if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            results = cons(item_var, results);
                                        }
                                    }
                                }
                                if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                    doneP = T;
                                }
                                csome_list_var_$42 = csome_list_var_$42.rest();
                                pair = csome_list_var_$42.first();
                            } 
                        }
                        pairs = pairs.rest();
                        pairs_$40 = pairs.first();
                        dispreferredP = dispreferredP.rest();
                        dispreferredP_$41 = dispreferredP.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                name_string_pred = csome_list_var.first();
            } 
        }
        return values(results, dispreferred_results);
    }

    public static final SubLObject pph_name_string_preds_from_nl_pred_specification_alt(SubLObject nl_preds) {
        return (nl_preds == $ANY) || (NIL != find($$nounStrings, nl_preds, symbol_function($sym197$SPEC_POS_PRED_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.pph_name_string_preds())) : com.cyc.cycjava.cycl.pph_methods.pph_name_string_preds_from_nl_preds(nl_preds);
    }

    public static SubLObject pph_name_string_preds_from_nl_pred_specification(final SubLObject nl_preds) {
        return (nl_preds == $ANY) || (NIL != find($$nounStrings, nl_preds, symbol_function($sym206$SPEC_POS_PRED_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? pph_name_string_preds(UNPROVIDED) : pph_name_string_preds_from_nl_preds(nl_preds);
    }

    public static final SubLObject pph_name_ok_for_preds_and_cyclP_alt(SubLObject string, SubLObject v_term, SubLObject pred, SubLObject nl_preds) {
        {
            SubLObject okP = T;
            SubLObject pcase_var = nl_preds;
            if (pcase_var.eql($ANY)) {
                okP = T;
            } else {
                if (NIL == okP) {
                    {
                        SubLObject csome_list_var = nl_preds;
                        SubLObject nl_pred = NIL;
                        for (nl_pred = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , nl_pred = csome_list_var.first()) {
                            okP = pph_methods_lexicon.pph_name_ok_for_pred_and_cyclP(string, v_term, pred, nl_pred);
                        }
                    }
                }
            }
            return okP;
        }
    }

    public static SubLObject pph_name_ok_for_preds_and_cyclP(final SubLObject string, final SubLObject v_term, final SubLObject pred, final SubLObject nl_preds) {
        SubLObject okP = T;
        if (nl_preds.eql($ANY)) {
            okP = T;
        } else
            if (NIL == okP) {
                SubLObject csome_list_var;
                SubLObject nl_pred;
                for (csome_list_var = nl_preds, nl_pred = NIL, nl_pred = csome_list_var.first(); (NIL == okP) && (NIL != csome_list_var); okP = pph_methods_lexicon.pph_name_ok_for_pred_and_cyclP(string, v_term, pred, nl_pred) , csome_list_var = csome_list_var.rest() , nl_pred = csome_list_var.first()) {
                }
            }

        return okP;
    }

    public static final SubLObject pph_name_string_preds_from_nl_preds_alt(SubLObject nl_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name_string_preds = new_set(UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = nl_preds;
                SubLObject nl_pred = NIL;
                for (nl_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nl_pred = cdolist_list_var.first()) {
                    if ((NIL != pph_utilities.pph_genl_predicateP(nl_pred, $$properNameStrings, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_predicateP(nl_pred, $$abbreviationString, UNPROVIDED))) {
                        {
                            SubLObject nonstandardP = makeBoolean(NIL == com.cyc.cycjava.cycl.pph_methods.pph_standard_name_string_predP(nl_pred));
                            SubLObject node_var = nl_pred;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_39 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt81$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(nl_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_42 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(nl_pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_45 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject name_string_pred = node_var_45;
                                                                            {
                                                                                SubLObject _prev_bind_0_46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_45)) {
                                                                                        if ((NIL != nonstandardP) || (NIL != com.cyc.cycjava.cycl.pph_methods.pph_standard_name_string_predP(name_string_pred))) {
                                                                                            set_add(name_string_pred, name_string_preds);
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                        SubLObject cdolist_list_var_47 = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var_47.first(); NIL != cdolist_list_var_47; cdolist_list_var_47 = cdolist_list_var_47.rest() , module_var = cdolist_list_var_47.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_45);
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
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_50 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_51 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_51)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_51);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_52 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_53 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_53.first(); NIL != cdolist_list_var_53; cdolist_list_var_53 = cdolist_list_var_53.rest() , node_vars_link_node = cdolist_list_var_53.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_52, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_51 = dictionary_contents.do_dictionary_contents_next(iteration_state_51);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_51);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_50, thread);
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
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt84$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_54 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest() , generating_fn = cdolist_list_var_54.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_55 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_56 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_57 = new_list_56;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , node_vars_link_node = cdolist_list_var_57.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_55, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_49, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_48, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_46, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_44, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_43, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_42, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt85$Node__a_does_not_pass_sbhl_type_t, nl_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_41, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_40, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return set_element_list(name_string_preds);
            }
        }
    }

    public static SubLObject pph_name_string_preds_from_nl_preds(final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name_string_preds = NIL;
        SubLObject cdolist_list_var = nl_preds;
        SubLObject nl_pred = NIL;
        nl_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != pph_utilities.pph_genl_predicateP(nl_pred, $$properNameStrings, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_predicateP(nl_pred, $$abbreviationString, UNPROVIDED))) {
                final SubLObject nonstandardP = makeBoolean(NIL == pph_standard_name_string_predP(nl_pred));
                final SubLObject node_var = nl_pred;
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(nl_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$46 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(nl_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$49 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject name_string_pred = node_var_$49;
                                            final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$49)) && ((NIL != nonstandardP) || (NIL != pph_standard_name_string_predP(name_string_pred)))) {
                                                    final SubLObject item_var = name_string_pred;
                                                    if (NIL == member(item_var, name_string_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        name_string_preds = cons(item_var, name_string_preds);
                                                    }
                                                }
                                                SubLObject cdolist_list_var_$51;
                                                final SubLObject accessible_modules = cdolist_list_var_$51 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var_$51.first();
                                                while (NIL != cdolist_list_var_$51) {
                                                    final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$49);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$55;
                                                                                for (iteration_state_$55 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$55); iteration_state_$55 = dictionary_contents.do_dictionary_contents_next(iteration_state_$55)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$55);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str81$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$49, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$55);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$48, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str82$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$52;
                                                                final SubLObject new_list = cdolist_list_var_$52 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$52.first();
                                                                while (NIL != cdolist_list_var_$52) {
                                                                    final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str81$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$50, thread);
                                                                    }
                                                                    cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                                    generating_fn = cdolist_list_var_$52.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$47, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                                    }
                                                    cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                    module_var = cdolist_list_var_$51.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$46, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$48, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$46, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$45, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, nl_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$45, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$43, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            nl_pred = cdolist_list_var.first();
        } 
        return pph_sort_name_string_preds(name_string_preds);
    }

    /**
     *
     *
     * @return BOOLEANP; Is NL-PRED a standard name-string pred for PPH purposes?
     */
    @LispMethod(comment = "@return BOOLEANP; Is NL-PRED a standard name-string pred for PPH purposes?")
    public static final SubLObject pph_standard_name_string_predP_alt(SubLObject nl_pred) {
        return makeBoolean(nl_pred.eql($$properNameStrings) || (NIL != subl_promotions.memberP(nl_pred, com.cyc.cycjava.cycl.pph_methods.pph_name_string_preds(), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP; Is NL-PRED a standard name-string pred for PPH purposes?
     */
    @LispMethod(comment = "@return BOOLEANP; Is NL-PRED a standard name-string pred for PPH purposes?")
    public static SubLObject pph_standard_name_string_predP(final SubLObject nl_pred) {
        return makeBoolean(nl_pred.eql($$properNameStrings) || (NIL != subl_promotions.memberP(nl_pred, pph_name_string_preds(UNPROVIDED), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject clear_pph_enhanced_domain_mt_alt() {
        {
            SubLObject cs = $pph_enhanced_domain_mt_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_pph_enhanced_domain_mt() {
        final SubLObject cs = $pph_enhanced_domain_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_pph_enhanced_domain_mt_alt(SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_enhanced_domain_mt_caching_state$.getGlobalValue(), list(language_mt, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_pph_enhanced_domain_mt(SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_enhanced_domain_mt_caching_state$.getGlobalValue(), list(language_mt, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return HLMT-P; the union of MT with DOMAIN-MT.
     */
    @LispMethod(comment = "@return HLMT-P; the union of MT with DOMAIN-MT.")
    public static final SubLObject pph_enhanced_domain_mt_internal_alt(SubLObject language_mt, SubLObject domain_mt) {
        return pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, language_mt, domain_mt));
    }

    /**
     *
     *
     * @return HLMT-P; the union of MT with DOMAIN-MT.
     */
    @LispMethod(comment = "@return HLMT-P; the union of MT with DOMAIN-MT.")
    public static SubLObject pph_enhanced_domain_mt_internal(final SubLObject language_mt, final SubLObject domain_mt) {
        return pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, language_mt, domain_mt));
    }

    public static final SubLObject pph_enhanced_domain_mt_alt(SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $pph_enhanced_domain_mt_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PPH_ENHANCED_DOMAIN_MT, $pph_enhanced_domain_mt_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_PPH_ENHANCED_DOMAIN_MT);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(language_mt, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (language_mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_enhanced_domain_mt_internal(language_mt, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(language_mt, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject pph_enhanced_domain_mt(SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pph_enhanced_domain_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_ENHANCED_DOMAIN_MT, $pph_enhanced_domain_mt_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_PPH_ENHANCED_DOMAIN_MT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(language_mt, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (language_mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_enhanced_domain_mt_internal(language_mt, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(language_mt, domain_mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return HLMT-P; A broader version of the current *PPH-LANGUAGE-MT*, if we can find
    an appropriate one to use.
     */
    @LispMethod(comment = "@return HLMT-P; A broader version of the current *PPH-LANGUAGE-MT*, if we can find\r\nan appropriate one to use.")
    public static final SubLObject pph_broaden_language_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject language = com.cyc.cycjava.cycl.pph_methods.pph_language_of_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                SubLObject broadening_pred = $$validatedLexicalPSCForLanguage;
                SubLObject language_psc = (NIL != indexed_term_p(language)) ? ((SubLObject) (kb_mapping_utilities.fpred_value_in_any_mt(language, broadening_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                return NIL != language_psc ? ((SubLObject) (language_psc)) : pph_vars.$pph_language_mt$.getDynamicValue(thread);
            }
        }
    }

    /**
     *
     *
     * @return HLMT-P; A broader version of the current *PPH-LANGUAGE-MT*, if we can find
    an appropriate one to use.
     */
    @LispMethod(comment = "@return HLMT-P; A broader version of the current *PPH-LANGUAGE-MT*, if we can find\r\nan appropriate one to use.")
    public static SubLObject pph_broaden_language_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject language = pph_language_of_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject broadening_pred = $$validatedLexicalPSCForLanguage;
        final SubLObject language_psc = (NIL != indexed_term_p(language)) ? kb_mapping_utilities.fpred_value_in_any_mt(language, broadening_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        return NIL != language_psc ? language_psc : pph_vars.$pph_language_mt$.getDynamicValue(thread);
    }

    public static SubLObject pph_dispreferred_assertionP(final SubLObject as) {
        return somewhere_cache.some_pred_assertion_somewhereP($$dispreferredLexification, as, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject pph_do_name_string_method(SubLObject v_term, SubLObject name_string_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = pph_methods_lexicon.pph_lexifications_for_term(v_term, list(name_string_pred), NIL);
                SubLObject ans = NIL;
                SubLObject doneP = NIL;
                if (NIL != assertions) {
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = assertions;
                            SubLObject gaf = NIL;
                            for (gaf = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , gaf = csome_list_var.first()) {
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var_58 = com.cyc.cycjava.cycl.pph_methods.name_string_gaf_strings(gaf);
                                        SubLObject string = NIL;
                                        for (string = csome_list_var_58.first(); !((NIL != doneP) || (NIL == csome_list_var_58)); csome_list_var_58 = csome_list_var_58.rest() , string = csome_list_var_58.first()) {
                                            if (NIL != pph_utilities.pph_string_ok_for_termP(string, v_term)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format(T, $str_alt204$Generated_name_for__S_from____S, v_term, gaf);
                                                }
                                                pph_phrase_resolution.maybe_throw_pph_hl_supports(v_term, string, list(name_string_pred), list(gaf));
                                                {
                                                    SubLObject item_var = cons(string, name_string_pred);
                                                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        ans = cons(item_var, ans);
                                                    }
                                                }
                                            } else {
                                                if (NIL != pph_disambiguation.pph_string_ambiguous_p(string)) {
                                                    {
                                                        SubLObject new_string = pph_disambiguation.pph_possibly_add_alias(v_term, string);
                                                        if (NIL != pph_utilities.pph_string_ok_for_termP(new_string, v_term)) {
                                                            {
                                                                SubLObject item_var = cons(new_string, name_string_pred);
                                                                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    ans = cons(item_var, ans);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            doneP = makeBoolean((NIL == pph_vars.pph_generate_alternative_phrasesP()) && (NIL != ans));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if ((name_string_pred.eql($$chemicalFormulaString) && (NIL != pph_utilities.pph_collectionP(v_term))) && (NIL != pph_utilities.pph_isaP(v_term, $$ChemicalSubstanceType, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
                        {
                            SubLObject output_item = com.cyc.cycjava.cycl.pph_methods.do_generate_chemical_substance_type_semantic(v_term);
                            SubLObject item_var = cons(pph_phrase.pph_phrase_output_item_get_string(output_item, T), pph_data_structures.pph_phrase_output_item_agr_pred(output_item));
                            if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                ans = cons(item_var, ans);
                            }
                        }
                    }
                }
                return values(ans, doneP);
            }
        }
    }

    public static SubLObject pph_do_name_string_method(final SubLObject v_term, final SubLObject name_string_pred, SubLObject allow_domain_mt_for_namesP) {
        if (allow_domain_mt_for_namesP == UNPROVIDED) {
            allow_domain_mt_for_namesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertions = pph_methods_lexicon.pph_lexifications_for_term(v_term, list(name_string_pred), allow_domain_mt_for_namesP);
        SubLObject ans = NIL;
        SubLObject dispreferred = NIL;
        SubLObject doneP = NIL;
        if (NIL != assertions) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str214$__Got__S, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == doneP) {
                SubLObject csome_list_var = assertions;
                SubLObject gaf = NIL;
                gaf = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    final SubLObject dispreferredP = pph_dispreferred_assertionP(gaf);
                    if (NIL == doneP) {
                        SubLObject csome_list_var_$60 = name_string_gaf_strings(gaf);
                        SubLObject string = NIL;
                        string = csome_list_var_$60.first();
                        while ((NIL == doneP) && (NIL != csome_list_var_$60)) {
                            if (NIL != pph_utilities.pph_string_ok_for_termP(string, v_term)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str215$Generated_name_for__S_from____S, v_term, gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_phrase_resolution.maybe_throw_pph_hl_supports(v_term, string, list(name_string_pred), list(gaf));
                                if (NIL != dispreferredP) {
                                    final SubLObject item_var = cons(string, name_string_pred);
                                    if (NIL == member(item_var, dispreferred, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        dispreferred = cons(item_var, dispreferred);
                                    }
                                } else {
                                    final SubLObject item_var = cons(string, name_string_pred);
                                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                            } else
                                if (NIL != pph_disambiguation.pph_string_ambiguous_p(string)) {
                                    final SubLObject new_string = pph_disambiguation.pph_possibly_add_alias(v_term, string);
                                    if (NIL != pph_utilities.pph_string_ok_for_termP(new_string, v_term)) {
                                        if (NIL != dispreferredP) {
                                            final SubLObject item_var2 = cons(new_string, name_string_pred);
                                            if (NIL == member(item_var2, dispreferred, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                dispreferred = cons(item_var2, dispreferred);
                                            }
                                        } else {
                                            final SubLObject item_var2 = cons(new_string, name_string_pred);
                                            if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var2, ans);
                                            }
                                        }
                                    }
                                }

                            doneP = makeBoolean((NIL == pph_vars.pph_generate_alternative_phrasesP()) && (NIL != ans));
                            csome_list_var_$60 = csome_list_var_$60.rest();
                            string = csome_list_var_$60.first();
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                } 
            }
        } else
            if ((name_string_pred.eql($$chemicalFormulaString) && (NIL != pph_utilities.pph_collectionP(v_term))) && (NIL != pph_utilities.pph_isaP(v_term, $$ChemicalSubstanceType, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
                final SubLObject output_item = do_generate_chemical_substance_type_semantic(v_term);
                final SubLObject item_var3 = cons(pph_phrase.pph_phrase_output_item_get_string(output_item, T), pph_data_structures.pph_phrase_output_item_agr_pred(output_item));
                if (NIL == member(item_var3, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var3, ans);
                }
            } else
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str217$__No__S_assertions___for__S___fro, name_string_pred, v_term, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }


        return values(ans, dispreferred, doneP);
    }

    public static SubLObject name_string_gaf_strings_internal(final SubLObject gaf) {
        SubLObject strings = NIL;
        final SubLObject v_cycl_string = assertions_high.gaf_arg2(gaf);
        if (v_cycl_string.isString() || (NIL != unicode_nauts.unicode_naut_p(v_cycl_string, UNPROVIDED))) {
            final SubLObject string = pph_string.pph_string_from_cycl_string(v_cycl_string);
            strings = cons(string, strings);
            if ((NIL != pph_string.pph_string_p(string)) && (NIL != pph_string.pph_string_starts_with(string, $$$the_, symbol_function(EQUALP)))) {
                strings = list_utilities.add_to_end(pph_string.pph_string_pre_remove(string, $$$the_, symbol_function(EQUALP)), strings);
            }
        }
        return strings;
    }

    public static final SubLObject name_string_gaf_strings_alt(SubLObject gaf) {
        {
            SubLObject string = assertions_high.gaf_arg2(gaf);
            SubLObject strings = (string.isString()) ? ((SubLObject) (list(string))) : NIL;
            if (string.isString() && (NIL != string_utilities.starts_with_by_test(string, $str_alt206$the_, symbol_function(EQUALP)))) {
                strings = list_utilities.add_to_end(string_utilities.pre_remove(string, $str_alt206$the_, symbol_function(EQUALP)), strings);
            }
            return strings;
        }
    }

    public static SubLObject name_string_gaf_strings(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return name_string_gaf_strings_internal(gaf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NAME_STRING_GAF_STRINGS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NAME_STRING_GAF_STRINGS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NAME_STRING_GAF_STRINGS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, gaf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(name_string_gaf_strings_internal(gaf)));
            memoization_state.caching_state_put(caching_state, gaf, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return BOOLEAN; Is NL-PREDS free of abbreviation preds?
     */
    @LispMethod(comment = "@return BOOLEAN; Is NL-PREDS free of abbreviation preds?")
    public static final SubLObject pph_no_abbreviation_predsP_alt(SubLObject nl_preds) {
        return makeBoolean(NIL == list_utilities.find_if_not($sym207$PPH_NON_ABBREVIATION_NAME_PRED_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEAN; Is NL-PREDS free of abbreviation preds?
     */
    @LispMethod(comment = "@return BOOLEAN; Is NL-PREDS free of abbreviation preds?")
    public static SubLObject pph_no_abbreviation_predsP(final SubLObject nl_preds) {
        return makeBoolean(NIL == list_utilities.find_if_not($sym219$PPH_NON_ABBREVIATION_NAME_PRED_, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject pph_non_abbreviation_name_predP_alt(SubLObject pred) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.pph_methods.pph_abbreviation_predP(pred, UNPROVIDED));
    }

    public static SubLObject pph_non_abbreviation_name_predP(final SubLObject pred) {
        return makeBoolean(NIL == pph_abbreviation_predP(pred, UNPROVIDED));
    }

    public static final SubLObject clear_pph_methods_caches_alt() {
        com.cyc.cycjava.cycl.pph_methods.clear_generate_skolem_name();
        return $CLEARED;
    }

    public static SubLObject clear_pph_methods_caches() {
        clear_generate_skolem_name();
        return $CLEARED;
    }

    public static final SubLObject pph_abbreviation_predP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return subl_promotions.memberP(pred, com.cyc.cycjava.cycl.pph_methods.pph_abbreviation_preds(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_abbreviation_predP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return subl_promotions.memberP(pred, pph_abbreviation_preds(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_pph_abbreviation_preds_alt() {
        {
            SubLObject cs = $pph_abbreviation_preds_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_pph_abbreviation_preds() {
        final SubLObject cs = $pph_abbreviation_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_pph_abbreviation_preds_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_abbreviation_preds_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_pph_abbreviation_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($pph_abbreviation_preds_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_abbreviation_preds_internal_alt(SubLObject mt) {
        return genl_predicates.all_spec_preds($$abbreviationString_PN, mt, UNPROVIDED);
    }

    public static SubLObject pph_abbreviation_preds_internal(final SubLObject mt) {
        return genl_predicates.all_spec_preds($$abbreviationString_PN, mt, UNPROVIDED);
    }

    public static final SubLObject pph_abbreviation_preds_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $pph_abbreviation_preds_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PPH_ABBREVIATION_PREDS, $pph_abbreviation_preds_caching_state$, $int$25, EQUAL, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_PPH_ABBREVIATION_PREDS);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw23$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_abbreviation_preds_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject pph_abbreviation_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = $pph_abbreviation_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_ABBREVIATION_PREDS, $pph_abbreviation_preds_caching_state$, $int$25, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_PPH_ABBREVIATION_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_abbreviation_preds_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Find any name-string pred hit, regardless of NL-PREDS.
     */
    @LispMethod(comment = "Find any name-string pred hit, regardless of NL-PREDS.")
    public static final SubLObject any_name_string_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return com.cyc.cycjava.cycl.pph_methods.name_string_method(v_term, $ANY);
    }

    /**
     * Find any name-string pred hit, regardless of NL-PREDS.
     */
    @LispMethod(comment = "Find any name-string pred hit, regardless of NL-PREDS.")
    public static SubLObject any_name_string_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return name_string_method(v_term, $ANY);
    }

    /**
     * Find any non-acronym name-string pred hit, regardless of NL-PREDS.
     */
    @LispMethod(comment = "Find any non-acronym name-string pred hit, regardless of NL-PREDS.")
    public static final SubLObject name_string_method_non_acronym_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            SubLObject preds = com.cyc.cycjava.cycl.pph_methods.pph_name_string_preds_from_nl_pred_specification(nl_preds);
            preds = delete($$acronymString, preds, $sym184$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.pph_methods.name_string_method(v_term, preds);
        }
    }

    /**
     * Find any non-acronym name-string pred hit, regardless of NL-PREDS.
     */
    @LispMethod(comment = "Find any non-acronym name-string pred hit, regardless of NL-PREDS.")
    public static SubLObject name_string_method_non_acronym(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        SubLObject preds = pph_name_string_preds_from_nl_pred_specification(nl_preds);
        preds = delete($$acronymString, preds, $sym181$PPH_SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return name_string_method(v_term, preds);
    }

    /**
     * Decapitalize STRING if it would be smart to do so, based on TERM, which STRING denotes.
     */
    @LispMethod(comment = "Decapitalize STRING if it would be smart to do so, based on TERM, which STRING denotes.")
    public static final SubLObject smart_decapitalize_alt(SubLObject string, SubLObject v_term) {
        if (!string.isString()) {
            return NIL;
        }
        {
            SubLObject ans = string_utilities.copy_string(string);
            if (((NIL != string_utilities.non_empty_stringP(string)) && (NIL != com.cyc.cycjava.cycl.pph_methods.pph_starts_with_determinerP(string))) && (NIL == com.cyc.cycjava.cycl.pph_methods.assume_det_is_part_of_nameP(v_term))) {
                set_aref(ans, ZERO_INTEGER, char_downcase(aref(ans, ZERO_INTEGER)));
            }
            return ans;
        }
    }

    /**
     * Decapitalize STRING if it would be smart to do so, based on TERM, which STRING denotes.
     */
    @LispMethod(comment = "Decapitalize STRING if it would be smart to do so, based on TERM, which STRING denotes.")
    public static SubLObject smart_decapitalize(final SubLObject string, final SubLObject v_term) {
        if (NIL == pph_string.pph_string_p(string)) {
            return NIL;
        }
        final SubLObject ans = pph_string.pph_string_copy(string);
        if (((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != pph_starts_with_determinerP(string))) && (NIL == assume_det_is_part_of_nameP(v_term))) {
            pph_string.pph_string_ndowncase_leading(ans);
        }
        return ans;
    }

    public static final SubLObject pph_starts_with_determinerP_alt(SubLObject string) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return string_utilities.starts_with_one_of(string, $list_alt215);
        } else {
            return NIL;
        }
    }

    public static SubLObject pph_starts_with_determinerP(final SubLObject string) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return pph_string.pph_string_starts_with_one_of(string, $list227);
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Should we assume that any initial determiner is
    part of the name of TERM?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we assume that any initial determiner is\r\npart of the name of TERM?")
    public static final SubLObject assume_det_is_part_of_nameP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_isaP(v_term, $$Artifact_Generic, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Should we assume that any initial determiner is
    part of the name of TERM?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we assume that any initial determiner is\r\npart of the name of TERM?")
    public static SubLObject assume_det_is_part_of_nameP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_isaP(v_term, $$Artifact_Generic, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
    }

    public static SubLObject pph_sort_name_string_preds(final SubLObject preds) {
        return Sort.sort(preds, $sym230$PPH_PREFER_NAME_STRING_PRED_, UNPROVIDED);
    }

    public static SubLObject pph_prefer_name_string_predP(final SubLObject pred1, final SubLObject pred2) {
        if ((NIL != subl_promotions.memberP(pred2, $dispreferred_pph_name_string_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(pred1, $dispreferred_pph_name_string_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if ((NIL != subl_promotions.memberP(pred1, $dispreferred_pph_name_string_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(pred2, $dispreferred_pph_name_string_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != pph_utilities.pph_isaP(pred1, $$ProperNamePredicate_Strict, UNPROVIDED)) && (NIL == pph_utilities.pph_isaP(pred2, $$ProperNamePredicate_Strict, UNPROVIDED))) {
            return T;
        }
        if ((NIL != pph_utilities.pph_isaP(pred2, $$ProperNamePredicate_Strict, UNPROVIDED)) && (NIL == pph_utilities.pph_isaP(pred1, $$ProperNamePredicate_Strict, UNPROVIDED))) {
            return NIL;
        }
        return cardinality_estimates.generality_estimateG(pred2, pred1);
    }

    /**
     * If term has a cached value, return the list (<string> <pred>), else return NIL.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a cached value, return the list (<string> <pred>), else return NIL.\r\n\r\n@unknown SELECT-STRING-METHODS")
    public static final SubLObject nl_generation_cache_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if ((NIL != forts.fort_p(v_term)) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject string = pph_utilities.pph_fort_paraphrase_cache_lookup(v_term, nl_preds, UNPROVIDED);
                        SubLObject pred = thread.secondMultipleValue();
                        SubLObject demerits = thread.thirdMultipleValue();
                        SubLObject justification = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (string.isString()) {
                            ans = list(string, pred, demerits, justification);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * If term has a cached value, return the list (<string> <pred>), else return NIL.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a cached value, return the list (<string> <pred>), else return NIL.\r\n\r\n@unknown SELECT-STRING-METHODS")
    public static SubLObject nl_generation_cache_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != forts.fort_p(v_term)) && pph_vars.$pph_language_mt$.getDynamicValue(thread).equal(nl_generation_fort_cache.nl_generation_fort_cache_paraphrase_mt(UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject string = pph_utilities.pph_fort_paraphrase_cache_lookup(v_term, nl_preds, UNPROVIDED);
            final SubLObject pred = thread.secondMultipleValue();
            final SubLObject demerits = thread.thirdMultipleValue();
            final SubLObject justification = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != pph_string.pph_string_p(string)) && (NIL == find_if($sym231$INVALID_ASSERTION_, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                ans = list(string, pred, demerits, justification);
            }
        }
        return ans;
    }

    /**
     * If term has a string associated with it via a #$ProperNamePredicate-Loose
     * such as #$termStrings or #$preferredTermStrings, return the list (namestring predicate),
     * else return nil. #$preferredTermStrings is preferred over anything else.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a string associated with it via a #$ProperNamePredicate-Loose\r\nsuch as #$termStrings or #$preferredTermStrings, return the list (namestring predicate),\r\nelse return nil. #$preferredTermStrings is preferred over anything else.\r\n\r\n@unknown SELECT-STRING-METHODS\nIf term has a string associated with it via a #$ProperNamePredicate-Loose\nsuch as #$termStrings or #$preferredTermStrings, return the list (namestring predicate),\nelse return nil. #$preferredTermStrings is preferred over anything else.")
    public static final SubLObject term_string_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        if (NIL == indexed_term_p(v_term)) {
            return list(NIL, NIL);
        }
        {
            SubLObject ans = NIL;
            SubLObject pred_used = NIL;
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.pph_methods.pph_term_string_preds();
                    SubLObject termstring_pred = NIL;
                    for (termstring_pred = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , termstring_pred = csome_list_var.first()) {
                        ans = kb_mapping_utilities.fpred_value_in_any_mt(v_term, termstring_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        pred_used = termstring_pred;
                    }
                }
            }
            if (ans.isString()) {
                ans = com.cyc.cycjava.cycl.pph_methods.smart_decapitalize(ans, v_term);
            }
            return list(ans, pred_used);
        }
    }

    /**
     * If term has a string associated with it via a #$ProperNamePredicate-Loose
     * such as #$termStrings or #$preferredTermStrings, return the list (namestring predicate),
     * else return nil. #$preferredTermStrings is preferred over anything else.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a string associated with it via a #$ProperNamePredicate-Loose\r\nsuch as #$termStrings or #$preferredTermStrings, return the list (namestring predicate),\r\nelse return nil. #$preferredTermStrings is preferred over anything else.\r\n\r\n@unknown SELECT-STRING-METHODS\nIf term has a string associated with it via a #$ProperNamePredicate-Loose\nsuch as #$termStrings or #$preferredTermStrings, return the list (namestring predicate),\nelse return nil. #$preferredTermStrings is preferred over anything else.")
    public static SubLObject term_string_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        if (NIL == indexed_term_p(v_term)) {
            return list(NIL, NIL);
        }
        SubLObject ans = NIL;
        SubLObject pred_used = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var;
            SubLObject termstring_pred;
            SubLObject string;
            for (csome_list_var = pph_term_string_preds(UNPROVIDED), termstring_pred = NIL, termstring_pred = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = (NIL != string) ? pph_string.pph_string_from_cycl_string(string) : NIL , pred_used = termstring_pred , csome_list_var = csome_list_var.rest() , termstring_pred = csome_list_var.first()) {
                string = kb_mapping_utilities.fpred_value_in_any_mt(v_term, termstring_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != pph_string.pph_string_p(ans)) {
            ans = smart_decapitalize(ans, v_term);
        }
        return list(ans, pred_used);
    }

    /**
     *
     *
     * @return PPH-OUTPUT-ITEM-P or NIL.
     */
    @LispMethod(comment = "@return PPH-OUTPUT-ITEM-P or NIL.")
    public static final SubLObject chemical_formula_method_alt(SubLObject substance_type, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            SubLObject olist = com.cyc.cycjava.cycl.pph_methods.do_generate_chemical_substance_type(substance_type);
            return (NIL != pph_phrase.pph_phrase_output_list_p(olist)) && (NIL != list_utilities.singletonP(olist)) ? ((SubLObject) (olist.first())) : NIL;
        }
    }

    /**
     *
     *
     * @return PPH-OUTPUT-ITEM-P or NIL.
     */
    @LispMethod(comment = "@return PPH-OUTPUT-ITEM-P or NIL.")
    public static SubLObject chemical_formula_method(final SubLObject substance_type, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLObject olist = do_generate_chemical_substance_type(substance_type);
        return (NIL != pph_phrase.pph_phrase_output_list_p(olist)) && (NIL != list_utilities.singletonP(olist)) ? olist.first() : NIL;
    }

    /**
     * If term has a scientific name, returns the list (<namestring> #$scientificName), else returns nil.
     *
     * @unknown SELECT-STRING-METHOD
     */
    @LispMethod(comment = "If term has a scientific name, returns the list (<namestring> #$scientificName), else returns nil.\r\n\r\n@unknown SELECT-STRING-METHOD")
    public static final SubLObject scientific_name_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject scientific_name = NIL;
                SubLObject output_item = NIL;
                if (NIL != indexed_term_p(v_term)) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                scientific_name = kb_mapping_utilities.fpred_value(v_term, $$scientificName, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if ((NIL != string_utilities.non_empty_stringP(scientific_name)) && (NIL != pph_utilities.pph_string_ok_for_termP(scientific_name, v_term))) {
                        scientific_name = com.cyc.cycjava.cycl.pph_methods.smart_decapitalize(scientific_name, v_term);
                        output_item = pph_data_structures.new_pph_phrase_output_item(scientific_name, pph_utilities.pph_unknown_arg_position(), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, $$scientificName);
                        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                            pph_html.pph_phrase_output_item_italicize(output_item);
                        }
                    }
                }
                return output_item;
            }
        }
    }

    /**
     * If term has a scientific name, returns the list (<namestring> #$scientificName), else returns nil.
     *
     * @unknown SELECT-STRING-METHOD
     */
    @LispMethod(comment = "If term has a scientific name, returns the list (<namestring> #$scientificName), else returns nil.\r\n\r\n@unknown SELECT-STRING-METHOD")
    public static SubLObject scientific_name_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject scientific_name = NIL;
        SubLObject output_item = NIL;
        if (NIL != indexed_term_p(v_term)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                scientific_name = kb_mapping_utilities.fpred_value(v_term, $$scientificName, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if ((NIL != string_utilities.non_empty_stringP(scientific_name)) && (NIL != pph_utilities.pph_string_ok_for_termP(scientific_name, v_term))) {
                scientific_name = smart_decapitalize(scientific_name, v_term);
                output_item = pph_data_structures.new_pph_phrase_output_item(scientific_name, pph_utilities.pph_unknown_arg_position(), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_data_structures.pph_phrase_output_item_set_agr_pred(output_item, $$scientificName);
                if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                    pph_html.pph_phrase_output_item_italicize(output_item);
                }
            }
        }
        return output_item;
    }

    /**
     * If term has a prettyString, return the list (<name> NIL), else return NIL.
     *
     * @unknown What should this do if there are multiple prettyStrings??
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a prettyString, return the list (<name> NIL), else return NIL.\r\n\r\n@unknown What should this do if there are multiple prettyStrings??\r\n@unknown SELECT-STRING-METHODS")
    public static final SubLObject pretty_string_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == indexed_term_p(v_term)) {
                return list(NIL, NIL);
            }
            {
                SubLObject preds = $list_alt222;
                SubLObject ans = NIL;
                if (NIL == ans) {
                    {
                        SubLObject csome_list_var = preds;
                        SubLObject pred = NIL;
                        for (pred = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                            if (NIL != valid_constantP(pred, UNPROVIDED)) {
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        ans = kb_mapping_utilities.fpred_value(v_term, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            return bq_cons(ans, $list_alt223);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * If term has a prettyString, return the list (<name> NIL), else return NIL.
     *
     * @unknown What should this do if there are multiple prettyStrings??
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "If term has a prettyString, return the list (<name> NIL), else return NIL.\r\n\r\n@unknown What should this do if there are multiple prettyStrings??\r\n@unknown SELECT-STRING-METHODS")
    public static SubLObject pretty_string_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(v_term)) {
            return list(NIL, NIL);
        }
        final SubLObject preds = $list233;
        SubLObject ans = NIL;
        SubLObject others = NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != valid_constantP(pred, UNPROVIDED)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject string = NIL;
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$61 = NIL;
                                    final SubLObject token_var_$62 = NIL;
                                    while (NIL == done_var_$61) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$62);
                                        final SubLObject valid_$63 = makeBoolean(!token_var_$62.eql(assertion));
                                        if (NIL != valid_$63) {
                                            string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                            final SubLObject result = list(string, pred);
                                            if (NIL == ans) {
                                                ans = result;
                                            } else {
                                                final SubLObject item_var = result;
                                                if (NIL == member(item_var, others, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    others = cons(item_var, others);
                                                }
                                            }
                                        }
                                        done_var_$61 = makeBoolean(NIL == valid_$63);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return values(ans, others);
    }

    /**
     * Paraphrase POSSESSED using a definite description of it as something belonging to something else.
     *
     * @return LISTP; (STRING PRED).
     */
    @LispMethod(comment = "Paraphrase POSSESSED using a definite description of it as something belonging to something else.\r\n\r\n@return LISTP; (STRING PRED).")
    public static final SubLObject genitive_paraphrase_method_alt(SubLObject possessed, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans_string = NIL;
                SubLObject ans_pred = NIL;
                SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_phrase.pph_phrase_set_cycl(phrase, possessed);
                pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                    try {
                        pph_vars.$select_string_methods_to_omit$.bind($list_alt224, thread);
                        com.cyc.cycjava.cycl.pph_methods.generate_genitive(phrase);
                    } finally {
                        pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                    {
                        SubLObject add_tagsP = NIL;
                        ans_string = pph_phrase.pph_phrase_string(phrase, add_tagsP);
                        ans_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                    }
                }
                return list(ans_string, ans_pred);
            }
        }
    }

    /**
     * Paraphrase POSSESSED using a definite description of it as something belonging to something else.
     *
     * @return LISTP; (STRING PRED).
     */
    @LispMethod(comment = "Paraphrase POSSESSED using a definite description of it as something belonging to something else.\r\n\r\n@return LISTP; (STRING PRED).")
    public static SubLObject genitive_paraphrase_method(final SubLObject possessed, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans_string = NIL;
        SubLObject ans_pred = NIL;
        final SubLObject phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_set_cycl(phrase, possessed);
        pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        try {
            pph_vars.$select_string_methods_to_omit$.bind($list235, thread);
            generate_genitive(phrase);
        } finally {
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            final SubLObject add_tagsP = NIL;
            ans_string = pph_phrase.pph_phrase_string(phrase, add_tagsP);
            ans_pred = pph_phrase.pph_phrase_agr_pred(phrase);
        }
        return list(ans_string, ans_pred);
    }

    /**
     * Try to paraphrase a NART based on good explicit lexifications for it.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on good explicit lexifications for it.")
    public static final SubLObject generate_nart_lexified_tight_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject precision = ((NIL != pph_utilities.pph_top_level_preciseP()) || (NIL == pph_vars.$pph_terse_modeP$.getDynamicValue(thread))) ? ((SubLObject) ($PRECISE)) : $GOOD;
                com.cyc.cycjava.cycl.pph_methods.generate_nart_lexified(phrase, precision);
            }
            return phrase;
        }
    }

    /**
     * Try to paraphrase a NART based on good explicit lexifications for it.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on good explicit lexifications for it.")
    public static SubLObject generate_nart_lexified_tight(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject precision = ((NIL != pph_utilities.pph_top_level_preciseP()) || (NIL == pph_vars.$pph_terse_modeP$.getDynamicValue(thread))) ? $PRECISE : $GOOD;
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind(ZERO_INTEGER, thread);
            generate_nart_lexified(phrase, precision);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    /**
     * Try to paraphrase a NART based on imprecise explicit lexifications for it.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on imprecise explicit lexifications for it.")
    public static final SubLObject generate_nart_lexified_imprecise_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != pph_vars.$pph_terse_modeP$.getDynamicValue(thread)) && (NIL != pph_utilities.pph_top_level_preciseP())) {
                {
                    SubLObject precision = $GOOD;
                    com.cyc.cycjava.cycl.pph_methods.generate_nart_lexified(phrase, precision);
                }
            }
            return phrase;
        }
    }

    /**
     * Try to paraphrase a NART based on imprecise explicit lexifications for it.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on imprecise explicit lexifications for it.")
    public static SubLObject generate_nart_lexified_imprecise(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != pph_vars.$pph_terse_modeP$.getDynamicValue(thread)) && (NIL != pph_utilities.pph_top_level_preciseP())) {
            final SubLObject precision = $GOOD;
            generate_nart_lexified(phrase, precision);
        }
        return phrase;
    }

    public static final SubLObject pph_nart_methods_to_omit_for_precision_alt(SubLObject precision) {
        {
            SubLObject pcase_var = precision;
            if (pcase_var.eql($PRECISE)) {
                return $list_alt224;
            } else {
                if (pcase_var.eql($GOOD)) {
                    return NIL;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject pph_nart_methods_to_omit_for_precision(final SubLObject precision) {
        if (precision.eql($PRECISE)) {
            return $list235;
        }
        if (precision.eql($GOOD)) {
            return NIL;
        }
        return NIL;
    }

    /**
     * Try to paraphrase a NART based on explicit lexifications for it.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on explicit lexifications for it.")
    public static final SubLObject generate_nart_lexified_alt(SubLObject phrase, SubLObject precision) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original = pph_phrase.pph_phrase_create_backup(phrase);
                SubLObject revised_nl_preds = com.cyc.cycjava.cycl.pph_methods.pph_revised_nl_preds_for_phrase(phrase, UNPROVIDED);
                SubLObject methods_to_omit = com.cyc.cycjava.cycl.pph_methods.pph_nart_methods_to_omit_for_precision(precision);
                methods_to_omit = append(methods_to_omit, pph_vars.$select_string_methods_to_omit$.getDynamicValue(thread));
                if (NIL == pph_vars.$pph_consolidate_output_list_for_nartP$.getDynamicValue(thread)) {
                    {
                        SubLObject item_var = NL_GENERATION_CACHE_METHOD;
                        if (NIL == member(item_var, methods_to_omit, symbol_function(EQ), symbol_function(IDENTITY))) {
                            methods_to_omit = cons(item_var, methods_to_omit);
                        }
                    }
                }
                if (NIL != revised_nl_preds) {
                    pph_phrase.pph_phrase_set_agr_preds(phrase, revised_nl_preds, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                        try {
                            pph_vars.$select_string_methods_to_omit$.bind(methods_to_omit, thread);
                            {
                                SubLObject nart = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                SubLObject nart_arg_position = pph_phrase.pph_phrase_arg_position(phrase);
                                SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                                SubLObject select_string_olist = NIL;
                                SubLObject nart_equivalents = cons(nart, kb_mapping_utilities.pred_values(nart, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, $TRUE));
                                SubLObject doneP = NIL;
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = nart_equivalents;
                                        SubLObject nart_equivalent = NIL;
                                        for (nart_equivalent = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , nart_equivalent = csome_list_var.first()) {
                                            select_string_olist = com.cyc.cycjava.cycl.pph_methods.select_string_for_term(nart_equivalent, nl_preds, precision, UNPROVIDED, UNPROVIDED);
                                            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(select_string_olist)) {
                                                pph_phrase.pph_phrase_set_output_list(phrase, select_string_olist, UNPROVIDED);
                                                pph_phrase.pph_phrase_set_output_list_cycl(phrase, nart);
                                                pph_phrase.pph_phrase_set_arg_position(phrase, nart_arg_position);
                                                pph_phrase.pph_phrase_note_done(phrase);
                                                doneP = T;
                                            }
                                        }
                                    }
                                }
                                if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format(T, $str_alt227$Couldn_t_find__S_lexification_wit, new SubLObject[]{ precision, nl_preds, nart });
                                    }
                                    pph_phrase.pph_phrase_revert_to_backup(phrase, original);
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format(T, $str_alt228$Reverted_to_original_phrase_);
                                    }
                                } else {
                                    if (NIL != list_utilities.singletonP(select_string_olist)) {
                                        {
                                            SubLObject output_item = select_string_olist.first();
                                            SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
                                            pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, nart_arg_position);
                                            if (NIL != agr_pred) {
                                                pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
                                            }
                                        }
                                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                    } else {
                                        pph_phrase.pph_phrase_consolidate_output_list(phrase, nart_arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                    }
                                }
                            }
                        } finally {
                            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    /**
     * Try to paraphrase a NART based on explicit lexifications for it.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on explicit lexifications for it.")
    public static SubLObject generate_nart_lexified(final SubLObject phrase, final SubLObject precision) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original = pph_phrase.pph_phrase_create_backup(phrase);
        final SubLObject revised_nl_preds = pph_revised_nl_preds_for_phrase(phrase, UNPROVIDED);
        SubLObject methods_to_omit = pph_nart_methods_to_omit_for_precision(precision);
        methods_to_omit = append(methods_to_omit, pph_vars.$select_string_methods_to_omit$.getDynamicValue(thread));
        if (NIL == pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue(thread)) {
            final SubLObject item_var = NL_GENERATION_CACHE_METHOD;
            if (NIL == member(item_var, methods_to_omit, symbol_function(EQ), symbol_function(IDENTITY))) {
                methods_to_omit = cons(item_var, methods_to_omit);
            }
        }
        if (NIL != revised_nl_preds) {
            pph_phrase.pph_phrase_set_agr_preds(phrase, revised_nl_preds, UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
            try {
                pph_vars.$select_string_methods_to_omit$.bind(methods_to_omit, thread);
                final SubLObject nart = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                final SubLObject nart_arg_position = pph_phrase.pph_phrase_arg_position(phrase);
                final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                SubLObject select_string_olist = NIL;
                final SubLObject nart_equivalents = cons(nart, kb_mapping_utilities.pred_values(nart, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, $TRUE));
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    SubLObject csome_list_var = nart_equivalents;
                    SubLObject nart_equivalent = NIL;
                    nart_equivalent = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        select_string_olist = select_string_for_term(nart_equivalent, nl_preds, precision, UNPROVIDED, UNPROVIDED);
                        if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(select_string_olist)) {
                            pph_phrase.pph_phrase_set_output_list(phrase, select_string_olist, UNPROVIDED);
                            pph_phrase.pph_phrase_set_output_list_cycl(phrase, nart);
                            pph_phrase.pph_phrase_set_arg_position(phrase, nart_arg_position);
                            pph_phrase.pph_phrase_note_done(phrase);
                            doneP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        nart_equivalent = csome_list_var.first();
                    } 
                }
                if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str239$Couldn_t_find__S_lexification_wit, precision, nl_preds, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_revert_to_backup(phrase, original);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str240$Reverted_to_original_phrase_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != list_utilities.singletonP(select_string_olist)) {
                        final SubLObject output_item = select_string_olist.first();
                        final SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
                        pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, nart_arg_position);
                        if (NIL != agr_pred) {
                            pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                    } else {
                        pph_phrase.pph_phrase_consolidate_output_list(phrase, nart_arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                    }

            } finally {
                pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Try to paraphrase a NART based on lexifications for its args.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on lexifications for its args.")
    public static final SubLObject generate_nart_as_naut_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nart = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject naut = narts_high.nart_hl_formula(nart);
                SubLObject nart_arg_position = pph_utilities.pph_top_level_arg_position(pph_phrase.pph_phrase_arg_position_map(phrase));
                {
                    SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_mode$.bind(NIL != pph_vars.$pph_consolidate_output_list_for_nartP$.getDynamicValue(thread) ? ((SubLObject) ($TEXT)) : pph_vars.$paraphrase_mode$.getDynamicValue(thread), thread);
                        {
                            SubLObject precision = (NIL != pph_utilities.pph_top_level_preciseP()) ? ((SubLObject) (NIL)) : pph_utilities.pph_current_precision();
                            pph_phrase.pph_phrase_set_cycl(phrase, naut);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format(T, $str_alt229$__GENERATE_NART_AS_NAUT_paraphras, naut, pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
                            }
                            {
                                SubLObject _prev_bind_0_59 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                try {
                                    pph_vars.$paraphrase_precision$.bind(precision, thread);
                                    pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_59, thread);
                                }
                            }
                            pph_phrase.pph_phrase_set_cycl(phrase, nart);
                            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                            } else {
                                if (NIL == pph_phrase.pph_phrase_justification(phrase)) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format(T, $str_alt230$__GENERATE_NART_AS_NAUT_found_unj, pph_phrase.pph_phrase_string(phrase, NIL), naut);
                                    }
                                }
                            }
                        }
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                if (!((NIL != pph_phrase.pph_phrase_doneP(phrase)) || (NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED)))) {
                    pph_phrase.pph_phrase_set_string(phrase, pph_methods_lexicon.pph_string_for_term(nart, $ANY, UNPROVIDED, UNPROVIDED));
                }
                if (NIL != pph_vars.$pph_consolidate_output_list_for_nartP$.getDynamicValue(thread)) {
                    pph_phrase.pph_phrase_consolidate_output_list(phrase, nart_arg_position, NIL, NIL, pph_phrase.pph_phrase_agr_pred(phrase));
                    pph_phrase.pph_phrase_set_output_list_cycl(phrase, nart);
                }
                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                pph_phrase.pph_phrase_set_cycl(phrase, nart);
                pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(phrase);
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    /**
     * Try to paraphrase a NART based on lexifications for its args.
     */
    @LispMethod(comment = "Try to paraphrase a NART based on lexifications for its args.")
    public static SubLObject generate_nart_as_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject naut = narts_high.nart_hl_formula(nart);
        final SubLObject nart_arg_position = pph_utilities.pph_top_level_arg_position(pph_phrase.pph_phrase_arg_position_map(phrase));
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind(NIL != pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue(thread) ? $TEXT : pph_vars.$paraphrase_mode$.getDynamicValue(thread), thread);
            final SubLObject precision = (NIL != pph_utilities.pph_top_level_preciseP()) ? NIL : pph_utilities.pph_current_precision();
            pph_phrase.pph_phrase_set_cycl(phrase, naut);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str242$__GENERATE_NART_AS_NAUT_paraphras, naut, pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            assert NIL != pph_utilities.pph_precision_p(precision) : "! pph_utilities.pph_precision_p(precision) " + ("pph_utilities.pph_precision_p(precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(precision) ") + precision;
            final SubLObject _prev_bind_0_$65 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind(precision, thread);
                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$65, thread);
            }
            maybe_adjust_nart_paraphrase_demerits(phrase);
            pph_phrase.pph_phrase_set_cycl(phrase, nart);
            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                if ((NIL == pph_phrase.pph_phrase_justification(phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                    format_nil.force_format(T, $str243$__GENERATE_NART_AS_NAUT_found_unj, pph_phrase.pph_phrase_string(phrase, NIL), naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == pph_phrase.pph_phrase_doneP(phrase)) && (NIL == pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED))) {
            pph_phrase.pph_phrase_set_string(phrase, pph_methods_lexicon.pph_string_for_term(nart, $ANY, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue(thread)) {
            pph_phrase.pph_phrase_consolidate_output_list(phrase, nart_arg_position, NIL, NIL, pph_phrase.pph_phrase_agr_pred(phrase));
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, nart);
        }
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        pph_phrase.pph_phrase_set_cycl(phrase, nart);
        pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(phrase);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject maybe_adjust_nart_paraphrase_demerits(final SubLObject phrase) {
        if ((NIL != pph_phrase.pph_phrase_doneP(phrase)) && (NIL != cycl_grammar.cycl_nat_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) {
            final SubLObject just = pph_phrase.pph_phrase_justification(phrase);
            final SubLObject reln = cycl_utilities.nat_functor(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
            SubLObject not_so_badP = NIL;
            if (NIL == not_so_badP) {
                SubLObject csome_list_var = just;
                SubLObject support = NIL;
                support = csome_list_var.first();
                while ((NIL == not_so_badP) && (NIL != csome_list_var)) {
                    if (NIL != ok_gen_template_assertion_for_relnP(support, reln, UNPROVIDED)) {
                        not_so_badP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    support = csome_list_var.first();
                } 
            }
            if (NIL != not_so_badP) {
                pph_phrase.pph_phrase_increment_top_level_demerits(phrase, MINUS_ONE_INTEGER, $OK_NAT_TEMPLATE);
            }
        }
        return pph_phrase.pph_phrase_demerits(phrase);
    }

    public static SubLObject ok_gen_template_assertion_for_relnP_internal(final SubLObject support, final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == assertion_handles.assertion_p(support)) {
                return NIL;
            }
            if (NIL == assertions_high.gaf_assertionP(support)) {
                return NIL;
            }
            if (assertions_high.gaf_predicate(support).eql($$genTemplate_Constrained) && assertions_high.gaf_arg1(support).eql(reln)) {
                return T;
            }
            if (assertions_high.gaf_predicate(support).eql($$genTemplate) && (NIL == kb_mapping_utilities.some_pred_value_in_relevant_mts(reln, $$genTemplate_Constrained, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
            return NIL;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject ok_gen_template_assertion_for_relnP(final SubLObject support, final SubLObject reln, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ok_gen_template_assertion_for_relnP_internal(support, reln, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(support, reln, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (support.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (reln.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(ok_gen_template_assertion_for_relnP_internal(support, reln, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(support, reln, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Generate English for an 8-digit universal date.
     */
    @LispMethod(comment = "Generate English for an 8-digit universal date.")
    public static final SubLObject generate_universal_date_alt(SubLObject phrase) {
        {
            SubLObject universal_date = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject date_cycl = date_utilities.universal_date_to_cycl_date(universal_date);
            SubLObject date_phrase = pph_phrase.new_pph_phrase_for_cycl(date_cycl, UNPROVIDED, UNPROVIDED);
            pph_main.pph_phrase_generate(date_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject date_string = pph_phrase.pph_phrase_string(date_phrase, UNPROVIDED);
                pph_phrase.pph_phrase_set_string(phrase, date_string);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Generate English for an 8-digit universal date.
     */
    @LispMethod(comment = "Generate English for an 8-digit universal date.")
    public static SubLObject generate_universal_date(final SubLObject phrase) {
        final SubLObject universal_date = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject date_cycl = date_utilities.universal_date_to_cycl_date(universal_date);
        final SubLObject date_phrase = pph_phrase.new_pph_phrase_for_cycl(date_cycl, UNPROVIDED, UNPROVIDED);
        pph_main.pph_phrase_generate(date_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject date_string = pph_phrase.pph_phrase_string(date_phrase, UNPROVIDED);
        pph_phrase.pph_phrase_set_string(phrase, date_string);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Generate English for an 8-digit universal date.
     */
    @LispMethod(comment = "Generate English for an 8-digit universal date.")
    public static final SubLObject generate_universal_date_numbers_alt(SubLObject phrase) {
        {
            SubLObject date = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject date_string = princ_to_string(date);
            SubLObject year = string_utilities.substring(date_string, ZERO_INTEGER, FOUR_INTEGER);
            SubLObject month = string_utilities.substring(date_string, FOUR_INTEGER, SIX_INTEGER);
            SubLObject day = string_utilities.substring(date_string, SIX_INTEGER, EIGHT_INTEGER);
            pph_phrase.pph_phrase_set_string(phrase, cconcatenate(month, new SubLObject[]{ $str_alt21$_, day, $str_alt21$_, year }));
        }
        return phrase;
    }

    /**
     * Generate English for an 8-digit universal date.
     */
    @LispMethod(comment = "Generate English for an 8-digit universal date.")
    public static SubLObject generate_universal_date_numbers(final SubLObject phrase) {
        final SubLObject date = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject date_string = princ_to_string(date);
        final SubLObject year = string_utilities.substring(date_string, ZERO_INTEGER, FOUR_INTEGER);
        final SubLObject month = string_utilities.substring(date_string, FOUR_INTEGER, SIX_INTEGER);
        final SubLObject day = string_utilities.substring(date_string, SIX_INTEGER, EIGHT_INTEGER);
        pph_phrase.pph_phrase_set_string(phrase, cconcatenate(month, new SubLObject[]{ $str20$_, day, $str20$_, year }));
        return phrase;
    }

    /**
     * Generate English for a 6-digit universal second
     */
    @LispMethod(comment = "Generate English for a 6-digit universal second")
    public static final SubLObject generate_universal_second_alt(SubLObject phrase, SubLObject precision) {
        if (precision == UNPROVIDED) {
            precision = $SECOND;
        }
        {
            SubLObject string = numeric_date_utilities.secondstring(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
            SubLObject pcase_var = precision;
            if (pcase_var.eql($MINUTE)) {
                string = string_utilities.post_remove(string, $str_alt238$_00, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_string(phrase, string);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Generate English for a 6-digit universal second
     */
    @LispMethod(comment = "Generate English for a 6-digit universal second")
    public static SubLObject generate_universal_second(final SubLObject phrase, SubLObject precision) {
        if (precision == UNPROVIDED) {
            precision = $SECOND;
        }
        SubLObject string = numeric_date_utilities.secondstring(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        final SubLObject pcase_var = precision;
        if (pcase_var.eql($MINUTE)) {
            string = string_utilities.post_remove(string, $str257$_00, UNPROVIDED);
        }
        pph_phrase.pph_phrase_set_string(phrase, string);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject generate_float_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_float = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject float_string = com.cyc.cycjava.cycl.pph_methods.pph_float_string(v_float, UNPROVIDED);
                SubLObject max_number_of_digits_to_print_with_commas = TEN_INTEGER;
                if ((pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread).isInteger() && round(v_float, UNPROVIDED).numE(v_float)) && log(abs(v_float), TEN_INTEGER).numLE(max_number_of_digits_to_print_with_commas)) {
                    pph_phrase.pph_phrase_set_string(phrase, com.cyc.cycjava.cycl.pph_methods.generate_integer_wXcommas(round(v_float, UNPROVIDED)));
                } else {
                    if ((NIL != string_utilities.ends_with(float_string, $$$E0, UNPROVIDED)) || (NIL == find_if(ALPHA_CHAR_P, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        {
                            SubLObject snipped_float_string = string_utilities.post_remove(float_string, $$$E0, UNPROVIDED);
                            pph_phrase.pph_phrase_set_string(phrase, snipped_float_string);
                        }
                    } else {
                        if ((NIL != pph_vars.$pph_expand_e_notation_for_floatsP$.getDynamicValue(thread)) && (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML)) {
                            {
                                SubLObject arg_position = pph_phrase.pph_phrase_arg_position(phrase);
                                SubLObject divider_position = position_if(ALPHA_CHAR_P, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject times_symbol_string = pph_phrase_resolution.pph_symbol_string($$MultiplicationSign_TheSymbol);
                                SubLObject base_string = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.post_remove(string_utilities.substring(float_string, ZERO_INTEGER, divider_position), $str_alt244$_0, UNPROVIDED)), new SubLObject[]{ $str_alt245$_, format_nil.format_nil_a_no_copy(times_symbol_string), $str_alt246$_10 });
                                SubLObject base_item = pph_data_structures.new_pph_phrase_output_item(base_string, arg_position, v_float, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject expt_string = string_utilities.substring(float_string, number_utilities.f_1X(divider_position), UNPROVIDED);
                                SubLObject expt_item = pph_data_structures.new_pph_phrase_output_item(expt_string, arg_position, v_float, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                pph_html.pph_phrase_output_item_superscript(expt_item);
                                pph_phrase.pph_phrase_set_output_list(phrase, list(base_item, expt_item), UNPROVIDED);
                                pph_phrase.pph_phrase_note_done(phrase);
                            }
                        } else {
                            pph_phrase.pph_phrase_set_string(phrase, float_string);
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject generate_float(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_float = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject float_string = pph_float_string(v_float, UNPROVIDED);
        final SubLObject max_number_of_digits_to_print_with_commas = TEN_INTEGER;
        v_float = read_from_string(float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread).isInteger() && round(v_float, UNPROVIDED).numE(v_float)) && (v_float.isZero() || log(abs(v_float), TEN_INTEGER).numLE(max_number_of_digits_to_print_with_commas))) {
            pph_phrase.pph_phrase_set_string(phrase, generate_integer_wXcommas(round(v_float, UNPROVIDED)));
        } else
            if ((NIL != string_utilities.ends_with(float_string, $$$E0, UNPROVIDED)) || (NIL == find_if(ALPHA_CHAR_P, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                final SubLObject snipped_float_string = string_utilities.post_remove(float_string, $$$E0, UNPROVIDED);
                pph_phrase.pph_phrase_set_string(phrase, snipped_float_string);
            } else
                if ((NIL != pph_vars.$pph_expand_e_notation_for_floatsP$.getDynamicValue(thread)) && (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML)) {
                    final SubLObject arg_position = pph_phrase.pph_phrase_arg_position(phrase);
                    thread.resetMultipleValues();
                    final SubLObject base_item = generate_float_items(v_float, float_string, arg_position);
                    final SubLObject expt_item = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    pph_phrase.pph_phrase_set_output_list(phrase, list(base_item, expt_item), UNPROVIDED);
                    pph_phrase.pph_phrase_note_done(phrase);
                } else {
                    pph_phrase.pph_phrase_set_string(phrase, float_string);
                }


        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_float_items(final SubLObject v_float, final SubLObject float_string, final SubLObject arg_position) {
        final SubLObject divider_position = position_if(ALPHA_CHAR_P, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject base_string = pph_string.pph_bunge(list(string_utilities.post_remove(string_utilities.substring(float_string, ZERO_INTEGER, divider_position), $str262$_0, UNPROVIDED), pph_phrase_resolution.pph_symbol_string($$MultiplicationSign_TheSymbol), $$$10));
        final SubLObject base_item = pph_data_structures.new_pph_phrase_output_item(base_string, arg_position, v_float, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject expt_string = string_utilities.pre_remove(string_utilities.substring(float_string, number_utilities.f_1X(divider_position), UNPROVIDED), $str265$_, UNPROVIDED);
        final SubLObject expt_item = pph_data_structures.new_pph_phrase_output_item(expt_string, arg_position, v_float, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_html.pph_phrase_output_item_superscript(expt_item);
        return values(base_item, expt_item);
    }

    public static final SubLObject pph_float_string_alt(SubLObject v_float, SubLObject sig_dig) {
        if (sig_dig == UNPROVIDED) {
            sig_dig = pph_vars.$pph_significant_digits_cutoff$.getDynamicValue();
        }
        {
            SubLObject sig_dig_float = (NIL != subl_promotions.positive_integer_p(sig_dig)) ? ((SubLObject) (number_utilities.significant_digits(v_float, sig_dig))) : v_float;
            SubLObject float_string = Strings.string_upcase(string_utilities.string_subst($$$E, $$$d, string_utilities.str(sig_dig_float), symbol_function(EQUALP)), UNPROVIDED, UNPROVIDED);
            return float_string;
        }
    }

    public static SubLObject pph_float_string(final SubLObject v_float, SubLObject sig_dig) {
        if (sig_dig == UNPROVIDED) {
            sig_dig = pph_vars.$pph_significant_digits_cutoff$.getDynamicValue();
        }
        final SubLObject sig_dig_float = (NIL != subl_promotions.positive_integer_p(sig_dig)) ? number_utilities.significant_digits(v_float, sig_dig) : v_float;
        final SubLObject float_string = pph_standardize_float_string(string_utilities.str(sig_dig_float), UNPROVIDED);
        return float_string;
    }

    public static SubLObject pph_standardize_float_string(SubLObject float_string, SubLObject sig_dig) {
        if (sig_dig == UNPROVIDED) {
            sig_dig = pph_vars.$pph_significant_digits_cutoff$.getDynamicValue();
        }
        float_string = Strings.string_upcase(float_string, UNPROVIDED, UNPROVIDED);
        if (NIL != find(CHAR_E, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return float_string;
        }
        if (NIL != find(CHAR_D, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string_utilities.string_subst($$$E, $$$D, float_string, symbol_function(EQUAL));
        }
        if (NIL != string_utilities.digit_stringP(float_string)) {
            final SubLObject exp = number_utilities.f_1_(length(float_string));
            SubLObject significand_string = string_utilities.trim_sides(float_string, CHAR_0);
            if ((!significand_string.isString()) || (NIL != list_utilities.lengthG(significand_string, sig_dig, UNPROVIDED))) {
            }
            if (NIL == string_utilities.non_empty_stringP(significand_string)) {
                significand_string = $$$0;
            }
            if (NIL != list_utilities.lengthE(significand_string, ONE_INTEGER, UNPROVIDED)) {
                significand_string = cconcatenate(significand_string, $$$0);
            }
            return cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.first_char(significand_string)), new SubLObject[]{ $str269$_, format_nil.format_nil_a_no_copy(string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED)), $$$d, format_nil.format_nil_a_no_copy(exp.isNegative() ? CHAR_hyphen : CHAR_plus), format_nil.format_nil_a_no_copy(exp) });
        }
        return float_string;
    }

    /**
     *
     *
     * @param INT
     * 		integerp; to generate a string for.
     * @return STRINGP; INT with commas inserted
     */
    @LispMethod(comment = "@param INT\r\n\t\tintegerp; to generate a string for.\r\n@return STRINGP; INT with commas inserted")
    public static final SubLObject generate_integer_wXcommas_alt(SubLObject v_int) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rev_int_string = reverse(string_utilities.str(v_int));
                SubLObject strings = NIL;
                if (!(pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread).isInteger() && (NIL != list_utilities.lengthG(rev_int_string, pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread), UNPROVIDED)))) {
                    return princ_to_string(v_int);
                }
                {
                    SubLObject string_var = rev_int_string;
                    SubLObject end_var = length(string_var);
                    SubLObject end_var_60 = end_var;
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; !i.numGE(end_var_60); i = number_utilities.f_1X(i)) {
                        {
                            SubLObject curr = Strings.sublisp_char(string_var, i);
                            strings = cons(Strings.make_string(ONE_INTEGER, curr), strings);
                            if ((NIL != list_utilities.lengthGE(rev_int_string, add(TWO_INTEGER, i), UNPROVIDED)) && rem(add(ONE_INTEGER, i), THREE_INTEGER).isZero()) {
                                strings = cons($str_alt249$_, strings);
                            }
                        }
                    }
                }
                return apply(symbol_function(CCONCATENATE), strings);
            }
        }
    }

    /**
     *
     *
     * @param INT
     * 		integerp; to generate a string for.
     * @return STRINGP; INT with commas inserted
     */
    @LispMethod(comment = "@param INT\r\n\t\tintegerp; to generate a string for.\r\n@return STRINGP; INT with commas inserted")
    public static SubLObject generate_integer_wXcommas(final SubLObject v_int) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject no_commas = string_utilities.str(v_int);
        if ((!pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread).isInteger()) || (NIL == list_utilities.lengthG(no_commas, pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread), UNPROVIDED))) {
            return no_commas;
        }
        return format(NIL, $str271$__D, v_int);
    }

    /**
     *
     *
     * @param INT;
     * 		an integer
     * @return STRINGP; INT paraphrased into NL.
     */
    @LispMethod(comment = "@param INT;\r\n\t\tan integer\r\n@return STRINGP; INT paraphrased into NL.")
    public static final SubLObject generate_integer_as_word_alt(SubLObject v_int) {
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        {
            SubLObject ans = NIL;
            if (v_int.numL($int$100)) {
                if (v_int.numL(ZERO_INTEGER)) {
                    return NIL;
                } else {
                    if (v_int.numG(TWENTY_INTEGER) && mod(v_int, TEN_INTEGER).isPositive()) {
                        {
                            SubLObject tens = subtract(v_int, mod(v_int, TEN_INTEGER));
                            SubLObject tens_string = com.cyc.cycjava.cycl.pph_methods.generate_integer_as_word(tens);
                            if (NIL != tens_string) {
                                ans = cconcatenate(tens_string, new SubLObject[]{ $str_alt245$_, com.cyc.cycjava.cycl.pph_methods.generate_integer_as_word(mod(v_int, TEN_INTEGER)) });
                            }
                        }
                    } else {
                        if (v_int.numL(TWENTY_INTEGER)) {
                            ans = nth(v_int, $english_integer_paraphrases$.getGlobalValue());
                        } else {
                            ans = assoc(v_int, $english_tens_paraphrases$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
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
     * @param INT;
     * 		an integer
     * @return STRINGP; INT paraphrased into NL.
     */
    @LispMethod(comment = "@param INT;\r\n\t\tan integer\r\n@return STRINGP; INT paraphrased into NL.")
    public static SubLObject generate_integer_as_word(final SubLObject v_int) {
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        SubLObject ans = NIL;
        if (v_int.numL($int$100)) {
            if (v_int.numL(ZERO_INTEGER)) {
                return NIL;
            }
            if (v_int.numG(TWENTY_INTEGER) && mod(v_int, TEN_INTEGER).isPositive()) {
                final SubLObject tens = subtract(v_int, mod(v_int, TEN_INTEGER));
                final SubLObject tens_string = generate_integer_as_word(tens);
                if (NIL != tens_string) {
                    ans = cconcatenate(tens_string, new SubLObject[]{ $$$_, generate_integer_as_word(mod(v_int, TEN_INTEGER)) });
                }
            } else
                if (v_int.numL(TWENTY_INTEGER)) {
                    ans = nth(v_int, $english_integer_paraphrases$.getGlobalValue());
                } else {
                    ans = assoc(v_int, $english_tens_paraphrases$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
                }

        }
        return ans;
    }

    public static final SubLObject generate_number_default_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject number = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject sig_dig_number = (NIL != subl_promotions.positive_integer_p(pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread))) ? ((SubLObject) (number_utilities.significant_digits(number, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)))) : number;
                SubLObject string = NIL;
                if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_ordinal_phrase_p(phrase)) {
                    string = pph_methods_formulas.ordinal_form(number);
                } else {
                    if (!number.isInteger()) {
                    } else {
                        if ((number.numL($int$100) && (NIL != pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED), $$Determiner, UNPROVIDED))) {
                            string = com.cyc.cycjava.cycl.pph_methods.generate_integer_as_word(sig_dig_number);
                        } else {
                            if (pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread).isInteger()) {
                                string = com.cyc.cycjava.cycl.pph_methods.generate_integer_wXcommas(sig_dig_number);
                            }
                        }
                    }
                }
                if (NIL != string) {
                    pph_phrase.pph_phrase_set_string(phrase, string);
                    if (NIL == pph_utilities.pph_string_ok_for_termP(string, number)) {
                        {
                            SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
                            if (NIL != list_utilities.singletonP(olist)) {
                                pph_disambiguation.pph_possibly_add_disambiguation_string(olist.first(), $ANY);
                            } else {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    Errors.warn($str_alt257$Was_anticipating_a_singleton_outp, olist);
                                }
                            }
                        }
                    }
                }
            }
            return phrase;
        }
    }

    public static SubLObject generate_number_default(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject number = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject sig_dig_number = (NIL != subl_promotions.positive_integer_p(pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread))) ? number_utilities.significant_digits(number, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)) : number;
        SubLObject string = NIL;
        SubLObject alt_strings = NIL;
        if (NIL != pph_ordinal_phrase_p(phrase)) {
            string = pph_methods_formulas.ordinal_form(number);
        } else
            if (number.isInteger()) {
                if (((number.numL($int$100) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) && (NIL != pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED), $$Determiner, UNPROVIDED))) {
                    string = generate_integer_as_word(sig_dig_number);
                    alt_strings = cons(generate_integer_wXcommas(sig_dig_number), alt_strings);
                } else
                    if (pph_vars.$pph_max_no_comma_length$.getDynamicValue(thread).isInteger()) {
                        string = generate_integer_wXcommas(sig_dig_number);
                        alt_strings = cons(generate_integer_as_word(sig_dig_number), alt_strings);
                    }

            }

        if (NIL != string) {
            pph_phrase.pph_phrase_set_string(phrase, string);
            if (NIL == pph_utilities.pph_string_ok_for_termP(string, number)) {
                final SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
                if (NIL != list_utilities.singletonP(olist)) {
                    pph_disambiguation.pph_possibly_add_disambiguation_string(olist.first(), $ANY);
                } else
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str279$Was_anticipating_a_singleton_outp, olist);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }

            }
            SubLObject cdolist_list_var = alt_strings;
            SubLObject alt_string = NIL;
            alt_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_string.pph_string_p(alt_string)) {
                    final SubLObject alt_phrase = pph_data_structures.new_pph_phrase(alt_string, number, UNPROVIDED);
                    pph_phrase.pph_phrase_add_alternative(phrase, alt_phrase);
                }
                cdolist_list_var = cdolist_list_var.rest();
                alt_string = cdolist_list_var.first();
            } 
        }
        return phrase;
    }

    /**
     *
     *
     * @return BOOLEANP; Should PHRASE be realized as an ordinal?
     */
    @LispMethod(comment = "@return BOOLEANP; Should PHRASE be realized as an ordinal?")
    public static final SubLObject pph_ordinal_phrase_p_alt(SubLObject phrase) {
        return makeBoolean(((NIL != number_utilities.positive_number_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && (NIL != pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) && (NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), $$OrdinalAdjective, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP; Should PHRASE be realized as an ordinal?
     */
    @LispMethod(comment = "@return BOOLEANP; Should PHRASE be realized as an ordinal?")
    public static SubLObject pph_ordinal_phrase_p(final SubLObject phrase) {
        return makeBoolean((NIL != number_utilities.positive_number_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && ((NIL != lexicon_utilities.term_phrases_constraint_implied_by_nl_predsP($$OrdinalAdjective, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED))) || ((NIL != pph_phrase.pph_phrase_category(phrase, UNPROVIDED)) && (NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), $$OrdinalAdjective, UNPROVIDED)))));
    }

    /**
     * Returns the URL term formatted as a string.
     *
     * @param URL
     * 		an instance of #$UniformResourceLocator.
     */
    @LispMethod(comment = "Returns the URL term formatted as a string.\r\n\r\n@param URL\r\n\t\tan instance of #$UniformResourceLocator.")
    public static final SubLObject get_image_url_as_string_alt(SubLObject url) {
        return ask_utilities.query_variable($sym259$_STRING, listS($$imageURLPathname, url, $list_alt261), $$InferencePSC, $list_alt262).first();
    }

    /**
     * Returns the URL term formatted as a string.
     *
     * @param URL
     * 		an instance of #$UniformResourceLocator.
     */
    @LispMethod(comment = "Returns the URL term formatted as a string.\r\n\r\n@param URL\r\n\t\tan instance of #$UniformResourceLocator.")
    public static SubLObject get_image_url_as_string(final SubLObject url) {
        return ask_utilities.query_variable($sym281$_STRING, listS($$imageURLPathname, url, $list283), $$InferencePSC, $list284).first();
    }

    public static final SubLObject generate_image_url_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject image_url = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject url = com.cyc.cycjava.cycl.pph_methods.get_image_url_as_string(image_url);
                SubLObject html = format(NIL, $str_alt265$_img_src___A__, url);
                if ($HTML == pph_vars.$paraphrase_mode$.getDynamicValue(thread)) {
                    pph_phrase.pph_phrase_set_html_tags(phrase, html, NIL);
                    pph_phrase.pph_phrase_set_string(phrase, $str_alt266$);
                } else {
                    pph_phrase.pph_phrase_set_string(phrase, url);
                }
            }
            return phrase;
        }
    }

    public static SubLObject generate_image_url(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_url = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject url = get_image_url_as_string(image_url);
        final SubLObject html = format(NIL, $str287$_img_src___A__, url);
        if ($HTML == pph_vars.$paraphrase_mode$.getDynamicValue(thread)) {
            pph_phrase.pph_phrase_set_html_tags(phrase, html, NIL);
            pph_phrase.pph_phrase_set_string(phrase, $str288$);
        } else {
            pph_phrase.pph_phrase_set_string(phrase, url);
        }
        return phrase;
    }

    public static final SubLObject generate_princ_alt(SubLObject phrase) {
        {
            SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject string = com.cyc.cycjava.cycl.pph_methods.do_generate_princ(v_object);
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
            pph_phrase.pph_phrase_set_string(phrase, string);
        }
        return phrase;
    }

    public static SubLObject generate_princ(final SubLObject phrase) {
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject string = do_generate_princ(v_object);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        pph_phrase.pph_phrase_set_string(phrase, string);
        return phrase;
    }

    public static final SubLObject do_generate_princ_alt(SubLObject v_object) {
        return princ_to_string(v_object);
    }

    public static SubLObject do_generate_princ(final SubLObject v_object) {
        return princ_to_string(v_object);
    }

    public static final SubLObject pph_default_mt_time_index_alt() {
        if (NIL == $pph_default_mt_time_index$.getGlobalValue()) {
            if (NIL != kb_loaded()) {
                $pph_default_mt_time_index$.setGlobalValue($$Always_TimeInterval);
            }
        }
        return $pph_default_mt_time_index$.getGlobalValue();
    }

    public static SubLObject pph_default_mt_time_index() {
        if ((NIL == $pph_default_mt_time_index$.getGlobalValue()) && (NIL != kb_loaded())) {
            $pph_default_mt_time_index$.setGlobalValue($$Always_TimeInterval);
        }
        return $pph_default_mt_time_index$.getGlobalValue();
    }

    public static final SubLObject generate_assertion_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject sentence = pph_utilities.pph_sentence_from_assertion(assertion);
                SubLObject pred = cycl_utilities.formula_arg0(sentence);
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject gloss = com.cyc.cycjava.cycl.pph_methods.pph_gloss_for_assertion(assertion, pred);
                if (NIL != gloss) {
                    pph_phrase.pph_phrase_set_string(phrase, gloss);
                    return phrase;
                }
                pph_phrase.pph_phrase_set_cycl(phrase, sentence);
                {
                    SubLObject temporal_object = com.cyc.cycjava.cycl.pph_methods.pph_time_interval_for_assertion(assertion);
                    if ((NIL != temporal_object) && ((com.cyc.cycjava.cycl.pph_methods.pph_default_mt_time_index() != temporal_object) || (NIL != pph_vars.$pph_use_explicit_temporal_qualification_for_defaultP$.getDynamicValue(thread)))) {
                        {
                            SubLObject template = listS($$ist, list($$MtTimeDimFn, temporal_object), $list_alt276);
                            pph_phrase.pph_phrase_reset_cycl(phrase, template);
                        }
                    }
                }
                {
                    SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
                    try {
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                            try {
                                pph_vars.$pph_domain_mt$.bind(pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, mt, pph_vars.$pph_domain_mt$.getDynamicValue(thread))), thread);
                                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject generate_assertion(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject sentence = pph_utilities.pph_sentence_from_assertion(assertion);
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        thread.resetMultipleValues();
        final SubLObject gloss = pph_gloss_for_assertion(assertion, pred);
        final SubLObject support = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != gloss) {
            pph_phrase.pph_phrase_set_output_list(phrase, list(pph_data_structures.new_pph_phrase_output_item(pph_string.pph_string_from_cycl_string(gloss), NIL, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
            pph_phrase.pph_phrase_add_justification(phrase, support);
            return phrase;
        }
        pph_phrase.pph_phrase_set_cycl(phrase, sentence);
        final SubLObject temporal_object = pph_time_interval_for_assertion(assertion);
        if (((NIL != temporal_object) && ((!pph_default_mt_time_index().eql(temporal_object)) || (NIL != pph_vars.$pph_use_explicit_temporal_qualification_for_defaultP$.getDynamicValue(thread)))) && (((NIL != pph_utilities.pph_top_level_preciseP()) || (NIL != pph_find_arg_starting_before(sentence, temporal_object, mt))) || (NIL != pph_find_arg_ending_after(sentence, temporal_object, mt)))) {
            final SubLObject template = listS($$ist, list($$MtTimeDimFn, temporal_object), $list298);
            pph_phrase.pph_phrase_reset_cycl(phrase, template);
        }
        final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
        try {
            final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_domain_mt$.bind(pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, mt, pph_vars.$pph_domain_mt$.getDynamicValue(thread))), thread);
                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        pph_phrase.pph_phrase_set_cycl(phrase, assertion);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_find_arg_starting_before(final SubLObject sentence, final SubLObject temporal_object, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_accessors.individualP(arg)) {
                SubLObject cdolist_list_var_$66 = pph_utilities.pph_ask_variable($sym300$_DATE, listS($$startingDate, arg, $list302), mt, UNPROVIDED, UNPROVIDED);
                SubLObject start = NIL;
                start = cdolist_list_var_$66.first();
                while (NIL != cdolist_list_var_$66) {
                    if (NIL != sbhl_time_modules.starts_after_starting_ofP(date_utilities.possibly_bind_temporal_indexical_in_object(temporal_object), start, UNPROVIDED)) {
                        return arg;
                    }
                    cdolist_list_var_$66 = cdolist_list_var_$66.rest();
                    start = cdolist_list_var_$66.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_find_arg_ending_after(final SubLObject sentence, final SubLObject temporal_object, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_accessors.individualP(arg)) {
                SubLObject cdolist_list_var_$67 = pph_utilities.pph_ask_variable($sym300$_DATE, listS($$endingDate, arg, $list302), mt, UNPROVIDED, UNPROVIDED);
                SubLObject end = NIL;
                end = cdolist_list_var_$67.first();
                while (NIL != cdolist_list_var_$67) {
                    if (NIL != sbhl_time_modules.ends_after_ending_ofP(end, date_utilities.possibly_bind_temporal_indexical_in_object(temporal_object), UNPROVIDED)) {
                        return arg;
                    }
                    cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                    end = cdolist_list_var_$67.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject pph_time_interval_for_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject temporal_object = com.cyc.cycjava.cycl.pph_methods.pph_mt_time_index(mt);
                if (NIL != $ignore_misleading_time_parametersP$.getDynamicValue(thread)) {
                    if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_ignore_temporal_qualification_for_assertionP(assertion, temporal_object)) {
                        temporal_object = NIL;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_matches_pattern(temporal_object, $list_alt277);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                                SubLObject start_date = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
                                if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_irrelevant_date_wrt_assertion_contentP(assertion, end_date)) {
                                    temporal_object = list($$IntervalStartedByFn_Inclusive, start_date);
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_irrelevant_date_wrt_assertion_contentP(assertion, start_date)) {
                                        temporal_object = list($$IntervalEndedByFn_Inclusive, end_date);
                                    }
                                }
                            }
                        }
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_matches_pattern(temporal_object, $list_alt282);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject guid = list_utilities.alist_lookup_without_values(v_bindings, GUID, UNPROVIDED, UNPROVIDED);
                                SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                                SubLObject start_date = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
                                if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_irrelevant_date_wrt_assertion_contentP(assertion, end_date)) {
                                    temporal_object = list($$SomeTimeInIntervalFn, list($$IntervalStartedByFn, start_date), guid);
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_irrelevant_date_wrt_assertion_contentP(assertion, start_date)) {
                                        temporal_object = list($$SomeTimeInIntervalFn, list($$IntervalEndedByFn, end_date), guid);
                                    }
                                }
                            }
                        }
                    }
                }
                return temporal_object;
            }
        }
    }

    public static SubLObject pph_time_interval_for_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject temporal_object = pph_mt_time_index(mt);
        if (NIL != $ignore_misleading_time_parametersP$.getDynamicValue(thread)) {
            if (NIL != pph_ignore_temporal_qualification_for_assertionP(assertion, temporal_object)) {
                temporal_object = NIL;
            }
            thread.resetMultipleValues();
            SubLObject success = formula_pattern_match.formula_matches_pattern(temporal_object, $list304);
            SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                final SubLObject start_date = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
                if (NIL != pph_irrelevant_date_wrt_assertion_contentP(assertion, end_date)) {
                    temporal_object = list($$IntervalStartedByFn_Inclusive, start_date);
                } else
                    if (NIL != pph_irrelevant_date_wrt_assertion_contentP(assertion, start_date)) {
                        temporal_object = list($$IntervalEndedByFn_Inclusive, end_date);
                    }

            }
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(temporal_object, $list309);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject guid = list_utilities.alist_lookup_without_values(v_bindings, GUID, UNPROVIDED, UNPROVIDED);
                final SubLObject end_date2 = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                final SubLObject start_date2 = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
                if (NIL != pph_irrelevant_date_wrt_assertion_contentP(assertion, end_date2)) {
                    temporal_object = list($$SomeTimeInIntervalFn, list($$IntervalStartedByFn, start_date2), guid);
                } else
                    if (NIL != pph_irrelevant_date_wrt_assertion_contentP(assertion, start_date2)) {
                        temporal_object = list($$SomeTimeInIntervalFn, list($$IntervalEndedByFn, end_date2), guid);
                    }

            }
        }
        return temporal_object;
    }

    public static final SubLObject pph_ignore_temporal_qualification_for_assertionP_alt(SubLObject assertion, SubLObject temporal_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignoreP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_matches_pattern(temporal_object, $list_alt287);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject date = list_utilities.alist_lookup_without_values(v_bindings, DATE, UNPROVIDED, UNPROVIDED);
                            if (NIL != com.cyc.cycjava.cycl.pph_methods.pph_irrelevant_date_wrt_assertion_contentP(assertion, date)) {
                                ignoreP = T;
                            }
                        }
                    }
                }
                return ignoreP;
            }
        }
    }

    public static SubLObject pph_ignore_temporal_qualification_for_assertionP(final SubLObject assertion, final SubLObject temporal_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignoreP = NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(temporal_object, $list314);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject date = list_utilities.alist_lookup_without_values(v_bindings, DATE, UNPROVIDED, UNPROVIDED);
            if (NIL != pph_irrelevant_date_wrt_assertion_contentP(assertion, date)) {
                ignoreP = T;
            }
        }
        return ignoreP;
    }

    public static final SubLObject pph_irrelevant_date_wrt_assertion_contentP_alt(SubLObject assertion, SubLObject date) {
        {
            SubLObject irrelevantP = NIL;
            if (NIL == com.cyc.cycjava.cycl.pph_methods.pph_indexed_nautP(date)) {
                irrelevantP = T;
            } else {
                if (NIL != subl_promotions.memberP(date_utilities.cycl_date_to_universal_date(date), com.cyc.cycjava.cycl.pph_methods.pph_support_creation_dates(assertion), UNPROVIDED, UNPROVIDED)) {
                    irrelevantP = T;
                }
            }
            return irrelevantP;
        }
    }

    public static SubLObject pph_irrelevant_date_wrt_assertion_contentP(final SubLObject assertion, final SubLObject date) {
        SubLObject irrelevantP = NIL;
        if (NIL == pph_indexed_nautP(date)) {
            irrelevantP = T;
        } else
            if (NIL != subl_promotions.memberP(date_utilities.cycl_date_to_universal_date(date), pph_support_creation_dates(assertion), UNPROVIDED, UNPROVIDED)) {
                irrelevantP = T;
            }

        return irrelevantP;
    }

    public static final SubLObject pph_indexed_nautP_alt(SubLObject naut) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject indexedP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject indexed_terms = cycl_utilities.expression_gather(naut, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                            if (NIL != indexed_term_p(NIL)) {
                                indexed_terms = cons(NIL, indexed_terms);
                            }
                            {
                                SubLObject rest = NIL;
                                for (rest = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED); !((NIL != indexedP) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject gaf = rest.first();
                                        if (((true || (NIL == assertions_high.assertion_direction(gaf))) && (true || NIL.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(gaf))))) && (NIL != term_occurs_as_formula_argument(naut, assertions_high.assertion_formula(gaf)))) {
                                            indexedP = T;
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
                return indexedP;
            }
        }
    }

    public static SubLObject pph_indexed_nautP(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject indexedP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject indexed_terms = cycl_utilities.expression_gather(naut, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            if (NIL != indexed_term_p(NIL)) {
                indexed_terms = cons(NIL, indexed_terms);
            }
            SubLObject rest;
            SubLObject gaf;
            for (rest = NIL, rest = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED); (NIL == indexedP) && (NIL != rest); rest = rest.rest()) {
                gaf = rest.first();
                if (NIL != term_occurs_as_formula_argument(naut, assertions_high.assertion_formula(gaf))) {
                    indexedP = T;
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return indexedP;
    }

    public static final SubLObject pph_support_creation_dates_internal_alt(SubLObject support) {
        return com.cyc.cycjava.cycl.pph_methods.pph_support_creation_dates_recursive(support, NIL);
    }

    public static SubLObject pph_support_creation_dates_internal(final SubLObject support) {
        return pph_support_creation_dates_recursive(support, NIL);
    }

    public static final SubLObject pph_support_creation_dates_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_methods.pph_support_creation_dates_internal(support);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_SUPPORT_CREATION_DATES, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_SUPPORT_CREATION_DATES, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_SUPPORT_CREATION_DATES, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, support, $kw23$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_support_creation_dates_internal(support)));
                        memoization_state.caching_state_put(caching_state, support, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject pph_support_creation_dates(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_support_creation_dates_internal(support);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_SUPPORT_CREATION_DATES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_SUPPORT_CREATION_DATES, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_SUPPORT_CREATION_DATES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_support_creation_dates_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject pph_support_creation_dates_recursive_alt(SubLObject support, SubLObject done_set) {
        {
            SubLObject universal_dates = NIL;
            if (!((NIL != set_p(done_set)) && (NIL != set_memberP(support, done_set)))) {
                if (NIL != set_p(done_set)) {
                    set_add(support, done_set);
                }
                if (NIL != assertion_p(support)) {
                    {
                        SubLObject item_var = assertions_high.asserted_when(support);
                        if (NIL == member(item_var, universal_dates, symbol_function(EQL), symbol_function(IDENTITY))) {
                            universal_dates = cons(item_var, universal_dates);
                        }
                    }
                }
                if ((NIL == assertion_p(support)) || (NIL != assertions_high.deduced_assertionP(support))) {
                    {
                        SubLObject cdolist_list_var = pph_proof.pph_meta_supports(support);
                        SubLObject meta_support = NIL;
                        for (meta_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_support = cdolist_list_var.first()) {
                            if (NIL == set_p(done_set)) {
                                done_set = new_set(symbol_function(EQUAL), UNPROVIDED);
                                set_add(support, done_set);
                            }
                            {
                                SubLObject cdolist_list_var_61 = com.cyc.cycjava.cycl.pph_methods.pph_support_creation_dates_recursive(meta_support, done_set);
                                SubLObject support_date = NIL;
                                for (support_date = cdolist_list_var_61.first(); NIL != cdolist_list_var_61; cdolist_list_var_61 = cdolist_list_var_61.rest() , support_date = cdolist_list_var_61.first()) {
                                    {
                                        SubLObject item_var = support_date;
                                        if (NIL == member(item_var, universal_dates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            universal_dates = cons(item_var, universal_dates);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return delete(NIL, universal_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject pph_support_creation_dates_recursive(final SubLObject support, SubLObject done_set) {
        SubLObject universal_dates = NIL;
        if ((NIL == set.set_p(done_set)) || (NIL == set.set_memberP(support, done_set))) {
            if (NIL != set.set_p(done_set)) {
                set.set_add(support, done_set);
            }
            if (NIL != assertion_handles.assertion_p(support)) {
                final SubLObject item_var = assertions_high.asserted_when(support);
                if (NIL == member(item_var, universal_dates, symbol_function(EQL), symbol_function(IDENTITY))) {
                    universal_dates = cons(item_var, universal_dates);
                }
            }
            if ((NIL == assertion_handles.assertion_p(support)) || (NIL != assertions_high.deduced_assertionP(support))) {
                SubLObject cdolist_list_var = pph_proof.pph_meta_supports(support);
                SubLObject meta_support = NIL;
                meta_support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == set.set_p(done_set)) {
                        done_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                        set.set_add(support, done_set);
                    }
                    SubLObject cdolist_list_var_$68 = pph_support_creation_dates_recursive(meta_support, done_set);
                    SubLObject support_date = NIL;
                    support_date = cdolist_list_var_$68.first();
                    while (NIL != cdolist_list_var_$68) {
                        final SubLObject item_var2 = support_date;
                        if (NIL == member(item_var2, universal_dates, symbol_function(EQL), symbol_function(IDENTITY))) {
                            universal_dates = cons(item_var2, universal_dates);
                        }
                        cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                        support_date = cdolist_list_var_$68.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_support = cdolist_list_var.first();
                } 
            }
        }
        return delete(NIL, universal_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_mt_time_index_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = com.cyc.cycjava.cycl.pph_methods.pph_default_mt_time_index();
                SubLObject monad_mt = hlmt.hlmt_monad_mt_without_default(mt);
                SubLObject temporal_object = NIL;
                SubLObject time_parameter = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject temporal_object_62 = hlmt.explode_hlmt_temporal_facets(mt, NIL, NIL);
                    SubLObject time_parameter_63 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    temporal_object = temporal_object_62;
                    time_parameter = time_parameter_63;
                }
                if (NIL != temporal_object) {
                    result = temporal_object;
                }
                if (NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP($$mtTimeIndex, mt, ONE_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject query_result = pph_utilities.pph_ask_variable_new($sym292$_TIME_INDEX, list($$assertedSentence, listS($$mtTimeIndex, mt, $list_alt294)), UNPROVIDED, UNPROVIDED);
                        if (NIL != query_result) {
                            result = query_result.first();
                        }
                    }
                }
                return NIL != com.cyc.cycjava.cycl.pph_methods.pph_monad_mt_time_precision_suspect_p(monad_mt) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_time_index_granularity(result))) : result;
            }
        }
    }

    public static SubLObject pph_mt_time_index(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = pph_default_mt_time_index();
        final SubLObject monad_mt = hlmt.hlmt_monad_mt_without_default(mt);
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject temporal_object_$69 = hlmt.explode_hlmt_temporal_facets(mt, NIL, NIL);
        final SubLObject time_parameter_$70 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        temporal_object = temporal_object_$69;
        time_parameter = time_parameter_$70;
        if (NIL != temporal_object) {
            result = temporal_object;
        }
        if (NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP($$mtTimeIndex, mt, ONE_INTEGER, UNPROVIDED)) {
            final SubLObject query_result = pph_utilities.pph_ask_variable_new($sym319$_TIME_INDEX, list($$assertedSentence, listS($$mtTimeIndex, mt, $list321)), UNPROVIDED, UNPROVIDED);
            if (NIL != query_result) {
                result = query_result.first();
            }
        }
        return NIL != pph_monad_mt_time_precision_suspect_p(monad_mt) ? pph_adjust_mt_time_index_granularity(result) : result;
    }

    public static final SubLObject pph_monad_mt_time_precision_suspect_p_alt(SubLObject monad_mt) {
        return makeBoolean(((NIL != monad_mt) && (NIL != pph_utilities.pph_genl_mtP(monad_mt, $$TKBSourceSpindleHeadMt))) && (NIL != pph_utilities.pph_genl_mtP($$TKBSourceSpindleCollectorMt, monad_mt)));
    }

    public static SubLObject pph_monad_mt_time_precision_suspect_p(final SubLObject monad_mt) {
        return makeBoolean(((NIL != monad_mt) && (NIL != pph_utilities.pph_genl_mtP(monad_mt, $$TKBSourceSpindleHeadMt))) && (NIL != pph_utilities.pph_genl_mtP($$TKBSourceSpindleCollectorMt, monad_mt)));
    }

    public static final SubLObject pph_adjust_mt_time_index_granularity_alt(SubLObject time_index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject adjusted = time_index;
                if (NIL != date_utilities.date_p(time_index)) {
                    adjusted = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(time_index, $SUBSUMING);
                }
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_matches_pattern(time_index, $list_alt277);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                            SubLObject start_date = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
                            SubLObject new_start_date = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(start_date, $SUBSUMING);
                            SubLObject new_end_date = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(end_date, $SUBSUMING);
                            if (NIL == pph_utilities.pph_ask_boolean(list($$startsAfterEndingOf, new_end_date, new_start_date), UNPROVIDED, UNPROVIDED)) {
                                new_start_date = start_date;
                                new_end_date = end_date;
                            }
                            adjusted = list($$TimeIntervalInclusiveFn, new_start_date, new_end_date);
                        }
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_matches_pattern(time_index, $list_alt310);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                            SubLObject new_end_date = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(end_date, $FOLLOWING);
                            adjusted = replace_formula_arg_position($list_alt312, new_end_date, adjusted);
                        }
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_matches_pattern(time_index, $list_alt282);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject guid = list_utilities.alist_lookup_without_values(v_bindings, GUID, UNPROVIDED, UNPROVIDED);
                            SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
                            SubLObject start_date = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
                            SubLObject new_start_date = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(start_date, $PRECEDING);
                            SubLObject new_end_date = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(end_date, $FOLLOWING);
                            adjusted = list($$SomeTimeInIntervalFn, list($$TimeIntervalBetweenFn, new_start_date, new_end_date), guid);
                        }
                    }
                }
                return adjusted;
            }
        }
    }

    public static SubLObject pph_adjust_mt_time_index_granularity(final SubLObject time_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject adjusted = time_index;
        if (NIL != date_utilities.date_p(time_index)) {
            adjusted = pph_adjust_mt_date_granularity(time_index, $SUBSUMING);
        }
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(time_index, $list304);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
            final SubLObject start_date = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
            SubLObject new_start_date = pph_adjust_mt_date_granularity(start_date, $SUBSUMING);
            SubLObject new_end_date = pph_adjust_mt_date_granularity(end_date, $SUBSUMING);
            if (NIL == pph_utilities.pph_ask_boolean(list($$startsAfterEndingOf, new_end_date, new_start_date), UNPROVIDED, UNPROVIDED)) {
                new_start_date = start_date;
                new_end_date = end_date;
            }
            adjusted = list($$TimeIntervalInclusiveFn, new_start_date, new_end_date);
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(time_index, $list336);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject end_date = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
            final SubLObject new_end_date2 = pph_adjust_mt_date_granularity(end_date, $FOLLOWING);
            adjusted = replace_formula_arg_position($list338, new_end_date2, adjusted);
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(time_index, $list309);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject guid = list_utilities.alist_lookup_without_values(v_bindings, GUID, UNPROVIDED, UNPROVIDED);
            final SubLObject end_date2 = list_utilities.alist_lookup_without_values(v_bindings, END_DATE, UNPROVIDED, UNPROVIDED);
            final SubLObject start_date2 = list_utilities.alist_lookup_without_values(v_bindings, START_DATE, UNPROVIDED, UNPROVIDED);
            final SubLObject new_start_date2 = pph_adjust_mt_date_granularity(start_date2, $PRECEDING);
            final SubLObject new_end_date3 = pph_adjust_mt_date_granularity(end_date2, $FOLLOWING);
            adjusted = list($$SomeTimeInIntervalFn, list($$TimeIntervalBetweenFn, new_start_date2, new_end_date3), guid);
        }
        return adjusted;
    }

    public static final SubLObject pph_adjust_mt_date_granularity_internal_alt(SubLObject date, SubLObject type) {
        {
            SubLObject adjusted = date;
            if (NIL != date_utilities.date_p(date)) {
                {
                    SubLObject today = date_utilities.indexical_today();
                    SubLObject precision = NIL;
                    if (NIL != pph_utilities.pph_time_interval_subsumesP(today, date)) {
                    } else {
                        if (NIL != pph_utilities.pph_time_interval_subsumesP(date_utilities.date_to_precision(today, $$CalendarYear), date)) {
                            if (NIL != pph_utilities.pph_longer_durationP($list_alt317, list($$DurationFn, date))) {
                                precision = $$CalendarDay;
                            }
                        } else {
                            if (NIL != pph_utilities.pph_longer_durationP($list_alt320, list($$DurationFn, date))) {
                                precision = $$CalendarMonth;
                            }
                        }
                    }
                    if (NIL != precision) {
                        adjusted = date_utilities.date_to_precision(date, precision);
                        if (!adjusted.equal(date)) {
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($PRECEDING)) {
                                    adjusted = time_interval_utilities.preceding_cycl_date(adjusted);
                                } else {
                                    if (pcase_var.eql($FOLLOWING)) {
                                        adjusted = time_interval_utilities.succeeding_cycl_date(adjusted);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if ((NIL != el_formula_with_operator_p(date, $$SomeTimeInIntervalFn)) && (NIL != date_utilities.date_p(cycl_utilities.nat_arg1(date, UNPROVIDED)))) {
                    {
                        SubLObject old = cycl_utilities.nat_arg1(date, UNPROVIDED);
                        SubLObject v_new = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(old, type);
                        if (!old.equal(v_new)) {
                            adjusted = v_new;
                        }
                    }
                } else {
                    if (((NIL != el_formula_with_operator_p(date, $$IntervalEndedByFn)) && (NIL != date_utilities.date_p(cycl_utilities.nat_arg1(date, UNPROVIDED)))) && (type == $FOLLOWING)) {
                        {
                            SubLObject old = cycl_utilities.nat_arg1(date, UNPROVIDED);
                            SubLObject v_new = com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity(old, type);
                            if (old.equal(v_new)) {
                                adjusted = time_interval_utilities.succeeding_cycl_date(v_new);
                            } else {
                                adjusted = v_new;
                            }
                        }
                    }
                }
            }
            return adjusted;
        }
    }

    public static SubLObject pph_adjust_mt_date_granularity_internal(final SubLObject date, final SubLObject type) {
        SubLObject adjusted = date;
        if (NIL != date_utilities.date_p(date)) {
            final SubLObject today = date_utilities.indexical_today();
            SubLObject precision = NIL;
            if (NIL == pph_utilities.pph_time_interval_subsumesP(today, date)) {
                if (NIL != pph_utilities.pph_time_interval_subsumesP(date_utilities.date_to_precision(today, $$CalendarYear, UNPROVIDED), date)) {
                    if (NIL != pph_utilities.pph_longer_durationP($list343, list($$DurationFn, date))) {
                        precision = $$CalendarDay;
                    }
                } else
                    if (NIL != pph_utilities.pph_longer_durationP($list346, list($$DurationFn, date))) {
                        precision = $$CalendarMonth;
                    }

            }
            if (NIL != precision) {
                adjusted = date_utilities.date_to_precision(date, precision, UNPROVIDED);
                if (!adjusted.equal(date)) {
                    if (type.eql($PRECEDING)) {
                        adjusted = time_interval_utilities.preceding_cycl_date(adjusted);
                    } else
                        if (type.eql($FOLLOWING)) {
                            adjusted = time_interval_utilities.succeeding_cycl_date(adjusted);
                        }

                }
            }
        } else
            if ((NIL != el_formula_with_operator_p(date, $$SomeTimeInIntervalFn)) && (NIL != date_utilities.date_p(cycl_utilities.nat_arg1(date, UNPROVIDED)))) {
                final SubLObject old = cycl_utilities.nat_arg1(date, UNPROVIDED);
                final SubLObject v_new = pph_adjust_mt_date_granularity(old, type);
                if (!old.equal(v_new)) {
                    adjusted = v_new;
                }
            } else
                if (((NIL != el_formula_with_operator_p(date, $$IntervalEndedByFn)) && (NIL != date_utilities.date_p(cycl_utilities.nat_arg1(date, UNPROVIDED)))) && (type == $FOLLOWING)) {
                    final SubLObject old = cycl_utilities.nat_arg1(date, UNPROVIDED);
                    final SubLObject v_new = pph_adjust_mt_date_granularity(old, type);
                    if (old.equal(v_new)) {
                        adjusted = time_interval_utilities.succeeding_cycl_date(v_new);
                    } else {
                        adjusted = v_new;
                    }
                }


        return adjusted;
    }

    public static final SubLObject pph_adjust_mt_date_granularity_alt(SubLObject date, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity_internal(date, type);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_ADJUST_MT_DATE_GRANULARITY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_ADJUST_MT_DATE_GRANULARITY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_ADJUST_MT_DATE_GRANULARITY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(date, type);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (date.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && type.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_adjust_mt_date_granularity_internal(date, type)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(date, type));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_adjust_mt_date_granularity(final SubLObject date, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_adjust_mt_date_granularity_internal(date, type);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_ADJUST_MT_DATE_GRANULARITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_ADJUST_MT_DATE_GRANULARITY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_ADJUST_MT_DATE_GRANULARITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(date, type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (date.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && type.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_adjust_mt_date_granularity_internal(date, type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(date, type));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_assertion_has_glossP_alt(SubLObject assertion) {
        {
            SubLObject sentence = pph_utilities.pph_sentence_from_assertion(assertion);
            SubLObject pred = cycl_utilities.formula_arg0(sentence);
            SubLObject gloss = com.cyc.cycjava.cycl.pph_methods.pph_gloss_for_assertion(assertion, pred);
            return list_utilities.sublisp_boolean(gloss);
        }
    }

    public static SubLObject pph_assertion_has_glossP(final SubLObject assertion) {
        final SubLObject sentence = pph_utilities.pph_sentence_from_assertion(assertion);
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject gloss = pph_gloss_for_assertion(assertion, pred);
        return list_utilities.sublisp_boolean(gloss);
    }

    public static final SubLObject pph_gloss_for_assertion_alt(SubLObject assertion, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gloss = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ((NIL != forts.fort_p(pred)) && (NIL != kb_mapping_utilities.some_pred_value(pred, $$genWithGloss, UNPROVIDED, UNPROVIDED))) {
                            gloss = kb_mapping_utilities.fpred_value(assertion, $$englishGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return gloss;
            }
        }
    }

    public static SubLObject pph_gloss_for_assertion(final SubLObject assertion, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gloss = NIL;
        SubLObject support = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != forts.fort_p(pred)) && (NIL != kb_mapping_utilities.some_pred_value(pred, $$genWithGloss, UNPROVIDED, UNPROVIDED))) {
                final SubLObject pred_var = $$englishGloss;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(assertion, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(assertion, ONE_INTEGER, pred_var);
                    SubLObject done_var = gloss;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$71 = gloss;
                                final SubLObject token_var_$72 = NIL;
                                while (NIL == done_var_$71) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                    final SubLObject valid_$73 = makeBoolean(!token_var_$72.eql(gaf));
                                    if (NIL != valid_$73) {
                                        gloss = assertions_high.gaf_arg2(gaf);
                                        support = gaf;
                                    }
                                    done_var_$71 = makeBoolean((NIL == valid_$73) || (NIL != gloss));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != gloss));
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(gloss, support);
    }

    public static final SubLObject pph_output_list_to_assertion_output_list_alt(SubLObject olist) {
        {
            SubLObject items = NIL;
            SubLTrampolineFile.checkType(olist, PPH_PHRASE_OUTPUT_LIST_P);
            {
                SubLObject start_char_index = ZERO_INTEGER;
                SubLObject end_char_index = ZERO_INTEGER;
                SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(olist, T);
                SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
                SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(olist);
                while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
                    {
                        SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
                        SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                        start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
                        if (start_char_index.numG(end_char_index)) {
                            {
                                SubLObject string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                                SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
                                SubLObject open_tag = NIL;
                                SubLObject close_tag = NIL;
                                SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
                                SubLObject start_char_index_64 = end_char_index;
                                SubLObject raw_list = list(close_tag, open_tag, arg_position, string);
                                SubLObject info_start = position_if(ASSERTION_OUTPUT_LIST_INFO_P, raw_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject info = nreverse(nthcdr(info_start, raw_list));
                                if (NIL != list_utilities.singletonP(info)) {
                                    info = info.first();
                                }
                                items = cons(info, items);
                            }
                        }
                        end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
                        {
                            SubLObject string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
                            SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                            SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
                            SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
                            SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl(item);
                            SubLObject raw_list = list(close_tag, open_tag, arg_position, string);
                            SubLObject info_start = position_if(ASSERTION_OUTPUT_LIST_INFO_P, raw_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject info = nreverse(nthcdr(info_start, raw_list));
                            if (NIL != list_utilities.singletonP(info)) {
                                info = info.first();
                            }
                            items = cons(info, items);
                        }
                    }
                } 
            }
            return nreverse(items);
        }
    }

    public static SubLObject pph_output_list_to_assertion_output_list(final SubLObject olist) {
        SubLObject items = NIL;
        assert NIL != pph_phrase.pph_phrase_output_list_p(olist) : "! pph_phrase.pph_phrase_output_list_p(olist) " + ("pph_phrase.pph_phrase_output_list_p(olist) " + "CommonSymbols.NIL != pph_phrase.pph_phrase_output_list_p(olist) ") + olist;
        SubLObject start_char_index = ZERO_INTEGER;
        SubLObject end_char_index = ZERO_INTEGER;
        final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(olist, T);
        final SubLObject whole_string = pph_utilities.pph_remove_html_tags(whole_html_string, NIL);
        final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(olist);
        while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
            final SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
            final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
            start_char_index = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
            if (start_char_index.numG(end_char_index)) {
                final SubLObject string = pph_macros.pph_make_space_string(start_char_index, end_char_index);
                final SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
                final SubLObject open_tag = NIL;
                final SubLObject close_tag = NIL;
                final SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
                final SubLObject output_item = pph_question.new_pph_phrase_filler_item(string);
                final SubLObject start_char_index_$75 = end_char_index;
                final SubLObject raw_list = list(close_tag, open_tag, arg_position, string);
                final SubLObject info_start = position_if(ASSERTION_OUTPUT_LIST_INFO_P, raw_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject info = nreverse(nthcdr(info_start, raw_list));
                if (NIL != list_utilities.singletonP(info)) {
                    info = info.first();
                }
                items = cons(info, items);
            }
            end_char_index = pph_macros.pph_update_end_char_index(start_char_index, raw_item_string);
            final SubLObject string = pph_phrase.pph_phrase_output_item_get_string(item, NIL);
            final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
            final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
            final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
            final SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject output_item = item;
            final SubLObject raw_list2 = list(close_tag, open_tag, arg_position, string);
            final SubLObject info_start2 = position_if(ASSERTION_OUTPUT_LIST_INFO_P, raw_list2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject info2 = nreverse(nthcdr(info_start2, raw_list2));
            if (NIL != list_utilities.singletonP(info2)) {
                info2 = info2.first();
            }
            items = cons(info2, items);
        } 
        return nreverse(items);
    }

    public static final SubLObject pph_output_list_from_assertion_output_list_alt(SubLObject assertion_output_list, SubLObject assertion) {
        {
            SubLObject olist_items = NIL;
            SubLObject cdolist_list_var = assertion_output_list;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (item.isString()) {
                    olist_items = cons(pph_question.new_pph_phrase_filler_item(item), olist_items);
                } else {
                    {
                        SubLObject datum = item;
                        SubLObject current = datum;
                        SubLObject string = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt328);
                        string = current.first();
                        current = current.rest();
                        {
                            SubLObject arg_position = (current.isCons()) ? ((SubLObject) (current.first())) : pph_utilities.pph_unknown_arg_position();
                            destructuring_bind_must_listp(current, datum, $list_alt328);
                            current = current.rest();
                            {
                                SubLObject open_tag = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt328);
                                current = current.rest();
                                {
                                    SubLObject close_tag = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt328);
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject cycl = (NIL != pph_utilities.pph_known_arg_position_p(arg_position)) ? ((SubLObject) (pph_utilities.pph_dereference_arg_position(assertion, arg_position))) : pph_phrase.pph_empty_cycl();
                                            olist_items = cons(pph_data_structures.new_pph_phrase_output_item(string, arg_position, cycl, open_tag, close_tag, UNPROVIDED), olist_items);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt328);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return pph_main.pph_sanitize_output_list(nreverse(olist_items), assertion);
        }
    }

    public static SubLObject pph_output_list_from_assertion_output_list(final SubLObject assertion_output_list, final SubLObject assertion) {
        SubLObject olist_items = NIL;
        SubLObject cdolist_list_var = assertion_output_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (item.isString()) {
                olist_items = cons(pph_question.new_pph_phrase_filler_item(item), olist_items);
            } else {
                SubLObject current;
                final SubLObject datum = current = item;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list354);
                string = current.first();
                current = current.rest();
                final SubLObject arg_position = (current.isCons()) ? current.first() : pph_utilities.pph_unknown_arg_position();
                destructuring_bind_must_listp(current, datum, $list354);
                current = current.rest();
                final SubLObject open_tag = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list354);
                current = current.rest();
                final SubLObject close_tag = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list354);
                current = current.rest();
                if (NIL == current) {
                    final SubLObject cycl = (NIL != pph_utilities.pph_known_arg_position_p(arg_position)) ? pph_utilities.pph_dereference_arg_position(assertion, arg_position) : pph_phrase.pph_empty_cycl();
                    olist_items = cons(pph_data_structures.new_pph_phrase_output_item(string, arg_position, cycl, open_tag, close_tag, UNPROVIDED), olist_items);
                } else {
                    cdestructuring_bind_error(datum, $list354);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return pph_main.pph_sanitize_output_list(nreverse(olist_items), assertion);
    }

    public static final SubLObject assertion_output_list_info_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL == pph_utilities.pph_unknown_arg_position_p(v_object)));
    }

    public static SubLObject assertion_output_list_info_p(final SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL == pph_utilities.pph_unknown_arg_position_p(v_object)));
    }

    public static final SubLObject generate_string_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                com.cyc.cycjava.cycl.pph_methods.generate_cycl_string_with_html(phrase);
            }
            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                {
                    SubLObject string = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                    if (string.isString()) {
                        pph_phrase.pph_phrase_set_string(phrase, string);
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject generate_string(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            generate_cycl_string_with_html(phrase);
        }
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            final SubLObject string = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            if (string.isString()) {
                pph_phrase.pph_phrase_set_string(phrase, string);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject generate_cycl_string_with_html_alt(SubLObject phrase) {
        {
            SubLObject string = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            if (string.isString()) {
                {
                    SubLObject output_items = com.cyc.cycjava.cycl.pph_methods.generate_cycl_string_with_html_internal(string, pph_phrase.pph_phrase_arg_position(phrase));
                    pph_phrase.pph_phrase_set_output_list(phrase, output_items, UNPROVIDED);
                    pph_phrase.pph_phrase_note_done(phrase);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_cycl_string_with_html(final SubLObject phrase) {
        final SubLObject string = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (string.isString()) {
            final SubLObject output_items = generate_cycl_string_with_html_internal(string, pph_phrase.pph_phrase_arg_position(phrase));
            pph_phrase.pph_phrase_set_output_list(phrase, output_items, UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Remove #$ in references to constants and add hyperlinks.
     */
    @LispMethod(comment = "Remove #$ in references to constants and add hyperlinks.")
    public static final SubLObject generate_cycl_string_with_html_internal_alt(SubLObject string, SubLObject arg_position) {
        if (arg_position == UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        {
            SubLObject output_items = NIL;
            SubLObject current_string = string_utilities.$empty_string$.getGlobalValue();
            SubLObject end_of_current_string = ZERO_INTEGER;
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_65 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_65); i = number_utilities.f_1X(i)) {
                {
                    SubLObject v_char = Strings.sublisp_char(string_var, i);
                    if ((((CHAR_hash == v_char) && ((!i.isPositive()) || (NIL == constant_completion_high.valid_constant_name_char_p(Strings.sublisp_char(string, number_utilities.f_1_(i)))))) && (NIL != list_utilities.lengthG(string, i, UNPROVIDED))) && (CHAR_dollar == Strings.sublisp_char(string, number_utilities.f_1X(i)))) {
                        {
                            SubLObject name_start = add(i, TWO_INTEGER);
                            SubLObject next_whitespace = list_utilities.position_if_not(VALID_CONSTANT_NAME_CHAR_P, string, symbol_function(IDENTITY), name_start, UNPROVIDED);
                            SubLObject putative_constant_name = string_utilities.substring(string, name_start, next_whitespace);
                            SubLObject putative_constant = constants_high.find_constant(putative_constant_name);
                            if (((NIL != valid_constantP(putative_constant, UNPROVIDED)) && (NIL != pph_html.pph_use_anchor_tags_for_termP(putative_constant))) && (NIL != list_utilities.sublisp_boolean(pph_html.pph_anchor_tags_for_term(putative_constant)))) {
                                current_string = cconcatenate(current_string, string_utilities.substring(string, end_of_current_string, i));
                                end_of_current_string = next_whitespace;
                                if (NIL != string_utilities.non_empty_stringP(current_string)) {
                                    output_items = cons(pph_question.new_pph_phrase_filler_item(current_string), output_items);
                                    current_string = string_utilities.$empty_string$.getGlobalValue();
                                }
                                {
                                    SubLObject constant_item = pph_data_structures.new_pph_phrase_output_item(putative_constant_name, pph_utilities.pph_unknown_arg_position(), putative_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(constant_item, putative_constant);
                                    output_items = cons(constant_item, output_items);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != end_of_current_string) {
                current_string = cconcatenate(current_string, string_utilities.substring(string, end_of_current_string, UNPROVIDED));
            }
            if (NIL != string_utilities.non_empty_stringP(current_string)) {
                {
                    SubLObject item = (NIL != list_utilities.empty_list_p(output_items)) ? ((SubLObject) (pph_data_structures.new_pph_phrase_output_item(string, arg_position, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : pph_question.new_pph_phrase_filler_item(current_string);
                    output_items = cons(item, output_items);
                }
            }
            return nreverse(output_items);
        }
    }

    /**
     * Remove #$ in references to constants and add hyperlinks.
     */
    @LispMethod(comment = "Remove #$ in references to constants and add hyperlinks.")
    public static SubLObject generate_cycl_string_with_html_internal(final SubLObject string, SubLObject arg_position) {
        if (arg_position == UNPROVIDED) {
            arg_position = pph_utilities.pph_unknown_arg_position();
        }
        SubLObject output_items = NIL;
        SubLObject current_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject end_of_current_string = ZERO_INTEGER;
        SubLObject end_var_$76;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        SubLObject name_start;
        SubLObject next_whitespace;
        SubLObject putative_constant_name;
        SubLObject putative_constant;
        SubLObject constant_item;
        for (end_var = end_var_$76 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$76); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (((CHAR_hash.eql(v_char) && ((!i.isPositive()) || (NIL == constant_completion_high.valid_constant_name_char_p(Strings.sublisp_char(string, number_utilities.f_1_(i)))))) && (NIL != list_utilities.lengthG(string, i, UNPROVIDED))) && CHAR_dollar.eql(Strings.sublisp_char(string, number_utilities.f_1X(i)))) {
                name_start = add(i, TWO_INTEGER);
                next_whitespace = list_utilities.position_if_not(VALID_CONSTANT_NAME_CHAR_P, string, symbol_function(IDENTITY), name_start, UNPROVIDED);
                putative_constant_name = string_utilities.substring(string, name_start, next_whitespace);
                putative_constant = constants_high.find_constant(putative_constant_name);
                if (((NIL != valid_constantP(putative_constant, UNPROVIDED)) && (NIL != pph_html.pph_use_anchor_tags_for_termP(putative_constant))) && (NIL != list_utilities.sublisp_boolean(pph_html.pph_anchor_tags_for_term(putative_constant)))) {
                    current_string = cconcatenate(current_string, string_utilities.substring(string, end_of_current_string, i));
                    end_of_current_string = next_whitespace;
                    if (NIL != string_utilities.non_empty_stringP(current_string)) {
                        output_items = cons(pph_question.new_pph_phrase_filler_item(current_string), output_items);
                        current_string = string_utilities.$empty_string$.getGlobalValue();
                    }
                    constant_item = pph_data_structures.new_pph_phrase_output_item(putative_constant_name, pph_utilities.pph_unknown_arg_position(), putative_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(constant_item, putative_constant);
                    output_items = cons(constant_item, output_items);
                }
            }
        }
        if (NIL != end_of_current_string) {
            current_string = cconcatenate(current_string, string_utilities.substring(string, end_of_current_string, UNPROVIDED));
        }
        if (NIL != string_utilities.non_empty_stringP(current_string)) {
            final SubLObject item = (NIL != list_utilities.empty_list_p(output_items)) ? pph_data_structures.new_pph_phrase_output_item(string, arg_position, string, UNPROVIDED, UNPROVIDED, UNPROVIDED) : pph_question.new_pph_phrase_filler_item(current_string);
            output_items = cons(item, output_items);
        }
        return nreverse(output_items);
    }

    /**
     * Object is apparently a simple (Lisp) list of elements,
     * so just return the paraphrase for each item bunged together.
     */
    @LispMethod(comment = "Object is apparently a simple (Lisp) list of elements,\r\nso just return the paraphrase for each item bunged together.\nObject is apparently a simple (Lisp) list of elements,\nso just return the paraphrase for each item bunged together.")
    public static final SubLObject generate_cycl_list_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                if ((NIL != fort_types_interface.predicate_in_any_mtP(v_object.first())) || (NIL != fort_types_interface.function_in_any_mtP(v_object.first()))) {
                    missing_knowledge_discovery_events.post_unlexified_term_discovery_event(function_terms.naut_to_nart(v_object), pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), nl_preds);
                }
                if (NIL != list_utilities.proper_list_p(v_object)) {
                    {
                        SubLObject output_items = NIL;
                        SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
                        SubLObject list_var = NIL;
                        SubLObject member = NIL;
                        SubLObject i = NIL;
                        for (list_var = v_object, member = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , member = list_var.first() , i = add(ONE_INTEGER, i)) {
                            {
                                SubLObject cdolist_list_var = pph_main.generate_pph_output_list_no_checks(member, $ANY, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                                SubLObject output_item = NIL;
                                for (output_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , output_item = cdolist_list_var.first()) {
                                    {
                                        SubLObject local_arg_position = list(i);
                                        SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, map);
                                        if (NIL != pph_utilities.pph_known_arg_position_p(global_arg_position)) {
                                            pph_utilities.pph_contextualize_output_item_arg_position(global_arg_position, output_item);
                                        }
                                        output_items = cons(output_item, output_items);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject olist = nreverse(output_items);
                            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                pph_phrase.pph_phrase_note_done(phrase);
                            }
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    /**
     * Object is apparently a simple (Lisp) list of elements,
     * so just return the paraphrase for each item bunged together.
     */
    @LispMethod(comment = "Object is apparently a simple (Lisp) list of elements,\r\nso just return the paraphrase for each item bunged together.\nObject is apparently a simple (Lisp) list of elements,\nso just return the paraphrase for each item bunged together.")
    public static SubLObject generate_cycl_list(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        if ((NIL != fort_types_interface.predicate_in_any_mtP(v_object.first())) || (NIL != fort_types_interface.function_in_any_mtP(v_object.first()))) {
            missing_knowledge_discovery_events.post_unlexified_term_discovery_event(function_terms.naut_to_nart(v_object), pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), nl_preds);
        }
        if (NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject output_items = NIL;
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            SubLObject list_var = NIL;
            SubLObject member = NIL;
            SubLObject i = NIL;
            list_var = v_object;
            member = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , member = list_var.first() , i = add(ONE_INTEGER, i)) {
                SubLObject cdolist_list_var = pph_main.generate_pph_output_list_no_checks(member, $ANY, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                SubLObject output_item = NIL;
                output_item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject local_arg_position = list(i);
                    final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, map);
                    if (NIL != pph_utilities.pph_known_arg_position_p(global_arg_position)) {
                        pph_utilities.pph_contextualize_output_item_arg_position(global_arg_position, output_item);
                    }
                    output_items = cons(output_item, output_items);
                    cdolist_list_var = cdolist_list_var.rest();
                    output_item = cdolist_list_var.first();
                } 
            }
            final SubLObject olist = nreverse(output_items);
            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Paraphrase a #$TheResultOfParsing NAT.
     */
    @LispMethod(comment = "Paraphrase a #$TheResultOfParsing NAT.")
    public static final SubLObject generate_rop_expression_alt(SubLObject phrase) {
        {
            SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            if ((NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) && (NIL != pph_utilities.pph_isaP(cycl_utilities.formula_arg1(v_object, UNPROVIDED), $$ScalarInterval, UNPROVIDED))) {
                pph_phrase.pph_phrase_set_cycl(phrase, reverse(v_object));
            }
            return com.cyc.cycjava.cycl.pph_methods.generate_cycl_list(phrase);
        }
    }

    /**
     * Paraphrase a #$TheResultOfParsing NAT.
     */
    @LispMethod(comment = "Paraphrase a #$TheResultOfParsing NAT.")
    public static SubLObject generate_rop_expression(final SubLObject phrase) {
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if ((NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) && (NIL != pph_utilities.pph_isaP(cycl_utilities.formula_arg1(v_object, UNPROVIDED), $$ScalarInterval, UNPROVIDED))) {
            pph_phrase.pph_phrase_set_cycl(phrase, reverse(v_object));
        }
        return generate_cycl_list(phrase);
    }

    public static final SubLObject generate_genitive_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possessed = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject new_cycl = com.cyc.cycjava.cycl.pph_methods.pph_genitive_cycl(possessed, UNPROVIDED);
                if (NIL != new_cycl) {
                    pph_phrase.pph_phrase_reset_cycl(phrase, new_cycl);
                    {
                        SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                        try {
                            pph_vars.$select_string_methods_to_omit$.bind($list_alt224, thread);
                            pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                pph_phrase.pph_phrase_set_agr_pred(phrase, $$definiteDescriptions, UNPROVIDED);
            }
            return phrase;
        }
    }

    public static SubLObject generate_genitive(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject possessed = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject new_cycl = pph_genitive_cycl(possessed, UNPROVIDED);
        if (NIL != new_cycl) {
            pph_phrase.pph_phrase_reset_cycl(phrase, new_cycl);
            final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
            try {
                pph_vars.$select_string_methods_to_omit$.bind($list235, thread);
                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            pph_phrase.pph_phrase_set_agr_pred(phrase, $$definiteDescriptions, UNPROVIDED);
        }
        return phrase;
    }

    public static final SubLObject pph_genitive_cycl_alt(SubLObject possessed, SubLObject possessive_sentence) {
        if (possessive_sentence == UNPROVIDED) {
            possessive_sentence = NIL;
        }
        {
            SubLObject ans = NIL;
            if (!((NIL != possessive_sentence) || (NIL == com.cyc.cycjava.cycl.pph_methods.pph_term_ok_for_genitive_paraphraseP(possessed)))) {
                possessive_sentence = com.cyc.cycjava.cycl.pph_methods.pph_find_possessive_sentence(possessed, UNPROVIDED);
            }
            if (NIL != el_formula_p(possessive_sentence)) {
                {
                    SubLObject possessive_pred = cycl_utilities.formula_arg0(possessive_sentence);
                    SubLObject possessor = com.cyc.cycjava.cycl.pph_methods.pph_find_possessor(possessive_sentence);
                    SubLObject possessed_type = com.cyc.cycjava.cycl.pph_methods.pph_find_possessed_type(possessive_sentence);
                    if (NIL != possessed_type) {
                        ans = list($$InstanceWithRelationFromFn, possessed_type, possessive_pred, possessor);
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject pph_genitive_cycl(final SubLObject possessed, SubLObject possessive_sentence) {
        if (possessive_sentence == UNPROVIDED) {
            possessive_sentence = NIL;
        }
        SubLObject ans = NIL;
        if ((NIL == possessive_sentence) && (NIL != pph_term_ok_for_genitive_paraphraseP(possessed))) {
            possessive_sentence = pph_find_possessive_sentence(possessed, UNPROVIDED);
        }
        if (NIL != el_formula_p(possessive_sentence)) {
            final SubLObject possessive_pred = cycl_utilities.formula_arg0(possessive_sentence);
            final SubLObject possessor = pph_find_possessor(possessive_sentence);
            final SubLObject possessed_type = pph_find_possessed_type(possessive_sentence);
            if (NIL != possessed_type) {
                ans = list($$InstanceWithRelationFromFn, possessed_type, possessive_pred, possessor);
            }
        }
        return ans;
    }

    public static final SubLObject pph_term_ok_for_genitive_paraphraseP_alt(SubLObject possessed) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == term.el_fort_p(possessed)) {
                return NIL;
            } else {
                if (NIL != pph_utilities.pph_isa_anyP(possessed, com.cyc.cycjava.cycl.pph_methods.pph_dont_use_instances_for_genitive_paraphrase(), pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
                    return NIL;
                } else {
                    return T;
                }
            }
        }
    }

    public static SubLObject pph_term_ok_for_genitive_paraphraseP(final SubLObject possessed) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term.el_fort_p(possessed)) {
            return NIL;
        }
        if (NIL != pph_utilities.pph_isa_anyP(possessed, pph_dont_use_instances_for_genitive_paraphrase(), pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject pph_dont_use_instances_for_genitive_paraphrase_alt() {
        return $bad_collections_for_genitive_paraphrase$.getGlobalValue();
    }

    public static SubLObject pph_dont_use_instances_for_genitive_paraphrase() {
        return $bad_collections_for_genitive_paraphrase$.getGlobalValue();
    }

    public static final SubLObject clear_pph_possessive_preds_alt() {
        {
            SubLObject cs = $pph_possessive_preds_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_pph_possessive_preds() {
        final SubLObject cs = $pph_possessive_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_pph_possessive_preds_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($pph_possessive_preds_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_pph_possessive_preds() {
        return memoization_state.caching_state_remove_function_results_with_args($pph_possessive_preds_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_possessive_preds_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preds = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = $$possessiveRelation;
                            SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            SubLObject node_and_predicate_mode = NIL;
                            {
                                SubLObject _prev_bind_0_66 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_67 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_68 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt81$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt76$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_69 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_70 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$possessiveRelation, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_71 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_72 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_73 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list($$possessiveRelation, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_74 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject possessive_pred = node_var_74;
                                                                            {
                                                                                SubLObject _prev_bind_0_75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_74)) {
                                                                                        if (!(kb_indexing.num_predicate_extent_index(possessive_pred, UNPROVIDED).isZero() || kb_accessors.fan_out_arg(possessive_pred, UNPROVIDED).eql(TWO_INTEGER))) {
                                                                                            preds = cons(possessive_pred, preds);
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_76 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_74);
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
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_79 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_79)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_79);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_80 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_81 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_81.first(); NIL != cdolist_list_var_81; cdolist_list_var_81 = cdolist_list_var_81.rest() , node_vars_link_node = cdolist_list_var_81.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_80, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_79 = dictionary_contents.do_dictionary_contents_next(iteration_state_79);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_79);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_78, thread);
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
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt84$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_82 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_82.first(); NIL != cdolist_list_var_82; cdolist_list_var_82 = cdolist_list_var_82.rest() , generating_fn = cdolist_list_var_82.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_83 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_84 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_85 = new_list_84;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , node_vars_link_node = cdolist_list_var_85.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_83, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_77, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_76, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_75, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_73, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_72, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_71, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt85$Node__a_does_not_pass_sbhl_type_t, $$possessiveRelation, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_70, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_69, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_68, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_67, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_66, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(preds);
            }
        }
    }

    public static SubLObject pph_possessive_preds_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$possessiveRelation;
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$77 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str73$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$possessiveRelation, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$81 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list($$possessiveRelation, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$85 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject possessive_pred = node_var_$85;
                                        final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$85)) && (!kb_indexing.num_predicate_extent_index(possessive_pred, UNPROVIDED).isZero())) && (!kb_accessors.fan_out_arg(possessive_pred, UNPROVIDED).eql(TWO_INTEGER))) {
                                                preds = cons(possessive_pred, preds);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$85);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$90;
                                                                            for (iteration_state_$90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$90); iteration_state_$90 = dictionary_contents.do_dictionary_contents_next(iteration_state_$90)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$90);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str81$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$84, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$90);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$83, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str82$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$92;
                                                            final SubLObject new_list = cdolist_list_var_$92 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$92.first();
                                                            while (NIL != cdolist_list_var_$92) {
                                                                final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str81$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$85, thread);
                                                                }
                                                                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                generating_fn = cdolist_list_var_$92.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$82, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$82, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$81, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$84, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$81, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$80, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str83$Node__a_does_not_pass_sbhl_type_t, $$possessiveRelation, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$80, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$79, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$79, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$78, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$77, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(preds);
    }

    public static final SubLObject pph_possessive_preds_alt() {
        {
            SubLObject caching_state = $pph_possessive_preds_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PPH_POSSESSIVE_PREDS, $pph_possessive_preds_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_possessive_preds_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject pph_possessive_preds() {
        SubLObject caching_state = $pph_possessive_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_POSSESSIVE_PREDS, $pph_possessive_preds_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_possessive_preds_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return EL-FORMULA-P or NIL; Relating POSSESSED to some possessor.
     */
    @LispMethod(comment = "@return EL-FORMULA-P or NIL; Relating POSSESSED to some possessor.")
    public static final SubLObject pph_find_possessive_sentence_internal_alt(SubLObject possessed, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject truth = $TRUE;
                if (NIL == ans) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.pph_methods.pph_possessive_preds();
                        SubLObject possessive_pred = NIL;
                        for (possessive_pred = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , possessive_pred = csome_list_var.first()) {
                            {
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        if (NIL != kb_mapping_utilities.some_pred_value(possessed, possessive_pred, TWO_INTEGER, truth)) {
                                            {
                                                SubLObject possessor = kb_mapping_utilities.fpred_value(possessed, possessive_pred, TWO_INTEGER, ONE_INTEGER, truth);
                                                if ((NIL != indexed_term_p(possessor)) && list(possessed).equal(kb_mapping_utilities.pred_values(possessor, possessive_pred, ONE_INTEGER, TWO_INTEGER, truth))) {
                                                    ans = make_binary_formula(possessive_pred, possessor, possessed);
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return EL-FORMULA-P or NIL; Relating POSSESSED to some possessor.
     */
    @LispMethod(comment = "@return EL-FORMULA-P or NIL; Relating POSSESSED to some possessor.")
    public static SubLObject pph_find_possessive_sentence_internal(final SubLObject possessed, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject truth = $TRUE;
        if (NIL == ans) {
            SubLObject csome_list_var = pph_possessive_preds();
            SubLObject possessive_pred = NIL;
            possessive_pred = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL != kb_mapping_utilities.some_pred_value(possessed, possessive_pred, TWO_INTEGER, truth)) {
                        final SubLObject possessor = kb_mapping_utilities.fpred_value(possessed, possessive_pred, TWO_INTEGER, ONE_INTEGER, truth);
                        if ((NIL != indexed_term_p(possessor)) && list(possessed).equal(kb_mapping_utilities.pred_values(possessor, possessive_pred, ONE_INTEGER, TWO_INTEGER, truth))) {
                            ans = make_binary_formula(possessive_pred, possessor, possessed);
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                csome_list_var = csome_list_var.rest();
                possessive_pred = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static final SubLObject pph_find_possessive_sentence_alt(SubLObject possessed, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_methods.pph_find_possessive_sentence_internal(possessed, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FIND_POSSESSIVE_SENTENCE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FIND_POSSESSIVE_SENTENCE, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_FIND_POSSESSIVE_SENTENCE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(possessed, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (possessed.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_find_possessive_sentence_internal(possessed, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(possessed, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_find_possessive_sentence(final SubLObject possessed, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_find_possessive_sentence_internal(possessed, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FIND_POSSESSIVE_SENTENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FIND_POSSESSIVE_SENTENCE, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_FIND_POSSESSIVE_SENTENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(possessed, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (possessed.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_find_possessive_sentence_internal(possessed, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(possessed, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_find_possessor_alt(SubLObject possessive_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var = $sym343$_POSSESSOR;
                SubLObject possessed = cycl_utilities.formula_arg2(possessive_sentence, UNPROVIDED);
                SubLObject ask_sentence = replace_formula_arg(ONE_INTEGER, var, possessive_sentence);
                SubLObject possessors = remove(possessed, pph_utilities.pph_ask_variable(var, ask_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject max_possessors = TEN_INTEGER;
                SubLObject check_discourse_participantsP = pph_speech_act.pph_discourse_participants_knownP(UNPROVIDED);
                SubLObject speaker = (NIL != check_discourse_participantsP) ? ((SubLObject) (find(pph_vars.$pph_speaker$.getDynamicValue(thread), possessors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject addressee = (NIL != check_discourse_participantsP) ? ((SubLObject) (find(pph_vars.$pph_addressee$.getDynamicValue(thread), possessors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                if ((NIL != speaker) && (NIL != addressee)) {
                    return pph_methods_lexicon.pph_pronoun_nart($list_alt344, $$PossessivePronoun_Pre);
                } else {
                    if (NIL != speaker) {
                        return speaker;
                    } else {
                        if (NIL != addressee) {
                            return addressee;
                        } else {
                            if (NIL != list_utilities.singletonP(possessors)) {
                                return possessors.first();
                            } else {
                                if (NIL == possessors) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        Errors.warn($str_alt346$Couldn_t_find_possessor_for__S, possessed);
                                    }
                                    return cycl_utilities.formula_arg1(possessive_sentence, UNPROVIDED);
                                } else {
                                    return make_el_formula($$TheCoordinationSet, list_utilities.first_n(max_possessors, possessors), UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject pph_find_possessor(final SubLObject possessive_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = $sym368$_POSSESSOR;
        final SubLObject possessed = cycl_utilities.formula_arg2(possessive_sentence, UNPROVIDED);
        final SubLObject ask_sentence = replace_formula_arg(ONE_INTEGER, var, possessive_sentence);
        final SubLObject possessors = remove(possessed, pph_utilities.pph_ask_variable(var, ask_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject max_possessors = TEN_INTEGER;
        final SubLObject check_discourse_participantsP = pph_speech_act.pph_discourse_participants_knownP(UNPROVIDED);
        final SubLObject speaker = (NIL != check_discourse_participantsP) ? find(pph_vars.$pph_speaker$.getDynamicValue(thread), possessors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject addressee = (NIL != check_discourse_participantsP) ? find(pph_vars.$pph_addressee$.getDynamicValue(thread), possessors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        if ((NIL != speaker) && (NIL != addressee)) {
            return pph_methods_lexicon.pph_pronoun_nart($list369, $$PossessivePronoun_Pre);
        }
        if (NIL != speaker) {
            return speaker;
        }
        if (NIL != addressee) {
            return addressee;
        }
        if (NIL != list_utilities.singletonP(possessors)) {
            return possessors.first();
        }
        if (NIL == possessors) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str371$Couldn_t_find_possessor_for__S, possessed);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return cycl_utilities.formula_arg1(possessive_sentence, UNPROVIDED);
        }
        return make_el_formula($$TheCoordinationSet, list_utilities.first_n(max_possessors, possessors), UNPROVIDED);
    }

    public static final SubLObject pph_find_possessive_support_alt(SubLObject possessor, SubLObject possessed, SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possessive_support = NIL;
                if (NIL == possessive_support) {
                    {
                        SubLObject csome_list_var = justification;
                        SubLObject support = NIL;
                        for (support = csome_list_var.first(); !((NIL != possessive_support) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                            if ((((NIL != assertions_high.gaf_assertionP(support)) && assertions_high.gaf_arg1(support).equal(possessor)) && assertions_high.gaf_arg2(support).equal(possessed)) && (NIL != genl_predicates.genl_predP(assertions_high.gaf_arg0(support), $$possessiveRelation, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED))) {
                                if (NIL == remove(possessed, pph_utilities.pph_ask_variable($sym348$_POSSESSED, replace_formula_arg(TWO_INTEGER, $sym348$_POSSESSED, assertions_high.gaf_formula(support)), pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, TWO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    possessive_support = support;
                                }
                            }
                        }
                    }
                }
                return possessive_support;
            }
        }
    }

    public static SubLObject pph_find_possessive_support(final SubLObject possessor, final SubLObject possessed, final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possessive_support = NIL;
        if (NIL == possessive_support) {
            SubLObject csome_list_var = justification;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == possessive_support) && (NIL != csome_list_var)) {
                if (((((NIL != assertions_high.gaf_assertionP(support)) && assertions_high.gaf_arg1(support).equal(possessor)) && assertions_high.gaf_arg2(support).equal(possessed)) && (NIL != genl_predicates.genl_predP(assertions_high.gaf_arg0(support), $$possessiveRelation, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED))) && (NIL == remove(possessed, pph_utilities.pph_ask_variable($sym373$_POSSESSED, replace_formula_arg(TWO_INTEGER, $sym373$_POSSESSED, assertions_high.gaf_formula(support)), pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, TWO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    possessive_support = support;
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return possessive_support;
    }

    public static final SubLObject pph_find_possessed_type_alt(SubLObject possessive_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.formula_terms(possessive_sentence, UNPROVIDED);
                SubLObject current = datum;
                SubLObject possessive_pred = NIL;
                SubLObject possessor = NIL;
                SubLObject possessed = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt349);
                possessive_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt349);
                possessor = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt349);
                possessed = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject ans = NIL;
                        if (NIL == ans) {
                            {
                                SubLObject csome_list_var = kb_accessors.argn_isa(possessive_pred, TWO_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                                SubLObject supertype = NIL;
                                for (supertype = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , supertype = csome_list_var.first()) {
                                    if (NIL == ans) {
                                        {
                                            SubLObject csome_list_var_86 = isa.isa(possessed, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED);
                                            SubLObject v_isa = NIL;
                                            for (v_isa = csome_list_var_86.first(); !((NIL != ans) || (NIL == csome_list_var_86)); csome_list_var_86 = csome_list_var_86.rest() , v_isa = csome_list_var_86.first()) {
                                                if ((NIL != pph_utilities.pph_genlP(v_isa, supertype, UNPROVIDED)) && (NIL == pph_utilities.pph_irrelevant_fort(v_isa, UNPROVIDED, UNPROVIDED))) {
                                                    ans = v_isa;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return ans;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt349);
                }
            }
            return NIL;
        }
    }

    public static SubLObject pph_find_possessed_type(final SubLObject possessive_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(possessive_sentence, UNPROVIDED);
        SubLObject possessive_pred = NIL;
        SubLObject possessor = NIL;
        SubLObject possessed = NIL;
        destructuring_bind_must_consp(current, datum, $list374);
        possessive_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list374);
        possessor = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list374);
        possessed = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject ans = NIL;
            if (NIL == ans) {
                SubLObject csome_list_var = kb_accessors.argn_isa(possessive_pred, TWO_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                SubLObject supertype = NIL;
                supertype = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    if (NIL == ans) {
                        SubLObject csome_list_var_$95 = isa.isa(possessed, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED);
                        SubLObject v_isa = NIL;
                        v_isa = csome_list_var_$95.first();
                        while ((NIL == ans) && (NIL != csome_list_var_$95)) {
                            if ((NIL != pph_utilities.pph_genlP(v_isa, supertype, UNPROVIDED)) && (NIL == pph_utilities.pph_irrelevant_fort(v_isa, UNPROVIDED, UNPROVIDED))) {
                                ans = v_isa;
                            }
                            csome_list_var_$95 = csome_list_var_$95.rest();
                            v_isa = csome_list_var_$95.first();
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    supertype = csome_list_var.first();
                } 
            }
            return ans;
        }
        cdestructuring_bind_error(datum, $list374);
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; should we avoid trying to find Cyc lexicon
    information for object when generating English for it?
    If T, this usually means the constant name itself will be
    used for constants.
     */
    @LispMethod(comment = "@return BOOLEAN; should we avoid trying to find Cyc lexicon\r\ninformation for object when generating English for it?\r\nIf T, this usually means the constant name itself will be\r\nused for constants.")
    public static final SubLObject prefer_unlexified_formP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == ans) {
                            {
                                SubLObject csome_list_var = $use_unlexified_form_for_instances$.getDynamicValue(thread);
                                SubLObject x = NIL;
                                for (x = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , x = csome_list_var.first()) {
                                    if (NIL != pph_utilities.pph_isaP(v_object, x, UNPROVIDED)) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format(T, $str_alt351$_S_is_an_instance_of__S__so_using, v_object, x);
                                        }
                                        ans = T;
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == ans) {
                    ans = subl_promotions.memberP(v_object, $use_unlexified_form$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; should we avoid trying to find Cyc lexicon
    information for object when generating English for it?
    If T, this usually means the constant name itself will be
    used for constants.
     */
    @LispMethod(comment = "@return BOOLEAN; should we avoid trying to find Cyc lexicon\r\ninformation for object when generating English for it?\r\nIf T, this usually means the constant name itself will be\r\nused for constants.")
    public static SubLObject prefer_unlexified_formP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == ans) {
                SubLObject csome_list_var = $use_unlexified_form_for_instances$.getDynamicValue(thread);
                SubLObject x = NIL;
                x = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    if (NIL != pph_utilities.pph_isaP(v_object, x, UNPROVIDED)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str376$_S_is_an_instance_of__S__so_using, v_object, x, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        ans = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    x = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == ans) {
            ans = subl_promotions.memberP(v_object, $use_unlexified_form$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
        }
        return ans;
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static final SubLObject prefer_unlexified_form_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return NIL != com.cyc.cycjava.cycl.pph_methods.prefer_unlexified_formP(v_term) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.unlexified_term_method(v_term, UNPROVIDED))) : list(NIL, NIL);
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static SubLObject prefer_unlexified_form_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return NIL != prefer_unlexified_formP(v_term) ? unlexified_term_method(v_term, UNPROVIDED) : list(NIL, NIL);
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static final SubLObject use_as_is_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            SubLObject ans = list(NIL, NIL);
            if (NIL != pph_utilities.always_use_nameP(v_term)) {
                ans = com.cyc.cycjava.cycl.pph_methods.coerce_name_method(v_term, UNPROVIDED);
            }
            return ans;
        }
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static SubLObject use_as_is_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        SubLObject ans = list(NIL, NIL);
        if (NIL != pph_utilities.always_use_nameP(v_term)) {
            ans = coerce_name_method(v_term, UNPROVIDED);
        }
        return ans;
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static final SubLObject coerce_name_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return bq_cons(misc_kb_utilities.coerce_name(v_term), $list_alt223);
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static SubLObject coerce_name_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        return bq_cons(misc_kb_utilities.coerce_name(v_term), $list377);
    }

    public static SubLObject licensed_definite_description_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        SubLObject item = NIL;
        if (NIL == item) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = licensed_definite_description_types_for_term(v_term, nl_preds), type = NIL, type = csome_list_var.first(); (NIL == item) && (NIL != csome_list_var); item = generate_definite_description_item(v_term, type, nl_preds) , csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
            }
        }
        return item;
    }

    public static SubLObject licensed_definite_description_types_for_term(final SubLObject v_term, final SubLObject nl_preds) {
        if ((NIL != pph_utilities.pph_pred_licensed_by_predsP($$definiteDescriptions, nl_preds)) && (NIL != pph_vars.definite_description_licensed_for_termP(v_term))) {
            return pph_utilities.pph_salient_generalizations(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Use a term's defining assertion to generate a description of it.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "Use a term\'s defining assertion to generate a description of it.\r\n\r\n@unknown SELECT-STRING-METHODS")
    public static final SubLObject coerced_definite_description_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != pph_vars.$pph_coerce_definite_descriptions_for_unlexified_termsP$.getDynamicValue(thread)) {
                    {
                        SubLObject generalization = pph_utilities.pph_salient_generalization(v_term, UNPROVIDED, UNPROVIDED);
                        if (NIL != generalization) {
                            {
                                SubLObject isa_ified_generalization = (NIL != pph_utilities.pph_isaP(v_term, generalization, UNPROVIDED)) ? ((SubLObject) (generalization)) : pph_utilities.pph_make_type_level(generalization);
                                SubLObject phrase = pph_templates.pph_phrasify_phrase_naut(list($$BestDetNbarFn_Definite, list($$TermParaphraseFn_Constrained, $$nonPlural_Generic, isa_ified_generalization)), UNPROVIDED);
                                pph_phrase.pph_phrase_set_cycl(phrase, v_term);
                                pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                                if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(TWO_INTEGER)))) {
                                    {
                                        SubLObject new_format_string = cconcatenate($str_alt89$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt90$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(TWO_INTEGER), new SubLObject[]{ $str_alt158$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                        pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                    pph_phrase.pph_phrase_consolidate_output_list(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    pph_phrase.pph_phrase_set_output_list_cycl(phrase, v_term);
                                    ans = pph_phrase.pph_phrase_output_list(phrase).first();
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Use a term's defining assertion to generate a description of it.
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "Use a term\'s defining assertion to generate a description of it.\r\n\r\n@unknown SELECT-STRING-METHODS")
    public static SubLObject coerced_definite_description_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != pph_vars.$pph_coerce_definite_descriptions_for_unlexified_termsP$.getDynamicValue(thread)) {
            final SubLObject generalization = pph_utilities.pph_salient_generalization(v_term, UNPROVIDED, UNPROVIDED);
            if (NIL != generalization) {
                ans = generate_definite_description_item(v_term, generalization, nl_preds);
            }
        }
        return ans;
    }/**
     * Use a term's defining assertion to generate a description of it.
     *
     * @unknown SELECT-STRING-METHODS
     */


    public static SubLObject generate_definite_description_item(final SubLObject v_term, final SubLObject type, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_utilities.pph_isaP(v_term, type, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject phrase = pph_templates.pph_phrasify_phrase_naut(list(pph_functions.bestdetnbarfn_definite(), list(pph_functions.termparaphrasefn_constrained(), $$nonPlural_Generic, type)), UNPROVIDED);
        pph_phrase.pph_phrase_set_cycl(phrase, v_term);
        pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(TWO_INTEGER), thread);
            pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            pph_phrase.pph_phrase_consolidate_output_list(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, v_term);
            return pph_phrase.pph_phrase_output_list(phrase).first();
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static final SubLObject unlexified_term_method_alt(SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constant_p(v_term)) {
                missing_knowledge_discovery_events.post_unlexified_term_discovery_event(v_term, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), nl_preds);
            }
            {
                SubLObject ans = NIL;
                if (NIL == pph_vars.$pph_guess_names_for_unlexified_termsP$.getDynamicValue(thread)) {
                    ans = prin1_to_string(v_term);
                } else {
                    if (NIL != misc_kb_utilities.nat_objectP(v_term)) {
                        ans = misc_kb_utilities.coerce_name(v_term);
                    } else {
                        ans = kb_utilities.string_for_unlexified_term(v_term, UNPROVIDED);
                        ans = (NIL != fort_types_interface.collection_p(v_term)) ? ((SubLObject) (string_utilities.string_downcase_except_acronyms(ans))) : string_utilities.capitalize_first(ans);
                    }
                }
                return bq_cons(ans, $list_alt223);
            }
        }
    }

    /**
     *
     *
     * @unknown SELECT-STRING-METHODS
     */
    @LispMethod(comment = "@unknown SELECT-STRING-METHODS")
    public static SubLObject unlexified_term_method(final SubLObject v_term, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(v_term)) {
            missing_knowledge_discovery_events.post_unlexified_term_discovery_event(v_term, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), nl_preds);
        }
        SubLObject ans = NIL;
        if (NIL == pph_vars.$pph_guess_names_for_unlexified_termsP$.getDynamicValue(thread)) {
            ans = prin1_to_string(v_term);
        } else
            if (NIL != misc_kb_utilities.nat_objectP(v_term)) {
                ans = misc_kb_utilities.coerce_name(v_term);
            } else {
                ans = kb_utilities.string_for_unlexified_term(v_term, UNPROVIDED);
                ans = (NIL != fort_types_interface.collection_p(v_term)) ? string_utilities.string_downcase_except_acronyms(ans) : string_utilities.capitalize_first(ans);
            }

        return bq_cons(ans, $list377);
    }

    public static final SubLObject pph_gender_p_internal_alt(SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return isa.isaP(obj, $$NLGenderAttribute, mt, UNPROVIDED);
    }

    public static SubLObject pph_gender_p_internal(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return isa.isaP(obj, $$NLGenderAttribute, mt, UNPROVIDED);
    }

    public static final SubLObject pph_gender_p_alt(SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_methods.pph_gender_p_internal(obj, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_GENDER_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_GENDER_P, TWO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_GENDER_P, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (obj.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_gender_p_internal(obj, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(obj, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_gender_p(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_gender_p_internal(obj, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_GENDER_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_GENDER_P, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_GENDER_P, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (obj.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_gender_p_internal(obj, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Determine the grammatical gender of EXP.
     *
     * @param EXP;
    EL-TERM-P.
     * 		
     * @return PPH-GENDER-P or :UNDETERMINED
     */
    @LispMethod(comment = "Determine the grammatical gender of EXP.\r\n\r\n@param EXP;\nEL-TERM-P.\r\n\t\t\r\n@return PPH-GENDER-P or :UNDETERMINED")
    public static final SubLObject pph_gender_alt(SubLObject exp) {
        if (NIL != cycl_variables.el_varP(exp)) {
            return com.cyc.cycjava.cycl.pph_methods.pph_gender_of_var(exp);
        } else {
            return com.cyc.cycjava.cycl.pph_methods.pph_gender_of_term(exp, UNPROVIDED);
        }
    }

    /**
     * Determine the grammatical gender of EXP.
     *
     * @param EXP;
    		EL-TERM-P.
     * 		
     * @return PPH-GENDER-P or :UNDETERMINED
     */
    @LispMethod(comment = "Determine the grammatical gender of EXP.\r\n\r\n@param EXP;\n\t\tEL-TERM-P.\r\n\t\t\r\n@return PPH-GENDER-P or :UNDETERMINED")
    public static SubLObject pph_gender(final SubLObject exp) {
        if (NIL != cycl_variables.el_varP(exp)) {
            return pph_gender_of_var(exp);
        }
        return pph_gender_of_term(exp, UNPROVIDED);
    }/**
     * Determine the grammatical gender of EXP.
     *
     * @param EXP;
    		EL-TERM-P.
     * 		
     * @return PPH-GENDER-P or :UNDETERMINED
     */


    /**
     * Determine the grammatical number of EXP.
     *
     * @param EXP;
    EL-TERM-P.
     * 		
     * @return EL-CONSTANT; either #$Singular-NLAttr or #$Plural-NLAttr.
     */
    @LispMethod(comment = "Determine the grammatical number of EXP.\r\n\r\n@param EXP;\nEL-TERM-P.\r\n\t\t\r\n@return EL-CONSTANT; either #$Singular-NLAttr or #$Plural-NLAttr.")
    public static final SubLObject pph_number_alt(SubLObject exp) {
        if (NIL != cycl_variables.el_varP(exp)) {
            return com.cyc.cycjava.cycl.pph_methods.pph_number_of_var(exp);
        } else {
            return com.cyc.cycjava.cycl.pph_methods.pph_number_of_term(exp);
        }
    }

    /**
     * Determine the grammatical number of EXP.
     *
     * @param EXP;
    		EL-TERM-P.
     * 		
     * @return EL-CONSTANT; either #$Singular-NLAttr or #$Plural-NLAttr.
     */
    @LispMethod(comment = "Determine the grammatical number of EXP.\r\n\r\n@param EXP;\n\t\tEL-TERM-P.\r\n\t\t\r\n@return EL-CONSTANT; either #$Singular-NLAttr or #$Plural-NLAttr.")
    public static SubLObject pph_number(final SubLObject exp) {
        if (NIL != cycl_variables.el_varP(exp)) {
            return pph_number_of_var(exp);
        }
        return pph_number_of_term(exp);
    }/**
     * Determine the grammatical number of EXP.
     *
     * @param EXP;
    		EL-TERM-P.
     * 		
     * @return EL-CONSTANT; either #$Singular-NLAttr or #$Plural-NLAttr.
     */


    /**
     * Determine whether EXP1 and EXP2 have the same grammatical gender.
     *
     * @param EXP1;
    EL-TERM-P.
     * 		
     * @param EXP2;
    EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */
    @LispMethod(comment = "Determine whether EXP1 and EXP2 have the same grammatical gender.\r\n\r\n@param EXP1;\nEL-TERM-P.\r\n\t\t\r\n@param EXP2;\nEL-TERM-P.\r\n\t\t\r\n@return BOOLEAN.")
    public static final SubLObject pph_same_genderP_alt(SubLObject exp1, SubLObject exp2) {
        return equal(com.cyc.cycjava.cycl.pph_methods.pph_gender(exp1), com.cyc.cycjava.cycl.pph_methods.pph_gender(exp2));
    }

    /**
     * Determine whether EXP1 and EXP2 have the same grammatical gender.
     *
     * @param EXP1;
    		EL-TERM-P.
     * 		
     * @param EXP2;
    		EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */
    @LispMethod(comment = "Determine whether EXP1 and EXP2 have the same grammatical gender.\r\n\r\n@param EXP1;\n\t\tEL-TERM-P.\r\n\t\t\r\n@param EXP2;\n\t\tEL-TERM-P.\r\n\t\t\r\n@return BOOLEAN.")
    public static SubLObject pph_same_genderP(final SubLObject exp1, final SubLObject exp2) {
        return equal(pph_gender(exp1), pph_gender(exp2));
    }/**
     * Determine whether EXP1 and EXP2 have the same grammatical gender.
     *
     * @param EXP1;
    		EL-TERM-P.
     * 		
     * @param EXP2;
    		EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */


    /**
     * Determine whether EXP1 and EXP2 have the same grammatical number.
     *
     * @param EXP1;
    EL-TERM-P.
     * 		
     * @param EXP2;
    EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */
    @LispMethod(comment = "Determine whether EXP1 and EXP2 have the same grammatical number.\r\n\r\n@param EXP1;\nEL-TERM-P.\r\n\t\t\r\n@param EXP2;\nEL-TERM-P.\r\n\t\t\r\n@return BOOLEAN.")
    public static final SubLObject pph_same_numberP_alt(SubLObject exp1, SubLObject exp2) {
        return equal(com.cyc.cycjava.cycl.pph_methods.pph_number(exp1), com.cyc.cycjava.cycl.pph_methods.pph_number(exp2));
    }

    /**
     * Determine whether EXP1 and EXP2 have the same grammatical number.
     *
     * @param EXP1;
    		EL-TERM-P.
     * 		
     * @param EXP2;
    		EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */
    @LispMethod(comment = "Determine whether EXP1 and EXP2 have the same grammatical number.\r\n\r\n@param EXP1;\n\t\tEL-TERM-P.\r\n\t\t\r\n@param EXP2;\n\t\tEL-TERM-P.\r\n\t\t\r\n@return BOOLEAN.")
    public static SubLObject pph_same_numberP(final SubLObject exp1, final SubLObject exp2) {
        return equal(pph_number(exp1), pph_number(exp2));
    }/**
     * Determine whether EXP1 and EXP2 have the same grammatical number.
     *
     * @param EXP1;
    		EL-TERM-P.
     * 		
     * @param EXP2;
    		EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */


    /**
     * Whether EXP1 and EXP2 have both the same grammatical number and gender.
     *
     * @param EXP1;
    EL-TERM-P.
     * 		
     * @param EXP2;
    EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */
    @LispMethod(comment = "Whether EXP1 and EXP2 have both the same grammatical number and gender.\r\n\r\n@param EXP1;\nEL-TERM-P.\r\n\t\t\r\n@param EXP2;\nEL-TERM-P.\r\n\t\t\r\n@return BOOLEAN.")
    public static final SubLObject pph_same_gender_and_numberP_alt(SubLObject exp1, SubLObject exp2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.pph_methods.pph_same_genderP(exp1, exp2)) && (NIL != com.cyc.cycjava.cycl.pph_methods.pph_same_numberP(exp1, exp2)));
    }

    /**
     * Whether EXP1 and EXP2 have both the same grammatical number and gender.
     *
     * @param EXP1;
    		EL-TERM-P.
     * 		
     * @param EXP2;
    		EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */
    @LispMethod(comment = "Whether EXP1 and EXP2 have both the same grammatical number and gender.\r\n\r\n@param EXP1;\n\t\tEL-TERM-P.\r\n\t\t\r\n@param EXP2;\n\t\tEL-TERM-P.\r\n\t\t\r\n@return BOOLEAN.")
    public static SubLObject pph_same_gender_and_numberP(final SubLObject exp1, final SubLObject exp2) {
        return makeBoolean((NIL != pph_same_genderP(exp1, exp2)) && (NIL != pph_same_numberP(exp1, exp2)));
    }/**
     * Whether EXP1 and EXP2 have both the same grammatical number and gender.
     *
     * @param EXP1;
    		EL-TERM-P.
     * 		
     * @param EXP2;
    		EL-TERM-P.
     * 		
     * @return BOOLEAN.
     */


    /**
     *
     *
     * @param PPH-GENDER-P
     * 		
     * @param PPH-GENDER-P
     * 		
     * @return PPH-GENDER-P; the gender if the params are the same, otherwise the
    gender used by *pph-language-mt* in mixed cases
     */
    @LispMethod(comment = "@param PPH-GENDER-P\r\n\t\t\r\n@param PPH-GENDER-P\r\n\t\t\r\n@return PPH-GENDER-P; the gender if the params are the same, otherwise the\r\ngender used by *pph-language-mt* in mixed cases")
    public static final SubLObject pph_unify_gender_alt(SubLObject gen1, SubLObject gen2) {
        if (gen1.eql(gen2)) {
            return gen1;
        }
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format(T, $str_alt356$Defaulting_to_English_gender_unif);
            }
        }
        if (NIL != subl_promotions.memberP($$Masculine_NLAttr, list(gen1, gen2), UNPROVIDED, UNPROVIDED)) {
            return $$Masculine_NLAttr;
        } else {
            if (NIL != subl_promotions.memberP($$Feminine_NLAttr, list(gen1, gen2), UNPROVIDED, UNPROVIDED)) {
                return $$Feminine_NLAttr;
            } else {
                if (NIL != subl_promotions.memberP($$Neuter_NLAttr, list(gen1, gen2), UNPROVIDED, UNPROVIDED)) {
                    return $$Neuter_NLAttr;
                } else {
                    return $$Ungendered_NLAttr;
                }
            }
        }
    }

    /**
     *
     *
     * @param PPH-GENDER-P
     * 		
     * @param PPH-GENDER-P
     * 		
     * @return PPH-GENDER-P; the gender if the params are the same, otherwise the
    gender used by *pph-language-mt* in mixed cases
     */
    @LispMethod(comment = "@param PPH-GENDER-P\r\n\t\t\r\n@param PPH-GENDER-P\r\n\t\t\r\n@return PPH-GENDER-P; the gender if the params are the same, otherwise the\r\ngender used by *pph-language-mt* in mixed cases")
    public static SubLObject pph_unify_gender(final SubLObject gen1, final SubLObject gen2) {
        if (gen1.eql(gen2)) {
            return gen1;
        }
        if ((NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER))) {
            format_nil.force_format(T, $str380$Defaulting_to_English_gender_unif, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != subl_promotions.memberP($$Masculine_NLAttr, list(gen1, gen2), UNPROVIDED, UNPROVIDED)) {
            return $$Masculine_NLAttr;
        }
        if (NIL != subl_promotions.memberP($$Feminine_NLAttr, list(gen1, gen2), UNPROVIDED, UNPROVIDED)) {
            return $$Feminine_NLAttr;
        }
        if (NIL != subl_promotions.memberP($$Neuter_NLAttr, list(gen1, gen2), UNPROVIDED, UNPROVIDED)) {
            return $$Neuter_NLAttr;
        }
        return $$Ungendered_NLAttr;
    }

    /**
     *
     *
     * @param PPH-NUMBER
     * 		
     * @param PPH-NUMBER
     * 		
     * @return PPH-NUMBER; presently #$Plural-NLAttr if either param is that,
    otherwise #$Singular-NLAttr
     */
    @LispMethod(comment = "@param PPH-NUMBER\r\n\t\t\r\n@param PPH-NUMBER\r\n\t\t\r\n@return PPH-NUMBER; presently #$Plural-NLAttr if either param is that,\r\notherwise #$Singular-NLAttr")
    public static final SubLObject pph_unify_number_alt(SubLObject num1, SubLObject num2) {
        return num1.eql($$Plural_NLAttr) || num2.eql($$Plural_NLAttr) ? ((SubLObject) ($$Plural_NLAttr)) : $$Singular_NLAttr;
    }

    /**
     *
     *
     * @param PPH-NUMBER
     * 		
     * @param PPH-NUMBER
     * 		
     * @return PPH-NUMBER; presently #$Plural-NLAttr if either param is that,
    otherwise #$Singular-NLAttr
     */
    @LispMethod(comment = "@param PPH-NUMBER\r\n\t\t\r\n@param PPH-NUMBER\r\n\t\t\r\n@return PPH-NUMBER; presently #$Plural-NLAttr if either param is that,\r\notherwise #$Singular-NLAttr")
    public static SubLObject pph_unify_number(final SubLObject num1, final SubLObject num2) {
        return num1.eql($$Plural_NLAttr) || num2.eql($$Plural_NLAttr) ? $$Plural_NLAttr : $$Singular_NLAttr;
    }

    /**
     * Takes a pair of pph-person's and returns the higher-order one.
     * pcond clauses are organized to (presumably) maximize efficiency
     */
    @LispMethod(comment = "Takes a pair of pph-person\'s and returns the higher-order one.\r\npcond clauses are organized to (presumably) maximize efficiency\nTakes a pair of pph-person\'s and returns the higher-order one.\npcond clauses are organized to (presumably) maximize efficiency")
    public static final SubLObject pph_unify_person_alt(SubLObject pers1, SubLObject pers2) {
        if (pers1.eql($$ThirdPerson_NLAttr) && pers2.eql($$ThirdPerson_NLAttr)) {
            return $$ThirdPerson_NLAttr;
        } else {
            if (pers1.eql($$FirstPerson_NLAttr) || pers2.eql($$FirstPerson_NLAttr)) {
                return $$FirstPerson_NLAttr;
            } else {
                return $$SecondPerson_NLAttr;
            }
        }
    }

    /**
     * Takes a pair of pph-person's and returns the higher-order one.
     * pcond clauses are organized to (presumably) maximize efficiency
     */
    @LispMethod(comment = "Takes a pair of pph-person\'s and returns the higher-order one.\r\npcond clauses are organized to (presumably) maximize efficiency\nTakes a pair of pph-person\'s and returns the higher-order one.\npcond clauses are organized to (presumably) maximize efficiency")
    public static SubLObject pph_unify_person(final SubLObject pers1, final SubLObject pers2) {
        if (pers1.eql($$ThirdPerson_NLAttr) && pers2.eql($$ThirdPerson_NLAttr)) {
            return $$ThirdPerson_NLAttr;
        }
        if (pers1.eql($$FirstPerson_NLAttr) || pers2.eql($$FirstPerson_NLAttr)) {
            return $$FirstPerson_NLAttr;
        }
        return $$SecondPerson_NLAttr;
    }/**
     * Takes a pair of pph-person's and returns the higher-order one.
     * pcond clauses are organized to (presumably) maximize efficiency
     */


    /**
     * Determine the grammatical gender of VAR.
     *
     * @param VAR;
    EL-VARIABLE-P.
     * 		
     * @return EL-CONSTANT
     */
    @LispMethod(comment = "Determine the grammatical gender of VAR.\r\n\r\n@param VAR;\nEL-VARIABLE-P.\r\n\t\t\r\n@return EL-CONSTANT")
    public static final SubLObject pph_gender_of_var_alt(SubLObject var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = (NIL != pph_variable_handling.pph_var_registeredP(var)) ? ((SubLObject) (pph_variable_handling.pph_cycl_var_type(var))) : NIL;
                SubLObject the_language = com.cyc.cycjava.cycl.pph_methods.pph_language_of_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                return (NIL != type) && (NIL != the_language) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.pph_gender_of_var_type(type, the_language))) : NIL != the_language ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language(the_language, UNPROVIDED))) : com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender();
            }
        }
    }

    /**
     * Determine the grammatical gender of VAR.
     *
     * @param VAR;
    		EL-VARIABLE-P.
     * 		
     * @return EL-CONSTANT
     */
    @LispMethod(comment = "Determine the grammatical gender of VAR.\r\n\r\n@param VAR;\n\t\tEL-VARIABLE-P.\r\n\t\t\r\n@return EL-CONSTANT")
    public static SubLObject pph_gender_of_var(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = (NIL != pph_variable_handling.pph_var_registeredP(var)) ? pph_variable_handling.pph_cycl_var_type(var) : NIL;
        final SubLObject the_language = pph_language_of_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        return (NIL != type) && (NIL != the_language) ? pph_gender_of_var_type(type, the_language) : NIL != the_language ? pph_default_grammatical_gender_for_language(the_language, UNPROVIDED) : pph_default_grammatical_gender();
    }/**
     * Determine the grammatical gender of VAR.
     *
     * @param VAR;
    		EL-VARIABLE-P.
     * 		
     * @return EL-CONSTANT
     */


    public static final SubLObject pph_gender_of_var_type_alt(SubLObject type, SubLObject the_language) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pph_utilities.specs_fn_natP(type)) {
                return com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language(the_language, UNPROVIDED);
            } else {
                if (NIL != cycl_variables.el_varP(type)) {
                    return com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language(the_language, UNPROVIDED);
                } else {
                    {
                        SubLObject gender = pph_utilities.pph_ask_variable_new($sym366$_GENDER, listS($$languageUsesGrammaticalGender, the_language, type, $list_alt368), pph_vars.$pph_language_mt$.getDynamicValue(thread), $list_alt369).first();
                        if (NIL == gender) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                Errors.warn($str_alt370$Couldn_t_find_gender_for__S_in__S, type, the_language);
                            }
                        }
                        return NIL != gender ? ((SubLObject) (gender)) : com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language(the_language, UNPROVIDED);
                    }
                }
            }
        }
    }

    public static SubLObject pph_gender_of_var_type(final SubLObject type, final SubLObject the_language) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_utilities.specs_fn_natP(type)) {
            return pph_default_grammatical_gender_for_language(the_language, UNPROVIDED);
        }
        if (NIL != cycl_variables.el_varP(type)) {
            return pph_default_grammatical_gender_for_language(the_language, UNPROVIDED);
        }
        final SubLObject gender = pph_utilities.pph_ask_variable_new($sym390$_GENDER, listS($$languageUsesGrammaticalGender, the_language, type, $list392), pph_vars.$pph_language_mt$.getDynamicValue(thread), $list393).first();
        if (((NIL == gender) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str394$Couldn_t_find_gender_for__S_in__S, type, the_language);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return NIL != gender ? gender : pph_default_grammatical_gender_for_language(the_language, UNPROVIDED);
    }

    /**
     * Look up a language mt's language and return it
     */
    @LispMethod(comment = "Look up a language mt\'s language and return it")
    public static final SubLObject pph_language_of_mt_alt(SubLObject mt) {
        return language_of_lexicon(mt);
    }

    /**
     * Look up a language mt's language and return it
     */
    @LispMethod(comment = "Look up a language mt\'s language and return it")
    public static SubLObject pph_language_of_mt(final SubLObject mt) {
        return lexicon_utilities.language_of_lexicon(mt);
    }/**
     * Look up a language mt's language and return it
     */


    /**
     *
     *
     * @return BOOLEANP; Is MT a lexical mt for English?
     */
    @LispMethod(comment = "@return BOOLEANP; Is MT a lexical mt for English?")
    public static final SubLObject pph_english_lexical_mtP_alt(SubLObject mt) {
        {
            SubLObject language = com.cyc.cycjava.cycl.pph_methods.pph_language_of_mt(mt);
            SubLObject known_english_variantP = member(language, $known_english_variants$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
            if (((NIL == known_english_variantP) && (NIL != pph_utilities.pph_isaP(language, $$LanguageDialect, UNPROVIDED))) && (NIL != pph_utilities.pph_ask_boolean(list($$dialects, $$EnglishLanguage, language), $$InferencePSC, UNPROVIDED))) {
                known_english_variantP = T;
                $known_english_variants$.setGlobalValue(cons(language, $known_english_variants$.getGlobalValue()));
            }
            return known_english_variantP;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is MT a lexical mt for English?
     */
    @LispMethod(comment = "@return BOOLEANP; Is MT a lexical mt for English?")
    public static SubLObject pph_english_lexical_mtP(final SubLObject mt) {
        final SubLObject language = pph_language_of_mt(mt);
        SubLObject known_english_variantP = member(language, $known_english_variants$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
        if (((NIL == known_english_variantP) && (NIL != pph_utilities.pph_isaP(language, $$LanguageDialect, UNPROVIDED))) && (NIL != pph_utilities.pph_ask_boolean(list($$dialects, $$EnglishLanguage, language), $$InferencePSC, UNPROVIDED))) {
            known_english_variantP = T;
            $known_english_variants$.setGlobalValue(cons(language, $known_english_variants$.getGlobalValue()));
        }
        return known_english_variantP;
    }

    /**
     *
     *
     * @return BOOLEANP; Is MT a lexical mt for a language other than English?
     */
    @LispMethod(comment = "@return BOOLEANP; Is MT a lexical mt for a language other than English?")
    public static final SubLObject pph_non_english_lexical_mtP_alt(SubLObject mt) {
        {
            SubLObject language = com.cyc.cycjava.cycl.pph_methods.pph_language_of_mt(mt);
            return makeBoolean((NIL != language) && (NIL == com.cyc.cycjava.cycl.pph_methods.pph_english_lexical_mtP(mt)));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is MT a lexical mt for a language other than English?
     */
    @LispMethod(comment = "@return BOOLEANP; Is MT a lexical mt for a language other than English?")
    public static SubLObject pph_non_english_lexical_mtP(final SubLObject mt) {
        final SubLObject language = pph_language_of_mt(mt);
        return makeBoolean((NIL != language) && (NIL == pph_english_lexical_mtP(mt)));
    }

    public static final SubLObject pph_default_grammatical_gender_alt() {
        return $pph_default_grammatical_gender$.getGlobalValue();
    }

    public static SubLObject pph_default_grammatical_gender() {
        return $pph_default_grammatical_gender$.getGlobalValue();
    }

    public static final SubLObject pph_default_grammatical_gender_for_language_internal_alt(SubLObject language, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralLexiconMt;
        }
        {
            SubLObject gender = pph_utilities.pph_ask_variable_new($sym366$_GENDER, listS($$defaultGrammaticalGender, language, $list_alt368), mt, UNPROVIDED).first();
            return NIL != gender ? ((SubLObject) (gender)) : com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender();
        }
    }

    public static SubLObject pph_default_grammatical_gender_for_language_internal(final SubLObject language, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralLexiconMt;
        }
        final SubLObject gender = pph_utilities.pph_ask_variable_new($sym390$_GENDER, listS($$defaultGrammaticalGender, language, $list392), mt, UNPROVIDED).first();
        return NIL != gender ? gender : pph_default_grammatical_gender();
    }

    public static final SubLObject pph_default_grammatical_gender_for_language_alt(SubLObject language, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralLexiconMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language_internal(language, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, TWO_INTEGER, EIGHT_INTEGER, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(language, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (language.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language_internal(language, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(language, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_default_grammatical_gender_for_language(final SubLObject language, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralLexiconMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_default_grammatical_gender_for_language_internal(language, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, TWO_INTEGER, EIGHT_INTEGER, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(language, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (language.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_default_grammatical_gender_for_language_internal(language, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(language, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Determine the grammatical number of VAR.
     *
     * @param VAR;
    EL-VARIABLE-P.
     * 		
     * @return EL-CONSTANT.
     */
    @LispMethod(comment = "Determine the grammatical number of VAR.\r\n\r\n@param VAR;\nEL-VARIABLE-P.\r\n\t\t\r\n@return EL-CONSTANT.")
    public static final SubLObject pph_number_of_var_alt(SubLObject var) {
        {
            SubLObject previously_pluralP = NIL;
            if (NIL == previously_pluralP) {
                {
                    SubLObject csome_list_var = pph_variable_handling.pph_var_paraphrases(var);
                    SubLObject paraphrase = NIL;
                    for (paraphrase = csome_list_var.first(); !((NIL != previously_pluralP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , paraphrase = csome_list_var.first()) {
                        if (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(paraphrase), $$plural_Generic, UNPROVIDED)) {
                            previously_pluralP = T;
                        }
                    }
                }
            }
            return NIL != previously_pluralP ? ((SubLObject) ($$Plural_NLAttr)) : $$Singular_NLAttr;
        }
    }

    /**
     * Determine the grammatical number of VAR.
     *
     * @param VAR;
    		EL-VARIABLE-P.
     * 		
     * @return EL-CONSTANT.
     */
    @LispMethod(comment = "Determine the grammatical number of VAR.\r\n\r\n@param VAR;\n\t\tEL-VARIABLE-P.\r\n\t\t\r\n@return EL-CONSTANT.")
    public static SubLObject pph_number_of_var(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_drs.pph_discourse_referentP(var)) {
            return pph_drs.pph_discourse_number_for_cycl(var);
        }
        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str402$pph_number_of_var_guessing_that__, var);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return $$Singular_NLAttr;
    }/**
     * Determine the grammatical number of VAR.
     *
     * @param VAR;
    		EL-VARIABLE-P.
     * 		
     * @return EL-CONSTANT.
     */


    /**
     *
     *
     * @return FORT-P; the grammatical number appropriate for TERM
     */
    @LispMethod(comment = "@return FORT-P; the grammatical number appropriate for TERM")
    public static final SubLObject pph_number_of_term_alt(SubLObject v_term) {
        if (NIL != pph_discourse_referentP(v_term)) {
            return pph_discourse_number_for_cycl(v_term);
        } else {
            return com.cyc.cycjava.cycl.pph_methods.pph_number_from_cycl(v_term);
        }
    }

    /**
     *
     *
     * @return FORT-P; the grammatical number appropriate for TERM
     */
    @LispMethod(comment = "@return FORT-P; the grammatical number appropriate for TERM")
    public static SubLObject pph_number_of_term(final SubLObject v_term) {
        if (NIL != pph_drs.pph_discourse_referentP(v_term)) {
            return pph_drs.pph_discourse_number_for_cycl(v_term);
        }
        return pph_number_from_cycl(v_term);
    }

    public static final SubLObject pph_number_from_cycl_alt(SubLObject v_term) {
        if (((NIL != pph_utilities.pph_isaP(v_term, $$Group, UNPROVIDED)) && (NIL == pph_utilities.pph_isaP(v_term, $$Agent_Generic, UNPROVIDED))) && (NIL == pph_utilities.pph_isaP(v_term, $$ConceptualWorkSeries, UNPROVIDED))) {
            return $$Plural_NLAttr;
        } else {
            return $$Singular_NLAttr;
        }
    }

    public static SubLObject pph_number_from_cycl(final SubLObject v_term) {
        if (((NIL != pph_utilities.pph_isaP(v_term, $$Group, UNPROVIDED)) && (NIL == pph_utilities.pph_isaP(v_term, $$Agent_Generic, UNPROVIDED))) && (NIL == pph_utilities.pph_isaP(v_term, $$ConceptualWorkSeries, UNPROVIDED))) {
            return $$Plural_NLAttr;
        }
        return $$Singular_NLAttr;
    }

    /**
     *
     *
     * @return FORT-P; the grammatical gender appropriate for TERM
     */
    @LispMethod(comment = "@return FORT-P; the grammatical gender appropriate for TERM")
    public static final SubLObject pph_gender_of_term_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = com.cyc.cycjava.cycl.pph_methods.pph_enhanced_domain_mt(UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject the_language = com.cyc.cycjava.cycl.pph_methods.pph_language_of_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                SubLObject gender = ((NIL != the_language) && (NIL != closedP(v_term, UNPROVIDED))) ? ((SubLObject) (pph_utilities.pph_ask_variable_new($sym366$_GENDER, listS($$licensedGrammaticalGender, the_language, v_term, $list_alt368), mt, $list_alt369).first())) : NIL;
                if (NIL == gender) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        Errors.warn($str_alt383$Couldn_t_find_a_gender_for__S_in_, v_term, mt);
                    }
                }
                return NIL != gender ? ((SubLObject) (gender)) : NIL != the_language ? ((SubLObject) (com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender_for_language(the_language, UNPROVIDED))) : com.cyc.cycjava.cycl.pph_methods.pph_default_grammatical_gender();
            }
        }
    }

    /**
     *
     *
     * @return FORT-P; the grammatical gender appropriate for TERM
     */
    @LispMethod(comment = "@return FORT-P; the grammatical gender appropriate for TERM")
    public static SubLObject pph_gender_of_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_enhanced_domain_mt(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_language = pph_language_of_mt(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        SubLObject gender = NIL;
        final SubLObject query_sentence = listS($$licensedGrammaticalGender, the_language, v_term, $list392);
        SubLObject timed_outP = NIL;
        if ((NIL != the_language) && (NIL != closedP(v_term, UNPROVIDED))) {
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$96 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer(TWO_INTEGER, tag);
                            gender = pph_utilities.pph_ask_variable_new($sym390$_GENDER, query_sentence, mt, $list393).first();
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$96, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
        }
        if (((NIL == gender) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str407$Couldn_t_find_a_gender_for__S_in_, v_term, mt);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        if ((NIL != timed_outP) || gender.eql($$Ungendered_NLAttr)) {
            gender = adjust_gender_for_top_level_cycl(v_term, gender, the_language);
        }
        return NIL != gender ? gender : NIL != the_language ? pph_default_grammatical_gender_for_language(the_language, UNPROVIDED) : pph_default_grammatical_gender();
    }

    public static SubLObject adjust_gender_for_top_level_cycl(final SubLObject v_term, final SubLObject gender, final SubLObject the_language) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != cycl_grammar.cycl_sentence_p(pph_vars.pph_top_level_cycl())) && (NIL != groundP(pph_vars.pph_top_level_cycl(), UNPROVIDED))) {
            final SubLObject var = $sym25$_X;
            final SubLObject formula = cycl_utilities.formula_subst(var, v_term, pph_vars.pph_top_level_cycl(), UNPROVIDED, UNPROVIDED);
            final SubLObject constraints = pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), T, T, UNPROVIDED);
            SubLObject cdolist_list_var = pph_utilities.pph_ask_template($list410, listS($$languageUsesGrammaticalGender, the_language, $list411), pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject type = NIL;
                SubLObject adjusted_gender = NIL;
                destructuring_bind_must_consp(current, datum, $list408);
                type = current.first();
                current = adjusted_gender = current.rest();
                if (NIL != subl_promotions.memberP(type, constraints, $sym409$SPEC_, UNPROVIDED)) {
                    return adjusted_gender;
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        return gender;
    }

    /**
     * Determine the grammatical person (first, second, third) for term.
     *
     * @param EXP:
    EL-TERM-P.
     * 		
     * @return EL-CONSTANT.
     */
    @LispMethod(comment = "Determine the grammatical person (first, second, third) for term.\r\n\r\n@param EXP:\nEL-TERM-P.\r\n\t\t\r\n@return EL-CONSTANT.")
    public static final SubLObject pph_person_alt(SubLObject exp) {
        if (NIL != pph_discourse_referentP(exp)) {
            return pph_discourse_person_for_cycl(exp);
        } else {
            return com.cyc.cycjava.cycl.pph_methods.pph_default_person();
        }
    }

    /**
     * Determine the grammatical person (first, second, third) for term.
     *
     * @param EXP:
    		EL-TERM-P.
     * 		
     * @return EL-CONSTANT.
     */
    @LispMethod(comment = "Determine the grammatical person (first, second, third) for term.\r\n\r\n@param EXP:\n\t\tEL-TERM-P.\r\n\t\t\r\n@return EL-CONSTANT.")
    public static SubLObject pph_person(final SubLObject exp) {
        if (NIL != pph_drs.pph_discourse_referentP(exp)) {
            return pph_drs.pph_discourse_person_for_cycl(exp);
        }
        return pph_default_person();
    }/**
     * Determine the grammatical person (first, second, third) for term.
     *
     * @param EXP:
    		EL-TERM-P.
     * 		
     * @return EL-CONSTANT.
     */


    public static final SubLObject pph_default_person_alt() {
        return $$ThirdPerson_NLAttr;
    }

    public static SubLObject pph_default_person() {
        return $$ThirdPerson_NLAttr;
    }

    public static final SubLObject declare_pph_methods_file_alt() {
        declareFunction("funcall_pph_method", "FUNCALL-PPH-METHOD", 2, 0, false);
        declareFunction("generate_skolem_term_with_name", "GENERATE-SKOLEM-TERM-WITH-NAME", 1, 0, false);
        declareFunction("clear_generate_skolem_name", "CLEAR-GENERATE-SKOLEM-NAME", 0, 0, false);
        declareFunction("remove_generate_skolem_name", "REMOVE-GENERATE-SKOLEM-NAME", 1, 0, false);
        declareFunction("generate_skolem_name_internal", "GENERATE-SKOLEM-NAME-INTERNAL", 1, 0, false);
        declareFunction("generate_skolem_name", "GENERATE-SKOLEM-NAME", 1, 0, false);
        declareFunction("pph_capitalize_smart", "PPH-CAPITALIZE-SMART", 1, 0, false);
        declareFunction("generate_skolem_term_existentially", "GENERATE-SKOLEM-TERM-EXISTENTIALLY", 1, 0, false);
        declareFunction("generate_skolem_term_existentially_int", "GENERATE-SKOLEM-TERM-EXISTENTIALLY-INT", 1, 0, false);
        declareFunction("pph_skolem_nat_find_type", "PPH-SKOLEM-NAT-FIND-TYPE", 1, 0, false);
        declareFunction("pph_min_isa", "PPH-MIN-ISA", 1, 1, false);
        declareFunction("arg_type_is_collection_p", "ARG-TYPE-IS-COLLECTION-P", 2, 0, false);
        declareFunction("generate_hypothetical", "GENERATE-HYPOTHETICAL", 1, 0, false);
        declareFunction("generate_cycl_variable", "GENERATE-CYCL-VARIABLE", 1, 0, false);
        declareFunction("pph_phrase_set_var_arg_position", "PPH-PHRASE-SET-VAR-ARG-POSITION", 2, 1, false);
        declareFunction("pph_phrase_set_var_type_arg_positions", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITIONS", 3, 0, false);
        declareFunction("pph_phrase_set_var_type_arg_position", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITION", 3, 0, false);
        declareFunction("pph_phrase_set_arg_position_for_cycl", "PPH-PHRASE-SET-ARG-POSITION-FOR-CYCL", 3, 0, false);
        declareFunction("pph_var_ok_for_lexifyingP", "PPH-VAR-OK-FOR-LEXIFYING?", 1, 1, false);
        declareFunction("pph_paraphrase_var_as_var", "PPH-PARAPHRASE-VAR-AS-VAR", 1, 2, false);
        declareFunction("pph_instance_of_item", "PPH-INSTANCE-OF-ITEM", 1, 0, false);
        declareFunction("pph_maybe_italicize_variable_phrase", "PPH-MAYBE-ITALICIZE-VARIABLE-PHRASE", 1, 0, false);
        declareFunction("pph_italicize_variablesP", "PPH-ITALICIZE-VARIABLES?", 0, 0, false);
        declareFunction("pph_var_phrase_prefix_items", "PPH-VAR-PHRASE-PREFIX-ITEMS", 1, 1, false);
        declareFunction("var_functional_in_matrix_sentenceP", "VAR-FUNCTIONAL-IN-MATRIX-SENTENCE?", 1, 0, false);
        declareFunction("pph_paraphrase_var_with_type", "PPH-PARAPHRASE-VAR-WITH-TYPE", 1, 0, false);
        declareFunction("pph_lexify_var", "PPH-LEXIFY-VAR", 3, 3, false);
        declareFunction("pph_var_type_for_lexification", "PPH-VAR-TYPE-FOR-LEXIFICATION", 1, 1, false);
        declareFunction("pph_var_type_for_lexification_internal", "PPH-VAR-TYPE-FOR-LEXIFICATION-INTERNAL", 3, 0, false);
        declareFunction("pph_highly_faceted_typeP", "PPH-HIGHLY-FACETED-TYPE?", 1, 0, false);
        declareFunction("pph_var_arg_position_map", "PPH-VAR-ARG-POSITION-MAP", 1, 0, false);
        declareFunction("determiner_type_for_var_phrase", "DETERMINER-TYPE-FOR-VAR-PHRASE", 1, 0, false);
        declareFunction("pph_npi_licensor", "PPH-NPI-LICENSOR", 1, 0, false);
        declareFunction("pph_npi_licensor_int", "PPH-NPI-LICENSOR-INT", 3, 0, false);
        declareFunction("pph_downward_entailing_operator_p", "PPH-DOWNWARD-ENTAILING-OPERATOR-P", 1, 0, false);
        declareFunction("pph_operator_downward_entailing_in_which_arg", "PPH-OPERATOR-DOWNWARD-ENTAILING-IN-WHICH-ARG", 1, 0, false);
        declareFunction("pph_phrase_maybe_add_disambiguation", "PPH-PHRASE-MAYBE-ADD-DISAMBIGUATION", 3, 0, false);
        declareFunction("pph_phrase_maybe_add_other", "PPH-PHRASE-MAYBE-ADD-OTHER", 2, 0, false);
        declareFunction("different_instance_same_typeP", "DIFFERENT-INSTANCE-SAME-TYPE?", 1, 0, false);
        declareFunction("pph_phrase_add_other", "PPH-PHRASE-ADD-OTHER", 1, 0, false);
        declareFunction("pph_phrase_add_english_other", "PPH-PHRASE-ADD-ENGLISH-OTHER", 1, 0, false);
        declareFunction("split_english_determiner_off", "SPLIT-ENGLISH-DETERMINER-OFF", 1, 0, false);
        declareFunction("pph_add_english_other_to_olists", "PPH-ADD-ENGLISH-OTHER-TO-OLISTS", 2, 0, false);
        declareFunction("pph_phrase_maybe_explicitify_var_phrase", "PPH-PHRASE-MAYBE-EXPLICITIFY-VAR-PHRASE", 3, 0, false);
        declareFunction("pph_phrase_explicitify_var_phrase", "PPH-PHRASE-EXPLICITIFY-VAR-PHRASE", 3, 0, false);
        declareFunction("generate_keyword", "GENERATE-KEYWORD", 1, 0, false);
        declareFunction("generate_cycl_symbol", "GENERATE-CYCL-SYMBOL", 1, 0, false);
        declareFunction("generate_non_cycl_symbol", "GENERATE-NON-CYCL-SYMBOL", 1, 0, false);
        declareFunction("generate_constant_default", "GENERATE-CONSTANT-DEFAULT", 1, 0, false);
        declareFunction("generate_lexical_word", "GENERATE-LEXICAL-WORD", 1, 0, false);
        declareFunction("generate_chemical_substance_type", "GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("do_generate_chemical_substance_type", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("generate_chemical_substance_type_from_formula_string", "GENERATE-CHEMICAL-SUBSTANCE-TYPE-FROM-FORMULA-STRING", 2, 0, false);
        declareFunction("pph_chemical_formula_html_output_items", "PPH-CHEMICAL-FORMULA-HTML-OUTPUT-ITEMS", 1, 0, false);
        declareFunction("do_generate_chemical_substance_type_semantic", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE-SEMANTIC", 1, 0, false);
        declareFunction("pph_chemical_composition", "PPH-CHEMICAL-COMPOSITION", 1, 0, false);
        declareFunction("pph_electrical_charge_of_substance_type", "PPH-ELECTRICAL-CHARGE-OF-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("pph_molecule_types", "PPH-MOLECULE-TYPES", 1, 0, false);
        declareFunction("generate_true", "GENERATE-TRUE", 1, 0, false);
        declareFunction("generate_false", "GENERATE-FALSE", 1, 0, false);
        declareFunction("select_string_method_count", "SELECT-STRING-METHOD-COUNT", 1, 0, false);
        declareFunction("select_string_method", "SELECT-STRING-METHOD", 1, 1, false);
        declareFunction("equal_pph_nl_predsP", "EQUAL-PPH-NL-PREDS?", 2, 0, false);
        declareFunction("omit_pph_select_string_method_p", "OMIT-PPH-SELECT-STRING-METHOD-P", 1, 0, false);
        declareFunction("pph_update_phrase_with_method_result", "PPH-UPDATE-PHRASE-WITH-METHOD-RESULT", 9, 0, false);
        declareFunction("pph_demerit_cutoff_for_quality", "PPH-DEMERIT-CUTOFF-FOR-QUALITY", 1, 0, false);
        declareFunction("pph_try_method", "PPH-TRY-METHOD", 5, 0, false);
        declareFunction("pph_process_method_result", "PPH-PROCESS-METHOD-RESULT", 6, 0, false);
        declareFunction("pph_category_for_disambiguation", "PPH-CATEGORY-FOR-DISAMBIGUATION", 2, 0, false);
        declareFunction("pph_filter_method_results", "PPH-FILTER-METHOD-RESULTS", 4, 0, false);
        declareFunction("pph_revised_nl_preds_for_phrase", "PPH-REVISED-NL-PREDS-FOR-PHRASE", 1, 1, false);
        declareFunction("pph_pred_ok_for_qualityP", "PPH-PRED-OK-FOR-QUALITY?", 4, 0, false);
        declareFunction("pph_genl_lexicon_predicateP", "PPH-GENL-LEXICON-PREDICATE?", 2, 0, false);
        declareFunction("select_string_for_term_internal", "SELECT-STRING-FOR-TERM-INTERNAL", 1, 4, false);
        declareFunction("select_string_for_term", "SELECT-STRING-FOR-TERM", 1, 4, false);
        declareFunction("pph_name_string_preds", "PPH-NAME-STRING-PREDS", 0, 0, false);
        declareFunction("pph_term_string_preds", "PPH-TERM-STRING-PREDS", 0, 0, false);
        declareFunction("name_string_method", "NAME-STRING-METHOD", 1, 1, false);
        declareFunction("name_string_method_int", "NAME-STRING-METHOD-INT", 3, 0, false);
        declareFunction("pph_name_string_preds_from_nl_pred_specification", "PPH-NAME-STRING-PREDS-FROM-NL-PRED-SPECIFICATION", 1, 0, false);
        declareFunction("pph_name_ok_for_preds_and_cyclP", "PPH-NAME-OK-FOR-PREDS-AND-CYCL?", 4, 0, false);
        declareFunction("pph_name_string_preds_from_nl_preds", "PPH-NAME-STRING-PREDS-FROM-NL-PREDS", 1, 0, false);
        declareFunction("pph_standard_name_string_predP", "PPH-STANDARD-NAME-STRING-PRED?", 1, 0, false);
        declareFunction("clear_pph_enhanced_domain_mt", "CLEAR-PPH-ENHANCED-DOMAIN-MT", 0, 0, false);
        declareFunction("remove_pph_enhanced_domain_mt", "REMOVE-PPH-ENHANCED-DOMAIN-MT", 0, 2, false);
        declareFunction("pph_enhanced_domain_mt_internal", "PPH-ENHANCED-DOMAIN-MT-INTERNAL", 2, 0, false);
        declareFunction("pph_enhanced_domain_mt", "PPH-ENHANCED-DOMAIN-MT", 0, 2, false);
        declareFunction("pph_broaden_language_mt", "PPH-BROADEN-LANGUAGE-MT", 0, 0, false);
        declareFunction("pph_do_name_string_method", "PPH-DO-NAME-STRING-METHOD", 2, 0, false);
        declareFunction("name_string_gaf_strings", "NAME-STRING-GAF-STRINGS", 1, 0, false);
        declareFunction("pph_no_abbreviation_predsP", "PPH-NO-ABBREVIATION-PREDS?", 1, 0, false);
        declareFunction("pph_non_abbreviation_name_predP", "PPH-NON-ABBREVIATION-NAME-PRED?", 1, 0, false);
        declareFunction("clear_pph_methods_caches", "CLEAR-PPH-METHODS-CACHES", 0, 0, false);
        declareFunction("pph_abbreviation_predP", "PPH-ABBREVIATION-PRED?", 1, 1, false);
        declareFunction("clear_pph_abbreviation_preds", "CLEAR-PPH-ABBREVIATION-PREDS", 0, 0, false);
        declareFunction("remove_pph_abbreviation_preds", "REMOVE-PPH-ABBREVIATION-PREDS", 0, 1, false);
        declareFunction("pph_abbreviation_preds_internal", "PPH-ABBREVIATION-PREDS-INTERNAL", 1, 0, false);
        declareFunction("pph_abbreviation_preds", "PPH-ABBREVIATION-PREDS", 0, 1, false);
        declareFunction("any_name_string_method", "ANY-NAME-STRING-METHOD", 1, 1, false);
        declareFunction("name_string_method_non_acronym", "NAME-STRING-METHOD-NON-ACRONYM", 1, 1, false);
        declareFunction("smart_decapitalize", "SMART-DECAPITALIZE", 2, 0, false);
        declareFunction("pph_starts_with_determinerP", "PPH-STARTS-WITH-DETERMINER?", 1, 0, false);
        declareFunction("assume_det_is_part_of_nameP", "ASSUME-DET-IS-PART-OF-NAME?", 1, 0, false);
        declareFunction("init_pph_name_string_preds", "INIT-PPH-NAME-STRING-PREDS", 0, 0, false);
        declareFunction("nl_generation_cache_method", "NL-GENERATION-CACHE-METHOD", 1, 1, false);
        new com.cyc.cycjava.cycl.pph_methods.$nl_generation_cache_method$UnaryFunction();
        new com.cyc.cycjava.cycl.pph_methods.$nl_generation_cache_method$BinaryFunction();
        declareFunction("term_string_method", "TERM-STRING-METHOD", 1, 1, false);
        declareFunction("chemical_formula_method", "CHEMICAL-FORMULA-METHOD", 1, 1, false);
        declareFunction("scientific_name_method", "SCIENTIFIC-NAME-METHOD", 1, 1, false);
        declareFunction("pretty_string_method", "PRETTY-STRING-METHOD", 1, 1, false);
        declareFunction("genitive_paraphrase_method", "GENITIVE-PARAPHRASE-METHOD", 1, 1, false);
        declareFunction("generate_nart_lexified_tight", "GENERATE-NART-LEXIFIED-TIGHT", 1, 0, false);
        declareFunction("generate_nart_lexified_imprecise", "GENERATE-NART-LEXIFIED-IMPRECISE", 1, 0, false);
        declareFunction("generate_nart_as_naut_tight", "GENERATE-NART-AS-NAUT-TIGHT", 1, 0, false);
        declareFunction("pph_nart_methods_to_omit_for_precision", "PPH-NART-METHODS-TO-OMIT-FOR-PRECISION", 1, 0, false);
        declareFunction("generate_nart_lexified", "GENERATE-NART-LEXIFIED", 2, 0, false);
        declareFunction("generate_nart_as_naut", "GENERATE-NART-AS-NAUT", 1, 0, false);
        declareFunction("generate_universal_date", "GENERATE-UNIVERSAL-DATE", 1, 0, false);
        declareFunction("generate_universal_date_numbers", "GENERATE-UNIVERSAL-DATE-NUMBERS", 1, 0, false);
        declareFunction("generate_universal_second", "GENERATE-UNIVERSAL-SECOND", 1, 1, false);
        declareFunction("generate_float", "GENERATE-FLOAT", 1, 0, false);
        declareFunction("pph_float_string", "PPH-FLOAT-STRING", 1, 1, false);
        declareFunction("generate_integer_wXcommas", "GENERATE-INTEGER-W/COMMAS", 1, 0, false);
        declareFunction("generate_integer_as_word", "GENERATE-INTEGER-AS-WORD", 1, 0, false);
        declareFunction("generate_number_default", "GENERATE-NUMBER-DEFAULT", 1, 0, false);
        declareFunction("pph_ordinal_phrase_p", "PPH-ORDINAL-PHRASE-P", 1, 0, false);
        declareFunction("get_image_url_as_string", "GET-IMAGE-URL-AS-STRING", 1, 0, false);
        declareFunction("generate_image_url", "GENERATE-IMAGE-URL", 1, 0, false);
        declareFunction("generate_princ", "GENERATE-PRINC", 1, 0, false);
        declareFunction("do_generate_princ", "DO-GENERATE-PRINC", 1, 0, false);
        declareFunction("pph_default_mt_time_index", "PPH-DEFAULT-MT-TIME-INDEX", 0, 0, false);
        declareFunction("generate_assertion", "GENERATE-ASSERTION", 1, 0, false);
        declareFunction("pph_time_interval_for_assertion", "PPH-TIME-INTERVAL-FOR-ASSERTION", 1, 0, false);
        declareFunction("pph_ignore_temporal_qualification_for_assertionP", "PPH-IGNORE-TEMPORAL-QUALIFICATION-FOR-ASSERTION?", 2, 0, false);
        declareFunction("pph_irrelevant_date_wrt_assertion_contentP", "PPH-IRRELEVANT-DATE-WRT-ASSERTION-CONTENT?", 2, 0, false);
        declareFunction("pph_indexed_nautP", "PPH-INDEXED-NAUT?", 1, 0, false);
        declareFunction("pph_support_creation_dates_internal", "PPH-SUPPORT-CREATION-DATES-INTERNAL", 1, 0, false);
        declareFunction("pph_support_creation_dates", "PPH-SUPPORT-CREATION-DATES", 1, 0, false);
        declareFunction("pph_support_creation_dates_recursive", "PPH-SUPPORT-CREATION-DATES-RECURSIVE", 2, 0, false);
        declareFunction("pph_mt_time_index", "PPH-MT-TIME-INDEX", 1, 0, false);
        declareFunction("pph_monad_mt_time_precision_suspect_p", "PPH-MONAD-MT-TIME-PRECISION-SUSPECT-P", 1, 0, false);
        declareFunction("pph_adjust_mt_time_index_granularity", "PPH-ADJUST-MT-TIME-INDEX-GRANULARITY", 1, 0, false);
        declareFunction("pph_adjust_mt_date_granularity_internal", "PPH-ADJUST-MT-DATE-GRANULARITY-INTERNAL", 2, 0, false);
        declareFunction("pph_adjust_mt_date_granularity", "PPH-ADJUST-MT-DATE-GRANULARITY", 2, 0, false);
        declareFunction("pph_assertion_has_glossP", "PPH-ASSERTION-HAS-GLOSS?", 1, 0, false);
        declareFunction("pph_gloss_for_assertion", "PPH-GLOSS-FOR-ASSERTION", 2, 0, false);
        declareFunction("pph_output_list_to_assertion_output_list", "PPH-OUTPUT-LIST-TO-ASSERTION-OUTPUT-LIST", 1, 0, false);
        declareFunction("pph_output_list_from_assertion_output_list", "PPH-OUTPUT-LIST-FROM-ASSERTION-OUTPUT-LIST", 2, 0, false);
        declareFunction("assertion_output_list_info_p", "ASSERTION-OUTPUT-LIST-INFO-P", 1, 0, false);
        declareFunction("generate_string", "GENERATE-STRING", 1, 0, false);
        declareFunction("generate_cycl_string_with_html", "GENERATE-CYCL-STRING-WITH-HTML", 1, 0, false);
        declareFunction("generate_cycl_string_with_html_internal", "GENERATE-CYCL-STRING-WITH-HTML-INTERNAL", 1, 1, false);
        declareFunction("generate_cycl_list", "GENERATE-CYCL-LIST", 1, 0, false);
        declareFunction("generate_rop_expression", "GENERATE-ROP-EXPRESSION", 1, 0, false);
        declareFunction("generate_genitive", "GENERATE-GENITIVE", 1, 0, false);
        declareFunction("pph_genitive_cycl", "PPH-GENITIVE-CYCL", 1, 1, false);
        declareFunction("pph_term_ok_for_genitive_paraphraseP", "PPH-TERM-OK-FOR-GENITIVE-PARAPHRASE?", 1, 0, false);
        declareFunction("pph_dont_use_instances_for_genitive_paraphrase", "PPH-DONT-USE-INSTANCES-FOR-GENITIVE-PARAPHRASE", 0, 0, false);
        declareFunction("clear_pph_possessive_preds", "CLEAR-PPH-POSSESSIVE-PREDS", 0, 0, false);
        declareFunction("remove_pph_possessive_preds", "REMOVE-PPH-POSSESSIVE-PREDS", 0, 0, false);
        declareFunction("pph_possessive_preds_internal", "PPH-POSSESSIVE-PREDS-INTERNAL", 0, 0, false);
        declareFunction("pph_possessive_preds", "PPH-POSSESSIVE-PREDS", 0, 0, false);
        declareFunction("pph_find_possessive_sentence_internal", "PPH-FIND-POSSESSIVE-SENTENCE-INTERNAL", 1, 1, false);
        declareFunction("pph_find_possessive_sentence", "PPH-FIND-POSSESSIVE-SENTENCE", 1, 1, false);
        declareFunction("pph_find_possessor", "PPH-FIND-POSSESSOR", 1, 0, false);
        declareFunction("pph_find_possessive_support", "PPH-FIND-POSSESSIVE-SUPPORT", 3, 0, false);
        declareFunction("pph_find_possessed_type", "PPH-FIND-POSSESSED-TYPE", 1, 0, false);
        declareFunction("prefer_unlexified_formP", "PREFER-UNLEXIFIED-FORM?", 1, 0, false);
        declareFunction("prefer_unlexified_form_method", "PREFER-UNLEXIFIED-FORM-METHOD", 1, 1, false);
        declareFunction("use_as_is_method", "USE-AS-IS-METHOD", 1, 1, false);
        declareFunction("coerce_name_method", "COERCE-NAME-METHOD", 1, 1, false);
        declareFunction("coerced_definite_description_method", "COERCED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false);
        declareFunction("unlexified_term_method", "UNLEXIFIED-TERM-METHOD", 1, 1, false);
        declareFunction("pph_gender_p_internal", "PPH-GENDER-P-INTERNAL", 1, 1, false);
        declareFunction("pph_gender_p", "PPH-GENDER-P", 1, 1, false);
        declareFunction("pph_gender", "PPH-GENDER", 1, 0, false);
        declareFunction("pph_number", "PPH-NUMBER", 1, 0, false);
        declareFunction("pph_same_genderP", "PPH-SAME-GENDER?", 2, 0, false);
        declareFunction("pph_same_numberP", "PPH-SAME-NUMBER?", 2, 0, false);
        declareFunction("pph_same_gender_and_numberP", "PPH-SAME-GENDER-AND-NUMBER?", 2, 0, false);
        declareFunction("pph_unify_gender", "PPH-UNIFY-GENDER", 2, 0, false);
        declareFunction("pph_unify_number", "PPH-UNIFY-NUMBER", 2, 0, false);
        declareFunction("pph_unify_person", "PPH-UNIFY-PERSON", 2, 0, false);
        declareFunction("pph_gender_of_var", "PPH-GENDER-OF-VAR", 1, 0, false);
        declareFunction("pph_gender_of_var_type", "PPH-GENDER-OF-VAR-TYPE", 2, 0, false);
        declareFunction("pph_language_of_mt", "PPH-LANGUAGE-OF-MT", 1, 0, false);
        declareFunction("pph_english_lexical_mtP", "PPH-ENGLISH-LEXICAL-MT?", 1, 0, false);
        declareFunction("pph_non_english_lexical_mtP", "PPH-NON-ENGLISH-LEXICAL-MT?", 1, 0, false);
        declareFunction("pph_default_grammatical_gender", "PPH-DEFAULT-GRAMMATICAL-GENDER", 0, 0, false);
        declareFunction("pph_default_grammatical_gender_for_language_internal", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE-INTERNAL", 1, 1, false);
        declareFunction("pph_default_grammatical_gender_for_language", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE", 1, 1, false);
        declareFunction("pph_number_of_var", "PPH-NUMBER-OF-VAR", 1, 0, false);
        declareFunction("pph_number_of_term", "PPH-NUMBER-OF-TERM", 1, 0, false);
        declareFunction("pph_number_from_cycl", "PPH-NUMBER-FROM-CYCL", 1, 0, false);
        declareFunction("pph_gender_of_term", "PPH-GENDER-OF-TERM", 1, 1, false);
        declareFunction("pph_person", "PPH-PERSON", 1, 0, false);
        declareFunction("pph_default_person", "PPH-DEFAULT-PERSON", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_pph_methods_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("funcall_pph_method", "FUNCALL-PPH-METHOD", 2, 0, false);
            declareFunction("generate_skolem_term_with_name", "GENERATE-SKOLEM-TERM-WITH-NAME", 1, 0, false);
            declareFunction("clear_generate_skolem_name", "CLEAR-GENERATE-SKOLEM-NAME", 0, 0, false);
            declareFunction("remove_generate_skolem_name", "REMOVE-GENERATE-SKOLEM-NAME", 1, 0, false);
            declareFunction("generate_skolem_name_internal", "GENERATE-SKOLEM-NAME-INTERNAL", 1, 0, false);
            declareFunction("generate_skolem_name", "GENERATE-SKOLEM-NAME", 1, 0, false);
            declareFunction("pph_capitalize_smart", "PPH-CAPITALIZE-SMART", 1, 0, false);
            declareFunction("generate_skolem_term_existentially", "GENERATE-SKOLEM-TERM-EXISTENTIALLY", 1, 0, false);
            declareFunction("generate_skolem_term_existentially_int", "GENERATE-SKOLEM-TERM-EXISTENTIALLY-INT", 1, 0, false);
            declareFunction("pph_skolem_nat_find_type", "PPH-SKOLEM-NAT-FIND-TYPE", 1, 0, false);
            declareFunction("pph_min_isa", "PPH-MIN-ISA", 1, 1, false);
            declareFunction("arg_type_is_collection_p", "ARG-TYPE-IS-COLLECTION-P", 2, 0, false);
            declareFunction("generate_hypothetical", "GENERATE-HYPOTHETICAL", 1, 0, false);
            declareFunction("generate_cycl_variable", "GENERATE-CYCL-VARIABLE", 1, 0, false);
            declareFunction("pph_phrase_set_var_arg_position", "PPH-PHRASE-SET-VAR-ARG-POSITION", 2, 1, false);
            declareFunction("pph_phrase_set_var_type_arg_positions", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITIONS", 3, 0, false);
            declareFunction("pph_phrase_set_var_type_arg_position", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITION", 3, 0, false);
            declareFunction("pph_phrase_set_arg_position_for_cycl", "PPH-PHRASE-SET-ARG-POSITION-FOR-CYCL", 3, 0, false);
            declareFunction("pph_var_ok_for_lexifyingP", "PPH-VAR-OK-FOR-LEXIFYING?", 1, 1, false);
            declareFunction("pph_paraphrase_var_as_var", "PPH-PARAPHRASE-VAR-AS-VAR", 1, 2, false);
            declareFunction("pph_instance_of_item", "PPH-INSTANCE-OF-ITEM", 1, 0, false);
            declareFunction("pph_maybe_italicize_variable_phrase", "PPH-MAYBE-ITALICIZE-VARIABLE-PHRASE", 1, 0, false);
            declareFunction("pph_italicize_variablesP", "PPH-ITALICIZE-VARIABLES?", 0, 0, false);
            declareFunction("pph_var_phrase_prefix_items", "PPH-VAR-PHRASE-PREFIX-ITEMS", 1, 1, false);
            declareFunction("var_functional_in_matrix_sentenceP", "VAR-FUNCTIONAL-IN-MATRIX-SENTENCE?", 1, 0, false);
            declareFunction("pph_paraphrase_var_with_type", "PPH-PARAPHRASE-VAR-WITH-TYPE", 1, 0, false);
            declareFunction("pph_lexify_var", "PPH-LEXIFY-VAR", 3, 3, false);
            declareFunction("pph_use_other_for_varP", "PPH-USE-OTHER-FOR-VAR?", 1, 0, false);
            declareFunction("pph_var_type_for_lexification", "PPH-VAR-TYPE-FOR-LEXIFICATION", 1, 1, false);
            declareFunction("pph_var_type_for_lexification_internal", "PPH-VAR-TYPE-FOR-LEXIFICATION-INTERNAL", 3, 0, false);
            declareFunction("pph_highly_faceted_typeP", "PPH-HIGHLY-FACETED-TYPE?", 1, 0, false);
            declareFunction("pph_var_arg_position_map", "PPH-VAR-ARG-POSITION-MAP", 1, 0, false);
            declareFunction("determiner_type_for_var_phrase", "DETERMINER-TYPE-FOR-VAR-PHRASE", 1, 0, false);
            declareFunction("pph_var_phrase_var_bound_by_universal_introductionP", "PPH-VAR-PHRASE-VAR-BOUND-BY-UNIVERSAL-INTRODUCTION?", 1, 0, false);
            declareFunction("pph_var_phrase_in_if_clauseP", "PPH-VAR-PHRASE-IN-IF-CLAUSE?", 1, 0, false);
            declareFunction("pph_npi_licensor", "PPH-NPI-LICENSOR", 1, 0, false);
            declareFunction("pph_npi_licensor_int", "PPH-NPI-LICENSOR-INT", 3, 0, false);
            declareFunction("pph_downward_entailing_operator_p", "PPH-DOWNWARD-ENTAILING-OPERATOR-P", 1, 0, false);
            declareFunction("pph_operator_downward_entailing_in_which_arg", "PPH-OPERATOR-DOWNWARD-ENTAILING-IN-WHICH-ARG", 1, 0, false);
            declareFunction("pph_phrase_maybe_add_disambiguation", "PPH-PHRASE-MAYBE-ADD-DISAMBIGUATION", 3, 0, false);
            declareFunction("pph_phrase_maybe_add_other", "PPH-PHRASE-MAYBE-ADD-OTHER", 2, 0, false);
            declareFunction("different_instance_same_typeP", "DIFFERENT-INSTANCE-SAME-TYPE?", 1, 0, false);
            declareFunction("pph_phrase_add_other", "PPH-PHRASE-ADD-OTHER", 1, 0, false);
            declareFunction("pph_phrase_add_english_other", "PPH-PHRASE-ADD-ENGLISH-OTHER", 1, 0, false);
            declareFunction("split_english_determiner_off", "SPLIT-ENGLISH-DETERMINER-OFF", 1, 0, false);
            declareFunction("pph_add_english_other_to_olists", "PPH-ADD-ENGLISH-OTHER-TO-OLISTS", 2, 0, false);
            declareFunction("pph_phrase_maybe_explicitify_var_phrase", "PPH-PHRASE-MAYBE-EXPLICITIFY-VAR-PHRASE", 3, 0, false);
            declareFunction("pph_phrase_explicitify_var_phrase", "PPH-PHRASE-EXPLICITIFY-VAR-PHRASE", 3, 0, false);
            declareFunction("generate_keyword", "GENERATE-KEYWORD", 1, 0, false);
            declareFunction("generate_cycl_symbol", "GENERATE-CYCL-SYMBOL", 1, 0, false);
            declareFunction("generate_non_cycl_symbol", "GENERATE-NON-CYCL-SYMBOL", 1, 0, false);
            declareFunction("generate_constant_default", "GENERATE-CONSTANT-DEFAULT", 1, 0, false);
            declareFunction("generate_lexical_word", "GENERATE-LEXICAL-WORD", 1, 0, false);
            declareFunction("generate_chemical_substance_type", "GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false);
            declareFunction("do_generate_chemical_substance_type", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false);
            declareFunction("generate_chemical_substance_type_from_formula_string", "GENERATE-CHEMICAL-SUBSTANCE-TYPE-FROM-FORMULA-STRING", 2, 0, false);
            declareFunction("pph_chemical_formula_html_output_items", "PPH-CHEMICAL-FORMULA-HTML-OUTPUT-ITEMS", 1, 0, false);
            declareFunction("do_generate_chemical_substance_type_semantic", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE-SEMANTIC", 1, 0, false);
            declareFunction("pph_chemical_composition", "PPH-CHEMICAL-COMPOSITION", 1, 0, false);
            declareFunction("pph_electrical_charge_of_substance_type", "PPH-ELECTRICAL-CHARGE-OF-SUBSTANCE-TYPE", 1, 0, false);
            declareFunction("pph_molecule_types", "PPH-MOLECULE-TYPES", 1, 0, false);
            declareFunction("select_string_method_count", "SELECT-STRING-METHOD-COUNT", 1, 0, false);
            declareFunction("select_string_method", "SELECT-STRING-METHOD", 1, 1, false);
            declareFunction("equal_pph_nl_predsP", "EQUAL-PPH-NL-PREDS?", 2, 0, false);
            declareFunction("omit_pph_select_string_method_p", "OMIT-PPH-SELECT-STRING-METHOD-P", 1, 0, false);
            declareFunction("pph_update_phrase_with_method_result", "PPH-UPDATE-PHRASE-WITH-METHOD-RESULT", 9, 0, false);
            declareFunction("pph_demerit_cutoff_for_quality", "PPH-DEMERIT-CUTOFF-FOR-QUALITY", 1, 0, false);
            declareFunction("pph_try_method", "PPH-TRY-METHOD", 5, 0, false);
            declareFunction("pph_process_method_result", "PPH-PROCESS-METHOD-RESULT", 6, 0, false);
            declareFunction("pph_category_for_disambiguation", "PPH-CATEGORY-FOR-DISAMBIGUATION", 2, 0, false);
            declareFunction("pph_filter_method_results", "PPH-FILTER-METHOD-RESULTS", 4, 0, false);
            declareFunction("pph_revised_nl_preds_for_phrase", "PPH-REVISED-NL-PREDS-FOR-PHRASE", 1, 1, false);
            declareFunction("pph_pred_ok_for_qualityP", "PPH-PRED-OK-FOR-QUALITY?", 4, 0, false);
            declareFunction("pph_genl_lexicon_predicateP", "PPH-GENL-LEXICON-PREDICATE?", 2, 0, false);
            declareFunction("select_string_for_term_internal", "SELECT-STRING-FOR-TERM-INTERNAL", 1, 4, false);
            declareFunction("select_string_for_term", "SELECT-STRING-FOR-TERM", 1, 4, false);
            declareFunction("clear_pph_name_string_preds", "CLEAR-PPH-NAME-STRING-PREDS", 0, 0, false);
            declareFunction("remove_pph_name_string_preds", "REMOVE-PPH-NAME-STRING-PREDS", 0, 1, false);
            declareFunction("pph_name_string_preds_internal", "PPH-NAME-STRING-PREDS-INTERNAL", 1, 0, false);
            declareFunction("pph_name_string_preds", "PPH-NAME-STRING-PREDS", 0, 1, false);
            declareFunction("clear_pph_term_string_preds", "CLEAR-PPH-TERM-STRING-PREDS", 0, 0, false);
            declareFunction("remove_pph_term_string_preds", "REMOVE-PPH-TERM-STRING-PREDS", 0, 1, false);
            declareFunction("pph_term_string_preds_internal", "PPH-TERM-STRING-PREDS-INTERNAL", 1, 0, false);
            declareFunction("pph_term_string_preds", "PPH-TERM-STRING-PREDS", 0, 1, false);
            declareFunction("name_string_method", "NAME-STRING-METHOD", 1, 1, false);
            declareFunction("name_string_method_int", "NAME-STRING-METHOD-INT", 3, 1, false);
            declareFunction("pph_name_string_preds_from_nl_pred_specification", "PPH-NAME-STRING-PREDS-FROM-NL-PRED-SPECIFICATION", 1, 0, false);
            declareFunction("pph_name_ok_for_preds_and_cyclP", "PPH-NAME-OK-FOR-PREDS-AND-CYCL?", 4, 0, false);
            declareFunction("pph_name_string_preds_from_nl_preds", "PPH-NAME-STRING-PREDS-FROM-NL-PREDS", 1, 0, false);
            declareFunction("pph_standard_name_string_predP", "PPH-STANDARD-NAME-STRING-PRED?", 1, 0, false);
            declareFunction("clear_pph_enhanced_domain_mt", "CLEAR-PPH-ENHANCED-DOMAIN-MT", 0, 0, false);
            declareFunction("remove_pph_enhanced_domain_mt", "REMOVE-PPH-ENHANCED-DOMAIN-MT", 0, 2, false);
            declareFunction("pph_enhanced_domain_mt_internal", "PPH-ENHANCED-DOMAIN-MT-INTERNAL", 2, 0, false);
            declareFunction("pph_enhanced_domain_mt", "PPH-ENHANCED-DOMAIN-MT", 0, 2, false);
            declareFunction("pph_broaden_language_mt", "PPH-BROADEN-LANGUAGE-MT", 0, 0, false);
            declareFunction("pph_dispreferred_assertionP", "PPH-DISPREFERRED-ASSERTION?", 1, 0, false);
            declareFunction("pph_do_name_string_method", "PPH-DO-NAME-STRING-METHOD", 2, 1, false);
            declareFunction("name_string_gaf_strings_internal", "NAME-STRING-GAF-STRINGS-INTERNAL", 1, 0, false);
            declareFunction("name_string_gaf_strings", "NAME-STRING-GAF-STRINGS", 1, 0, false);
            declareFunction("pph_no_abbreviation_predsP", "PPH-NO-ABBREVIATION-PREDS?", 1, 0, false);
            declareFunction("pph_non_abbreviation_name_predP", "PPH-NON-ABBREVIATION-NAME-PRED?", 1, 0, false);
            declareFunction("clear_pph_methods_caches", "CLEAR-PPH-METHODS-CACHES", 0, 0, false);
            declareFunction("pph_abbreviation_predP", "PPH-ABBREVIATION-PRED?", 1, 1, false);
            declareFunction("clear_pph_abbreviation_preds", "CLEAR-PPH-ABBREVIATION-PREDS", 0, 0, false);
            declareFunction("remove_pph_abbreviation_preds", "REMOVE-PPH-ABBREVIATION-PREDS", 0, 1, false);
            declareFunction("pph_abbreviation_preds_internal", "PPH-ABBREVIATION-PREDS-INTERNAL", 1, 0, false);
            declareFunction("pph_abbreviation_preds", "PPH-ABBREVIATION-PREDS", 0, 1, false);
            declareFunction("any_name_string_method", "ANY-NAME-STRING-METHOD", 1, 1, false);
            declareFunction("name_string_method_non_acronym", "NAME-STRING-METHOD-NON-ACRONYM", 1, 1, false);
            declareFunction("smart_decapitalize", "SMART-DECAPITALIZE", 2, 0, false);
            declareFunction("pph_starts_with_determinerP", "PPH-STARTS-WITH-DETERMINER?", 1, 0, false);
            declareFunction("assume_det_is_part_of_nameP", "ASSUME-DET-IS-PART-OF-NAME?", 1, 0, false);
            declareFunction("pph_sort_name_string_preds", "PPH-SORT-NAME-STRING-PREDS", 1, 0, false);
            declareFunction("pph_prefer_name_string_predP", "PPH-PREFER-NAME-STRING-PRED?", 2, 0, false);
            declareFunction("nl_generation_cache_method", "NL-GENERATION-CACHE-METHOD", 1, 1, false);
            new pph_methods.$nl_generation_cache_method$UnaryFunction();
            new pph_methods.$nl_generation_cache_method$BinaryFunction();
            declareFunction("term_string_method", "TERM-STRING-METHOD", 1, 1, false);
            declareFunction("chemical_formula_method", "CHEMICAL-FORMULA-METHOD", 1, 1, false);
            declareFunction("scientific_name_method", "SCIENTIFIC-NAME-METHOD", 1, 1, false);
            declareFunction("pretty_string_method", "PRETTY-STRING-METHOD", 1, 1, false);
            declareFunction("genitive_paraphrase_method", "GENITIVE-PARAPHRASE-METHOD", 1, 1, false);
            declareFunction("generate_nart_lexified_tight", "GENERATE-NART-LEXIFIED-TIGHT", 1, 0, false);
            declareFunction("generate_nart_lexified_imprecise", "GENERATE-NART-LEXIFIED-IMPRECISE", 1, 0, false);
            declareFunction("pph_nart_methods_to_omit_for_precision", "PPH-NART-METHODS-TO-OMIT-FOR-PRECISION", 1, 0, false);
            declareFunction("generate_nart_lexified", "GENERATE-NART-LEXIFIED", 2, 0, false);
            declareFunction("generate_nart_as_naut", "GENERATE-NART-AS-NAUT", 1, 0, false);
            declareFunction("maybe_adjust_nart_paraphrase_demerits", "MAYBE-ADJUST-NART-PARAPHRASE-DEMERITS", 1, 0, false);
            declareFunction("ok_gen_template_assertion_for_relnP_internal", "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?-INTERNAL", 2, 1, false);
            declareFunction("ok_gen_template_assertion_for_relnP", "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?", 2, 1, false);
            declareFunction("generate_universal_date", "GENERATE-UNIVERSAL-DATE", 1, 0, false);
            declareFunction("generate_universal_date_numbers", "GENERATE-UNIVERSAL-DATE-NUMBERS", 1, 0, false);
            declareFunction("generate_universal_second", "GENERATE-UNIVERSAL-SECOND", 1, 1, false);
            declareFunction("generate_float", "GENERATE-FLOAT", 1, 0, false);
            declareFunction("generate_float_items", "GENERATE-FLOAT-ITEMS", 3, 0, false);
            declareFunction("pph_float_string", "PPH-FLOAT-STRING", 1, 1, false);
            declareFunction("pph_standardize_float_string", "PPH-STANDARDIZE-FLOAT-STRING", 1, 1, false);
            declareFunction("generate_integer_wXcommas", "GENERATE-INTEGER-W/COMMAS", 1, 0, false);
            declareFunction("generate_integer_as_word", "GENERATE-INTEGER-AS-WORD", 1, 0, false);
            declareFunction("generate_number_default", "GENERATE-NUMBER-DEFAULT", 1, 0, false);
            declareFunction("pph_ordinal_phrase_p", "PPH-ORDINAL-PHRASE-P", 1, 0, false);
            declareFunction("get_image_url_as_string", "GET-IMAGE-URL-AS-STRING", 1, 0, false);
            declareFunction("generate_image_url", "GENERATE-IMAGE-URL", 1, 0, false);
            declareFunction("generate_princ", "GENERATE-PRINC", 1, 0, false);
            declareFunction("do_generate_princ", "DO-GENERATE-PRINC", 1, 0, false);
            declareFunction("pph_default_mt_time_index", "PPH-DEFAULT-MT-TIME-INDEX", 0, 0, false);
            declareFunction("generate_assertion", "GENERATE-ASSERTION", 1, 0, false);
            declareFunction("pph_find_arg_starting_before", "PPH-FIND-ARG-STARTING-BEFORE", 3, 0, false);
            declareFunction("pph_find_arg_ending_after", "PPH-FIND-ARG-ENDING-AFTER", 3, 0, false);
            declareFunction("pph_time_interval_for_assertion", "PPH-TIME-INTERVAL-FOR-ASSERTION", 1, 0, false);
            declareFunction("pph_ignore_temporal_qualification_for_assertionP", "PPH-IGNORE-TEMPORAL-QUALIFICATION-FOR-ASSERTION?", 2, 0, false);
            declareFunction("pph_irrelevant_date_wrt_assertion_contentP", "PPH-IRRELEVANT-DATE-WRT-ASSERTION-CONTENT?", 2, 0, false);
            declareFunction("pph_indexed_nautP", "PPH-INDEXED-NAUT?", 1, 0, false);
            declareFunction("pph_support_creation_dates_internal", "PPH-SUPPORT-CREATION-DATES-INTERNAL", 1, 0, false);
            declareFunction("pph_support_creation_dates", "PPH-SUPPORT-CREATION-DATES", 1, 0, false);
            declareFunction("pph_support_creation_dates_recursive", "PPH-SUPPORT-CREATION-DATES-RECURSIVE", 2, 0, false);
            declareFunction("pph_mt_time_index", "PPH-MT-TIME-INDEX", 1, 0, false);
            declareFunction("pph_monad_mt_time_precision_suspect_p", "PPH-MONAD-MT-TIME-PRECISION-SUSPECT-P", 1, 0, false);
            declareFunction("pph_adjust_mt_time_index_granularity", "PPH-ADJUST-MT-TIME-INDEX-GRANULARITY", 1, 0, false);
            declareFunction("pph_adjust_mt_date_granularity_internal", "PPH-ADJUST-MT-DATE-GRANULARITY-INTERNAL", 2, 0, false);
            declareFunction("pph_adjust_mt_date_granularity", "PPH-ADJUST-MT-DATE-GRANULARITY", 2, 0, false);
            declareFunction("pph_assertion_has_glossP", "PPH-ASSERTION-HAS-GLOSS?", 1, 0, false);
            declareFunction("pph_gloss_for_assertion", "PPH-GLOSS-FOR-ASSERTION", 2, 0, false);
            declareFunction("pph_output_list_to_assertion_output_list", "PPH-OUTPUT-LIST-TO-ASSERTION-OUTPUT-LIST", 1, 0, false);
            declareFunction("pph_output_list_from_assertion_output_list", "PPH-OUTPUT-LIST-FROM-ASSERTION-OUTPUT-LIST", 2, 0, false);
            declareFunction("assertion_output_list_info_p", "ASSERTION-OUTPUT-LIST-INFO-P", 1, 0, false);
            declareFunction("generate_string", "GENERATE-STRING", 1, 0, false);
            declareFunction("generate_cycl_string_with_html", "GENERATE-CYCL-STRING-WITH-HTML", 1, 0, false);
            declareFunction("generate_cycl_string_with_html_internal", "GENERATE-CYCL-STRING-WITH-HTML-INTERNAL", 1, 1, false);
            declareFunction("generate_cycl_list", "GENERATE-CYCL-LIST", 1, 0, false);
            declareFunction("generate_rop_expression", "GENERATE-ROP-EXPRESSION", 1, 0, false);
            declareFunction("generate_genitive", "GENERATE-GENITIVE", 1, 0, false);
            declareFunction("pph_genitive_cycl", "PPH-GENITIVE-CYCL", 1, 1, false);
            declareFunction("pph_term_ok_for_genitive_paraphraseP", "PPH-TERM-OK-FOR-GENITIVE-PARAPHRASE?", 1, 0, false);
            declareFunction("pph_dont_use_instances_for_genitive_paraphrase", "PPH-DONT-USE-INSTANCES-FOR-GENITIVE-PARAPHRASE", 0, 0, false);
            declareFunction("clear_pph_possessive_preds", "CLEAR-PPH-POSSESSIVE-PREDS", 0, 0, false);
            declareFunction("remove_pph_possessive_preds", "REMOVE-PPH-POSSESSIVE-PREDS", 0, 0, false);
            declareFunction("pph_possessive_preds_internal", "PPH-POSSESSIVE-PREDS-INTERNAL", 0, 0, false);
            declareFunction("pph_possessive_preds", "PPH-POSSESSIVE-PREDS", 0, 0, false);
            declareFunction("pph_find_possessive_sentence_internal", "PPH-FIND-POSSESSIVE-SENTENCE-INTERNAL", 1, 1, false);
            declareFunction("pph_find_possessive_sentence", "PPH-FIND-POSSESSIVE-SENTENCE", 1, 1, false);
            declareFunction("pph_find_possessor", "PPH-FIND-POSSESSOR", 1, 0, false);
            declareFunction("pph_find_possessive_support", "PPH-FIND-POSSESSIVE-SUPPORT", 3, 0, false);
            declareFunction("pph_find_possessed_type", "PPH-FIND-POSSESSED-TYPE", 1, 0, false);
            declareFunction("prefer_unlexified_formP", "PREFER-UNLEXIFIED-FORM?", 1, 0, false);
            declareFunction("prefer_unlexified_form_method", "PREFER-UNLEXIFIED-FORM-METHOD", 1, 1, false);
            declareFunction("use_as_is_method", "USE-AS-IS-METHOD", 1, 1, false);
            declareFunction("coerce_name_method", "COERCE-NAME-METHOD", 1, 1, false);
            declareFunction("licensed_definite_description_method", "LICENSED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false);
            declareFunction("licensed_definite_description_types_for_term", "LICENSED-DEFINITE-DESCRIPTION-TYPES-FOR-TERM", 2, 0, false);
            declareFunction("coerced_definite_description_method", "COERCED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false);
            declareFunction("generate_definite_description_item", "GENERATE-DEFINITE-DESCRIPTION-ITEM", 3, 0, false);
            declareFunction("unlexified_term_method", "UNLEXIFIED-TERM-METHOD", 1, 1, false);
            declareFunction("pph_gender_p_internal", "PPH-GENDER-P-INTERNAL", 1, 1, false);
            declareFunction("pph_gender_p", "PPH-GENDER-P", 1, 1, false);
            declareFunction("pph_gender", "PPH-GENDER", 1, 0, false);
            declareFunction("pph_number", "PPH-NUMBER", 1, 0, false);
            declareFunction("pph_same_genderP", "PPH-SAME-GENDER?", 2, 0, false);
            declareFunction("pph_same_numberP", "PPH-SAME-NUMBER?", 2, 0, false);
            declareFunction("pph_same_gender_and_numberP", "PPH-SAME-GENDER-AND-NUMBER?", 2, 0, false);
            declareFunction("pph_unify_gender", "PPH-UNIFY-GENDER", 2, 0, false);
            declareFunction("pph_unify_number", "PPH-UNIFY-NUMBER", 2, 0, false);
            declareFunction("pph_unify_person", "PPH-UNIFY-PERSON", 2, 0, false);
            declareFunction("pph_gender_of_var", "PPH-GENDER-OF-VAR", 1, 0, false);
            declareFunction("pph_gender_of_var_type", "PPH-GENDER-OF-VAR-TYPE", 2, 0, false);
            declareFunction("pph_language_of_mt", "PPH-LANGUAGE-OF-MT", 1, 0, false);
            declareFunction("pph_english_lexical_mtP", "PPH-ENGLISH-LEXICAL-MT?", 1, 0, false);
            declareFunction("pph_non_english_lexical_mtP", "PPH-NON-ENGLISH-LEXICAL-MT?", 1, 0, false);
            declareFunction("pph_default_grammatical_gender", "PPH-DEFAULT-GRAMMATICAL-GENDER", 0, 0, false);
            declareFunction("pph_default_grammatical_gender_for_language_internal", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE-INTERNAL", 1, 1, false);
            declareFunction("pph_default_grammatical_gender_for_language", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE", 1, 1, false);
            declareFunction("pph_number_of_var", "PPH-NUMBER-OF-VAR", 1, 0, false);
            declareFunction("pph_number_of_term", "PPH-NUMBER-OF-TERM", 1, 0, false);
            declareFunction("pph_number_from_cycl", "PPH-NUMBER-FROM-CYCL", 1, 0, false);
            declareFunction("pph_gender_of_term", "PPH-GENDER-OF-TERM", 1, 1, false);
            declareFunction("adjust_gender_for_top_level_cycl", "ADJUST-GENDER-FOR-TOP-LEVEL-CYCL", 3, 0, false);
            declareFunction("pph_person", "PPH-PERSON", 1, 0, false);
            declareFunction("pph_default_person", "PPH-DEFAULT-PERSON", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("generate_true", "GENERATE-TRUE", 1, 0, false);
            declareFunction("generate_false", "GENERATE-FALSE", 1, 0, false);
            declareFunction("pph_name_string_preds", "PPH-NAME-STRING-PREDS", 0, 0, false);
            declareFunction("pph_term_string_preds", "PPH-TERM-STRING-PREDS", 0, 0, false);
            declareFunction("name_string_method_int", "NAME-STRING-METHOD-INT", 3, 0, false);
            declareFunction("pph_do_name_string_method", "PPH-DO-NAME-STRING-METHOD", 2, 0, false);
            declareFunction("init_pph_name_string_preds", "INIT-PPH-NAME-STRING-PREDS", 0, 0, false);
            declareFunction("generate_nart_as_naut_tight", "GENERATE-NART-AS-NAUT-TIGHT", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_pph_methods_file_Previous() {
        declareFunction("funcall_pph_method", "FUNCALL-PPH-METHOD", 2, 0, false);
        declareFunction("generate_skolem_term_with_name", "GENERATE-SKOLEM-TERM-WITH-NAME", 1, 0, false);
        declareFunction("clear_generate_skolem_name", "CLEAR-GENERATE-SKOLEM-NAME", 0, 0, false);
        declareFunction("remove_generate_skolem_name", "REMOVE-GENERATE-SKOLEM-NAME", 1, 0, false);
        declareFunction("generate_skolem_name_internal", "GENERATE-SKOLEM-NAME-INTERNAL", 1, 0, false);
        declareFunction("generate_skolem_name", "GENERATE-SKOLEM-NAME", 1, 0, false);
        declareFunction("pph_capitalize_smart", "PPH-CAPITALIZE-SMART", 1, 0, false);
        declareFunction("generate_skolem_term_existentially", "GENERATE-SKOLEM-TERM-EXISTENTIALLY", 1, 0, false);
        declareFunction("generate_skolem_term_existentially_int", "GENERATE-SKOLEM-TERM-EXISTENTIALLY-INT", 1, 0, false);
        declareFunction("pph_skolem_nat_find_type", "PPH-SKOLEM-NAT-FIND-TYPE", 1, 0, false);
        declareFunction("pph_min_isa", "PPH-MIN-ISA", 1, 1, false);
        declareFunction("arg_type_is_collection_p", "ARG-TYPE-IS-COLLECTION-P", 2, 0, false);
        declareFunction("generate_hypothetical", "GENERATE-HYPOTHETICAL", 1, 0, false);
        declareFunction("generate_cycl_variable", "GENERATE-CYCL-VARIABLE", 1, 0, false);
        declareFunction("pph_phrase_set_var_arg_position", "PPH-PHRASE-SET-VAR-ARG-POSITION", 2, 1, false);
        declareFunction("pph_phrase_set_var_type_arg_positions", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITIONS", 3, 0, false);
        declareFunction("pph_phrase_set_var_type_arg_position", "PPH-PHRASE-SET-VAR-TYPE-ARG-POSITION", 3, 0, false);
        declareFunction("pph_phrase_set_arg_position_for_cycl", "PPH-PHRASE-SET-ARG-POSITION-FOR-CYCL", 3, 0, false);
        declareFunction("pph_var_ok_for_lexifyingP", "PPH-VAR-OK-FOR-LEXIFYING?", 1, 1, false);
        declareFunction("pph_paraphrase_var_as_var", "PPH-PARAPHRASE-VAR-AS-VAR", 1, 2, false);
        declareFunction("pph_instance_of_item", "PPH-INSTANCE-OF-ITEM", 1, 0, false);
        declareFunction("pph_maybe_italicize_variable_phrase", "PPH-MAYBE-ITALICIZE-VARIABLE-PHRASE", 1, 0, false);
        declareFunction("pph_italicize_variablesP", "PPH-ITALICIZE-VARIABLES?", 0, 0, false);
        declareFunction("pph_var_phrase_prefix_items", "PPH-VAR-PHRASE-PREFIX-ITEMS", 1, 1, false);
        declareFunction("var_functional_in_matrix_sentenceP", "VAR-FUNCTIONAL-IN-MATRIX-SENTENCE?", 1, 0, false);
        declareFunction("pph_paraphrase_var_with_type", "PPH-PARAPHRASE-VAR-WITH-TYPE", 1, 0, false);
        declareFunction("pph_lexify_var", "PPH-LEXIFY-VAR", 3, 3, false);
        declareFunction("pph_use_other_for_varP", "PPH-USE-OTHER-FOR-VAR?", 1, 0, false);
        declareFunction("pph_var_type_for_lexification", "PPH-VAR-TYPE-FOR-LEXIFICATION", 1, 1, false);
        declareFunction("pph_var_type_for_lexification_internal", "PPH-VAR-TYPE-FOR-LEXIFICATION-INTERNAL", 3, 0, false);
        declareFunction("pph_highly_faceted_typeP", "PPH-HIGHLY-FACETED-TYPE?", 1, 0, false);
        declareFunction("pph_var_arg_position_map", "PPH-VAR-ARG-POSITION-MAP", 1, 0, false);
        declareFunction("determiner_type_for_var_phrase", "DETERMINER-TYPE-FOR-VAR-PHRASE", 1, 0, false);
        declareFunction("pph_var_phrase_var_bound_by_universal_introductionP", "PPH-VAR-PHRASE-VAR-BOUND-BY-UNIVERSAL-INTRODUCTION?", 1, 0, false);
        declareFunction("pph_var_phrase_in_if_clauseP", "PPH-VAR-PHRASE-IN-IF-CLAUSE?", 1, 0, false);
        declareFunction("pph_npi_licensor", "PPH-NPI-LICENSOR", 1, 0, false);
        declareFunction("pph_npi_licensor_int", "PPH-NPI-LICENSOR-INT", 3, 0, false);
        declareFunction("pph_downward_entailing_operator_p", "PPH-DOWNWARD-ENTAILING-OPERATOR-P", 1, 0, false);
        declareFunction("pph_operator_downward_entailing_in_which_arg", "PPH-OPERATOR-DOWNWARD-ENTAILING-IN-WHICH-ARG", 1, 0, false);
        declareFunction("pph_phrase_maybe_add_disambiguation", "PPH-PHRASE-MAYBE-ADD-DISAMBIGUATION", 3, 0, false);
        declareFunction("pph_phrase_maybe_add_other", "PPH-PHRASE-MAYBE-ADD-OTHER", 2, 0, false);
        declareFunction("different_instance_same_typeP", "DIFFERENT-INSTANCE-SAME-TYPE?", 1, 0, false);
        declareFunction("pph_phrase_add_other", "PPH-PHRASE-ADD-OTHER", 1, 0, false);
        declareFunction("pph_phrase_add_english_other", "PPH-PHRASE-ADD-ENGLISH-OTHER", 1, 0, false);
        declareFunction("split_english_determiner_off", "SPLIT-ENGLISH-DETERMINER-OFF", 1, 0, false);
        declareFunction("pph_add_english_other_to_olists", "PPH-ADD-ENGLISH-OTHER-TO-OLISTS", 2, 0, false);
        declareFunction("pph_phrase_maybe_explicitify_var_phrase", "PPH-PHRASE-MAYBE-EXPLICITIFY-VAR-PHRASE", 3, 0, false);
        declareFunction("pph_phrase_explicitify_var_phrase", "PPH-PHRASE-EXPLICITIFY-VAR-PHRASE", 3, 0, false);
        declareFunction("generate_keyword", "GENERATE-KEYWORD", 1, 0, false);
        declareFunction("generate_cycl_symbol", "GENERATE-CYCL-SYMBOL", 1, 0, false);
        declareFunction("generate_non_cycl_symbol", "GENERATE-NON-CYCL-SYMBOL", 1, 0, false);
        declareFunction("generate_constant_default", "GENERATE-CONSTANT-DEFAULT", 1, 0, false);
        declareFunction("generate_lexical_word", "GENERATE-LEXICAL-WORD", 1, 0, false);
        declareFunction("generate_chemical_substance_type", "GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("do_generate_chemical_substance_type", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("generate_chemical_substance_type_from_formula_string", "GENERATE-CHEMICAL-SUBSTANCE-TYPE-FROM-FORMULA-STRING", 2, 0, false);
        declareFunction("pph_chemical_formula_html_output_items", "PPH-CHEMICAL-FORMULA-HTML-OUTPUT-ITEMS", 1, 0, false);
        declareFunction("do_generate_chemical_substance_type_semantic", "DO-GENERATE-CHEMICAL-SUBSTANCE-TYPE-SEMANTIC", 1, 0, false);
        declareFunction("pph_chemical_composition", "PPH-CHEMICAL-COMPOSITION", 1, 0, false);
        declareFunction("pph_electrical_charge_of_substance_type", "PPH-ELECTRICAL-CHARGE-OF-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("pph_molecule_types", "PPH-MOLECULE-TYPES", 1, 0, false);
        declareFunction("select_string_method_count", "SELECT-STRING-METHOD-COUNT", 1, 0, false);
        declareFunction("select_string_method", "SELECT-STRING-METHOD", 1, 1, false);
        declareFunction("equal_pph_nl_predsP", "EQUAL-PPH-NL-PREDS?", 2, 0, false);
        declareFunction("omit_pph_select_string_method_p", "OMIT-PPH-SELECT-STRING-METHOD-P", 1, 0, false);
        declareFunction("pph_update_phrase_with_method_result", "PPH-UPDATE-PHRASE-WITH-METHOD-RESULT", 9, 0, false);
        declareFunction("pph_demerit_cutoff_for_quality", "PPH-DEMERIT-CUTOFF-FOR-QUALITY", 1, 0, false);
        declareFunction("pph_try_method", "PPH-TRY-METHOD", 5, 0, false);
        declareFunction("pph_process_method_result", "PPH-PROCESS-METHOD-RESULT", 6, 0, false);
        declareFunction("pph_category_for_disambiguation", "PPH-CATEGORY-FOR-DISAMBIGUATION", 2, 0, false);
        declareFunction("pph_filter_method_results", "PPH-FILTER-METHOD-RESULTS", 4, 0, false);
        declareFunction("pph_revised_nl_preds_for_phrase", "PPH-REVISED-NL-PREDS-FOR-PHRASE", 1, 1, false);
        declareFunction("pph_pred_ok_for_qualityP", "PPH-PRED-OK-FOR-QUALITY?", 4, 0, false);
        declareFunction("pph_genl_lexicon_predicateP", "PPH-GENL-LEXICON-PREDICATE?", 2, 0, false);
        declareFunction("select_string_for_term_internal", "SELECT-STRING-FOR-TERM-INTERNAL", 1, 4, false);
        declareFunction("select_string_for_term", "SELECT-STRING-FOR-TERM", 1, 4, false);
        declareFunction("clear_pph_name_string_preds", "CLEAR-PPH-NAME-STRING-PREDS", 0, 0, false);
        declareFunction("remove_pph_name_string_preds", "REMOVE-PPH-NAME-STRING-PREDS", 0, 1, false);
        declareFunction("pph_name_string_preds_internal", "PPH-NAME-STRING-PREDS-INTERNAL", 1, 0, false);
        declareFunction("pph_name_string_preds", "PPH-NAME-STRING-PREDS", 0, 1, false);
        declareFunction("clear_pph_term_string_preds", "CLEAR-PPH-TERM-STRING-PREDS", 0, 0, false);
        declareFunction("remove_pph_term_string_preds", "REMOVE-PPH-TERM-STRING-PREDS", 0, 1, false);
        declareFunction("pph_term_string_preds_internal", "PPH-TERM-STRING-PREDS-INTERNAL", 1, 0, false);
        declareFunction("pph_term_string_preds", "PPH-TERM-STRING-PREDS", 0, 1, false);
        declareFunction("name_string_method", "NAME-STRING-METHOD", 1, 1, false);
        declareFunction("name_string_method_int", "NAME-STRING-METHOD-INT", 3, 1, false);
        declareFunction("pph_name_string_preds_from_nl_pred_specification", "PPH-NAME-STRING-PREDS-FROM-NL-PRED-SPECIFICATION", 1, 0, false);
        declareFunction("pph_name_ok_for_preds_and_cyclP", "PPH-NAME-OK-FOR-PREDS-AND-CYCL?", 4, 0, false);
        declareFunction("pph_name_string_preds_from_nl_preds", "PPH-NAME-STRING-PREDS-FROM-NL-PREDS", 1, 0, false);
        declareFunction("pph_standard_name_string_predP", "PPH-STANDARD-NAME-STRING-PRED?", 1, 0, false);
        declareFunction("clear_pph_enhanced_domain_mt", "CLEAR-PPH-ENHANCED-DOMAIN-MT", 0, 0, false);
        declareFunction("remove_pph_enhanced_domain_mt", "REMOVE-PPH-ENHANCED-DOMAIN-MT", 0, 2, false);
        declareFunction("pph_enhanced_domain_mt_internal", "PPH-ENHANCED-DOMAIN-MT-INTERNAL", 2, 0, false);
        declareFunction("pph_enhanced_domain_mt", "PPH-ENHANCED-DOMAIN-MT", 0, 2, false);
        declareFunction("pph_broaden_language_mt", "PPH-BROADEN-LANGUAGE-MT", 0, 0, false);
        declareFunction("pph_dispreferred_assertionP", "PPH-DISPREFERRED-ASSERTION?", 1, 0, false);
        declareFunction("pph_do_name_string_method", "PPH-DO-NAME-STRING-METHOD", 2, 1, false);
        declareFunction("name_string_gaf_strings_internal", "NAME-STRING-GAF-STRINGS-INTERNAL", 1, 0, false);
        declareFunction("name_string_gaf_strings", "NAME-STRING-GAF-STRINGS", 1, 0, false);
        declareFunction("pph_no_abbreviation_predsP", "PPH-NO-ABBREVIATION-PREDS?", 1, 0, false);
        declareFunction("pph_non_abbreviation_name_predP", "PPH-NON-ABBREVIATION-NAME-PRED?", 1, 0, false);
        declareFunction("clear_pph_methods_caches", "CLEAR-PPH-METHODS-CACHES", 0, 0, false);
        declareFunction("pph_abbreviation_predP", "PPH-ABBREVIATION-PRED?", 1, 1, false);
        declareFunction("clear_pph_abbreviation_preds", "CLEAR-PPH-ABBREVIATION-PREDS", 0, 0, false);
        declareFunction("remove_pph_abbreviation_preds", "REMOVE-PPH-ABBREVIATION-PREDS", 0, 1, false);
        declareFunction("pph_abbreviation_preds_internal", "PPH-ABBREVIATION-PREDS-INTERNAL", 1, 0, false);
        declareFunction("pph_abbreviation_preds", "PPH-ABBREVIATION-PREDS", 0, 1, false);
        declareFunction("any_name_string_method", "ANY-NAME-STRING-METHOD", 1, 1, false);
        declareFunction("name_string_method_non_acronym", "NAME-STRING-METHOD-NON-ACRONYM", 1, 1, false);
        declareFunction("smart_decapitalize", "SMART-DECAPITALIZE", 2, 0, false);
        declareFunction("pph_starts_with_determinerP", "PPH-STARTS-WITH-DETERMINER?", 1, 0, false);
        declareFunction("assume_det_is_part_of_nameP", "ASSUME-DET-IS-PART-OF-NAME?", 1, 0, false);
        declareFunction("pph_sort_name_string_preds", "PPH-SORT-NAME-STRING-PREDS", 1, 0, false);
        declareFunction("pph_prefer_name_string_predP", "PPH-PREFER-NAME-STRING-PRED?", 2, 0, false);
        declareFunction("nl_generation_cache_method", "NL-GENERATION-CACHE-METHOD", 1, 1, false);
        new pph_methods.$nl_generation_cache_method$UnaryFunction();
        new pph_methods.$nl_generation_cache_method$BinaryFunction();
        declareFunction("term_string_method", "TERM-STRING-METHOD", 1, 1, false);
        declareFunction("chemical_formula_method", "CHEMICAL-FORMULA-METHOD", 1, 1, false);
        declareFunction("scientific_name_method", "SCIENTIFIC-NAME-METHOD", 1, 1, false);
        declareFunction("pretty_string_method", "PRETTY-STRING-METHOD", 1, 1, false);
        declareFunction("genitive_paraphrase_method", "GENITIVE-PARAPHRASE-METHOD", 1, 1, false);
        declareFunction("generate_nart_lexified_tight", "GENERATE-NART-LEXIFIED-TIGHT", 1, 0, false);
        declareFunction("generate_nart_lexified_imprecise", "GENERATE-NART-LEXIFIED-IMPRECISE", 1, 0, false);
        declareFunction("pph_nart_methods_to_omit_for_precision", "PPH-NART-METHODS-TO-OMIT-FOR-PRECISION", 1, 0, false);
        declareFunction("generate_nart_lexified", "GENERATE-NART-LEXIFIED", 2, 0, false);
        declareFunction("generate_nart_as_naut", "GENERATE-NART-AS-NAUT", 1, 0, false);
        declareFunction("maybe_adjust_nart_paraphrase_demerits", "MAYBE-ADJUST-NART-PARAPHRASE-DEMERITS", 1, 0, false);
        declareFunction("ok_gen_template_assertion_for_relnP_internal", "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?-INTERNAL", 2, 1, false);
        declareFunction("ok_gen_template_assertion_for_relnP", "OK-GEN-TEMPLATE-ASSERTION-FOR-RELN?", 2, 1, false);
        declareFunction("generate_universal_date", "GENERATE-UNIVERSAL-DATE", 1, 0, false);
        declareFunction("generate_universal_date_numbers", "GENERATE-UNIVERSAL-DATE-NUMBERS", 1, 0, false);
        declareFunction("generate_universal_second", "GENERATE-UNIVERSAL-SECOND", 1, 1, false);
        declareFunction("generate_float", "GENERATE-FLOAT", 1, 0, false);
        declareFunction("generate_float_items", "GENERATE-FLOAT-ITEMS", 3, 0, false);
        declareFunction("pph_float_string", "PPH-FLOAT-STRING", 1, 1, false);
        declareFunction("pph_standardize_float_string", "PPH-STANDARDIZE-FLOAT-STRING", 1, 1, false);
        declareFunction("generate_integer_wXcommas", "GENERATE-INTEGER-W/COMMAS", 1, 0, false);
        declareFunction("generate_integer_as_word", "GENERATE-INTEGER-AS-WORD", 1, 0, false);
        declareFunction("generate_number_default", "GENERATE-NUMBER-DEFAULT", 1, 0, false);
        declareFunction("pph_ordinal_phrase_p", "PPH-ORDINAL-PHRASE-P", 1, 0, false);
        declareFunction("get_image_url_as_string", "GET-IMAGE-URL-AS-STRING", 1, 0, false);
        declareFunction("generate_image_url", "GENERATE-IMAGE-URL", 1, 0, false);
        declareFunction("generate_princ", "GENERATE-PRINC", 1, 0, false);
        declareFunction("do_generate_princ", "DO-GENERATE-PRINC", 1, 0, false);
        declareFunction("pph_default_mt_time_index", "PPH-DEFAULT-MT-TIME-INDEX", 0, 0, false);
        declareFunction("generate_assertion", "GENERATE-ASSERTION", 1, 0, false);
        declareFunction("pph_find_arg_starting_before", "PPH-FIND-ARG-STARTING-BEFORE", 3, 0, false);
        declareFunction("pph_find_arg_ending_after", "PPH-FIND-ARG-ENDING-AFTER", 3, 0, false);
        declareFunction("pph_time_interval_for_assertion", "PPH-TIME-INTERVAL-FOR-ASSERTION", 1, 0, false);
        declareFunction("pph_ignore_temporal_qualification_for_assertionP", "PPH-IGNORE-TEMPORAL-QUALIFICATION-FOR-ASSERTION?", 2, 0, false);
        declareFunction("pph_irrelevant_date_wrt_assertion_contentP", "PPH-IRRELEVANT-DATE-WRT-ASSERTION-CONTENT?", 2, 0, false);
        declareFunction("pph_indexed_nautP", "PPH-INDEXED-NAUT?", 1, 0, false);
        declareFunction("pph_support_creation_dates_internal", "PPH-SUPPORT-CREATION-DATES-INTERNAL", 1, 0, false);
        declareFunction("pph_support_creation_dates", "PPH-SUPPORT-CREATION-DATES", 1, 0, false);
        declareFunction("pph_support_creation_dates_recursive", "PPH-SUPPORT-CREATION-DATES-RECURSIVE", 2, 0, false);
        declareFunction("pph_mt_time_index", "PPH-MT-TIME-INDEX", 1, 0, false);
        declareFunction("pph_monad_mt_time_precision_suspect_p", "PPH-MONAD-MT-TIME-PRECISION-SUSPECT-P", 1, 0, false);
        declareFunction("pph_adjust_mt_time_index_granularity", "PPH-ADJUST-MT-TIME-INDEX-GRANULARITY", 1, 0, false);
        declareFunction("pph_adjust_mt_date_granularity_internal", "PPH-ADJUST-MT-DATE-GRANULARITY-INTERNAL", 2, 0, false);
        declareFunction("pph_adjust_mt_date_granularity", "PPH-ADJUST-MT-DATE-GRANULARITY", 2, 0, false);
        declareFunction("pph_assertion_has_glossP", "PPH-ASSERTION-HAS-GLOSS?", 1, 0, false);
        declareFunction("pph_gloss_for_assertion", "PPH-GLOSS-FOR-ASSERTION", 2, 0, false);
        declareFunction("pph_output_list_to_assertion_output_list", "PPH-OUTPUT-LIST-TO-ASSERTION-OUTPUT-LIST", 1, 0, false);
        declareFunction("pph_output_list_from_assertion_output_list", "PPH-OUTPUT-LIST-FROM-ASSERTION-OUTPUT-LIST", 2, 0, false);
        declareFunction("assertion_output_list_info_p", "ASSERTION-OUTPUT-LIST-INFO-P", 1, 0, false);
        declareFunction("generate_string", "GENERATE-STRING", 1, 0, false);
        declareFunction("generate_cycl_string_with_html", "GENERATE-CYCL-STRING-WITH-HTML", 1, 0, false);
        declareFunction("generate_cycl_string_with_html_internal", "GENERATE-CYCL-STRING-WITH-HTML-INTERNAL", 1, 1, false);
        declareFunction("generate_cycl_list", "GENERATE-CYCL-LIST", 1, 0, false);
        declareFunction("generate_rop_expression", "GENERATE-ROP-EXPRESSION", 1, 0, false);
        declareFunction("generate_genitive", "GENERATE-GENITIVE", 1, 0, false);
        declareFunction("pph_genitive_cycl", "PPH-GENITIVE-CYCL", 1, 1, false);
        declareFunction("pph_term_ok_for_genitive_paraphraseP", "PPH-TERM-OK-FOR-GENITIVE-PARAPHRASE?", 1, 0, false);
        declareFunction("pph_dont_use_instances_for_genitive_paraphrase", "PPH-DONT-USE-INSTANCES-FOR-GENITIVE-PARAPHRASE", 0, 0, false);
        declareFunction("clear_pph_possessive_preds", "CLEAR-PPH-POSSESSIVE-PREDS", 0, 0, false);
        declareFunction("remove_pph_possessive_preds", "REMOVE-PPH-POSSESSIVE-PREDS", 0, 0, false);
        declareFunction("pph_possessive_preds_internal", "PPH-POSSESSIVE-PREDS-INTERNAL", 0, 0, false);
        declareFunction("pph_possessive_preds", "PPH-POSSESSIVE-PREDS", 0, 0, false);
        declareFunction("pph_find_possessive_sentence_internal", "PPH-FIND-POSSESSIVE-SENTENCE-INTERNAL", 1, 1, false);
        declareFunction("pph_find_possessive_sentence", "PPH-FIND-POSSESSIVE-SENTENCE", 1, 1, false);
        declareFunction("pph_find_possessor", "PPH-FIND-POSSESSOR", 1, 0, false);
        declareFunction("pph_find_possessive_support", "PPH-FIND-POSSESSIVE-SUPPORT", 3, 0, false);
        declareFunction("pph_find_possessed_type", "PPH-FIND-POSSESSED-TYPE", 1, 0, false);
        declareFunction("prefer_unlexified_formP", "PREFER-UNLEXIFIED-FORM?", 1, 0, false);
        declareFunction("prefer_unlexified_form_method", "PREFER-UNLEXIFIED-FORM-METHOD", 1, 1, false);
        declareFunction("use_as_is_method", "USE-AS-IS-METHOD", 1, 1, false);
        declareFunction("coerce_name_method", "COERCE-NAME-METHOD", 1, 1, false);
        declareFunction("licensed_definite_description_method", "LICENSED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false);
        declareFunction("licensed_definite_description_types_for_term", "LICENSED-DEFINITE-DESCRIPTION-TYPES-FOR-TERM", 2, 0, false);
        declareFunction("coerced_definite_description_method", "COERCED-DEFINITE-DESCRIPTION-METHOD", 1, 1, false);
        declareFunction("generate_definite_description_item", "GENERATE-DEFINITE-DESCRIPTION-ITEM", 3, 0, false);
        declareFunction("unlexified_term_method", "UNLEXIFIED-TERM-METHOD", 1, 1, false);
        declareFunction("pph_gender_p_internal", "PPH-GENDER-P-INTERNAL", 1, 1, false);
        declareFunction("pph_gender_p", "PPH-GENDER-P", 1, 1, false);
        declareFunction("pph_gender", "PPH-GENDER", 1, 0, false);
        declareFunction("pph_number", "PPH-NUMBER", 1, 0, false);
        declareFunction("pph_same_genderP", "PPH-SAME-GENDER?", 2, 0, false);
        declareFunction("pph_same_numberP", "PPH-SAME-NUMBER?", 2, 0, false);
        declareFunction("pph_same_gender_and_numberP", "PPH-SAME-GENDER-AND-NUMBER?", 2, 0, false);
        declareFunction("pph_unify_gender", "PPH-UNIFY-GENDER", 2, 0, false);
        declareFunction("pph_unify_number", "PPH-UNIFY-NUMBER", 2, 0, false);
        declareFunction("pph_unify_person", "PPH-UNIFY-PERSON", 2, 0, false);
        declareFunction("pph_gender_of_var", "PPH-GENDER-OF-VAR", 1, 0, false);
        declareFunction("pph_gender_of_var_type", "PPH-GENDER-OF-VAR-TYPE", 2, 0, false);
        declareFunction("pph_language_of_mt", "PPH-LANGUAGE-OF-MT", 1, 0, false);
        declareFunction("pph_english_lexical_mtP", "PPH-ENGLISH-LEXICAL-MT?", 1, 0, false);
        declareFunction("pph_non_english_lexical_mtP", "PPH-NON-ENGLISH-LEXICAL-MT?", 1, 0, false);
        declareFunction("pph_default_grammatical_gender", "PPH-DEFAULT-GRAMMATICAL-GENDER", 0, 0, false);
        declareFunction("pph_default_grammatical_gender_for_language_internal", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE-INTERNAL", 1, 1, false);
        declareFunction("pph_default_grammatical_gender_for_language", "PPH-DEFAULT-GRAMMATICAL-GENDER-FOR-LANGUAGE", 1, 1, false);
        declareFunction("pph_number_of_var", "PPH-NUMBER-OF-VAR", 1, 0, false);
        declareFunction("pph_number_of_term", "PPH-NUMBER-OF-TERM", 1, 0, false);
        declareFunction("pph_number_from_cycl", "PPH-NUMBER-FROM-CYCL", 1, 0, false);
        declareFunction("pph_gender_of_term", "PPH-GENDER-OF-TERM", 1, 1, false);
        declareFunction("adjust_gender_for_top_level_cycl", "ADJUST-GENDER-FOR-TOP-LEVEL-CYCL", 3, 0, false);
        declareFunction("pph_person", "PPH-PERSON", 1, 0, false);
        declareFunction("pph_default_person", "PPH-DEFAULT-PERSON", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_pph_methods_file_alt() {
        deflexical("*GENERATE-SKOLEM-IDS*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*GENERATE-SKOLEM-NAME-CACHING-STATE*", NIL);
        defparameter("*PPH-FACET-THRESHOLD*", NIL);
        deflexical("*SELECT-STRING-METHOD-COUNT*", NIL != boundp($select_string_method_count$) ? ((SubLObject) ($select_string_method_count$.getGlobalValue())) : make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
        defparameter("*SELECT-STRING-METHODS*", $list_alt154);
        defparameter("*PPH-TERM-STRING-PREDS*", NIL);
        deflexical("*PPH-ENHANCED-DOMAIN-MT-CACHING-STATE*", NIL);
        deflexical("*PPH-ABBREVIATION-PREDS-CACHING-STATE*", NIL);
        deflexical("*DISPREFERRED-PPH-NAME-STRING-PREDS*", $list_alt217);
        deflexical("*ENGLISH-INTEGER-PARAPHRASES*", $list_alt251);
        deflexical("*ENGLISH-TENS-PARAPHRASES*", $list_alt252);
        deflexical("*PPH-DEFAULT-MT-TIME-INDEX*", NIL != boundp($pph_default_mt_time_index$) ? ((SubLObject) ($pph_default_mt_time_index$.getGlobalValue())) : NIL);
        defparameter("*IGNORE-MISLEADING-TIME-PARAMETERS?*", NIL);
        deflexical("*BAD-COLLECTIONS-FOR-GENITIVE-PARAPHRASE*", $list_alt337);
        deflexical("*PPH-POSSESSIVE-PREDS-CACHING-STATE*", NIL);
        defparameter("*USE-UNLEXIFIED-FORM-FOR-INSTANCES*", NIL);
        defparameter("*USE-UNLEXIFIED-FORM*", $list_alt350);
        deflexical("*KNOWN-ENGLISH-VARIANTS*", $list_alt371);
        deflexical("*PPH-DEFAULT-GRAMMATICAL-GENDER*", $$Neuter_NLAttr);
        return NIL;
    }

    public static SubLObject init_pph_methods_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*GENERATE-SKOLEM-IDS*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            deflexical("*GENERATE-SKOLEM-NAME-CACHING-STATE*", NIL);
            defparameter("*PPH-FACET-THRESHOLD*", NIL);
            defparameter("*PPH-ASSUME-DISTINCT-VARS-REQUIRE-DIFFERENT-BINDINGS?*", NIL);
            deflexical("*SELECT-STRING-METHOD-COUNT*", SubLTrampolineFile.maybeDefault($select_string_method_count$, $select_string_method_count$, () -> make_hash_table($int$256, UNPROVIDED, UNPROVIDED)));
            defparameter("*SELECT-STRING-METHODS*", $list150);
            deflexical("*PPH-NAME-STRING-PREDS-CACHING-STATE*", NIL);
            deflexical("*PPH-TERM-STRING-PREDS-CACHING-STATE*", NIL);
            deflexical("*PPH-ENHANCED-DOMAIN-MT-CACHING-STATE*", NIL);
            deflexical("*PPH-ABBREVIATION-PREDS-CACHING-STATE*", NIL);
            deflexical("*DISPREFERRED-PPH-NAME-STRING-PREDS*", $list229);
            deflexical("*ENGLISH-INTEGER-PARAPHRASES*", $list272);
            deflexical("*ENGLISH-TENS-PARAPHRASES*", $list273);
            deflexical("*PPH-DEFAULT-MT-TIME-INDEX*", SubLTrampolineFile.maybeDefault($pph_default_mt_time_index$, $pph_default_mt_time_index$, NIL));
            defparameter("*IGNORE-MISLEADING-TIME-PARAMETERS?*", NIL);
            deflexical("*BAD-COLLECTIONS-FOR-GENITIVE-PARAPHRASE*", $list362);
            deflexical("*PPH-POSSESSIVE-PREDS-CACHING-STATE*", NIL);
            defparameter("*USE-UNLEXIFIED-FORM-FOR-INSTANCES*", NIL);
            defparameter("*USE-UNLEXIFIED-FORM*", $list375);
            deflexical("*KNOWN-ENGLISH-VARIANTS*", $list395);
            deflexical("*PPH-DEFAULT-GRAMMATICAL-GENDER*", $$Neuter_NLAttr);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SELECT-STRING-METHOD-COUNT*", NIL != boundp($select_string_method_count$) ? ((SubLObject) ($select_string_method_count$.getGlobalValue())) : make_hash_table($int$256, UNPROVIDED, UNPROVIDED));
            defparameter("*SELECT-STRING-METHODS*", $list_alt154);
            defparameter("*PPH-TERM-STRING-PREDS*", NIL);
            deflexical("*DISPREFERRED-PPH-NAME-STRING-PREDS*", $list_alt217);
            deflexical("*ENGLISH-INTEGER-PARAPHRASES*", $list_alt251);
            deflexical("*ENGLISH-TENS-PARAPHRASES*", $list_alt252);
            deflexical("*PPH-DEFAULT-MT-TIME-INDEX*", NIL != boundp($pph_default_mt_time_index$) ? ((SubLObject) ($pph_default_mt_time_index$.getGlobalValue())) : NIL);
            deflexical("*BAD-COLLECTIONS-FOR-GENITIVE-PARAPHRASE*", $list_alt337);
            defparameter("*USE-UNLEXIFIED-FORM*", $list_alt350);
            deflexical("*KNOWN-ENGLISH-VARIANTS*", $list_alt371);
        }
        return NIL;
    }

    public static SubLObject init_pph_methods_file_Previous() {
        deflexical("*GENERATE-SKOLEM-IDS*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*GENERATE-SKOLEM-NAME-CACHING-STATE*", NIL);
        defparameter("*PPH-FACET-THRESHOLD*", NIL);
        defparameter("*PPH-ASSUME-DISTINCT-VARS-REQUIRE-DIFFERENT-BINDINGS?*", NIL);
        deflexical("*SELECT-STRING-METHOD-COUNT*", SubLTrampolineFile.maybeDefault($select_string_method_count$, $select_string_method_count$, () -> make_hash_table($int$256, UNPROVIDED, UNPROVIDED)));
        defparameter("*SELECT-STRING-METHODS*", $list150);
        deflexical("*PPH-NAME-STRING-PREDS-CACHING-STATE*", NIL);
        deflexical("*PPH-TERM-STRING-PREDS-CACHING-STATE*", NIL);
        deflexical("*PPH-ENHANCED-DOMAIN-MT-CACHING-STATE*", NIL);
        deflexical("*PPH-ABBREVIATION-PREDS-CACHING-STATE*", NIL);
        deflexical("*DISPREFERRED-PPH-NAME-STRING-PREDS*", $list229);
        deflexical("*ENGLISH-INTEGER-PARAPHRASES*", $list272);
        deflexical("*ENGLISH-TENS-PARAPHRASES*", $list273);
        deflexical("*PPH-DEFAULT-MT-TIME-INDEX*", SubLTrampolineFile.maybeDefault($pph_default_mt_time_index$, $pph_default_mt_time_index$, NIL));
        defparameter("*IGNORE-MISLEADING-TIME-PARAMETERS?*", NIL);
        deflexical("*BAD-COLLECTIONS-FOR-GENITIVE-PARAPHRASE*", $list362);
        deflexical("*PPH-POSSESSIVE-PREDS-CACHING-STATE*", NIL);
        defparameter("*USE-UNLEXIFIED-FORM-FOR-INSTANCES*", NIL);
        defparameter("*USE-UNLEXIFIED-FORM*", $list375);
        deflexical("*KNOWN-ENGLISH-VARIANTS*", $list395);
        deflexical("*PPH-DEFAULT-GRAMMATICAL-GENDER*", $$Neuter_NLAttr);
        return NIL;
    }

    public static final SubLObject setup_pph_methods_file_alt() {
        pph_types.pph_register_method(GENERATE_SKOLEM_TERM_WITH_NAME, $SKOLEM_TERM, $DECENT);
        memoization_state.note_globally_cached_function(GENERATE_SKOLEM_NAME);
        pph_types.pph_register_method(GENERATE_SKOLEM_TERM_EXISTENTIALLY, $SKOLEM_TERM, $DECENT);
        pph_types.pph_register_method(GENERATE_HYPOTHETICAL, $HYPOTHETICAL, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_VARIABLE, $VARIABLE, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_VARIABLE, $LEXIFIED_VARIABLE, $BEST);
        pph_types.pph_register_method(GENERATE_KEYWORD, $KEYWORD, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_SYMBOL, $CYCL_SYMBOL, $BEST);
        pph_types.pph_register_method(GENERATE_NON_CYCL_SYMBOL, $NON_CYCL_SYMBOL, $DECENT);
        pph_types.pph_register_method(GENERATE_CONSTANT_DEFAULT, $CONSTANT, $BEST);
        pph_types.pph_register_method(GENERATE_LEXICAL_WORD, $LEXICAL_WORD, $DECENT);
        pph_types.pph_register_method(GENERATE_TRUE, $TRUE, $FALLBACK);
        pph_types.pph_register_method(GENERATE_FALSE, $FALSE, $FALLBACK);
        declare_defglobal($select_string_method_count$);
        memoization_state.note_memoized_function(SELECT_STRING_FOR_TERM);
        memoization_state.note_globally_cached_function(PPH_ENHANCED_DOMAIN_MT);
        memoization_state.note_globally_cached_function(PPH_ABBREVIATION_PREDS);
        pph_types.pph_register_method(GENERATE_NART_LEXIFIED_TIGHT, $NART, $BEST);
        pph_types.pph_register_method(GENERATE_NART_LEXIFIED_IMPRECISE, $NART, $DECENT);
        pph_types.pph_register_method(GENERATE_NART_AS_NAUT_TIGHT, $NART, $DECENT);
        pph_types.pph_register_method(GENERATE_NART_AS_NAUT, $NART, $FALLBACK);
        pph_types.pph_register_method(GENERATE_UNIVERSAL_DATE, $UNIVERSAL_DATE, $BEST);
        pph_types.pph_register_method(GENERATE_UNIVERSAL_DATE_NUMBERS, $UNIVERSAL_DATE, $FALLBACK);
        pph_types.pph_register_method(GENERATE_UNIVERSAL_SECOND, $UNIVERSAL_SECOND, $BEST);
        pph_types.pph_register_method(GENERATE_FLOAT, $FLOAT, $BEST);
        pph_types.pph_register_method(GENERATE_NUMBER_DEFAULT, $NUMBER, $BEST);
        pph_types.pph_register_method(GENERATE_IMAGE_URL, $IMAGE_URL, $BEST);
        pph_types.pph_register_method(GENERATE_PRINC, $OBJECT, $FALLBACK);
        pph_types.pph_register_method(GENERATE_PRINC, $SYMBOL, $FALLBACK);
        declare_defglobal($pph_default_mt_time_index$);
        pph_types.pph_register_method(GENERATE_ASSERTION, $ASSERTION, $BEST);
        memoization_state.note_memoized_function(PPH_SUPPORT_CREATION_DATES);
        define_test_case_table_int(PPH_MT_TIME_INDEX, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$baxter, $CLASSES, $list_alt302, $KB, $FULL, $WORKING_, T }), $list_alt306);
        memoization_state.note_memoized_function(PPH_ADJUST_MT_DATE_GRANULARITY);
        define_test_case_table_int(PPH_ADJUST_MT_TIME_INDEX_GRANULARITY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$baxter, $CLASSES, $list_alt302, $KB, $FULL, $WORKING_, T }), $list_alt323);
        pph_types.pph_register_method(GENERATE_STRING, $STRING, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_LIST, $LIST, $DECENT);
        pph_types.pph_register_method(GENERATE_ROP_EXPRESSION, $ROP_EXPRESSION, $DECENT);
        memoization_state.note_globally_cached_function(PPH_POSSESSIVE_PREDS);
        memoization_state.note_memoized_function(PPH_FIND_POSSESSIVE_SENTENCE);
        memoization_state.note_memoized_function(PPH_GENDER_P);
        memoization_state.note_memoized_function(PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE);
        return NIL;
    }

    public static SubLObject setup_pph_methods_file() {
        if (SubLFiles.USE_V1) {
            pph_types.pph_register_method(GENERATE_SKOLEM_TERM_WITH_NAME, $SKOLEM_TERM, $DECENT);
            memoization_state.note_globally_cached_function(GENERATE_SKOLEM_NAME);
            pph_types.pph_register_method(GENERATE_SKOLEM_TERM_EXISTENTIALLY, $SKOLEM_TERM, $DECENT);
            pph_types.pph_register_method(GENERATE_HYPOTHETICAL, $HYPOTHETICAL, $BEST);
            pph_types.pph_register_method(GENERATE_CYCL_VARIABLE, $VARIABLE, $BEST);
            pph_types.pph_register_method(GENERATE_CYCL_VARIABLE, $LEXIFIED_VARIABLE, $BEST);
            pph_types.pph_register_method(GENERATE_KEYWORD, $KEYWORD, $BEST);
            pph_types.pph_register_method(GENERATE_CYCL_SYMBOL, $CYCL_SYMBOL, $BEST);
            pph_types.pph_register_method(GENERATE_NON_CYCL_SYMBOL, $NON_CYCL_SYMBOL, $DECENT);
            pph_types.pph_register_method(GENERATE_CONSTANT_DEFAULT, $CONSTANT, $BEST);
            pph_types.pph_register_method(GENERATE_LEXICAL_WORD, $LEXICAL_WORD, $BEST);
            declare_defglobal($select_string_method_count$);
            memoization_state.note_memoized_function(SELECT_STRING_FOR_TERM);
            memoization_state.note_globally_cached_function(PPH_NAME_STRING_PREDS);
            memoization_state.note_globally_cached_function(PPH_TERM_STRING_PREDS);
            memoization_state.note_globally_cached_function(PPH_ENHANCED_DOMAIN_MT);
            memoization_state.note_memoized_function(NAME_STRING_GAF_STRINGS);
            memoization_state.note_globally_cached_function(PPH_ABBREVIATION_PREDS);
            pph_types.pph_register_method(GENERATE_NART_LEXIFIED_TIGHT, $LEXIFIED_NART, $BEST);
            pph_types.pph_register_method(GENERATE_NART_LEXIFIED_IMPRECISE, $LEXIFIED_NART, $DECENT);
            pph_types.pph_register_method(GENERATE_NART_AS_NAUT, $NART, $BEST);
            memoization_state.note_memoized_function($sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_);
            pph_types.pph_register_method(GENERATE_UNIVERSAL_DATE, $UNIVERSAL_DATE, $BEST);
            pph_types.pph_register_method(GENERATE_UNIVERSAL_DATE_NUMBERS, $UNIVERSAL_DATE, $FALLBACK);
            pph_types.pph_register_method(GENERATE_UNIVERSAL_SECOND, $UNIVERSAL_SECOND, $BEST);
            pph_types.pph_register_method(GENERATE_FLOAT, $FLOAT, $BEST);
            pph_types.pph_register_method(GENERATE_NUMBER_DEFAULT, $NUMBER, $BEST);
            pph_types.pph_register_method(GENERATE_IMAGE_URL, $IMAGE_URL, $BEST);
            pph_types.pph_register_method(GENERATE_PRINC, $OBJECT, $FALLBACK);
            pph_types.pph_register_method(GENERATE_PRINC, $SYMBOL, $FALLBACK);
            declare_defglobal($pph_default_mt_time_index$);
            pph_types.pph_register_method(GENERATE_ASSERTION, $ASSERTION, $BEST);
            memoization_state.note_memoized_function(PPH_SUPPORT_CREATION_DATES);
            define_test_case_table_int(PPH_MT_TIME_INDEX, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list328, $KB, $FULL, $WORKING_, T }), $list332);
            memoization_state.note_memoized_function(PPH_ADJUST_MT_DATE_GRANULARITY);
            define_test_case_table_int(PPH_ADJUST_MT_TIME_INDEX_GRANULARITY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list328, $KB, $FULL, $WORKING_, T }), $list349);
            pph_types.pph_register_method(GENERATE_STRING, $STRING, $BEST);
            pph_types.pph_register_method(GENERATE_CYCL_LIST, $LIST, $DECENT);
            pph_types.pph_register_method(GENERATE_ROP_EXPRESSION, $ROP_EXPRESSION, $DECENT);
            memoization_state.note_globally_cached_function(PPH_POSSESSIVE_PREDS);
            memoization_state.note_memoized_function(PPH_FIND_POSSESSIVE_SENTENCE);
            memoization_state.note_memoized_function(PPH_GENDER_P);
            memoization_state.note_memoized_function(PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE);
        }
        if (SubLFiles.USE_V2) {
            pph_types.pph_register_method(GENERATE_LEXICAL_WORD, $LEXICAL_WORD, $DECENT);
            pph_types.pph_register_method(GENERATE_TRUE, $TRUE, $FALLBACK);
            pph_types.pph_register_method(GENERATE_FALSE, $FALSE, $FALLBACK);
            pph_types.pph_register_method(GENERATE_NART_LEXIFIED_TIGHT, $NART, $BEST);
            pph_types.pph_register_method(GENERATE_NART_LEXIFIED_IMPRECISE, $NART, $DECENT);
            pph_types.pph_register_method(GENERATE_NART_AS_NAUT_TIGHT, $NART, $DECENT);
            pph_types.pph_register_method(GENERATE_NART_AS_NAUT, $NART, $FALLBACK);
            define_test_case_table_int(PPH_MT_TIME_INDEX, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$baxter, $CLASSES, $list_alt302, $KB, $FULL, $WORKING_, T }), $list_alt306);
            define_test_case_table_int(PPH_ADJUST_MT_TIME_INDEX_GRANULARITY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$baxter, $CLASSES, $list_alt302, $KB, $FULL, $WORKING_, T }), $list_alt323);
        }
        return NIL;
    }

    public static SubLObject setup_pph_methods_file_Previous() {
        pph_types.pph_register_method(GENERATE_SKOLEM_TERM_WITH_NAME, $SKOLEM_TERM, $DECENT);
        memoization_state.note_globally_cached_function(GENERATE_SKOLEM_NAME);
        pph_types.pph_register_method(GENERATE_SKOLEM_TERM_EXISTENTIALLY, $SKOLEM_TERM, $DECENT);
        pph_types.pph_register_method(GENERATE_HYPOTHETICAL, $HYPOTHETICAL, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_VARIABLE, $VARIABLE, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_VARIABLE, $LEXIFIED_VARIABLE, $BEST);
        pph_types.pph_register_method(GENERATE_KEYWORD, $KEYWORD, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_SYMBOL, $CYCL_SYMBOL, $BEST);
        pph_types.pph_register_method(GENERATE_NON_CYCL_SYMBOL, $NON_CYCL_SYMBOL, $DECENT);
        pph_types.pph_register_method(GENERATE_CONSTANT_DEFAULT, $CONSTANT, $BEST);
        pph_types.pph_register_method(GENERATE_LEXICAL_WORD, $LEXICAL_WORD, $BEST);
        declare_defglobal($select_string_method_count$);
        memoization_state.note_memoized_function(SELECT_STRING_FOR_TERM);
        memoization_state.note_globally_cached_function(PPH_NAME_STRING_PREDS);
        memoization_state.note_globally_cached_function(PPH_TERM_STRING_PREDS);
        memoization_state.note_globally_cached_function(PPH_ENHANCED_DOMAIN_MT);
        memoization_state.note_memoized_function(NAME_STRING_GAF_STRINGS);
        memoization_state.note_globally_cached_function(PPH_ABBREVIATION_PREDS);
        pph_types.pph_register_method(GENERATE_NART_LEXIFIED_TIGHT, $LEXIFIED_NART, $BEST);
        pph_types.pph_register_method(GENERATE_NART_LEXIFIED_IMPRECISE, $LEXIFIED_NART, $DECENT);
        pph_types.pph_register_method(GENERATE_NART_AS_NAUT, $NART, $BEST);
        memoization_state.note_memoized_function($sym245$OK_GEN_TEMPLATE_ASSERTION_FOR_RELN_);
        pph_types.pph_register_method(GENERATE_UNIVERSAL_DATE, $UNIVERSAL_DATE, $BEST);
        pph_types.pph_register_method(GENERATE_UNIVERSAL_DATE_NUMBERS, $UNIVERSAL_DATE, $FALLBACK);
        pph_types.pph_register_method(GENERATE_UNIVERSAL_SECOND, $UNIVERSAL_SECOND, $BEST);
        pph_types.pph_register_method(GENERATE_FLOAT, $FLOAT, $BEST);
        pph_types.pph_register_method(GENERATE_NUMBER_DEFAULT, $NUMBER, $BEST);
        pph_types.pph_register_method(GENERATE_IMAGE_URL, $IMAGE_URL, $BEST);
        pph_types.pph_register_method(GENERATE_PRINC, $OBJECT, $FALLBACK);
        pph_types.pph_register_method(GENERATE_PRINC, $SYMBOL, $FALLBACK);
        declare_defglobal($pph_default_mt_time_index$);
        pph_types.pph_register_method(GENERATE_ASSERTION, $ASSERTION, $BEST);
        memoization_state.note_memoized_function(PPH_SUPPORT_CREATION_DATES);
        define_test_case_table_int(PPH_MT_TIME_INDEX, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list328, $KB, $FULL, $WORKING_, T }), $list332);
        memoization_state.note_memoized_function(PPH_ADJUST_MT_DATE_GRANULARITY);
        define_test_case_table_int(PPH_ADJUST_MT_TIME_INDEX_GRANULARITY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list328, $KB, $FULL, $WORKING_, T }), $list349);
        pph_types.pph_register_method(GENERATE_STRING, $STRING, $BEST);
        pph_types.pph_register_method(GENERATE_CYCL_LIST, $LIST, $DECENT);
        pph_types.pph_register_method(GENERATE_ROP_EXPRESSION, $ROP_EXPRESSION, $DECENT);
        memoization_state.note_globally_cached_function(PPH_POSSESSIVE_PREDS);
        memoization_state.note_memoized_function(PPH_FIND_POSSESSIVE_SENTENCE);
        memoization_state.note_memoized_function(PPH_GENDER_P);
        memoization_state.note_memoized_function(PPH_DEFAULT_GRAMMATICAL_GENDER_FOR_LANGUAGE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_methods_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_methods_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_methods_file();
    }

    static {
    }

    public static final class $nl_generation_cache_method$UnaryFunction extends UnaryFunction {
        public $nl_generation_cache_method$UnaryFunction() {
            super(extractFunctionNamed("NL-GENERATION-CACHE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_generation_cache_method(arg1, pph_methods.$nl_generation_cache_method$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $nl_generation_cache_method$BinaryFunction extends BinaryFunction {
        public $nl_generation_cache_method$BinaryFunction() {
            super(extractFunctionNamed("NL-GENERATION-CACHE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return nl_generation_cache_method(arg1, arg2);
        }
    }

    private static final SubLSymbol GENERATE_NART_AS_NAUT_TIGHT = makeSymbol("GENERATE-NART-AS-NAUT-TIGHT");

    static private final SubLList $list_alt20 = list(reader_make_constant_shell("singular"), reader_make_constant_shell("massNumber"));

    static private final SubLString $str_alt21$_ = makeString("-");

    public static final SubLSymbol $kw23$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt24$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym28$_X = makeSymbol("?X");

    static private final SubLSymbol $sym29$TOU_ATOMIC_SENTENCE_ = makeSymbol("TOU-ATOMIC-SENTENCE?");

    static private final SubLList $list_alt30 = list(makeSymbol("HL-VAR"), makeSymbol("NAUT"));

    static private final SubLList $list_alt32 = list(makeKeyword("MODES"), list(reader_make_constant_shell("ReformulatorMode-Tersify")));

    static private final SubLList $list_alt43 = cons(makeSymbol("FROM-PREFIX"), makeSymbol("TO-PREFIX"));

    static private final SubLString $str_alt47$_of = makeString(" of");

    static private final SubLSymbol $sym55$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");

    static private final SubLString $str_alt56$__Paraphrasing__S_as__S_in_contex = makeString("~&Paraphrasing ~S as ~S in context ~S.~%");

    static private final SubLList $list_alt58 = list(reader_make_constant_shell("PhraseFn"), reader_make_constant_shell("Determiner"));

    static private final SubLString $str_alt63$Can_t_reconcile__S_with__S = makeString("Can't reconcile ~S with ~S");

    static private final SubLSymbol $sym65$_TG = makeSymbol("?TG");

    static private final SubLList $list_alt67 = list(makeSymbol("?TG"));

    static private final SubLSymbol $sym68$PPH_GENL_ = makeSymbol("PPH-GENL?");

    static private final SubLString $str_alt76$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt81$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt83$Skipping__S_as_too_highly_faceted = makeString("Skipping ~S as too highly faceted (threshold = ~S).");

    static private final SubLString $str_alt84$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt85$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt89$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt90$__ = makeString(") ");

    static private final SubLString $str_alt91$Arg_position__S_applied_to_top_le = makeString("Arg position ~S applied to top-level cycl ~S does not yield correct var ~S but rather ~S!~%*pph-cycls*: ~S~%");

    static private final SubLString $str_alt94$Var__S_at_arg_position__S_in_cycl = makeString("Var ~S at arg-position ~S in cycl ~S not in non-veridical environment.~%");

    static private final SubLString $str_alt95$Quantifier_for_var__S_not_found_i = makeString("Quantifier for var ~S not found in top-level cycl!~%");

    static private final SubLList $list_alt96 = list(reader_make_constant_shell("implies"), reader_make_constant_shell("not"), reader_make_constant_shell("unknownSentence"));

    static private final SubLList $list_alt97 = cons(makeSymbol("FIRST-ITEM"), makeSymbol("REST-ITEMS"));

    static private final SubLString $str_alt105$Explicitifying__S = makeString("Explicitifying ~S");

    static private final SubLString $str_alt110$the_SubL_symbol_ = makeString("the SubL symbol ");

    static private final SubLString $str_alt113$the_symbol_ = makeString("the symbol ");

    static private final SubLString $str_alt117$__Shadowing_discourse_context____ = makeString("~&Shadowing discourse context...~%");

    static private final SubLString $str_alt119$__GENERATE_CONSTANT_DEFAULT__Tryi = makeString("~&GENERATE-CONSTANT-DEFAULT: Trying again with :ANY quality.~%");

    static private final SubLString $str_alt122$_TheWord = makeString("-TheWord");

    static private final SubLString $str_alt123$_MWW = makeString("-MWW");

    static private final SubLString $str_alt124$RKF_ = makeString("RKF-");

    static private final SubLString $str_alt126$the_word_ = makeString("the word ");

    static private final SubLList $list_alt128 = list(makeSymbol("ELEMENT-LIST"), makeSymbol("QUANTITY-LIST"));

    static private final SubLList $list_alt130 = list(reader_make_constant_shell("ElementalSubstanceFn"), $FORT);

    static private final SubLList $list_alt132 = list(list(reader_make_constant_shell("TheList"), ONE_INTEGER));

    static private final SubLList $list_alt133 = list(makeSymbol("?ELEMENTS"), makeSymbol("?QUANTITIES"));

    static private final SubLSymbol $sym136$_CHARGE = makeSymbol("?CHARGE");

    static private final SubLList $list_alt138 = list(makeSymbol("?CHARGE"));

    static private final SubLSymbol $sym139$_MOLECULE_TYPE = makeSymbol("?MOLECULE-TYPE");

    static private final SubLList $list_alt141 = list(makeSymbol("?MOLECULE-TYPE"));

    private static final SubLSymbol GENERATE_TRUE = makeSymbol("GENERATE-TRUE");

    static private final SubLString $$$some_statement_in_the_KB_is_true = makeString("some statement in the KB is true");



    private static final SubLSymbol GENERATE_FALSE = makeSymbol("GENERATE-FALSE");

    static private final SubLString $$$some_statement_in_the_KB_is_false = makeString("some statement in the KB is false");



    static private final SubLList $list_alt154 = list(new SubLObject[]{ makeSymbol("NL-GENERATION-CACHE-METHOD"), makeSymbol("GEN-PHRASE-METHOD"), makeSymbol("PREFERRED-GEN-UNIT-METHOD"), makeSymbol("PREFERRED-LEXIFICATION-METHOD"), makeSymbol("CHEMICAL-FORMULA-METHOD"), makeSymbol("PRETTY-STRING-METHOD"), makeSymbol("USE-AS-IS-METHOD"), makeSymbol("PREFER-UNLEXIFIED-FORM-METHOD"), makeSymbol("NAME-STRING-METHOD-NON-ACRONYM"), makeSymbol("PASSED-PREDS-SUCCEED-METHOD"), cons(makeSymbol("DEMERITS"), TWO_INTEGER), makeSymbol("RDF-LABEL-METHOD"), makeSymbol("NOUN-FROM-ADJECTIVE-METHOD"), makeSymbol("ANY-PREDS-SUCCEED-METHOD"), makeSymbol("NAME-STRING-METHOD"), makeSymbol("SCIENTIFIC-NAME-METHOD"), makeSymbol("ANY-NAME-STRING-METHOD"), cons(makeSymbol("DEMERITS"), ONE_INTEGER), makeSymbol("GENITIVE-PARAPHRASE-METHOD"), makeSymbol("COERCED-DEFINITE-DESCRIPTION-METHOD"), makeSymbol("TERM-STRING-METHOD"), cons(makeSymbol("DEMERITS"), ONE_INTEGER), makeSymbol("UNLEXIFIED-TERM-METHOD"), makeSymbol("COERCE-NAME-METHOD") });

    static private final SubLString $str_alt155$__SELECT_STRING_METHOD__NL_PREDS_ = makeString("~&SELECT-STRING-METHOD: NL-PREDS is ~S.~%");

    static private final SubLString $str_alt156$__SELECT_STRING_METHOD__Precision = makeString("~&SELECT-STRING-METHOD: Precision is ~S.~%");

    static private final SubLList $list_alt157 = list(makeSymbol("GEN-STRING-ASSERTION-PRECISE-METHOD"));

    static private final SubLString $str_alt158$_is_not_a_ = makeString(" is not a ");

    static private final SubLString $str_alt162$Added__S_alternatives_for____S = makeString("Added ~S alternatives for~% ~S");

    static private final SubLString $str_alt163$__SELECT_STRING_METHOD__the_funct = makeString("~&SELECT-STRING-METHOD: the function ~S returned NIL for ~S.~%");

    static private final SubLString $str_alt164$PPH_timeout_time_reached_ = makeString("PPH timeout time reached.");

    static private final SubLString $str_alt171$__SELECT_STRING_METHOD__Calling__ = makeString("~&SELECT-STRING-METHOD: Calling ~S on ~S.~%");

    static private final SubLList $list_alt173 = list(makeSymbol("STRING"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEMERITS"), ZERO_INTEGER), makeSymbol("JUSTIFICATION"));

    static private final SubLString $str_alt174$__SELECT_STRING_METHOD__Function_ = makeString("~&SELECT-STRING-METHOD: Function ~S returned ~S.~%");

    static private final SubLString $str_alt177$Paraphrasing__S_as_an_NP_ = makeString("Paraphrasing ~S as an NP.");

    static private final SubLList $list_alt178 = list(reader_make_constant_shell("nonSingular-Generic"));

    static private final SubLList $list_alt179 = list(reader_make_constant_shell("nounStrings"));

    static private final SubLList $list_alt180 = list(reader_make_constant_shell("plural-Generic"));

    static private final SubLList $list_alt181 = list(reader_make_constant_shell("singular-Generic"));

    static private final SubLList $list_alt182 = list(reader_make_constant_shell("massNumber-Generic"));

    static private final SubLSymbol $sym184$PPH_SPEC_PREDICATE_ = makeSymbol("PPH-SPEC-PREDICATE?");

    static private final SubLString $str_alt185$Adding___properNameStrings_to__S = makeString("Adding #$properNameStrings to ~S");

    static private final SubLSymbol $sym186$PPH_PRED_LICENSED_BY_PRED_ = makeSymbol("PPH-PRED-LICENSED-BY-PRED?");

    static private final SubLString $str_alt189$Trying_to_paraphrase__S_with_no_N = makeString("Trying to paraphrase ~S with no NL preds.");

    static private final SubLSymbol $sym194$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    static private final SubLString $str_alt195$Broadening__PPH_LANGUAGE_MT__to__ = makeString("Broadening *PPH-LANGUAGE-MT* to ~S");

    static private final SubLList $list_alt196 = cons(makeSymbol("STRING"), makeSymbol("PRED"));

    static private final SubLSymbol $sym197$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");

    static private final SubLString $str_alt204$Generated_name_for__S_from____S = makeString("Generated name for ~S from~% ~S");

    static private final SubLString $str_alt206$the_ = makeString("the ");

    static private final SubLSymbol $sym207$PPH_NON_ABBREVIATION_NAME_PRED_ = makeSymbol("PPH-NON-ABBREVIATION-NAME-PRED?");

    static private final SubLList $list_alt215 = list(makeString("The "), makeString("A "), makeString("An "));

    static private final SubLList $list_alt217 = list(new SubLObject[]{ reader_make_constant_shell("middleName"), reader_make_constant_shell("scientificName"), reader_make_constant_shell("nicknames"), reader_make_constant_shell("firstName"), reader_make_constant_shell("givenNames"), reader_make_constant_shell("formerName"), reader_make_constant_shell("placeName-LocalLongForm"), reader_make_constant_shell("placeName-LocalShortForm"), reader_make_constant_shell("countryName-LocalLongForm"), reader_make_constant_shell("countryName-LocalShortForm"), reader_make_constant_shell("epistleAddresseeText"), reader_make_constant_shell("abbreviationString-PN"), reader_make_constant_shell("internetCountryCode"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("geopoliticalEntityCodeDigraph") });

    static private final SubLSymbol $sym220$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    static private final SubLList $list_alt222 = list(reader_make_constant_shell("prettyString-Canonical"), reader_make_constant_shell("prettyString"));

    static private final SubLList $list_alt223 = list(NIL);

    static private final SubLList $list_alt224 = list(makeSymbol("GENITIVE-PARAPHRASE-METHOD"));

    static private final SubLString $str_alt227$Couldn_t_find__S_lexification_wit = makeString("Couldn't find ~S lexification with preds ~S for~% ~S");

    static private final SubLString $str_alt228$Reverted_to_original_phrase_ = makeString("Reverted to original phrase.");

    static private final SubLString $str_alt229$__GENERATE_NART_AS_NAUT_paraphras = makeString("~&GENERATE-NART-AS-NAUT paraphrasing ~S with category ~S.~%");

    static private final SubLString $str_alt230$__GENERATE_NART_AS_NAUT_found_unj = makeString("~&GENERATE-NART-AS-NAUT found unjustified string ~S for ~S.~%");

    static private final SubLString $str_alt238$_00 = makeString(":00");

    static private final SubLString $str_alt244$_0 = makeString(".0");

    static private final SubLString $str_alt245$_ = makeString(" ");

    static private final SubLString $str_alt246$_10 = makeString(" 10");

    static private final SubLString $str_alt249$_ = makeString(",");

    static private final SubLList $list_alt251 = list(new SubLObject[]{ makeString("no"), makeString("one"), makeString("two"), makeString("three"), makeString("four"), makeString("five"), makeString("six"), makeString("seven"), makeString("eight"), makeString("nine"), makeString("ten"), makeString("eleven"), makeString("twelve"), makeString("thirteen"), makeString("fourteen"), makeString("fifteen"), makeString("sixteen"), makeString("seventeen"), makeString("eighteen"), makeString("nineteen") });

    static private final SubLList $list_alt252 = list(cons(TWENTY_INTEGER, makeString("twenty")), cons(makeInteger(30), makeString("thirty")), cons(makeInteger(40), makeString("forty")), cons(makeInteger(50), makeString("fifty")), cons(makeInteger(60), makeString("sixty")), cons(makeInteger(70), makeString("seventy")), cons(makeInteger(80), makeString("eighty")), cons(makeInteger(90), makeString("ninety")));

    static private final SubLString $str_alt257$Was_anticipating_a_singleton_outp = makeString("Was anticipating a singleton output list, got: ~S.  Not adding disambiguation string.");

    static private final SubLSymbol $sym259$_STRING = makeSymbol("?STRING");

    static private final SubLList $list_alt261 = list(makeSymbol("?STRING"));

    static private final SubLList $list_alt262 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));

    static private final SubLString $str_alt265$_img_src___A__ = makeString("<img src=\"~A\">");

    static private final SubLList $list_alt276 = list($SELF);

    static private final SubLList $list_alt277 = list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list($BIND, makeSymbol("START-DATE")), list($BIND, makeSymbol("END-DATE")));

    static private final SubLList $list_alt282 = list(reader_make_constant_shell("SomeTimeInIntervalFn"), list(reader_make_constant_shell("TimeIntervalBetweenFn"), list($BIND, makeSymbol("START-DATE")), list($BIND, makeSymbol("END-DATE"))), list($BIND, makeSymbol("GUID")));

    static private final SubLList $list_alt287 = list(reader_make_constant_shell("SomeTimeInIntervalFn"), list(reader_make_constant_shell("IntervalEndedByFn"), list($BIND, makeSymbol("DATE"))), makeKeyword("ANYTHING"));

    static private final SubLSymbol $sym292$_TIME_INDEX = makeSymbol("?TIME-INDEX");

    static private final SubLList $list_alt294 = list(makeSymbol("?TIME-INDEX"));

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt302 = list(makeSymbol("PPH-TEST-CASE-TABLES"));

    static private final SubLList $list_alt306 = list(list(list(reader_make_constant_shell("CIAWorldFactbook1995Mt")), list(reader_make_constant_shell("YearFn"), makeInteger(1994))), list(list(list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("BaseKB"), list(reader_make_constant_shell("MtTimeDimFn"), list(reader_make_constant_shell("YearFn"), makeInteger(1994))))), list(reader_make_constant_shell("YearFn"), makeInteger(1994))));

    static private final SubLList $list_alt310 = list(reader_make_constant_shell("SomeTimeInIntervalFn"), list(reader_make_constant_shell("IntervalEndedByFn"), list($BIND, makeSymbol("END-DATE"))), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt312 = list(ONE_INTEGER, ONE_INTEGER);

    static private final SubLList $list_alt317 = list(reader_make_constant_shell("DaysDuration"), ONE_INTEGER);

    static private final SubLList $list_alt320 = list(reader_make_constant_shell("YearsDuration"), ONE_INTEGER);

    static private final SubLList $list_alt323 = list(list(list(list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(1956)))), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(1956)))), list(list(list(reader_make_constant_shell("SecondFn"), SIXTEEN_INTEGER, list(reader_make_constant_shell("MinuteFn"), makeInteger(42), list(reader_make_constant_shell("HourFn"), TWENTY_INTEGER, list(reader_make_constant_shell("DayFn"), ELEVEN_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("August"), list(reader_make_constant_shell("YearFn"), makeInteger(2004)))))))), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("August"), list(reader_make_constant_shell("YearFn"), makeInteger(2004)))), list(list(list(reader_make_constant_shell("DecadeFn"), makeInteger(198))), list(reader_make_constant_shell("DecadeFn"), makeInteger(198))));

    static private final SubLList $list_alt328 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-POSITION"), list(makeSymbol("PPH-UNKNOWN-ARG-POSITION"))), makeSymbol("OPEN-TAG"), makeSymbol("CLOSE-TAG"));

    static private final SubLList $list_alt337 = list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Relation"), reader_make_constant_shell("GAFGathering"), reader_make_constant_shell("StringBasedSearching"), reader_make_constant_shell("ObtainingAStringBasedSearchResult"), reader_make_constant_shell("LexicalItem"), reader_make_constant_shell("SKSSchema-LogicalOrPhysical"));

    static private final SubLSymbol $sym343$_POSSESSOR = makeSymbol("?POSSESSOR");

    static private final SubLList $list_alt344 = list(reader_make_constant_shell("FirstPerson-NLAttr"), reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Ungendered-NLAttr"));

    static private final SubLString $str_alt346$Couldn_t_find_possessor_for__S = makeString("Couldn't find possessor for ~S");

    static private final SubLSymbol $sym348$_POSSESSED = makeSymbol("?POSSESSED");

    static private final SubLList $list_alt349 = list(makeSymbol("POSSESSIVE-PRED"), makeSymbol("POSSESSOR"), makeSymbol("POSSESSED"));

    static private final SubLList $list_alt350 = list(reader_make_constant_shell("Individual"));

    static private final SubLString $str_alt351$_S_is_an_instance_of__S__so_using = makeString("~S is an instance of ~S, so using unlexified form.~%");

    public static final SubLObject $$BestDetNbarFn_Definite = reader_make_constant_shell("BestDetNbarFn-Definite");

    public static final SubLObject $$TermParaphraseFn_Constrained = reader_make_constant_shell("TermParaphraseFn-Constrained");

    static private final SubLString $str_alt356$Defaulting_to_English_gender_unif = makeString("Defaulting to English gender unification in non-English context");

    static private final SubLSymbol $sym366$_GENDER = makeSymbol("?GENDER");

    static private final SubLList $list_alt368 = list(makeSymbol("?GENDER"));

    static private final SubLList $list_alt369 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLString $str_alt370$Couldn_t_find_gender_for__S_in__S = makeString("Couldn't find gender for ~S in ~S");

    static private final SubLList $list_alt371 = list(reader_make_constant_shell("EnglishLanguage"));

    public static final SubLObject $$plural_Generic = reader_make_constant_shell("plural-Generic");

    static private final SubLString $str_alt383$Couldn_t_find_a_gender_for__S_in_ = makeString("Couldn't find a gender for ~S in ~S");
}

/**
 * Total time: 3043 ms
 */
