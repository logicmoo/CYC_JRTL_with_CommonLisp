/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$use_wn_linksP$;
import static com.cyc.cycjava.cycl.control_vars.lexicon_initialized_p;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_h;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_n;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_q;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
 * module:      MORPHOLOGY
 * source file: /cyc/top/cycl/morphology.lisp
 * created:     2019/07/03 17:38:15
 */
public final class morphology extends SubLTranslatedFile implements V12 {
    public static final SubLObject try_to_fix_stale_base_form_gafs() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stale = com.cyc.cycjava.cycl.morphology.find_stale_base_forms();
                SubLObject fixed_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = stale;
                SubLObject gaf = NIL;
                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                    {
                        SubLObject fixedP = com.cyc.cycjava.cycl.morphology.try_to_fix_stale_base_form_gaf(gaf);
                        if (NIL != fixedP) {
                            Errors.warn($str_alt48$Failed_to_fix__S__, gaf);
                        } else {
                            fixed_count = add(fixed_count, ONE_INTEGER);
                        }
                    }
                }
                format(StreamsLow.$debug_io$.getDynamicValue(thread), $str_alt49$Fixed__S_of__S_stale___baseForm_G, fixed_count, length(stale));
            }
            return NIL;
        }
    }

    public static final SubLObject try_to_fix_stale_base_form_gaf(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fixedP = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.morphology.base_form_gaf_staleP(gaf)) {
                        Errors.error($str_alt54$_S_is_not_stale, gaf);
                    }
                }
                {
                    SubLObject rest = NIL;
                    for (rest = assertions_high.assertion_arguments(gaf); !((NIL != fixedP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject argument = rest.first();
                            if (NIL != deduction_handles.deduction_p(argument)) {
                                {
                                    SubLObject rest_15 = NIL;
                                    for (rest_15 = deductions_high.deduction_supports(argument); !((NIL != fixedP) || (NIL == rest_15)); rest_15 = rest_15.rest()) {
                                        {
                                            SubLObject support = rest_15.first();
                                            if ((((NIL != assertion_handles.assertion_p(support)) && (NIL != assertions_high.asserted_assertionP(support))) && (NIL != assertions_high.gaf_assertionP(support))) && ($$suffixString == assertions_high.gaf_arg0(support))) {
                                                {
                                                    SubLObject assertion_var = support;
                                                    {
                                                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = fi.$the_date$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = fi.$the_second$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
                                                        try {
                                                            api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(assertion_var), thread);
                                                            fi.$the_date$.bind(assertions_high.asserted_when(assertion_var), thread);
                                                            api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(assertion_var), thread);
                                                            fi.$the_second$.bind(assertions_high.asserted_second(assertion_var), thread);
                                                            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
                                                            ke.ke_edit_assertion_preserving_meta_assertions(support, $ALL, assertions_high.gaf_formula(support), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_4, thread);
                                                            fi.$the_second$.rebind(_prev_bind_3, thread);
                                                            api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
                                                            fi.$the_date$.rebind(_prev_bind_1, thread);
                                                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                }
                                                fixedP = makeBoolean(NIL == com.cyc.cycjava.cycl.morphology.base_form_gaf_staleP(gaf));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return fixedP;
            }
        }
    }

    /**
     * In-house testing function for showing the adjective comparative form generation
     */
    @LispMethod(comment = "In-house testing function for showing the adjective comparative form generation")
    public static final SubLObject test_comp_reg() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$regularDegree;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        SubLObject done_var_18 = NIL;
                                                        SubLObject token_var_19 = NIL;
                                                        while (NIL == done_var_18) {
                                                            {
                                                                SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                SubLObject valid_20 = makeBoolean(token_var_19 != as);
                                                                if (NIL != valid_20) {
                                                                    {
                                                                        SubLObject string = assertions_high.gaf_arg2(as);
                                                                        format(T, $str_alt96$___S___S__S__, new SubLObject[]{ string, com.cyc.cycjava.cycl.morphology.comparative_reg(string), com.cyc.cycjava.cycl.morphology.superlative_reg(string) });
                                                                    }
                                                                }
                                                                done_var_18 = makeBoolean(NIL == valid_20);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
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
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @return LISTP of all derived #$baseForm GAFs derived via ADD-ENGLISH-SUFFIX that
    do not match the current behavior of ADD-ENGLISH-SUFFIX.
     */
    @LispMethod(comment = "@return LISTP of all derived #$baseForm GAFs derived via ADD-ENGLISH-SUFFIX that\r\ndo not match the current behavior of ADD-ENGLISH-SUFFIX.")
    public static final SubLObject find_stale_base_forms() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$baseForm;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                            SubLObject done_var_10 = NIL;
                                                            SubLObject token_var_11 = NIL;
                                                            while (NIL == done_var_10) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                    SubLObject valid_12 = makeBoolean(token_var_11 != gaf);
                                                                    if (NIL != valid_12) {
                                                                        if (NIL != com.cyc.cycjava.cycl.morphology.base_form_gaf_staleP(gaf)) {
                                                                            ans = cons(gaf, ans);
                                                                        }
                                                                    }
                                                                    done_var_10 = makeBoolean(NIL == valid_12);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
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
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff GAF is derived via ADD-ENGLISH-SUFFIX but
    does not match the current behavior of ADD-ENGLISH-SUFFIX.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff GAF is derived via ADD-ENGLISH-SUFFIX but\r\ndoes not match the current behavior of ADD-ENGLISH-SUFFIX.")
    public static final SubLObject base_form_gaf_staleP(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject staleP = NIL;
                if (NIL == assertions_high.asserted_assertionP(gaf)) {
                    {
                        SubLObject rest = NIL;
                        for (rest = assertions_high.assertion_arguments(gaf); !((NIL != staleP) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject argument = rest.first();
                                if (NIL != deduction_handles.deduction_p(argument)) {
                                    {
                                        SubLObject rest_14 = NIL;
                                        for (rest_14 = deductions_high.deduction_supports(argument); !((NIL != staleP) || (NIL == rest_14)); rest_14 = rest_14.rest()) {
                                            {
                                                SubLObject support = rest_14.first();
                                                if ((NIL != arguments.hl_support_p(support)) && $EVAL.eql(arguments.support_module(support))) {
                                                    {
                                                        SubLObject sentence = arguments.support_sentence(support);
                                                        SubLObject naut = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject success = formula_pattern_match.formula_matches_pattern(naut, $list_alt51);
                                                            SubLObject v_bindings = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != success) {
                                                                {
                                                                    SubLObject suffix = list_utilities.alist_lookup_without_values(v_bindings, SUFFIX, UNPROVIDED, UNPROVIDED);
                                                                    SubLObject base = list_utilities.alist_lookup_without_values(v_bindings, BASE, UNPROVIDED, UNPROVIDED);
                                                                    if (!com.cyc.cycjava.cycl.morphology.add_english_suffix(base, suffix).equal(cycl_utilities.formula_arg1(sentence, UNPROVIDED))) {
                                                                        staleP = T;
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
                return staleP;
            }
        }
    }

    static private final SubLString $str_alt45$ = makeString("");

    public static final SubLFile me = new morphology();

 public static final String myName = "com.cyc.cycjava.cycl.morphology";


    // defconstant
    @LispMethod(comment = "defconstant")
    // Definitions
    private static final SubLSymbol $vowels$ = makeSymbol("*VOWELS*");

    // defconstant
    @LispMethod(comment = "List of vowel character pairs that often occur within a single syllable\ndefconstant")
    /**
     * List of vowel character pairs that often occur within a single syllable
     */
    private static final SubLSymbol $bigraph_vowels$ = makeSymbol("*BIGRAPH-VOWELS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $sibilant_endings$ = makeSymbol("*SIBILANT-ENDINGS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $consonants$ = makeSymbol("*CONSONANTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $doublers$ = makeSymbol("*DOUBLERS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $unstressed_latin_pfxs$ = makeSymbol("*UNSTRESSED-LATIN-PFXS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $special_ate_cases$ = makeSymbol("*SPECIAL-ATE-CASES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $liquids$ = makeSymbol("*LIQUIDS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $vowelsX_plus_y$ = makeSymbol("*VOWELS*-PLUS-Y*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $aes_do_orthographic_change_fns$ = makeSymbol("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*");

    // deflexical
    /**
     * Maximum number of syllables for comparative and superlative adjectives that
     * use -er
     */
    @LispMethod(comment = "Maximum number of syllables for comparative and superlative adjectives that\r\nuse -er\ndeflexical\nMaximum number of syllables for comparative and superlative adjectives that\nuse -er")
    private static final SubLSymbol $comparative_syllable_cutoff$ = makeSymbol("*COMPARATIVE-SYLLABLE-CUTOFF*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $more_prefix$ = makeSymbol("*MORE-PREFIX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $most_prefix$ = makeSymbol("*MOST-PREFIX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $english_possessive_pronouns$ = makeSymbol("*ENGLISH-POSSESSIVE-PRONOUNS*");

    // defparameter
    /**
     *
     *
     * @unknown but I have no idea what the consequences of a larger fix might be... or why downcasing occurs at all. --TW
     */
    @LispMethod(comment = "@unknown but I have no idea what the consequences of a larger fix might be... or why downcasing occurs at all. --TW\ndefparameter")
    public static final SubLSymbol $preserve_case_in_singular_regP$ = makeSymbol("*PRESERVE-CASE-IN-SINGULAR-REG?*");

    // defparameter
    // part-of-speech keywords currently supported
    /**
     * part-of-speech keywords currently supported
     */
    @LispMethod(comment = "part-of-speech keywords currently supported\ndefparameter")
    private static final SubLSymbol $pos_keywords$ = makeSymbol("*POS-KEYWORDS*");

    private static final SubLString $str0$_Revision__149757__ = makeString("$Revision: 149757 $");

    public static final SubLSymbol $morphology_code_revision$ = makeSymbol("*MORPHOLOGY-CODE-REVISION*");

    static private final SubLList $list2 = list(new SubLObject[]{ list(makeString("1.137"), makeString("1.138")), list(makeString("1.138"), makeString("1.139")), list(makeString("1.139"), makeString("1.140")), list(makeString("1.140"), makeString("1.141")), list(makeString("1.141"), makeString("1.142")), list(makeString("1.142"), makeString("1.143")), list(makeString("1.143"), makeString("1.144")), list(makeString("1.145"), makeString("1.146")), list(makeString("1.146"), makeString("1.147")), list(makeString("1.147"), makeString("1.148")), list(makeString("1.148"), makeString("1.149")), list(makeString("1.149"), makeString("1.150")) });

    static private final SubLString $$$aeiou = makeString("aeiou");

    static private final SubLList $list4 = list(new SubLObject[]{ makeString("ai"), makeString("au"), makeString("ay"), makeString("ea"), makeString("ee"), makeString("ei"), makeString("eu"), makeString("ie"), makeString("io"), makeString("oa"), makeString("oi"), makeString("oo"), makeString("ou"), makeString("ow"), makeString("oy"), makeString("ui") });

    static private final SubLList $list5 = list(makeString("ss"), makeString("x"), makeString("sh"), makeString("ch"), makeString("z"), makeString("s"));

    static private final SubLString $$$bcdfghjklmnprstvxz = makeString("bcdfghjklmnprstvxz");

    static private final SubLString $$$bdfgklmnprtvz = makeString("bdfgklmnprtvz");

    static private final SubLList $list8 = list(makeString("re"), makeString("de"), makeString("dis"), makeString("mis"), makeString("un"), makeString("in"), makeString("ex"));

    static private final SubLList $list9 = list(new SubLObject[]{ makeString("evaporate"), makeString("appreciate"), makeString("associate"), makeString("accommodate"), makeString("affiliate"), makeString("applicate"), makeString("navigate"), makeString("calculate"), makeString("abdicate"), makeString("estimate"), makeString("emulate"), makeString("educate") });

    static private final SubLList $list10 = list(makeString("l"), makeString("r"));

    static private final SubLString $$$y = makeString("y");

    static private final SubLString $$$ly = makeString("ly");

    static private final SubLString $$$qw = makeString("qw");

    static private final SubLString $$$q = makeString("q");

    static private final SubLString $$$u = makeString("u");



    private static final SubLSymbol COMPARATIVE_REG = makeSymbol("COMPARATIVE-REG");



    private static final SubLSymbol SUPERLATIVE_REG = makeSymbol("SUPERLATIVE-REG");



    private static final SubLSymbol COMPARATIVE_ADVERB_REG = makeSymbol("COMPARATIVE-ADVERB-REG");



    private static final SubLSymbol SUPERLATIVE_ADVERB_REG = makeSymbol("SUPERLATIVE-ADVERB-REG");

    private static final SubLSymbol POS_PREDS_DERIVABLE_FROM_PRED_INT = makeSymbol("POS-PREDS-DERIVABLE-FROM-PRED-INT");



    public static final SubLSymbol $pos_preds_derivable_from_pred_int_caching_state$ = makeSymbol("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*");

    private static final SubLObject $$plural_Generic = reader_make_constant_shell("plural-Generic");

    private static final SubLObject $$singular_Generic = reader_make_constant_shell("singular-Generic");

    private static final SubLList $list32 = list(reader_make_constant_shell("plural"), reader_make_constant_shell("pnPlural"), reader_make_constant_shell("agentive-Pl"));

    private static final SubLString $$$z = makeString("z");



    private static final SubLList $list35 = list(reader_make_constant_shell("regularDegree"), reader_make_constant_shell("regularAdverb"));

    static private final SubLList $list36 = list(reader_make_constant_shell("comparativeDegree"), reader_make_constant_shell("superlativeDegree"), reader_make_constant_shell("comparativeAdverb"), reader_make_constant_shell("superlativeAdverb"));



    private static final SubLList $list39 = list(makeSymbol("RULE-BASE-PRED"), makeSymbol("SUFFIX"));



    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLString $str44$ = makeString("");

    private static final SubLList $list45 = cons(makeSymbol("CHANGE-FN"), makeSymbol("TYPE"));

    private static final SubLList $list46 = list(new SubLObject[]{ cons(makeSymbol("AES-CHANGE-Y-TO-I"), $BOTH), cons(makeSymbol("AES-ABLE-TO-ATE"), $BASE), cons(makeSymbol("AES-GEMINATE-LAST"), $BASE), cons(makeSymbol("AES-DE-TO-SE"), $BASE), cons(makeSymbol("AES-BLE-TO-BIL-BEFORE-ITY"), $BASE), cons(makeSymbol("AES-CHANGE-CEIVE-TO-CEPT"), $BASE), cons(makeSymbol("AES-CHANGE-VERT-TO-VERS"), $BASE), cons(makeSymbol("AES-CHANGE-DUCE-TO-DUCT"), $BASE), cons(makeSymbol("AES-CHANGE-AIC-TO-AC"), $BASE), cons(makeSymbol("AES-ION-TO-ATION"), makeKeyword("SUFFIX")), cons(makeSymbol("AES-STRIP-FINAL-E"), $BASE), cons(makeSymbol("AES-STRIP-FINAL-VOWELS-BEFORE-IC"), $BASE), cons(makeSymbol("AES-CHANGE-IE-TO-Y"), $BASE), cons(makeSymbol("AES-CHANGE-ISM-TO-IST"), $BASE), cons(makeSymbol("AES-REMOVE-ABLE-LE-BEFORE-LY"), $BASE), cons(makeSymbol("AES-ADD-E-BEFORE-S"), makeKeyword("SUFFIX")) });

    private static final SubLList $list47 = list($BOTH, $BASE);

    private static final SubLList $list48 = list($BOTH, makeKeyword("SUFFIX"));

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $$$e = makeString("e");

    private static final SubLString $$$ion = makeString("ion");

    private static final SubLList $list52 = list(new SubLObject[]{ makeString("port"), makeString("apt"), makeString("cit"), makeString("cite"), makeString("est"), makeString("ant"), makeString("ment"), makeString("ient"), makeString("ont"), makeString("pute"), makeString("esent"), makeString("note"), makeString("mute"), makeString("et") });

    private static final SubLString $$$ation = makeString("ation");

    private static final SubLString $$$i = makeString("i");

    private static final SubLString $$$ity = makeString("ity");

    private static final SubLString $$$ble = makeString("ble");

    private static final SubLString $$$il = makeString("il");

    private static final SubLString $$$at = makeString("at");

    private static final SubLString $$$ai = makeString("ai");

    private static final SubLString $$$ing = makeString("ing");

    private static final SubLString $$$ie = makeString("ie");

    private static final SubLString $$$ism = makeString("ism");

    private static final SubLString $$$ist = makeString("ist");

    private static final SubLString $$$ceive = makeString("ceive");

    private static final SubLString $$$ive = makeString("ive");

    private static final SubLString $$$pt = makeString("pt");

    private static final SubLString $$$vert = makeString("vert");

    private static final SubLString $$$vers = makeString("vers");

    private static final SubLString $$$duce = makeString("duce");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $$$able = makeString("able");

    private static final SubLString $$$ible = makeString("ible");

    private static final SubLString $$$le = makeString("le");

    private static final SubLString $$$de = makeString("de");

    private static final SubLString $$$is = makeString("is");

    private static final SubLList $list76 = list(makeString("ing"), makeString("ity"));

    private static final SubLString $$$se = makeString("se");

    private static final SubLString $$$ize = makeString("ize");

    private static final SubLString $$$ise = makeString("ise");

    private static final SubLString $$$al = makeString("al");

    private static final SubLString $$$er = makeString("er");

    private static final SubLString $$$or = makeString("or");

    private static final SubLString $$$fer = makeString("fer");

    private static final SubLString $$$ffer = makeString("ffer");

    private static final SubLString $$$id = makeString("id");

    private static final SubLList $list86 = list(makeString("n"), makeString("l"), makeString("t"));

    private static final SubLString $$$alicious = makeString("alicious");

    private static final SubLString $$$ate = makeString("ate");

    private static final SubLString $$$ed = makeString("ed");

    private static final SubLString $$$more_ = makeString("more ");

    private static final SubLString $$$most_ = makeString("most ");

    private static final SubLString $$$est = makeString("est");

    private static final SubLObject $$pastTense_Universal = reader_make_constant_shell("pastTense-Universal");





    private static final SubLObject $$thirdPersonSg_Present = reader_make_constant_shell("thirdPersonSg-Present");









    private static final SubLList $list101 = list(new SubLObject[]{ cons(makeString("I"), makeString("my")), cons(makeString("me"), makeString("my")), cons(makeString("you"), makeString("your")), cons(makeString("he"), makeString("his")), cons(makeString("him"), makeString("his")), cons(makeString("him or her"), makeString("his or her")), cons(makeString("he or she"), makeString("his or her")), cons(makeString("she"), makeString("her")), cons(makeString("her"), makeString("her")), cons(makeString("it"), makeString("its")), cons(makeString("we"), makeString("our")), cons(makeString("us"), makeString("our")), cons(makeString("they"), makeString("their")), cons(makeString("them"), makeString("their")), cons(makeString("there"), makeString("that place's")), cons(makeString("here"), makeString("this place's")) });

    private static final SubLString $str103$_ = makeString("'");

    private static final SubLString $str104$_s = makeString("'s");

    private static final SubLString $$$_ = makeString(" ");





    private static final SubLString $$$in = makeString("in");

    private static final SubLObject $$SurfaceRegion_Underspecified = reader_make_constant_shell("SurfaceRegion-Underspecified");

    private static final SubLString $$$on = makeString("on");

    private static final SubLList $list111 = list(makeKeyword("PROPER-NOUN"), $NOUN);

    private static final SubLList $list113 = list($NOUN, makeKeyword("PROPER-NOUN"), $VERB);

    private static final SubLSymbol FIND_STEM_MEMOIZED = makeSymbol("FIND-STEM-MEMOIZED");

    private static final SubLSymbol $find_stem_memoized_caching_state$ = makeSymbol("*FIND-STEM-MEMOIZED-CACHING-STATE*");

    private static final SubLInteger $int$16384 = makeInteger(16384);

    private static final SubLSymbol CLEAR_FIND_STEM_MEMOIZED = makeSymbol("CLEAR-FIND-STEM-MEMOIZED");

    private static final SubLString $$$ies = makeString("ies");

    private static final SubLString $$$ss = makeString("ss");

    private static final SubLList $list121 = list(makeString("o"), makeString("ch"), makeString("x"), makeString("sh"), makeString("z"), makeString("s"));

    private static final SubLString $$$ied = makeString("ied");

    private static final SubLString $$$l = makeString("l");

    private static final SubLString $$$d = makeString("d");

    private static final SubLString $$$r = makeString("r");

    private static final SubLString $$$es = makeString("es");

    private static final SubLSymbol PLURAL_NOUN_TO_SG = makeSymbol("PLURAL-NOUN-TO-SG");

    private static final SubLString $$$us = makeString("us");

    private static final SubLList $list129 = list(CHAR_r, CHAR_h, CHAR_t, CHAR_n);

    private static final SubLList $list130 = list(makeString("ch"), makeString("sh"), makeString("x"), makeString("z"));



    private static final SubLString $$$en = makeString("en");



    private static final SubLObject $$Number_SP = reader_make_constant_shell("Number-SP");







    private static final SubLString $$$yze = makeString("yze");

    private static final SubLString $$$ify = makeString("ify");

    private static final SubLString $$$logy = makeString("logy");

    private static final SubLString $$$ette = makeString("ette");

    private static final SubLString $$$ess = makeString("ess");

    private static final SubLString $$$eer = makeString("eer");

    private static final SubLString $$$omy = makeString("omy");

    private static final SubLString $$$ics = makeString("ics");

    private static final SubLString $$$geny = makeString("geny");

    private static final SubLString $$$ium = makeString("ium");

    private static final SubLString $$$cracy = makeString("cracy");

    private static final SubLString $$$itis = makeString("itis");

    private static final SubLString $$$oma = makeString("oma");

    private static final SubLString $$$lysis = makeString("lysis");

    private static final SubLString $$$hood = makeString("hood");

    private static final SubLString $$$ship = makeString("ship");

    private static final SubLString $$$lty = makeString("lty");

    private static final SubLString $$$meter = makeString("meter");

    private static final SubLString $$$morph = makeString("morph");

    private static final SubLString $$$morphy = makeString("morphy");

    private static final SubLString $$$osis = makeString("osis");

    private static final SubLString $$$stery = makeString("stery");

    private static final SubLString $$$ence = makeString("ence");

    private static final SubLString $$$tude = makeString("tude");

    private static final SubLString $$$ance = makeString("ance");

    private static final SubLString $$$graphy = makeString("graphy");

    private static final SubLString $$$ment = makeString("ment");

    private static final SubLString $$$age = makeString("age");

    private static final SubLString $$$dom = makeString("dom");

    private static final SubLString $$$ery = makeString("ery");

    private static final SubLString $$$ite = makeString("ite");

    private static final SubLString $$$let = makeString("let");

    private static final SubLString $$$ling = makeString("ling");

    private static final SubLString $$$ster = makeString("ster");

    private static final SubLString $$$ant = makeString("ant");

    private static final SubLString $$$ee = makeString("ee");

    private static final SubLString $$$ese = makeString("ese");

    private static final SubLString $$$an = makeString("an");

    private static final SubLString $$$ical = makeString("ical");

    private static final SubLString $$$ous = makeString("ous");

    private static final SubLString $$$less = makeString("less");

    private static final SubLString $$$ier = makeString("ier");

    private static final SubLString $$$nant = makeString("nant");

    private static final SubLString $$$thic = makeString("thic");

    private static final SubLString $$$etic = makeString("etic");

    private static final SubLString $$$itic = makeString("itic");

    private static final SubLString $$$ful = makeString("ful");

    private static final SubLString $$$ish = makeString("ish");

    private static final SubLString $$$like = makeString("like");

    private static final SubLString $$$ial = makeString("ial");

    private static final SubLString $$$esque = makeString("esque");

    private static final SubLString $$$ic = makeString("ic");

    private static final SubLString $$$wise = makeString("wise");

    private static final SubLString $$$ward = makeString("ward");

    private static final SubLString $$$wards = makeString("wards");

    private static final SubLList $list193 = list($NOUN, makeKeyword("PROPER-NOUN"), $VERB, makeKeyword("ADJECTIVE"), makeKeyword("ADVERB"), makeKeyword("PREPOSITION"));









    private static final SubLString $$$be = makeString("be");

    private static final SubLSymbol POS_KEYWORD_P = makeSymbol("POS-KEYWORD-P");



    private static final SubLObject $$Be_Contracted = reader_make_constant_shell("Be-Contracted");

    private static final SubLObject $$Be_TheWord = reader_make_constant_shell("Be-TheWord");

    private static final SubLObject $$Will_Contracted = reader_make_constant_shell("Will-Contracted");

    private static final SubLObject $$Will_TheModal = reader_make_constant_shell("Will-TheModal");

    private static final SubLObject $$Have_Contracted = reader_make_constant_shell("Have-Contracted");

    private static final SubLObject $$Have_TheWord = reader_make_constant_shell("Have-TheWord");

    private static final SubLObject $$Would_Contracted = reader_make_constant_shell("Would-Contracted");

    private static final SubLObject $$Would_TheWord = reader_make_constant_shell("Would-TheWord");

    /**
     * Given STRING, return a list of integers representing the character positions of the vowels in STRING.
     */
    @LispMethod(comment = "Given STRING, return a list of integers representing the character positions of the vowels in STRING.")
    public static final SubLObject get_vowel_positions_alt(SubLObject string) {
        {
            SubLObject position_list = NIL;
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_1 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_1); i = number_utilities.f_1X(i)) {
                {
                    SubLObject curr = Strings.sublisp_char(string_var, i);
                    if (((NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(curr, UNPROVIDED)) && ((i.isZero() || (!curr.equalp(CHAR_u))) || (!Strings.sublisp_char(string, number_utilities.f_1_(i)).equalp(CHAR_q)))) || ((curr.equalp(CHAR_y) && (NIL == com.cyc.cycjava.cycl.morphology.vowel_charP(string_utilities.char_at(string, number_utilities.f_1_(i)), UNPROVIDED))) && (NIL == com.cyc.cycjava.cycl.morphology.vowel_charP(string_utilities.char_at(string, number_utilities.f_1X(i)), UNPROVIDED)))) {
                        position_list = cons(i, position_list);
                    }
                }
            }
            return nreverse(position_list);
        }
    }

    /**
     * Given STRING, return a list of integers representing the character positions of the vowels in STRING.
     */
    @LispMethod(comment = "Given STRING, return a list of integers representing the character positions of the vowels in STRING.")
    public static SubLObject get_vowel_positions(final SubLObject string) {
        SubLObject position_list = NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject curr;
        for (end_var = end_var_$1 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            curr = Strings.sublisp_char(string, i);
            if (((NIL != vowel_charP(curr, UNPROVIDED)) && ((i.isZero() || (!curr.equalp(CHAR_u))) || (!Strings.sublisp_char(string, number_utilities.f_1_(i)).equalp(CHAR_q)))) || ((curr.equalp(CHAR_y) && (NIL == vowel_charP(string_utilities.char_at(string, number_utilities.f_1_(i)), UNPROVIDED))) && (NIL == vowel_charP(string_utilities.char_at(string, number_utilities.f_1X(i)), UNPROVIDED)))) {
                position_list = cons(i, position_list);
            }
        }
        return nreverse(position_list);
    }

    /**
     *
     *
     * @return INTEGERP; an estimate of how many syllables are in the English STRING
     */
    @LispMethod(comment = "@return INTEGERP; an estimate of how many syllables are in the English STRING")
    public static final SubLObject estimated_syllable_count_alt(SubLObject string) {
        {
            SubLObject vowel_positions = com.cyc.cycjava.cycl.morphology.get_vowel_positions(string);
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = vowel_positions;
            SubLObject pos = NIL;
            for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                if (!(((NIL != subl_promotions.memberP(number_utilities.f_1_(pos), vowel_positions, UNPROVIDED, UNPROVIDED)) && (NIL != member(string_utilities.substring(string, number_utilities.f_1_(pos), number_utilities.f_1X(pos)), $bigraph_vowels$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) || (Strings.sublisp_char(string, pos).equalp(CHAR_e) && (((NIL != list_utilities.lengthE(string, number_utilities.f_1X(pos), UNPROVIDED)) || (NIL != string_utilities.whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(pos))))) || string_utilities.substring(string, number_utilities.f_1X(pos), UNPROVIDED).equalp($$$ly))))) {
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
    }

    /**
     *
     *
     * @return INTEGERP; an estimate of how many syllables are in the English STRING
     */
    @LispMethod(comment = "@return INTEGERP; an estimate of how many syllables are in the English STRING")
    public static SubLObject estimated_syllable_count(final SubLObject string) {
        final SubLObject vowel_positions = get_vowel_positions(string);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = vowel_positions;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == subl_promotions.memberP(number_utilities.f_1_(pos), vowel_positions, UNPROVIDED, UNPROVIDED)) || (NIL == member(string_utilities.substring(string, number_utilities.f_1_(pos), number_utilities.f_1X(pos)), $bigraph_vowels$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) && ((!Strings.sublisp_char(string, pos).equalp(CHAR_e)) || (((NIL == list_utilities.lengthE(string, number_utilities.f_1X(pos), UNPROVIDED)) && (NIL == string_utilities.whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(pos))))) && (!string_utilities.substring(string, number_utilities.f_1X(pos), UNPROVIDED).equalp($$$ly))))) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return count;
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a monosyllable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a monosyllable?")
    public static final SubLObject monosyllabicP_alt(SubLObject string) {
        return equal(com.cyc.cycjava.cycl.morphology.estimated_syllable_count(string), ONE_INTEGER);
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a monosyllable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a monosyllable?")
    public static SubLObject monosyllabicP(final SubLObject string) {
        return equal(estimated_syllable_count(string), ONE_INTEGER);
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING have at least N syllables?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING have at least N syllables?")
    public static final SubLObject polysyllabicP_alt(SubLObject string, SubLObject min_syllable_count) {
        if (min_syllable_count == UNPROVIDED) {
            min_syllable_count = TWO_INTEGER;
        }
        return numGE(com.cyc.cycjava.cycl.morphology.estimated_syllable_count(string), min_syllable_count);
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING have at least N syllables?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING have at least N syllables?")
    public static SubLObject polysyllabicP(final SubLObject string, SubLObject min_syllable_count) {
        if (min_syllable_count == UNPROVIDED) {
            min_syllable_count = TWO_INTEGER;
        }
        return numGE(estimated_syllable_count(string), min_syllable_count);
    }

    /**
     *
     *
     * @return BOOLEAN; Is CHAR a vowel character?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CHAR a vowel character?")
    public static final SubLObject vowel_charP_alt(SubLObject v_char, SubLObject include_yP) {
        if (include_yP == UNPROVIDED) {
            include_yP = NIL;
        }
        return makeBoolean((NIL != find(v_char, $vowels$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || ((NIL != include_yP) && v_char.equalp(CHAR_y)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is CHAR a vowel character?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CHAR a vowel character?")
    public static SubLObject vowel_charP(final SubLObject v_char, SubLObject include_yP) {
        if (include_yP == UNPROVIDED) {
            include_yP = NIL;
        }
        return makeBoolean((NIL != find(v_char, $vowels$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || ((NIL != include_yP) && v_char.equalp(CHAR_y)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is CHAR a consonant character?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CHAR a consonant character?")
    public static final SubLObject consonant_charP_alt(SubLObject v_char) {
        return list_utilities.sublisp_boolean(find(v_char, $consonants$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEAN; Is CHAR a consonant character?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CHAR a consonant character?")
    public static SubLObject consonant_charP(final SubLObject v_char) {
        return list_utilities.sublisp_boolean(find(v_char, $consonants$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Given STRING, return a list of integers representing the character positions of the consonants in STRING.
     */
    @LispMethod(comment = "Given STRING, return a list of integers representing the character positions of the consonants in STRING.")
    public static final SubLObject get_consonant_positions_alt(SubLObject string) {
        {
            SubLObject position_list = NIL;
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_2 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_2); i = number_utilities.f_1X(i)) {
                {
                    SubLObject curr = Strings.sublisp_char(string_var, i);
                    if (NIL != com.cyc.cycjava.cycl.morphology.consonant_charP(curr)) {
                        {
                            SubLObject item_var = i;
                            if (NIL == member(item_var, position_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                position_list = cons(item_var, position_list);
                            }
                        }
                    }
                }
            }
            return nreverse(position_list);
        }
    }

    /**
     * Given STRING, return a list of integers representing the character positions of the consonants in STRING.
     */
    @LispMethod(comment = "Given STRING, return a list of integers representing the character positions of the consonants in STRING.")
    public static SubLObject get_consonant_positions(final SubLObject string) {
        SubLObject position_list = NIL;
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject i;
        SubLObject curr;
        SubLObject item_var;
        for (end_var = end_var_$2 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$2); i = number_utilities.f_1X(i)) {
            curr = Strings.sublisp_char(string, i);
            if (NIL != consonant_charP(curr)) {
                item_var = i;
                if (NIL == member(item_var, position_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                    position_list = cons(item_var, position_list);
                }
            }
        }
        return nreverse(position_list);
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end with a vowel?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end with a vowel?")
    public static final SubLObject ends_with_vowelP_alt(SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(string_utilities.last_char(string), T)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end with a vowel?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end with a vowel?")
    public static SubLObject ends_with_vowelP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != vowel_charP(string_utilities.last_char(string), T)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING start with a vowel?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING start with a vowel?")
    public static final SubLObject starts_with_vowelP_alt(SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(string, ZERO_INTEGER), UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING start with a vowel?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING start with a vowel?")
    public static SubLObject starts_with_vowelP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != vowel_charP(Strings.sublisp_char(string, ZERO_INTEGER), UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end with a consonant?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end with a consonant?")
    public static final SubLObject ends_with_consonantP_alt(SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphology.consonant_charP(string_utilities.last_char(string))));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end with a consonant?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end with a consonant?")
    public static SubLObject ends_with_consonantP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != consonant_charP(string_utilities.last_char(string))));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING start with a consonant?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING start with a consonant?")
    public static final SubLObject starts_with_consonantP_alt(SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (((NIL != com.cyc.cycjava.cycl.morphology.consonant_charP(Strings.sublisp_char(string, ZERO_INTEGER))) || (NIL != find(Strings.sublisp_char(string, ZERO_INTEGER), $$$qw, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (Strings.sublisp_char(string, ZERO_INTEGER).equalp(CHAR_y) && (NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(string, ONE_INTEGER), UNPROVIDED)))));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING start with a consonant?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING start with a consonant?")
    public static SubLObject starts_with_consonantP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (((NIL != consonant_charP(Strings.sublisp_char(string, ZERO_INTEGER))) || (NIL != find(Strings.sublisp_char(string, ZERO_INTEGER), $$$qw, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (((NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) && Strings.sublisp_char(string, ZERO_INTEGER).equalp(CHAR_y)) && (NIL != vowel_charP(Strings.sublisp_char(string, ONE_INTEGER), UNPROVIDED)))));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end in a single consonant?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end in a single consonant?")
    public static final SubLObject single_c_codaP_alt(SubLObject string) {
        {
            SubLObject ans = NIL;
            SubLObject rev = reverse(string);
            ans = makeBoolean(((NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) && (NIL == com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(rev, ZERO_INTEGER), UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), T)));
            return ans;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end in a single consonant?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end in a single consonant?")
    public static SubLObject single_c_codaP(final SubLObject string) {
        SubLObject ans = NIL;
        final SubLObject rev = reverse(string);
        ans = makeBoolean(((NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) && (NIL == vowel_charP(Strings.sublisp_char(rev, ZERO_INTEGER), UNPROVIDED))) && (NIL != vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), T)));
        return ans;
    }

    public static final SubLObject ends_with_doublerP_alt(SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != find(string_utilities.last_char(string), $doublers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject ends_with_doublerP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != find(string_utilities.last_char(string), $doublers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING start with an unstressed latin prefix?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING start with an unstressed latin prefix?")
    public static final SubLObject starts_with_unstressed_pfxP_alt(SubLObject string) {
        {
            SubLObject csome_list_var = $unstressed_latin_pfxs$.getGlobalValue();
            SubLObject pre = NIL;
            for (pre = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pre = csome_list_var.first()) {
                if (NIL != string_utilities.starts_with(string, pre)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING start with an unstressed latin prefix?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING start with an unstressed latin prefix?")
    public static SubLObject starts_with_unstressed_pfxP(final SubLObject string) {
        SubLObject csome_list_var = $unstressed_latin_pfxs$.getGlobalValue();
        SubLObject pre = NIL;
        pre = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != string_utilities.starts_with(string, pre)) {
                return T;
            }
            csome_list_var = csome_list_var.rest();
            pre = csome_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end in a consonant-vowel-consonant sequence?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end in a consonant-vowel-consonant sequence?")
    public static final SubLObject ends_in_cvcP_alt(SubLObject string) {
        {
            SubLObject ans = NIL;
            SubLObject rev = reverse(string);
            ans = makeBoolean((((NIL != list_utilities.lengthG(string, TWO_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphology.consonant_charP(Strings.sublisp_char(rev, ZERO_INTEGER)))) && (NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), UNPROVIDED))) && (NIL == com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(rev, TWO_INTEGER), UNPROVIDED)));
            return ans;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end in a consonant-vowel-consonant sequence?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end in a consonant-vowel-consonant sequence?")
    public static SubLObject ends_in_cvcP(final SubLObject string) {
        SubLObject ans = NIL;
        final SubLObject rev = reverse(string);
        ans = makeBoolean((((NIL != list_utilities.lengthG(string, TWO_INTEGER, UNPROVIDED)) && (NIL != consonant_charP(Strings.sublisp_char(rev, ZERO_INTEGER)))) && (NIL != vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), UNPROVIDED))) && (NIL == vowel_charP(Strings.sublisp_char(rev, TWO_INTEGER), UNPROVIDED)));
        return ans;
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end in a qu-vowel-consonant sequence?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end in a qu-vowel-consonant sequence?")
    public static final SubLObject ends_in_quvcP_alt(SubLObject string) {
        {
            SubLObject ans = NIL;
            SubLObject rev = reverse(string);
            ans = makeBoolean(((((NIL != list_utilities.lengthG(string, THREE_INTEGER, UNPROVIDED)) && (NIL != find(Strings.sublisp_char(rev, THREE_INTEGER), $$$q, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find(Strings.sublisp_char(rev, TWO_INTEGER), $$$u, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.morphology.consonant_charP(Strings.sublisp_char(rev, ZERO_INTEGER)))) && (NIL != com.cyc.cycjava.cycl.morphology.vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), UNPROVIDED)));
            return ans;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does STRING end in a qu-vowel-consonant sequence?
     */
    @LispMethod(comment = "@return BOOLEAN; Does STRING end in a qu-vowel-consonant sequence?")
    public static SubLObject ends_in_quvcP(final SubLObject string) {
        SubLObject ans = NIL;
        final SubLObject rev = reverse(string);
        ans = makeBoolean(((((NIL != list_utilities.lengthG(string, THREE_INTEGER, UNPROVIDED)) && (NIL != find(Strings.sublisp_char(rev, THREE_INTEGER), $$$q, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find(Strings.sublisp_char(rev, TWO_INTEGER), $$$u, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != consonant_charP(Strings.sublisp_char(rev, ZERO_INTEGER)))) && (NIL != vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), UNPROVIDED)));
        return ans;
    }

    /**
     * Given STRING and an integer N, double the character in the Nth position.
     */
    @LispMethod(comment = "Given STRING and an integer N, double the character in the Nth position.")
    public static final SubLObject make_geminate_alt(SubLObject string, SubLObject n) {
        if (NIL != list_utilities.lengthG(string, n, UNPROVIDED)) {
            return string_utilities.infix(string_utilities.substring(string, n, number_utilities.f_1X(n)), string, n);
        }
        return NIL;
    }

    /**
     * Given STRING and an integer N, double the character in the Nth position.
     */
    @LispMethod(comment = "Given STRING and an integer N, double the character in the Nth position.")
    public static SubLObject make_geminate(final SubLObject string, final SubLObject n) {
        if (NIL != list_utilities.lengthG(string, n, UNPROVIDED)) {
            return string_utilities.infix(string_utilities.substring(string, n, number_utilities.f_1X(n)), string, n);
        }
        return NIL;
    }

    /**
     * Double the last character of STRING.
     */
    @LispMethod(comment = "Double the last character of STRING.")
    public static final SubLObject geminate_last_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.make_geminate(string, number_utilities.f_1_(length(string)));
    }

    /**
     * Double the last character of STRING.
     */
    @LispMethod(comment = "Double the last character of STRING.")
    public static SubLObject geminate_last(final SubLObject string) {
        return make_geminate(string, number_utilities.f_1_(length(string)));
    }

    /**
     * returns WORD capitalized like CORRECT
     */
    @LispMethod(comment = "returns WORD capitalized like CORRECT")
    public static final SubLObject correct_capitalization_alt(SubLObject correct, SubLObject word) {
        if (NIL != string_utilities.lower_case_string_p(correct)) {
            return Strings.string_downcase(word, UNPROVIDED, UNPROVIDED);
        } else {
            if (NIL != string_utilities.upper_case_string_p(correct)) {
                return Strings.string_upcase(word, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL != string_utilities.capitalized_string_p(correct)) {
                    return Strings.string_capitalize(word, UNPROVIDED, UNPROVIDED);
                } else {
                    return word;
                }
            }
        }
    }

    /**
     * returns WORD capitalized like CORRECT
     */
    @LispMethod(comment = "returns WORD capitalized like CORRECT")
    public static SubLObject correct_capitalization(final SubLObject correct, final SubLObject word) {
        if (NIL != string_utilities.lower_case_string_p(correct)) {
            return Strings.string_downcase(word, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != string_utilities.upper_case_string_p(correct)) {
            return Strings.string_upcase(word, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != string_utilities.capitalized_string_p(correct)) {
            return Strings.string_capitalize(word, UNPROVIDED, UNPROVIDED);
        }
        return word;
    }

    /**
     *
     *
     * @return function ; regular inflection function to use for PRED speech parts
     */
    @LispMethod(comment = "@return function ; regular inflection function to use for PRED speech parts")
    public static final SubLObject regular_string_function_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$comparativeDegree)) {
                return symbol_function(COMPARATIVE_REG);
            } else {
                if (pcase_var.eql($$superlativeDegree)) {
                    return symbol_function(SUPERLATIVE_REG);
                } else {
                    if (pcase_var.eql($$comparativeAdverb)) {
                        return symbol_function(COMPARATIVE_ADVERB_REG);
                    } else {
                        if (pcase_var.eql($$superlativeAdverb)) {
                            return symbol_function(SUPERLATIVE_ADVERB_REG);
                        } else {
                            return symbol_function(IDENTITY);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return function ; regular inflection function to use for PRED speech parts
     */
    @LispMethod(comment = "@return function ; regular inflection function to use for PRED speech parts")
    public static SubLObject regular_string_function(final SubLObject pred) {
        if (pred.eql($$comparativeDegree)) {
            return symbol_function(COMPARATIVE_REG);
        }
        if (pred.eql($$superlativeDegree)) {
            return symbol_function(SUPERLATIVE_REG);
        }
        if (pred.eql($$comparativeAdverb)) {
            return symbol_function(COMPARATIVE_ADVERB_REG);
        }
        if (pred.eql($$superlativeAdverb)) {
            return symbol_function(SUPERLATIVE_ADVERB_REG);
        }
        return symbol_function(IDENTITY);
    }

    /**
     *
     *
     * @param PRED;
     * 		a #$SpeechPartPredicate
     * @return LISTP; of other #$SpeechPartPredicates derivable from PRED
     * @unknown baxter
     */
    @LispMethod(comment = "@param PRED;\r\n\t\ta #$SpeechPartPredicate\r\n@return LISTP; of other #$SpeechPartPredicates derivable from PRED\r\n@unknown baxter")
    public static final SubLObject pos_preds_derivable_from_pred_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return NIL != lexicon_accessors.speech_part_predP(pred, mt) ? ((SubLObject) (com.cyc.cycjava.cycl.morphology.pos_preds_derivable_from_pred_int(pred, mt, UNPROVIDED))) : NIL;
    }

    /**
     *
     *
     * @param PRED;
     * 		a #$SpeechPartPredicate
     * @return LISTP; of other #$SpeechPartPredicates derivable from PRED
     * @unknown baxter
     */
    @LispMethod(comment = "@param PRED;\r\n\t\ta #$SpeechPartPredicate\r\n@return LISTP; of other #$SpeechPartPredicates derivable from PRED\r\n@unknown baxter")
    public static SubLObject pos_preds_derivable_from_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        return NIL != lexicon_accessors.speech_part_predP(pred, mt) ? pos_preds_derivable_from_pred_int(pred, mt, UNPROVIDED) : NIL;
    }

    public static final SubLObject clear_pos_preds_derivable_from_pred_int_alt() {
        {
            SubLObject cs = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_pos_preds_derivable_from_pred_int() {
        final SubLObject cs = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_pos_preds_derivable_from_pred_int_alt(SubLObject pred, SubLObject mt, SubLObject preds) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue(), list(pred, mt, preds), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue(), list(pred, mt, preds), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Cached helper for @xref POS-PREDS-DERIVABLE-FROM-PRED
     *
     * @param PREDS;
     * 		listp of derivable preds we've already found.
     */
    @LispMethod(comment = "Cached helper for @xref POS-PREDS-DERIVABLE-FROM-PRED\r\n\r\n@param PREDS;\r\n\t\tlistp of derivable preds we\'ve already found.")
    public static final SubLObject pos_preds_derivable_from_pred_int_internal_alt(SubLObject pred, SubLObject mt, SubLObject preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(pred, $$regularSuffix, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                        SubLObject der_pred = NIL;
                        for (der_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , der_pred = cdolist_list_var.first()) {
                            if (NIL == subl_promotions.memberP(der_pred, preds, UNPROVIDED, UNPROVIDED)) {
                                preds = cons(der_pred, preds);
                                {
                                    SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.morphology.pos_preds_derivable_from_pred_int(der_pred, mt, preds);
                                    SubLObject new_pred = NIL;
                                    for (new_pred = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , new_pred = cdolist_list_var_3.first()) {
                                        {
                                            SubLObject item_var = new_pred;
                                            if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                preds = cons(item_var, preds);
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
            return preds;
        }
    }

    /**
     * Cached helper for @xref POS-PREDS-DERIVABLE-FROM-PRED
     *
     * @param PREDS;
     * 		listp of derivable preds we've already found.
     */
    @LispMethod(comment = "Cached helper for @xref POS-PREDS-DERIVABLE-FROM-PRED\r\n\r\n@param PREDS;\r\n\t\tlistp of derivable preds we\'ve already found.")
    public static SubLObject pos_preds_derivable_from_pred_int_internal(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(pred, $$regularSuffix, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject der_pred = NIL;
            der_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.memberP(der_pred, preds, UNPROVIDED, UNPROVIDED)) {
                    preds = cons(der_pred, preds);
                    SubLObject cdolist_list_var_$3 = pos_preds_derivable_from_pred_int(der_pred, mt, preds);
                    SubLObject new_pred = NIL;
                    new_pred = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        final SubLObject item_var = new_pred;
                        if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            preds = cons(item_var, preds);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        new_pred = cdolist_list_var_$3.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                der_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static final SubLObject pos_preds_derivable_from_pred_int_alt(SubLObject pred, SubLObject mt, SubLObject preds) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        {
            SubLObject caching_state = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(POS_PREDS_DERIVABLE_FROM_PRED_INT, $pos_preds_derivable_from_pred_int_caching_state$, NIL, EQL, THREE_INTEGER, $int$256);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, preds);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw30$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pred.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && preds.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morphology.pos_preds_derivable_from_pred_int_internal(pred, mt, preds)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, mt, preds));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        SubLObject caching_state = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(POS_PREDS_DERIVABLE_FROM_PRED_INT, $pos_preds_derivable_from_pred_int_caching_state$, NIL, EQL, THREE_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && preds.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pos_preds_derivable_from_pred_int_internal(pred, mt, preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt, preds));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return FORT-P; the singular predicate corresponding to PRED
     */
    @LispMethod(comment = "@return FORT-P; the singular predicate corresponding to PRED")
    public static final SubLObject singular_form_for_pred_alt(SubLObject pred) {
        if (NIL == com.cyc.cycjava.cycl.morphology.plural_predP(pred, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject ans = NIL;
            SubLObject pos = lexicon_accessors.pos_of_pred(pred);
            SubLObject other_preds = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = other_preds;
                    SubLObject other_pred = NIL;
                    for (other_pred = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_pred = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.morphology.singular_predP(other_pred, UNPROVIDED)) {
                            ans = other_pred;
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
     * @return FORT-P; the singular predicate corresponding to PRED
     */
    @LispMethod(comment = "@return FORT-P; the singular predicate corresponding to PRED")
    public static SubLObject singular_form_for_pred(final SubLObject pred) {
        if (NIL == plural_predP(pred, UNPROVIDED)) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject pos = lexicon_accessors.pos_of_pred(pred);
        final SubLObject other_preds = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
        if (NIL == ans) {
            SubLObject csome_list_var = other_preds;
            SubLObject other_pred = NIL;
            other_pred = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL != singular_predP(other_pred, UNPROVIDED)) {
                    ans = other_pred;
                }
                csome_list_var = csome_list_var.rest();
                other_pred = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static final SubLObject plural_predP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        ans = makeBoolean((NIL != fort_p(pred)) && (NIL != genl_predicates.genl_predP(pred, $$plural_Generic, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject plural_predP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = makeBoolean((NIL != forts.fort_p(pred)) && (NIL != genl_predicates.genl_predP(pred, $$plural_Generic, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject singular_predP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        ans = makeBoolean((NIL != fort_p(pred)) && (NIL != genl_predicates.genl_predP(pred, $$singular_Generic, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject singular_predP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = makeBoolean((NIL != forts.fort_p(pred)) && (NIL != genl_predicates.genl_predP(pred, $$singular_Generic, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     * Where normal English morphology would add an -s suffix, add a -z.
     * This should only be used for words with the appropriate denotations in
     * the #$ComputereseLexicalMt.
     */
    @LispMethod(comment = "Where normal English morphology would add an -s suffix, add a -z.\r\nThis should only be used for words with the appropriate denotations in\r\nthe #$ComputereseLexicalMt.\nWhere normal English morphology would add an -s suffix, add a -z.\nThis should only be used for words with the appropriate denotations in\nthe #$ComputereseLexicalMt.")
    public static final SubLObject generate_z_form_alt(SubLObject wu, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != find(pred, $list_alt33, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                            {
                                SubLObject singular_pred = com.cyc.cycjava.cycl.morphology.singular_form_for_pred(pred);
                                SubLObject root = (NIL != singular_pred) ? ((SubLObject) (kb_mapping_utilities.fpred_value(wu, singular_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                                if (NIL != root) {
                                    ans = cconcatenate(root, $$$z);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Where normal English morphology would add an -s suffix, add a -z.
     * This should only be used for words with the appropriate denotations in
     * the #$ComputereseLexicalMt.
     */
    @LispMethod(comment = "Where normal English morphology would add an -s suffix, add a -z.\r\nThis should only be used for words with the appropriate denotations in\r\nthe #$ComputereseLexicalMt.\nWhere normal English morphology would add an -s suffix, add a -z.\nThis should only be used for words with the appropriate denotations in\nthe #$ComputereseLexicalMt.")
    public static SubLObject generate_z_form(final SubLObject wu, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != find(pred, $list32, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                final SubLObject singular_pred = singular_form_for_pred(pred);
                final SubLObject root = (NIL != singular_pred) ? kb_mapping_utilities.fpred_value(wu, singular_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                if (NIL != root) {
                    ans = cconcatenate(root, $$$z);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    /**
     *
     *
     * @return LISTP of #$regularSuffix assertions for PRED.
     */
    @LispMethod(comment = "@return LISTP of #$regularSuffix assertions for PRED.")
    public static final SubLObject suffix_rules_for_pred_alt(SubLObject pred) {
        return kb_mapping.gather_gaf_arg_index_with_predicate(pred, ONE_INTEGER, $$regularSuffix, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP of #$regularSuffix assertions for PRED.
     */
    @LispMethod(comment = "@return LISTP of #$regularSuffix assertions for PRED.")
    public static SubLObject suffix_rules_for_pred(final SubLObject pred) {
        return kb_mapping.gather_gaf_arg_index_with_predicate(pred, ONE_INTEGER, $$regularSuffix, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Generate a regular form with part of speech TARGET-PRED, based on morphology rules
     * in the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.
     *
     * @return STRINGP
     * @unknown (generate-regular-string-from-form #$gerund #$infinitive "foo") -> "fooing"
     * @unknown baxter
     */
    @LispMethod(comment = "Generate a regular form with part of speech TARGET-PRED, based on morphology rules\r\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.\r\n\r\n@return STRINGP\r\n@unknown (generate-regular-string-from-form #$gerund #$infinitive \"foo\") -> \"fooing\"\r\n@unknown baxter\nGenerate a regular form with part of speech TARGET-PRED, based on morphology rules\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.")
    public static final SubLObject generate_regular_string_from_form_alt(SubLObject target_pred, SubLObject base_pred, SubLObject base_form, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = $$EnglishLexiconMt;
        }
        return com.cyc.cycjava.cycl.morphology.generate_regular_strings_from_form(target_pred, base_pred, base_form, mt_info, T, UNPROVIDED).first();
    }

    /**
     * Generate a regular form with part of speech TARGET-PRED, based on morphology rules
     * in the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.
     *
     * @return STRINGP
     * @unknown (generate-regular-string-from-form #$gerund #$infinitive "foo") -> "fooing"
     * @unknown baxter
     */
    @LispMethod(comment = "Generate a regular form with part of speech TARGET-PRED, based on morphology rules\r\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.\r\n\r\n@return STRINGP\r\n@unknown (generate-regular-string-from-form #$gerund #$infinitive \"foo\") -> \"fooing\"\r\n@unknown baxter\nGenerate a regular form with part of speech TARGET-PRED, based on morphology rules\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.")
    public static SubLObject generate_regular_string_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = $$EnglishLexiconMt;
        }
        return generate_regular_strings_from_form(target_pred, base_pred, base_form, mt_info, T, UNPROVIDED).first();
    }

    /**
     * Generate a regular form with part of speech TARGET-PRED, based on morphology rules
     * in the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.
     *
     * @return LISTP of STRINGP
     * @unknown (generate-regular-string-from-form #$gerund #$infinitive "foo") -> "fooing"
     * @unknown baxter
     */
    @LispMethod(comment = "Generate a regular form with part of speech TARGET-PRED, based on morphology rules\r\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.\r\n\r\n@return LISTP of STRINGP\r\n@unknown (generate-regular-string-from-form #$gerund #$infinitive \"foo\") -> \"fooing\"\r\n@unknown baxter\nGenerate a regular form with part of speech TARGET-PRED, based on morphology rules\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.")
    public static final SubLObject generate_regular_strings_from_form_alt(SubLObject target_pred, SubLObject base_pred, SubLObject base_form, SubLObject mt_info, SubLObject best_onlyP, SubLObject tried_preds) {
        if (mt_info == UNPROVIDED) {
            mt_info = $$EnglishLexiconMt;
        }
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = NIL;
        }
        if (tried_preds == UNPROVIDED) {
            tried_preds = NIL;
        }
        if ((NIL != subl_promotions.memberP(base_pred, $list_alt36, UNPROVIDED, UNPROVIDED)) && (NIL != member(target_pred, $list_alt37, UNPROVIDED, UNPROVIDED))) {
            {
                SubLObject inflection_function = com.cyc.cycjava.cycl.morphology.regular_string_function(target_pred);
                SubLObject form = funcall(inflection_function, base_form);
                return list(form);
            }
        } else {
            return com.cyc.cycjava.cycl.morphology.generate_regular_strings_from_form_int(target_pred, base_pred, base_form, mt_info, best_onlyP, tried_preds);
        }
    }

    /**
     * Generate a regular form with part of speech TARGET-PRED, based on morphology rules
     * in the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.
     *
     * @return LISTP of STRINGP
     * @unknown (generate-regular-string-from-form #$gerund #$infinitive "foo") -> "fooing"
     * @unknown baxter
     */
    @LispMethod(comment = "Generate a regular form with part of speech TARGET-PRED, based on morphology rules\r\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.\r\n\r\n@return LISTP of STRINGP\r\n@unknown (generate-regular-string-from-form #$gerund #$infinitive \"foo\") -> \"fooing\"\r\n@unknown baxter\nGenerate a regular form with part of speech TARGET-PRED, based on morphology rules\nin the KB and the information that the BASE-PRED form of the word in question is BASE-FORM.")
    public static SubLObject generate_regular_strings_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info, SubLObject best_onlyP, SubLObject tried_preds) {
        if (mt_info == UNPROVIDED) {
            mt_info = $$EnglishLexiconMt;
        }
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = NIL;
        }
        if (tried_preds == UNPROVIDED) {
            tried_preds = NIL;
        }
        if ((NIL != subl_promotions.memberP(base_pred, $list35, UNPROVIDED, UNPROVIDED)) && (NIL != member(target_pred, $list36, UNPROVIDED, UNPROVIDED))) {
            final SubLObject inflection_function = regular_string_function(target_pred);
            final SubLObject form = funcall(inflection_function, base_form);
            return list(form);
        }
        return generate_regular_strings_from_form_int(target_pred, base_pred, base_form, mt_info, best_onlyP, tried_preds);
    }

    /**
     * Workhorse for @xref GENERATE-REGULAR-STRINGS-FROM-FORM.
     *
     * @unknown calls GENERATE-REGULAR-STRINGS-FROM-FORM recursively.
     */
    @LispMethod(comment = "Workhorse for @xref GENERATE-REGULAR-STRINGS-FROM-FORM.\r\n\r\n@unknown calls GENERATE-REGULAR-STRINGS-FROM-FORM recursively.")
    public static final SubLObject generate_regular_strings_from_form_int_alt(SubLObject target_pred, SubLObject base_pred, SubLObject base_form, SubLObject mt_info, SubLObject best_onlyP, SubLObject tried_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject target_forms = NIL;
                SubLObject doneP = NIL;
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = com.cyc.cycjava.cycl.morphology.suffix_rules_for_pred(target_pred);
                                    SubLObject rule = NIL;
                                    for (rule = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                        {
                                            SubLObject datum = assertions_high.gaf_args(rule).rest();
                                            SubLObject current = datum;
                                            SubLObject rule_base_pred = NIL;
                                            SubLObject suffix = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt40);
                                            rule_base_pred = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt40);
                                            suffix = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (rule_base_pred == base_pred) {
                                                    {
                                                        SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(base_form, suffix);
                                                        if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            target_forms = cons(item_var, target_forms);
                                                        }
                                                    }
                                                    doneP = best_onlyP;
                                                } else {
                                                    if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                                        {
                                                            SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                                            SubLObject derived_base_forms = com.cyc.cycjava.cycl.morphology.generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                                            if (NIL == doneP) {
                                                                {
                                                                    SubLObject csome_list_var_4 = derived_base_forms;
                                                                    SubLObject derived_base_form = NIL;
                                                                    for (derived_base_form = csome_list_var_4.first(); !((NIL != doneP) || (NIL == csome_list_var_4)); csome_list_var_4 = csome_list_var_4.rest() , derived_base_form = csome_list_var_4.first()) {
                                                                        {
                                                                            SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(derived_base_form, suffix);
                                                                            if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                target_forms = cons(item_var, target_forms);
                                                                            }
                                                                        }
                                                                        doneP = best_onlyP;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt40);
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
                } else {
                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = com.cyc.cycjava.cycl.morphology.suffix_rules_for_pred(target_pred);
                                        SubLObject rule = NIL;
                                        for (rule = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                            {
                                                SubLObject datum = assertions_high.gaf_args(rule).rest();
                                                SubLObject current = datum;
                                                SubLObject rule_base_pred = NIL;
                                                SubLObject suffix = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                rule_base_pred = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt40);
                                                suffix = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (rule_base_pred == base_pred) {
                                                        {
                                                            SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(base_form, suffix);
                                                            if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                target_forms = cons(item_var, target_forms);
                                                            }
                                                        }
                                                        doneP = best_onlyP;
                                                    } else {
                                                        if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                                            {
                                                                SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                                                SubLObject derived_base_forms = com.cyc.cycjava.cycl.morphology.generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                                                if (NIL == doneP) {
                                                                    {
                                                                        SubLObject csome_list_var_5 = derived_base_forms;
                                                                        SubLObject derived_base_form = NIL;
                                                                        for (derived_base_form = csome_list_var_5.first(); !((NIL != doneP) || (NIL == csome_list_var_5)); csome_list_var_5 = csome_list_var_5.rest() , derived_base_form = csome_list_var_5.first()) {
                                                                            {
                                                                                SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(derived_base_form, suffix);
                                                                                if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    target_forms = cons(item_var, target_forms);
                                                                                }
                                                                            }
                                                                            doneP = best_onlyP;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt40);
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
                    } else {
                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var = com.cyc.cycjava.cycl.morphology.suffix_rules_for_pred(target_pred);
                                            SubLObject rule = NIL;
                                            for (rule = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                                {
                                                    SubLObject datum = assertions_high.gaf_args(rule).rest();
                                                    SubLObject current = datum;
                                                    SubLObject rule_base_pred = NIL;
                                                    SubLObject suffix = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                    rule_base_pred = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                    suffix = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (rule_base_pred == base_pred) {
                                                            {
                                                                SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(base_form, suffix);
                                                                if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    target_forms = cons(item_var, target_forms);
                                                                }
                                                            }
                                                            doneP = best_onlyP;
                                                        } else {
                                                            if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                                                {
                                                                    SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                                                    SubLObject derived_base_forms = com.cyc.cycjava.cycl.morphology.generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                                                    if (NIL == doneP) {
                                                                        {
                                                                            SubLObject csome_list_var_6 = derived_base_forms;
                                                                            SubLObject derived_base_form = NIL;
                                                                            for (derived_base_form = csome_list_var_6.first(); !((NIL != doneP) || (NIL == csome_list_var_6)); csome_list_var_6 = csome_list_var_6.rest() , derived_base_form = csome_list_var_6.first()) {
                                                                                {
                                                                                    SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(derived_base_form, suffix);
                                                                                    if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        target_forms = cons(item_var, target_forms);
                                                                                    }
                                                                                }
                                                                                doneP = best_onlyP;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt40);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var = com.cyc.cycjava.cycl.morphology.suffix_rules_for_pred(target_pred);
                                            SubLObject rule = NIL;
                                            for (rule = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                                                {
                                                    SubLObject datum = assertions_high.gaf_args(rule).rest();
                                                    SubLObject current = datum;
                                                    SubLObject rule_base_pred = NIL;
                                                    SubLObject suffix = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                    rule_base_pred = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt40);
                                                    suffix = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (rule_base_pred == base_pred) {
                                                            {
                                                                SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(base_form, suffix);
                                                                if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    target_forms = cons(item_var, target_forms);
                                                                }
                                                            }
                                                            doneP = best_onlyP;
                                                        } else {
                                                            if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                                                {
                                                                    SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                                                    SubLObject derived_base_forms = com.cyc.cycjava.cycl.morphology.generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                                                    if (NIL == doneP) {
                                                                        {
                                                                            SubLObject csome_list_var_7 = derived_base_forms;
                                                                            SubLObject derived_base_form = NIL;
                                                                            for (derived_base_form = csome_list_var_7.first(); !((NIL != doneP) || (NIL == csome_list_var_7)); csome_list_var_7 = csome_list_var_7.rest() , derived_base_form = csome_list_var_7.first()) {
                                                                                {
                                                                                    SubLObject item_var = com.cyc.cycjava.cycl.morphology.add_english_suffix(derived_base_form, suffix);
                                                                                    if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        target_forms = cons(item_var, target_forms);
                                                                                    }
                                                                                }
                                                                                doneP = best_onlyP;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt40);
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
                    }
                }
                return target_forms;
            }
        }
    }

    /**
     * Workhorse for @xref GENERATE-REGULAR-STRINGS-FROM-FORM.
     *
     * @unknown calls GENERATE-REGULAR-STRINGS-FROM-FORM recursively.
     */
    @LispMethod(comment = "Workhorse for @xref GENERATE-REGULAR-STRINGS-FROM-FORM.\r\n\r\n@unknown calls GENERATE-REGULAR-STRINGS-FROM-FORM recursively.")
    public static SubLObject generate_regular_strings_from_form_int(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, final SubLObject mt_info, final SubLObject best_onlyP, final SubLObject tried_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject target_forms = NIL;
        SubLObject doneP = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL == doneP) {
                    SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                        SubLObject rule_base_pred = NIL;
                        SubLObject suffix = NIL;
                        destructuring_bind_must_consp(current, datum, $list39);
                        rule_base_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list39);
                        suffix = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (rule_base_pred.eql(base_pred)) {
                                final SubLObject item_var = add_english_suffix(base_form, suffix);
                                if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    target_forms = cons(item_var, target_forms);
                                }
                                doneP = best_onlyP;
                            } else
                                if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                    final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                    final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var_$4 = derived_base_forms;
                                        SubLObject derived_base_form = NIL;
                                        derived_base_form = csome_list_var_$4.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var_$4)) {
                                            final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                            if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                target_forms = cons(item_var2, target_forms);
                                            }
                                            doneP = best_onlyP;
                                            csome_list_var_$4 = csome_list_var_$4.rest();
                                            derived_base_form = csome_list_var_$4.first();
                                        } 
                                    }
                                }

                        } else {
                            cdestructuring_bind_error(datum, $list39);
                        }
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    if (NIL == doneP) {
                        SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                        SubLObject rule = NIL;
                        rule = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            SubLObject current;
                            final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                            SubLObject rule_base_pred = NIL;
                            SubLObject suffix = NIL;
                            destructuring_bind_must_consp(current, datum, $list39);
                            rule_base_pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list39);
                            suffix = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (rule_base_pred.eql(base_pred)) {
                                    final SubLObject item_var = add_english_suffix(base_form, suffix);
                                    if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        target_forms = cons(item_var, target_forms);
                                    }
                                    doneP = best_onlyP;
                                } else
                                    if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                        final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                        final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                        if (NIL == doneP) {
                                            SubLObject csome_list_var_$5 = derived_base_forms;
                                            SubLObject derived_base_form = NIL;
                                            derived_base_form = csome_list_var_$5.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var_$5)) {
                                                final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                                if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    target_forms = cons(item_var2, target_forms);
                                                }
                                                doneP = best_onlyP;
                                                csome_list_var_$5 = csome_list_var_$5.rest();
                                                derived_base_form = csome_list_var_$5.first();
                                            } 
                                        }
                                    }

                            } else {
                                cdestructuring_bind_error(datum, $list39);
                            }
                            csome_list_var = csome_list_var.rest();
                            rule = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                            SubLObject rule = NIL;
                            rule = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                                SubLObject rule_base_pred = NIL;
                                SubLObject suffix = NIL;
                                destructuring_bind_must_consp(current, datum, $list39);
                                rule_base_pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list39);
                                suffix = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (rule_base_pred.eql(base_pred)) {
                                        final SubLObject item_var = add_english_suffix(base_form, suffix);
                                        if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            target_forms = cons(item_var, target_forms);
                                        }
                                        doneP = best_onlyP;
                                    } else
                                        if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                            final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                            final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                            if (NIL == doneP) {
                                                SubLObject csome_list_var_$6 = derived_base_forms;
                                                SubLObject derived_base_form = NIL;
                                                derived_base_form = csome_list_var_$6.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var_$6)) {
                                                    final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                                    if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        target_forms = cons(item_var2, target_forms);
                                                    }
                                                    doneP = best_onlyP;
                                                    csome_list_var_$6 = csome_list_var_$6.rest();
                                                    derived_base_form = csome_list_var_$6.first();
                                                } 
                                            }
                                        }

                                } else {
                                    cdestructuring_bind_error(datum, $list39);
                                }
                                csome_list_var = csome_list_var.rest();
                                rule = csome_list_var.first();
                            } 
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                            SubLObject rule = NIL;
                            rule = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                                SubLObject rule_base_pred = NIL;
                                SubLObject suffix = NIL;
                                destructuring_bind_must_consp(current, datum, $list39);
                                rule_base_pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list39);
                                suffix = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (rule_base_pred.eql(base_pred)) {
                                        final SubLObject item_var = add_english_suffix(base_form, suffix);
                                        if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            target_forms = cons(item_var, target_forms);
                                        }
                                        doneP = best_onlyP;
                                    } else
                                        if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                            final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                            final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                            if (NIL == doneP) {
                                                SubLObject csome_list_var_$7 = derived_base_forms;
                                                SubLObject derived_base_form = NIL;
                                                derived_base_form = csome_list_var_$7.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var_$7)) {
                                                    final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                                    if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        target_forms = cons(item_var2, target_forms);
                                                    }
                                                    doneP = best_onlyP;
                                                    csome_list_var_$7 = csome_list_var_$7.rest();
                                                    derived_base_form = csome_list_var_$7.first();
                                                } 
                                            }
                                        }

                                } else {
                                    cdestructuring_bind_error(datum, $list39);
                                }
                                csome_list_var = csome_list_var.rest();
                                rule = csome_list_var.first();
                            } 
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return target_forms;
    }

    /**
     * Add SUFFIX to the end of BASE, making any regular orthographic changes as well.
     *
     * @return STRINGP
     * @unknown baxter
     */
    @LispMethod(comment = "Add SUFFIX to the end of BASE, making any regular orthographic changes as well.\r\n\r\n@return STRINGP\r\n@unknown baxter")
    public static final SubLObject add_english_suffix_alt(SubLObject base, SubLObject suffix) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(base, STRINGP);
            SubLTrampolineFile.checkType(suffix, STRINGP);
            if (suffix.equal($str_alt45$)) {
                return base;
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject base_8 = com.cyc.cycjava.cycl.morphology.aes_do_orthographic_changes(base, suffix);
                    SubLObject suffix_9 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    base = base_8;
                    suffix = suffix_9;
                }
                return string_utilities.post_fix(base, suffix);
            }
        }
    }

    /**
     * Add SUFFIX to the end of BASE, making any regular orthographic changes as well.
     *
     * @return STRINGP
     * @unknown baxter
     */
    @LispMethod(comment = "Add SUFFIX to the end of BASE, making any regular orthographic changes as well.\r\n\r\n@return STRINGP\r\n@unknown baxter")
    public static SubLObject add_english_suffix(SubLObject base, SubLObject suffix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_string.cycl_string_p(base) : "! cycl_string.cycl_string_p(base) " + ("cycl_string.cycl_string_p(base) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(base) ") + base;
        assert NIL != cycl_string.cycl_string_p(suffix) : "! cycl_string.cycl_string_p(suffix) " + ("cycl_string.cycl_string_p(suffix) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(suffix) ") + suffix;
        if (suffix.equal($str44$)) {
            return base;
        }
        thread.resetMultipleValues();
        final SubLObject base_$8 = aes_do_orthographic_changes(base, suffix);
        final SubLObject suffix_$9 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        base = base_$8;
        suffix = suffix_$9;
        return string_utilities.post_fix(base, suffix);
    }

    /**
     * Do any necessary orthographic changes before adding SUFFIX to BASE.
     *
     * @unknown Assumes BASE and SUFFIX are STRINGP, and that SUFFIX is not the empty string.
     */
    @LispMethod(comment = "Do any necessary orthographic changes before adding SUFFIX to BASE.\r\n\r\n@unknown Assumes BASE and SUFFIX are STRINGP, and that SUFFIX is not the empty string.")
    public static final SubLObject aes_do_orthographic_changes_alt(SubLObject base, SubLObject suffix) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_suffix = suffix;
                SubLObject current_base = base;
                SubLObject changers = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.morphology.aes_do_orthographic_change_fns();
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject change_fn = NIL;
                        SubLObject type = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt57);
                        change_fn = current.first();
                        current = current.rest();
                        type = current;
                        thread.resetMultipleValues();
                        {
                            SubLObject new_base = com.cyc.cycjava.cycl.morphology.aes_do_orthographic_change(current_base, current_suffix, change_fn, type);
                            SubLObject new_suffix = thread.secondMultipleValue();
                            SubLObject changedP = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != changedP) {
                                changers = cons(change_fn, changers);
                                current_base = new_base;
                                current_suffix = new_suffix;
                            }
                        }
                    }
                }
                return values(current_base, current_suffix, changers);
            }
        }
    }

    @LispMethod(comment = "Do any necessary orthographic changes before adding SUFFIX to BASE.\r\n\r\n@unknown Assumes BASE and SUFFIX are STRINGP, and that SUFFIX is not the empty string.")
    public static SubLObject aes_do_orthographic_changes(final SubLObject base, final SubLObject suffix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_suffix = suffix;
        SubLObject current_base = base;
        SubLObject changers = NIL;
        SubLObject cdolist_list_var = aes_do_orthographic_change_fns();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject change_fn = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            change_fn = current.first();
            current = type = current.rest();
            thread.resetMultipleValues();
            final SubLObject new_base = aes_do_orthographic_change(current_base, current_suffix, change_fn, type);
            final SubLObject new_suffix = thread.secondMultipleValue();
            final SubLObject changedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != changedP) {
                changers = cons(change_fn, changers);
                current_base = new_base;
                current_suffix = new_suffix;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return values(current_base, current_suffix, changers);
    }/**
     * Do any necessary orthographic changes before adding SUFFIX to BASE.
     *
     * @unknown Assumes BASE and SUFFIX are STRINGP, and that SUFFIX is not the empty string.
     */


    public static final SubLObject aes_do_orthographic_change_fns_alt() {
        return $aes_do_orthographic_change_fns$.getGlobalValue();
    }

    public static SubLObject aes_do_orthographic_change_fns() {
        return $aes_do_orthographic_change_fns$.getGlobalValue();
    }

    /**
     *
     *
     * @unknown - Test-case table is in tests/regular-morphological-forms.lisp
     */
    @LispMethod(comment = "@unknown - Test-case table is in tests/regular-morphological-forms.lisp")
    public static final SubLObject aes_do_orthographic_change_alt(SubLObject base, SubLObject suffix, SubLObject change_fn, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_suffix = suffix;
                SubLObject new_base = base;
                SubLObject base_changerP = member(type, $list_alt59, UNPROVIDED, UNPROVIDED);
                SubLObject suffix_changerP = member(type, $list_alt60, UNPROVIDED, UNPROVIDED);
                if ((NIL != base_changerP) && (NIL != suffix_changerP)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject new_base_16 = funcall(change_fn, base, suffix);
                        SubLObject new_suffix_17 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_base = new_base_16;
                        new_suffix = new_suffix_17;
                    }
                } else {
                    if (NIL != base_changerP) {
                        new_base = funcall(change_fn, base, suffix);
                    } else {
                        if (NIL != suffix_changerP) {
                            new_suffix = funcall(change_fn, base, suffix);
                        }
                    }
                }
                {
                    SubLObject changedP = makeBoolean((!base.equal(new_base)) || (!suffix.equal(new_suffix)));
                    return values(new_base, new_suffix, changedP);
                }
            }
        }
    }

    /**
     *
     *
     * @unknown - Test-case table is in tests/regular-morphological-forms.lisp
     */
    @LispMethod(comment = "@unknown - Test-case table is in tests/regular-morphological-forms.lisp")
    public static SubLObject aes_do_orthographic_change(final SubLObject base, final SubLObject suffix, final SubLObject change_fn, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_suffix = suffix;
        SubLObject new_base = base;
        final SubLObject base_changerP = member(type, $list47, UNPROVIDED, UNPROVIDED);
        final SubLObject suffix_changerP = member(type, $list48, UNPROVIDED, UNPROVIDED);
        if ((NIL != base_changerP) && (NIL != suffix_changerP)) {
            thread.resetMultipleValues();
            final SubLObject new_base_$10 = funcall(change_fn, base, suffix);
            final SubLObject new_suffix_$11 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_base = new_base_$10;
            new_suffix = new_suffix_$11;
        } else
            if (NIL != base_changerP) {
                new_base = funcall(change_fn, base, suffix);
            } else
                if (NIL != suffix_changerP) {
                    new_suffix = funcall(change_fn, base, suffix);
                }


        final SubLObject changedP = makeBoolean((!base.equal(new_base)) || (!suffix.equal(new_suffix)));
        return values(new_base, new_suffix, changedP);
    }

    public static final SubLObject ends_with_sibilantP_alt(SubLObject string) {
        return string_utilities.ends_with_one_of(string, $sibilant_endings$.getGlobalValue());
    }

    public static SubLObject ends_with_sibilantP(final SubLObject string) {
        return string_utilities.ends_with_one_of(string, $sibilant_endings$.getGlobalValue());
    }

    public static final SubLObject aes_add_e_before_s_alt(SubLObject base, SubLObject suffix) {
        if ((NIL != com.cyc.cycjava.cycl.morphology.ends_with_sibilantP(base)) && (NIL != string_utilities.starts_with(suffix, $$$s))) {
            suffix = cconcatenate($$$e, suffix);
        }
        return suffix;
    }

    public static SubLObject aes_add_e_before_s(final SubLObject base, SubLObject suffix) {
        if ((NIL != ends_with_sibilantP(base)) && (NIL != string_utilities.starts_with(suffix, $$$s))) {
            suffix = cconcatenate($$$e, suffix);
        }
        return suffix;
    }

    public static SubLObject aes_ion_to_ation(final SubLObject base, SubLObject suffix) {
        if (suffix.equal($$$ion) && (NIL != string_utilities.ends_with_one_of(base, $list52))) {
            suffix = $$$ation;
        }
        return suffix;
    }

    public static final SubLObject aes_change_y_to_i_alt(SubLObject base, SubLObject suffix) {
        if (((NIL != string_utilities.ends_with(base, $$$y, UNPROVIDED)) && (NIL == string_utilities.starts_with(suffix, $$$i))) && (NIL == com.cyc.cycjava.cycl.morphology.ends_with_vowelP(string_utilities.strip_final(base, UNPROVIDED)))) {
            base = cconcatenate(string_utilities.strip_final(base, UNPROVIDED), $$$i);
            if ((NIL != list_utilities.lengthE(suffix, ONE_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphology.starts_with_consonantP(suffix))) {
                suffix = cconcatenate($$$e, suffix);
            }
        }
        return values(base, suffix);
    }

    public static SubLObject aes_change_y_to_i(SubLObject base, SubLObject suffix) {
        if (((NIL != string_utilities.ends_with(base, $$$y, UNPROVIDED)) && (NIL == string_utilities.starts_with(suffix, $$$i))) && (NIL == ends_with_vowelP(string_utilities.strip_final(base, UNPROVIDED)))) {
            base = cconcatenate(string_utilities.strip_final(base, UNPROVIDED), $$$i);
            if ((NIL != list_utilities.lengthE(suffix, ONE_INTEGER, UNPROVIDED)) && (NIL != starts_with_consonantP(suffix))) {
                suffix = cconcatenate($$$e, suffix);
            }
        }
        return values(base, suffix);
    }

    public static final SubLObject aes_ble_to_bil_before_ity_alt(SubLObject base, SubLObject suffix) {
        if (suffix.equalp($$$ity) && (NIL != string_utilities.ends_with(base, $$$ble, UNPROVIDED))) {
            base = cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$il);
        }
        return base;
    }

    public static SubLObject aes_ble_to_bil_before_ity(SubLObject base, final SubLObject suffix) {
        if (suffix.equalp($$$ity) && (NIL != string_utilities.ends_with(base, $$$ble, UNPROVIDED))) {
            base = cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$il);
        }
        return base;
    }

    /**
     * exclamation, etc.
     */
    @LispMethod(comment = "exclamation, etc.")
    public static final SubLObject aes_change_aic_to_ac_alt(SubLObject base, SubLObject suffix) {
        if (((NIL != string_utilities.starts_with(suffix, $$$at)) && (NIL != string_utilities.ends_with(string_utilities.strip_final(base, UNPROVIDED), $$$ai, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.morphology.ends_with_consonantP(base))) {
            base = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(base, TWO_INTEGER)), format_nil.format_nil_a_no_copy(string_utilities.last_char(base)));
        }
        return base;
    }

    @LispMethod(comment = "exclamation, etc.")
    public static SubLObject aes_change_aic_to_ac(SubLObject base, final SubLObject suffix) {
        if (((NIL != string_utilities.starts_with(suffix, $$$at)) && (NIL != string_utilities.ends_with(string_utilities.strip_final(base, UNPROVIDED), $$$ai, UNPROVIDED))) && (NIL != ends_with_consonantP(base))) {
            base = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(base, TWO_INTEGER)), format_nil.format_nil_a_no_copy(string_utilities.last_char(base)));
        }
        return base;
    }/**
     * exclamation, etc.
     */


    public static final SubLObject aes_strip_final_e_alt(SubLObject base, SubLObject suffix) {
        if (((NIL != list_utilities.lengthG(base, ONE_INTEGER, UNPROVIDED)) && (NIL != string_utilities.ends_with(base, $$$e, UNPROVIDED))) && ((NIL != string_utilities.starts_with(suffix, $$$e)) || (((NIL != string_utilities.ends_with(string_utilities.strip_final(base, UNPROVIDED), $$$u, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.morphology.ends_with_consonantP(string_utilities.strip_final(base, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.morphology.starts_with_vowelP(suffix))))) {
            base = string_utilities.strip_final(base, UNPROVIDED);
        }
        return base;
    }

    public static SubLObject aes_strip_final_e(SubLObject base, final SubLObject suffix) {
        if (((NIL != list_utilities.lengthG(base, ONE_INTEGER, UNPROVIDED)) && (NIL != string_utilities.ends_with(base, $$$e, UNPROVIDED))) && ((NIL != string_utilities.starts_with(suffix, $$$e)) || (((NIL != string_utilities.ends_with(string_utilities.strip_final(base, UNPROVIDED), $$$u, UNPROVIDED)) || (NIL != ends_with_consonantP(string_utilities.strip_final(base, UNPROVIDED)))) && (NIL != starts_with_vowelP(suffix))))) {
            base = string_utilities.strip_final(base, UNPROVIDED);
        }
        return base;
    }

    /**
     * pianist, quadriplegic, etc.
     */
    @LispMethod(comment = "pianist, quadriplegic, etc.")
    public static final SubLObject aes_strip_final_vowels_before_ic_alt(SubLObject base, SubLObject suffix) {
        if (((((NIL != string_utilities.starts_with(suffix, $$$i)) && (!suffix.equalp($$$ing))) && (NIL != list_utilities.lengthG(suffix, ONE_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.morphology.polysyllabicP(base, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.morphology.starts_with_consonantP(string_utilities.substring(suffix, ONE_INTEGER, UNPROVIDED)))) {
            while (NIL != com.cyc.cycjava.cycl.morphology.ends_with_vowelP(base)) {
                base = string_utilities.strip_final(base, UNPROVIDED);
            } 
        }
        return base;
    }

    @LispMethod(comment = "pianist, quadriplegic, etc.")
    public static SubLObject aes_strip_final_vowels_before_ic(SubLObject base, final SubLObject suffix) {
        if (((((NIL != string_utilities.starts_with(suffix, $$$i)) && (!suffix.equalp($$$ing))) && (NIL != list_utilities.lengthG(suffix, ONE_INTEGER, UNPROVIDED))) && (NIL != polysyllabicP(base, UNPROVIDED))) && (NIL != starts_with_consonantP(string_utilities.substring(suffix, ONE_INTEGER, UNPROVIDED)))) {
            while (NIL != ends_with_vowelP(base)) {
                base = string_utilities.strip_final(base, UNPROVIDED);
            } 
        }
        return base;
    }/**
     * pianist, quadriplegic, etc.
     */


    public static final SubLObject aes_change_ie_to_y_alt(SubLObject base, SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ie, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$i))) {
            base = cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$y);
        }
        return base;
    }

    public static SubLObject aes_change_ie_to_y(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ie, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$i))) {
            base = cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$y);
        }
        return base;
    }

    /**
     *
     *
     * @unknown 'environmentalist' derived from 'environmentalism'
     * @unknown nancy
     */
    @LispMethod(comment = "@unknown \'environmentalist\' derived from \'environmentalism\'\r\n@unknown nancy")
    public static final SubLObject aes_change_ism_to_ist_alt(SubLObject base, SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ism, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = string_utilities.remove_substring(base, $$$ism);
        }
        return base;
    }

    /**
     *
     *
     * @unknown 'environmentalist' derived from 'environmentalism'
     * @unknown nancy
     */
    @LispMethod(comment = "@unknown \'environmentalist\' derived from \'environmentalism\'\r\n@unknown nancy")
    public static SubLObject aes_change_ism_to_ist(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ism, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = string_utilities.remove_substring(base, $$$ism);
        }
        return base;
    }

    /**
     *
     *
     * @unknown 'conception' derived from 'conceive'
     */
    @LispMethod(comment = "@unknown \'conception\' derived from \'conceive\'")
    public static final SubLObject aes_change_ceive_to_cept_alt(SubLObject base, SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ceive, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.remove_substring(base, $$$ive), $$$pt);
        }
        return base;
    }

    /**
     *
     *
     * @unknown 'conception' derived from 'conceive'
     */
    @LispMethod(comment = "@unknown \'conception\' derived from \'conceive\'")
    public static SubLObject aes_change_ceive_to_cept(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ceive, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.remove_substring(base, $$$ive), $$$pt);
        }
        return base;
    }

    public static SubLObject aes_change_vert_to_vers(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$vert, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.post_remove(base, $$$vert, UNPROVIDED), $$$vers);
        }
        return base;
    }

    public static SubLObject aes_change_duce_to_duct(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$duce, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.post_remove(base, $$$e, UNPROVIDED), $$$t);
        }
        return base;
    }

    public static final SubLObject aes_remove_able_le_before_ly_alt(SubLObject base, SubLObject suffix) {
        if (((NIL != string_utilities.ends_with(base, $$$able, UNPROVIDED)) || (NIL != string_utilities.ends_with(base, $$$ible, UNPROVIDED))) && (NIL != Strings.string_equal(suffix, $$$ly, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = string_utilities.remove_substring(base, $$$le);
        }
        return base;
    }

    public static SubLObject aes_remove_able_le_before_ly(SubLObject base, final SubLObject suffix) {
        if (((NIL != string_utilities.ends_with(base, $$$able, UNPROVIDED)) || (NIL != string_utilities.ends_with(base, $$$ible, UNPROVIDED))) && (NIL != Strings.string_equal(suffix, $$$ly, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = string_utilities.remove_substring(base, $$$le);
        }
        return base;
    }

    public static SubLObject aes_de_to_se(SubLObject base, final SubLObject suffix) {
        if ((((NIL != string_utilities.ends_with(base, $$$de, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$i))) && (NIL == string_utilities.starts_with(suffix, $$$is))) && (NIL == subl_promotions.memberP(suffix, $list76, symbol_function(EQUAL), UNPROVIDED))) {
            base = cconcatenate(string_utilities.post_remove(base, $$$de, UNPROVIDED), $$$se);
        }
        return base;
    }

    public static final SubLObject aes_geminate_last_alt(SubLObject base, SubLObject suffix) {
        if ((((((((((NIL != string_utilities.ends_with(base, $$$z, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.morphology.starts_with_vowelP(suffix))) || suffix.equalp($$$y)) && (NIL != com.cyc.cycjava.cycl.morphology.ends_with_doublerP(base))) && ((NIL != com.cyc.cycjava.cycl.morphology.ends_in_cvcP(base)) || (NIL != com.cyc.cycjava.cycl.morphology.ends_in_quvcP(base)))) && (!suffix.equalp($$$able))) && ((!(suffix.equalp($$$ize) || suffix.equalp($$$ise))) || (NIL != string_utilities.ends_with(base, $$$al, UNPROVIDED)))) && ((!((NIL != string_utilities.ends_with(base, $$$er, UNPROVIDED)) || (NIL != string_utilities.ends_with(base, $$$or, UNPROVIDED)))) || ((NIL != string_utilities.ends_with(base, $$$fer, UNPROVIDED)) && (NIL == string_utilities.ends_with(base, $$$ffer, UNPROVIDED))))) && ((NIL == string_utilities.ends_with(base, $$$id, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.morphology.monosyllabicP(base)))) && ((NIL == string_utilities.ends_with_one_of(base, $list_alt88)) || (NIL != com.cyc.cycjava.cycl.morphology.monosyllabicP(base)))) {
            base = com.cyc.cycjava.cycl.morphology.geminate_last(base);
        }
        return base;
    }

    public static SubLObject aes_geminate_last(SubLObject base, final SubLObject suffix) {
        if ((((((((((NIL != string_utilities.ends_with(base, $$$z, UNPROVIDED)) || (NIL != starts_with_vowelP(suffix))) || suffix.equalp($$$y)) && (NIL != ends_with_doublerP(base))) && (NIL == dont_geminate_beforeP(suffix))) && ((NIL != ends_in_cvcP(base)) || (NIL != ends_in_quvcP(base)))) && (((!suffix.equalp($$$ize)) && (!suffix.equalp($$$ise))) || (NIL != string_utilities.ends_with(base, $$$al, UNPROVIDED)))) && (((NIL == string_utilities.ends_with(base, $$$er, UNPROVIDED)) && (NIL == string_utilities.ends_with(base, $$$or, UNPROVIDED))) || ((NIL != string_utilities.ends_with(base, $$$fer, UNPROVIDED)) && (NIL == string_utilities.ends_with(base, $$$ffer, UNPROVIDED))))) && ((NIL == string_utilities.ends_with(base, $$$id, UNPROVIDED)) || (NIL != monosyllabicP(base)))) && ((NIL == string_utilities.ends_with_one_of(base, $list86)) || (NIL != monosyllabicP(base)))) {
            base = geminate_last(base);
        }
        return base;
    }

    public static SubLObject dont_geminate_beforeP(final SubLObject suffix) {
        return makeBoolean((suffix.equalp($$$able) || suffix.equalp($$$ity)) || suffix.equalp($$$alicious));
    }

    /**
     * When base is "ate" and suffix is "able", returns "at" for base when syllable count is 2 or under, e.g. "debate" --> "debatable", or when base is not one of the special case list; otherwise, retuns with entire "ate" removed, e.g. "evaporate" --> "evaporable"
     */
    @LispMethod(comment = "When base is \"ate\" and suffix is \"able\", returns \"at\" for base when syllable count is 2 or under, e.g. \"debate\" --> \"debatable\", or when base is not one of the special case list; otherwise, retuns with entire \"ate\" removed, e.g. \"evaporate\" --> \"evaporable\"")
    public static final SubLObject aes_able_to_ate_alt(SubLObject base, SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ate, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$able, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            if (com.cyc.cycjava.cycl.morphology.estimated_syllable_count(base).numLE(TWO_INTEGER)) {
                base = string_utilities.post_remove(base, $$$e, UNPROVIDED);
                return base;
            } else {
                if (NIL != subl_promotions.memberP(base, $special_ate_cases$.getGlobalValue(), EQUALP, UNPROVIDED)) {
                    base = string_utilities.remove_substring(base, $$$ate);
                    return base;
                } else {
                    base = string_utilities.post_remove(base, $$$e, UNPROVIDED);
                    return base;
                }
            }
        }
        return base;
    }

    @LispMethod(comment = "When base is \"ate\" and suffix is \"able\", returns \"at\" for base when syllable count is 2 or under, e.g. \"debate\" --> \"debatable\", or when base is not one of the special case list; otherwise, retuns with entire \"ate\" removed, e.g. \"evaporate\" --> \"evaporable\"")
    public static SubLObject aes_able_to_ate(SubLObject base, final SubLObject suffix) {
        if ((NIL == string_utilities.ends_with(base, $$$ate, UNPROVIDED)) || (NIL == Strings.string_equal(suffix, $$$able, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return base;
        }
        if (estimated_syllable_count(base).numLE(TWO_INTEGER)) {
            base = string_utilities.post_remove(base, $$$e, UNPROVIDED);
            return base;
        }
        if (NIL != subl_promotions.memberP(base, $special_ate_cases$.getGlobalValue(), EQUALP, UNPROVIDED)) {
            base = string_utilities.remove_substring(base, $$$ate);
            return base;
        }
        base = string_utilities.post_remove(base, $$$e, UNPROVIDED);
        return base;
    }/**
     * When base is "ate" and suffix is "able", returns "at" for base when syllable count is 2 or under, e.g. "debate" --> "debatable", or when base is not one of the special case list; otherwise, retuns with entire "ate" removed, e.g. "evaporate" --> "evaporable"
     */


    /**
     *
     *
     * @return BOOLEAN; Does BASE-FORM look like the kind of #$regularDegree form that
    we should generate a regular comparative or superlative form from?
     */
    @LispMethod(comment = "@return BOOLEAN; Does BASE-FORM look like the kind of #$regularDegree form that\r\nwe should generate a regular comparative or superlative form from?")
    public static final SubLObject try_regular_adj_morphologyP_alt(SubLObject base_form) {
        {
            SubLObject cutoff = $comparative_syllable_cutoff$.getGlobalValue();
            return makeBoolean((NIL == string_utilities.ends_with(base_form, $$$ed, UNPROVIDED)) && com.cyc.cycjava.cycl.morphology.estimated_syllable_count(base_form).numLE(cutoff));
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does BASE-FORM look like the kind of #$regularDegree form that
    we should generate a regular comparative or superlative form from?
     */
    @LispMethod(comment = "@return BOOLEAN; Does BASE-FORM look like the kind of #$regularDegree form that\r\nwe should generate a regular comparative or superlative form from?")
    public static SubLObject try_regular_adj_morphologyP(final SubLObject base_form) {
        final SubLObject cutoff = $comparative_syllable_cutoff$.getGlobalValue();
        return makeBoolean((NIL == string_utilities.ends_with(base_form, $$$ed, UNPROVIDED)) && estimated_syllable_count(base_form).numLE(cutoff));
    }

    public static final SubLObject most_form_alt(SubLObject string) {
        return cconcatenate($most_prefix$.getGlobalValue(), string);
    }

    public static SubLObject most_form(final SubLObject string) {
        return cconcatenate($most_prefix$.getGlobalValue(), string);
    }

    public static final SubLObject more_form_alt(SubLObject string) {
        return cconcatenate($more_prefix$.getGlobalValue(), string);
    }

    public static SubLObject more_form(final SubLObject string) {
        return cconcatenate($more_prefix$.getGlobalValue(), string);
    }

    public static final SubLObject most_form_p_alt(SubLObject string) {
        return string_utilities.starts_with(string, $most_prefix$.getGlobalValue());
    }

    public static SubLObject most_form_p(final SubLObject string) {
        return string_utilities.starts_with(string, $most_prefix$.getGlobalValue());
    }

    public static final SubLObject more_form_p_alt(SubLObject string) {
        return string_utilities.starts_with(string, $more_prefix$.getGlobalValue());
    }

    public static SubLObject more_form_p(final SubLObject string) {
        return string_utilities.starts_with(string, $more_prefix$.getGlobalValue());
    }

    /**
     *
     *
     * @param PRED
    speech-part-pred?.
     * 		
     * @return STRINGP; STRING with 'more' or 'most' added, as appropriate for PRED.
     */
    @LispMethod(comment = "@param PRED\nspeech-part-pred?.\r\n\t\t\r\n@return STRINGP; STRING with \'more\' or \'most\' added, as appropriate for PRED.")
    public static final SubLObject more_or_most_form_alt(SubLObject string, SubLObject pred) {
        if (NIL != lexicon_cache.comparative_formP(pred)) {
            return com.cyc.cycjava.cycl.morphology.more_form(string);
        } else {
            if (NIL != lexicon_cache.superlative_formP(pred)) {
                return com.cyc.cycjava.cycl.morphology.most_form(string);
            } else {
                Errors.warn($str_alt93$Assuming__S_is_comparative__Addin, pred, $more_prefix$.getGlobalValue(), string);
                return com.cyc.cycjava.cycl.morphology.more_form(string);
            }
        }
    }

    /**
     *
     *
     * @param PRED
    speech-part-pred?.
     * 		
     * @return STRINGP; STRING with 'more' or 'most' added, as appropriate for PRED.
     */
    @LispMethod(comment = "@param PRED\nspeech-part-pred?.\r\n\t\t\r\n@return STRINGP; STRING with \'more\' or \'most\' added, as appropriate for PRED.")
    public static SubLObject more_or_most_form(final SubLObject string, final SubLObject pred) {
        if (NIL != lexicon_cache.comparative_formP(pred)) {
            return more_form(string);
        }
        if (NIL != lexicon_cache.superlative_formP(pred)) {
            return most_form(string);
        }
        return more_form(string);
    }

    /**
     *
     *
     * @return BOOLEANP; Does STRING start with the 'more' or 'most' form appropriate
    for PRED?
     */
    @LispMethod(comment = "@return BOOLEANP; Does STRING start with the \'more\' or \'most\' form appropriate\r\nfor PRED?")
    public static final SubLObject more_or_most_form_p_alt(SubLObject string, SubLObject pred) {
        if (NIL != lexicon_cache.comparative_formP(pred)) {
            return com.cyc.cycjava.cycl.morphology.more_form_p(string);
        } else {
            if (NIL != lexicon_cache.superlative_formP(pred)) {
                return com.cyc.cycjava.cycl.morphology.most_form_p(string);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEANP; Does STRING start with the 'more' or 'most' form appropriate
    for PRED?
     */
    @LispMethod(comment = "@return BOOLEANP; Does STRING start with the \'more\' or \'most\' form appropriate\r\nfor PRED?")
    public static SubLObject more_or_most_form_p(final SubLObject string, final SubLObject pred) {
        if (NIL != lexicon_cache.comparative_formP(pred)) {
            return more_form_p(string);
        }
        if (NIL != lexicon_cache.superlative_formP(pred)) {
            return most_form_p(string);
        }
        return NIL;
    }

    /**
     * Given STRING, return the regular comparative degree adj form, i.e. add 'er' or 'more'.
     */
    @LispMethod(comment = "Given STRING, return the regular comparative degree adj form, i.e. add \'er\' or \'more\'.")
    public static final SubLObject comparative_reg_alt(SubLObject string) {
        if (NIL != com.cyc.cycjava.cycl.morphology.try_regular_adj_morphologyP(string)) {
            return com.cyc.cycjava.cycl.morphology.add_english_suffix(string, $$$er);
        } else {
            return com.cyc.cycjava.cycl.morphology.more_form(string);
        }
    }

    @LispMethod(comment = "Given STRING, return the regular comparative degree adj form, i.e. add \'er\' or \'more\'.")
    public static SubLObject comparative_reg(final SubLObject string) {
        if (NIL != try_regular_adj_morphologyP(string)) {
            return add_english_suffix(string, $$$er);
        }
        return more_form(string);
    }/**
     * Given STRING, return the regular comparative degree adj form, i.e. add 'er' or 'more'.
     */


    /**
     * Given STRING, return the regular comparative degree adverb form, usually with 'more'.
     */
    @LispMethod(comment = "Given STRING, return the regular comparative degree adverb form, usually with \'more\'.")
    public static final SubLObject comparative_adverb_reg_alt(SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.morphology.more_form(string);
        } else {
            return com.cyc.cycjava.cycl.morphology.comparative_reg(string);
        }
    }

    @LispMethod(comment = "Given STRING, return the regular comparative degree adverb form, usually with \'more\'.")
    public static SubLObject comparative_adverb_reg(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) {
            return more_form(string);
        }
        return comparative_reg(string);
    }/**
     * Given STRING, return the regular comparative degree adverb form, usually with 'more'.
     */


    /**
     * Given STRING, return the regular superlative degree adj form, i.e. add 'est' or 'more'.
     */
    @LispMethod(comment = "Given STRING, return the regular superlative degree adj form, i.e. add \'est\' or \'more\'.")
    public static final SubLObject superlative_reg_alt(SubLObject string) {
        if (NIL != com.cyc.cycjava.cycl.morphology.try_regular_adj_morphologyP(string)) {
            return com.cyc.cycjava.cycl.morphology.add_english_suffix(string, $$$est);
        } else {
            return com.cyc.cycjava.cycl.morphology.most_form(string);
        }
    }

    @LispMethod(comment = "Given STRING, return the regular superlative degree adj form, i.e. add \'est\' or \'more\'.")
    public static SubLObject superlative_reg(final SubLObject string) {
        if (NIL != try_regular_adj_morphologyP(string)) {
            return add_english_suffix(string, $$$est);
        }
        return most_form(string);
    }/**
     * Given STRING, return the regular superlative degree adj form, i.e. add 'est' or 'more'.
     */


    /**
     * Given STRING, return the regular superlative degree adverb form, usually with 'most'.
     */
    @LispMethod(comment = "Given STRING, return the regular superlative degree adverb form, usually with \'most\'.")
    public static final SubLObject superlative_adverb_reg_alt(SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.morphology.most_form(string);
        } else {
            return com.cyc.cycjava.cycl.morphology.superlative_reg(string);
        }
    }

    @LispMethod(comment = "Given STRING, return the regular superlative degree adverb form, usually with \'most\'.")
    public static SubLObject superlative_adverb_reg(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) {
            return most_form(string);
        }
        return superlative_reg(string);
    }/**
     * Given STRING, return the regular superlative degree adverb form, usually with 'most'.
     */


    /**
     * Given STRING, return the regular past tense verb form, i.e. add 'd' or 'ed'.
     */
    @LispMethod(comment = "Given STRING, return the regular past tense verb form, i.e. add \'d\' or \'ed\'.")
    public static final SubLObject past_tense_reg_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.generate_regular_string_from_form($$pastTense_Universal, $$infinitive, string, UNPROVIDED);
    }

    @LispMethod(comment = "Given STRING, return the regular past tense verb form, i.e. add \'d\' or \'ed\'.")
    public static SubLObject past_tense_reg(final SubLObject string) {
        return generate_regular_string_from_form($$pastTense_Universal, $$infinitive, string, UNPROVIDED);
    }/**
     * Given STRING, return the regular past tense verb form, i.e. add 'd' or 'ed'.
     */


    /**
     * Given STRING, return the regular progressive ('-ing') form.
     */
    @LispMethod(comment = "Given STRING, return the regular progressive (\'-ing\') form.")
    public static final SubLObject gerund_reg_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.generate_regular_string_from_form($$gerund, $$infinitive, string, UNPROVIDED);
    }

    @LispMethod(comment = "Given STRING, return the regular progressive (\'-ing\') form.")
    public static SubLObject gerund_reg(final SubLObject string) {
        return generate_regular_string_from_form($$gerund, $$infinitive, string, UNPROVIDED);
    }/**
     * Given STRING, return the regular progressive ('-ing') form.
     */


    /**
     * Given STRING, return the regular third person singular verb form, i.e. add 's'.
     */
    @LispMethod(comment = "Given STRING, return the regular third person singular verb form, i.e. add \'s\'.")
    public static final SubLObject third_sg_reg_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.generate_regular_string_from_form($$thirdPersonSg_Present, $$infinitive, string, UNPROVIDED);
    }

    @LispMethod(comment = "Given STRING, return the regular third person singular verb form, i.e. add \'s\'.")
    public static SubLObject third_sg_reg(final SubLObject string) {
        return generate_regular_string_from_form($$thirdPersonSg_Present, $$infinitive, string, UNPROVIDED);
    }/**
     * Given STRING, return the regular third person singular verb form, i.e. add 's'.
     */


    /**
     * Given STRING, return the regular plural noun form, i.e. add 's'.
     */
    @LispMethod(comment = "Given STRING, return the regular plural noun form, i.e. add \'s\'.")
    public static final SubLObject plural_reg_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.correct_capitalization(string, com.cyc.cycjava.cycl.morphology.generate_regular_string_from_form($$plural, $$singular, string, UNPROVIDED));
    }

    @LispMethod(comment = "Given STRING, return the regular plural noun form, i.e. add \'s\'.")
    public static SubLObject plural_reg(final SubLObject string) {
        return correct_capitalization(string, generate_regular_string_from_form($$plural, $$singular, string, UNPROVIDED));
    }/**
     * Given STRING, return the regular plural noun form, i.e. add 's'.
     */


    /**
     * Given a #$singular form STRING, pluralize and capitalize it to return
     * the regular #$pnPlural form. Looks first for irregular asserted #$plural
     * form.
     */
    @LispMethod(comment = "Given a #$singular form STRING, pluralize and capitalize it to return\r\nthe regular #$pnPlural form. Looks first for irregular asserted #$plural\r\nform.\nGiven a #$singular form STRING, pluralize and capitalize it to return\nthe regular #$pnPlural form. Looks first for irregular asserted #$plural\nform.")
    public static final SubLObject pn_plural_reg_alt(SubLObject string) {
        return string_utilities.string_proper(com.cyc.cycjava.cycl.morphology.pluralize_string(string, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Given a #$singular form STRING, pluralize and capitalize it to return\r\nthe regular #$pnPlural form. Looks first for irregular asserted #$plural\r\nform.\nGiven a #$singular form STRING, pluralize and capitalize it to return\nthe regular #$pnPlural form. Looks first for irregular asserted #$plural\nform.")
    public static SubLObject pn_plural_reg(final SubLObject string) {
        return string_utilities.string_proper(pluralize_string(string, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Given a #$singular form STRING, pluralize and capitalize it to return
     * the regular #$pnPlural form. Looks first for irregular asserted #$plural
     * form.
     */


    /**
     * Given STRING, convert it from the infinitive to third person singular.
     * First check for stored irregular forms; if none are found, generate a string.
     */
    @LispMethod(comment = "Given STRING, convert it from the infinitive to third person singular.\r\nFirst check for stored irregular forms; if none are found, generate a string.\nGiven STRING, convert it from the infinitive to third person singular.\nFirst check for stored irregular forms; if none are found, generate a string.")
    public static final SubLObject infinitive_to_third_sing_alt(SubLObject string) {
        {
            SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$infinitive, T, $$EnglishMt, UNPROVIDED);
            if (NIL != words) {
                {
                    SubLObject word_to_use = words.first();
                    SubLObject irreg_stored_form = lexicon_utilities.verb_form_third_sing(word_to_use, UNPROVIDED);
                    if (NIL != irreg_stored_form) {
                        return irreg_stored_form;
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.morphology.generate_regular_string_from_form($$thirdPersonSg_Present, $$infinitive, string, UNPROVIDED);
    }

    @LispMethod(comment = "Given STRING, convert it from the infinitive to third person singular.\r\nFirst check for stored irregular forms; if none are found, generate a string.\nGiven STRING, convert it from the infinitive to third person singular.\nFirst check for stored irregular forms; if none are found, generate a string.")
    public static SubLObject infinitive_to_third_sing(final SubLObject string) {
        final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$infinitive, T, $$EnglishMt, UNPROVIDED);
        if (NIL != words) {
            final SubLObject word_to_use = words.first();
            final SubLObject irreg_stored_form = lexicon_utilities.verb_form_third_sing(word_to_use, UNPROVIDED);
            if (NIL != irreg_stored_form) {
                return irreg_stored_form;
            }
        }
        return generate_regular_string_from_form($$thirdPersonSg_Present, $$infinitive, string, UNPROVIDED);
    }/**
     * Given STRING, convert it from the infinitive to third person singular.
     * First check for stored irregular forms; if none are found, generate a string.
     */


    /**
     * Given STRING, convert it from the infinitive to present participle form.
     * First check for stored irregular forms; if none are found, generate a string.
     */
    @LispMethod(comment = "Given STRING, convert it from the infinitive to present participle form.\r\nFirst check for stored irregular forms; if none are found, generate a string.\nGiven STRING, convert it from the infinitive to present participle form.\nFirst check for stored irregular forms; if none are found, generate a string.")
    public static final SubLObject infinitive_to_pres_participle_alt(SubLObject string) {
        {
            SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$infinitive, T, $$EnglishMt, UNPROVIDED);
            if (NIL != words) {
                {
                    SubLObject word_to_use = words.first();
                    SubLObject irreg_stored_form = lexicon_utilities.verb_form_pres_participle(word_to_use, UNPROVIDED);
                    if (NIL != irreg_stored_form) {
                        return irreg_stored_form;
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.morphology.generate_regular_string_from_form($$presentParticiple, $$infinitive, string, UNPROVIDED);
    }

    @LispMethod(comment = "Given STRING, convert it from the infinitive to present participle form.\r\nFirst check for stored irregular forms; if none are found, generate a string.\nGiven STRING, convert it from the infinitive to present participle form.\nFirst check for stored irregular forms; if none are found, generate a string.")
    public static SubLObject infinitive_to_pres_participle(final SubLObject string) {
        final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$infinitive, T, $$EnglishMt, UNPROVIDED);
        if (NIL != words) {
            final SubLObject word_to_use = words.first();
            final SubLObject irreg_stored_form = lexicon_utilities.verb_form_pres_participle(word_to_use, UNPROVIDED);
            if (NIL != irreg_stored_form) {
                return irreg_stored_form;
            }
        }
        return generate_regular_string_from_form($$presentParticiple, $$infinitive, string, UNPROVIDED);
    }/**
     * Given STRING, convert it from the infinitive to present participle form.
     * First check for stored irregular forms; if none are found, generate a string.
     */


    /**
     *
     *
     * @param STRING;
     * 		a non-possessive noun-type string
     * @param POS-PRED;
     * 		the part-of-speech of STRING,
     * 		either a #$SpeechPartPredicate or #$nameString
     * @return string; the possessive form of STRING
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta non-possessive noun-type string\r\n@param POS-PRED;\r\n\t\tthe part-of-speech of STRING,\r\n\t\teither a #$SpeechPartPredicate or #$nameString\r\n@return string; the possessive form of STRING")
    public static final SubLObject possessivize_string_alt(SubLObject string, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = NIL;
        }
        if (!string.isString()) {
            return string;
        }
        {
            SubLObject lexical_possessive = com.cyc.cycjava.cycl.morphology.english_lexical_possessive_version_of_string(string);
            if (lexical_possessive.isString()) {
                return lexical_possessive;
            } else {
                return cconcatenate(string, com.cyc.cycjava.cycl.morphology.english_possessive_suffix_for_string(string, pos_pred));
            }
        }
    }

    /**
     *
     *
     * @param STRING;
     * 		a non-possessive noun-type string
     * @param POS-PRED;
     * 		the part-of-speech of STRING,
     * 		either a #$SpeechPartPredicate or #$nameString
     * @return string; the possessive form of STRING
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta non-possessive noun-type string\r\n@param POS-PRED;\r\n\t\tthe part-of-speech of STRING,\r\n\t\teither a #$SpeechPartPredicate or #$nameString\r\n@return string; the possessive form of STRING")
    public static SubLObject possessivize_string(final SubLObject string, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = NIL;
        }
        if (!string.isString()) {
            return string;
        }
        final SubLObject lexical_possessive = english_lexical_possessive_version_of_string(string);
        if (lexical_possessive.isString()) {
            return lexical_possessive;
        }
        return cconcatenate(string, english_possessive_suffix_for_string(string, pos_pred));
    }

    /**
     *
     *
     * @return STRINGP or NIL; A lexical possessive version of the English word STRING.
     */
    @LispMethod(comment = "@return STRINGP or NIL; A lexical possessive version of the English word STRING.")
    public static final SubLObject english_lexical_possessive_version_of_string_alt(SubLObject string) {
        {
            SubLObject pronominal_possessive = list_utilities.alist_lookup($english_possessive_pronouns$.getGlobalValue(), string, symbol_function(EQUALP), $NOT_FOUND);
            if (pronominal_possessive.isString()) {
                return pronominal_possessive;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return STRINGP or NIL; A lexical possessive version of the English word STRING.
     */
    @LispMethod(comment = "@return STRINGP or NIL; A lexical possessive version of the English word STRING.")
    public static SubLObject english_lexical_possessive_version_of_string(final SubLObject string) {
        final SubLObject pronominal_possessive = list_utilities.alist_lookup($english_possessive_pronouns$.getGlobalValue(), string, symbol_function(EQUALP), $NOT_FOUND);
        if (pronominal_possessive.isString()) {
            return pronominal_possessive;
        }
        return NIL;
    }

    /**
     *
     *
     * @return STRINGP; The possessive suffix to append to STRING, which has agreement POS-PRED.
     */
    @LispMethod(comment = "@return STRINGP; The possessive suffix to append to STRING, which has agreement POS-PRED.")
    public static final SubLObject english_possessive_suffix_for_string_alt(SubLObject string, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = NIL;
        }
        {
            SubLObject suffix = NIL;
            if ((NIL == pos_pred) && (NIL != com.cyc.cycjava.cycl.morphology.plural_nounP(string))) {
                pos_pred = $$plural_Generic;
            }
            if (((NIL != fort_p(pos_pred)) && (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pos_pred, $$plural_Generic, UNPROVIDED))) {
                suffix = $str_alt107$_;
            }
            if (!suffix.isString()) {
                suffix = $str_alt108$_s;
            }
            return suffix;
        }
    }

    /**
     *
     *
     * @return STRINGP; The possessive suffix to append to STRING, which has agreement POS-PRED.
     */
    @LispMethod(comment = "@return STRINGP; The possessive suffix to append to STRING, which has agreement POS-PRED.")
    public static SubLObject english_possessive_suffix_for_string(final SubLObject string, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = NIL;
        }
        SubLObject suffix = NIL;
        if ((NIL == pos_pred) && (NIL != plural_nounP(string))) {
            pos_pred = $$plural_Generic;
        }
        if (((NIL != forts.fort_p(pos_pred)) && (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pos_pred, $$plural_Generic, UNPROVIDED))) {
            suffix = $str103$_;
        }
        if (!suffix.isString()) {
            suffix = $str104$_s;
        }
        return suffix;
    }

    /**
     *
     *
     * @param STRING;
     * 		a non-locative noun-type string
     * @return string; the locative form of STRING
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta non-locative noun-type string\r\n@return string; the locative form of STRING")
    public static final SubLObject locativize_string_alt(SubLObject string, SubLObject denot) {
        if (NIL != com.cyc.cycjava.cycl.morphology.not_locativizable_english_stringP(string)) {
            return string;
        } else {
            return cconcatenate(com.cyc.cycjava.cycl.morphology.english_locative_preposition_for_denot(denot), new SubLObject[]{ $str_alt109$_, string });
        }
    }

    /**
     *
     *
     * @param STRING;
     * 		a non-locative noun-type string
     * @return string; the locative form of STRING
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta non-locative noun-type string\r\n@return string; the locative form of STRING")
    public static SubLObject locativize_string(final SubLObject string, final SubLObject denot) {
        if (NIL != not_locativizable_english_stringP(string)) {
            return string;
        }
        return cconcatenate(english_locative_preposition_for_denot(denot), new SubLObject[]{ $$$_, string });
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT something we do *not* want to locativize, for instance
    something that looks already locative?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT something we do *not* want to locativize, for instance\r\nsomething that looks already locative?")
    public static final SubLObject not_locativizable_english_stringP_alt(SubLObject v_object) {
        if (!v_object.isString()) {
            return T;
        }
        {
            SubLObject ans = NIL;
            if (NIL != subl_promotions.memberP($$QuantifyingIndexical, lexicon_accessors.pos_of_string(v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                ans = T;
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT something we do *not* want to locativize, for instance
    something that looks already locative?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT something we do *not* want to locativize, for instance\r\nsomething that looks already locative?")
    public static SubLObject not_locativizable_english_stringP(final SubLObject v_object) {
        if (!v_object.isString()) {
            return T;
        }
        SubLObject ans = NIL;
        if (NIL != subl_promotions.memberP($$QuantifyingIndexical, lexicon_accessors.pos_of_string(v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            ans = T;
        }
        return ans;
    }

    public static final SubLObject english_locative_preposition_for_denot_alt(SubLObject denot) {
        if (NIL != isa.isa_in_any_mtP(denot, $$GeographicalRegion)) {
            return $$$in;
        } else {
            if (NIL != isa.isa_in_any_mtP(denot, $$SurfaceRegion_Underspecified)) {
                return $$$on;
            } else {
                return $$$in;
            }
        }
    }

    public static SubLObject english_locative_preposition_for_denot(final SubLObject denot) {
        if (NIL != isa.isa_in_any_mtP(denot, $$GeographicalRegion)) {
            return $$$in;
        }
        if (NIL != isa.isa_in_any_mtP(denot, $$SurfaceRegion_Underspecified)) {
            return $$$on;
        }
        return $$$in;
    }

    /**
     * Return the best guess at a plural form for STRING.
     *
     * @param mt;
     * 		the microtheory to look from.
     */
    @LispMethod(comment = "Return the best guess at a plural form for STRING.\r\n\r\n@param mt;\r\n\t\tthe microtheory to look from.")
    public static final SubLObject pluralize_string_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        {
            SubLObject ans = NIL;
            ans = com.cyc.cycjava.cycl.morphology.pluralize_string_wXlexicon(string, mt);
            if (NIL == ans) {
                {
                    SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
                    SubLObject last_token = last(tokens, UNPROVIDED).first();
                    if (NIL != list_utilities.lengthG(tokens, ONE_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject plural_last_token = com.cyc.cycjava.cycl.morphology.pluralize_string_wXlexicon(last_token, mt);
                            if (NIL != plural_last_token) {
                                ans = cconcatenate(subseq(string, ZERO_INTEGER, subtract(length(string), length(last_token))), plural_last_token);
                            }
                        }
                    }
                }
            }
            if (NIL == ans) {
                ans = com.cyc.cycjava.cycl.morphology.plural_reg(string);
            }
            return com.cyc.cycjava.cycl.morphology.correct_capitalization(string, ans);
        }
    }

    @LispMethod(comment = "Return the best guess at a plural form for STRING.\r\n\r\n@param mt;\r\n\t\tthe microtheory to look from.")
    public static SubLObject pluralize_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        SubLObject ans = NIL;
        ans = pluralize_string_wXlexicon(string, mt);
        if (NIL == ans) {
            final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            final SubLObject last_token = last(tokens, UNPROVIDED).first();
            if (NIL != list_utilities.lengthG(tokens, ONE_INTEGER, UNPROVIDED)) {
                final SubLObject plural_last_token = pluralize_string_wXlexicon(last_token, mt);
                if (NIL != plural_last_token) {
                    ans = cconcatenate(subseq(string, ZERO_INTEGER, subtract(length(string), length(last_token))), plural_last_token);
                }
            }
        }
        if (NIL == ans) {
            ans = plural_reg(string);
        }
        return correct_capitalization(string, ans);
    }/**
     * Return the best guess at a plural form for STRING.
     *
     * @param mt;
     * 		the microtheory to look from.
     */


    public static final SubLObject pluralize_string_wXlexicon_alt(SubLObject string, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != lexicon_initialized_p()) {
                    {
                        SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$singular_Generic, T, mt, UNPROVIDED);
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                if (NIL == ans) {
                                    {
                                        SubLObject csome_list_var = words;
                                        SubLObject word = NIL;
                                        for (word = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                                            if (NIL == ans) {
                                                {
                                                    SubLObject csome_list_var_22 = lexicon_accessors.preds_of_stringXword(string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject singular_pred = NIL;
                                                    for (singular_pred = csome_list_var_22.first(); !((NIL != ans) || (NIL == csome_list_var_22)); csome_list_var_22 = csome_list_var_22.rest() , singular_pred = csome_list_var_22.first()) {
                                                        {
                                                            SubLObject plural_pred = lexicon_accessors.plural_pred(lexicon_accessors.pos_of_pred(singular_pred));
                                                            if (NIL != plural_pred) {
                                                                ans = lexicon_cache.first_string_of_wordXpred(word, plural_pred, UNPROVIDED);
                                                            }
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
                }
                return NIL != ans ? ((SubLObject) (com.cyc.cycjava.cycl.morphology.correct_capitalization(string, ans))) : NIL;
            }
        }
    }

    public static SubLObject pluralize_string_wXlexicon(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != lexicon_initialized_p()) {
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$singular_Generic, T, mt, UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (NIL == ans) {
                    SubLObject csome_list_var = words;
                    SubLObject word = NIL;
                    word = csome_list_var.first();
                    while ((NIL == ans) && (NIL != csome_list_var)) {
                        if (NIL == ans) {
                            SubLObject csome_list_var_$12 = lexicon_accessors.preds_of_stringXword(string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject singular_pred = NIL;
                            singular_pred = csome_list_var_$12.first();
                            while ((NIL == ans) && (NIL != csome_list_var_$12)) {
                                final SubLObject plural_pred = lexicon_accessors.plural_pred(lexicon_accessors.pos_of_pred(singular_pred));
                                if (NIL != plural_pred) {
                                    ans = lexicon_cache.first_string_of_wordXpred(word, plural_pred, mt);
                                }
                                csome_list_var_$12 = csome_list_var_$12.rest();
                                singular_pred = csome_list_var_$12.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        word = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != ans ? correct_capitalization(string, ans) : NIL;
    }

    /**
     * Return the best guess at a singular form for STRING.
     *
     * @param mt;
     * 		the microtheory to look from.
     * @unknown Returns a lower-case string, regardless of the case of STRING.
     */
    @LispMethod(comment = "Return the best guess at a singular form for STRING.\r\n\r\n@param mt;\r\n\t\tthe microtheory to look from.\r\n@unknown Returns a lower-case string, regardless of the case of STRING.")
    public static final SubLObject singularize_string_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        {
            SubLObject ans = NIL;
            ans = com.cyc.cycjava.cycl.morphology.singularize_string_wXlexicon(string, mt);
            if (NIL == ans) {
                {
                    SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
                    SubLObject last_token = last(tokens, UNPROVIDED).first();
                    if (NIL != list_utilities.lengthG(tokens, ONE_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject singular_last_token = com.cyc.cycjava.cycl.morphology.singularize_string_wXlexicon(last_token, mt);
                            if (NIL != singular_last_token) {
                                ans = cconcatenate(subseq(string, ZERO_INTEGER, subtract(length(string), length(last_token))), singular_last_token);
                            }
                        }
                    }
                }
            }
            if (NIL == ans) {
                ans = com.cyc.cycjava.cycl.morphology.singular_reg(string);
            }
            return com.cyc.cycjava.cycl.morphology.correct_capitalization(string, ans);
        }
    }

    @LispMethod(comment = "Return the best guess at a singular form for STRING.\r\n\r\n@param mt;\r\n\t\tthe microtheory to look from.\r\n@unknown Returns a lower-case string, regardless of the case of STRING.")
    public static SubLObject singularize_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        SubLObject ans = NIL;
        ans = singularize_string_wXlexicon(string, mt);
        if (NIL == ans) {
            final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            final SubLObject last_token = last(tokens, UNPROVIDED).first();
            if (NIL != list_utilities.lengthG(tokens, ONE_INTEGER, UNPROVIDED)) {
                final SubLObject singular_last_token = singularize_string_wXlexicon(last_token, mt);
                if (NIL != singular_last_token) {
                    ans = cconcatenate(subseq(string, ZERO_INTEGER, subtract(length(string), length(last_token))), singular_last_token);
                }
            }
        }
        if (NIL == ans) {
            ans = singular_reg(string);
        }
        return correct_capitalization(string, ans);
    }/**
     * Return the best guess at a singular form for STRING.
     *
     * @param mt;
     * 		the microtheory to look from.
     * @unknown Returns a lower-case string, regardless of the case of STRING.
     */


    public static final SubLObject singularize_string_wXlexicon_alt(SubLObject string, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != lexicon_initialized_p()) {
                    {
                        SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$plural_Generic, T, mt, UNPROVIDED);
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                if (NIL == ans) {
                                    {
                                        SubLObject csome_list_var = words;
                                        SubLObject word = NIL;
                                        for (word = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                                            if (NIL == ans) {
                                                {
                                                    SubLObject csome_list_var_23 = lexicon_accessors.preds_of_stringXword(string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject plural_pred = NIL;
                                                    for (plural_pred = csome_list_var_23.first(); !((NIL != ans) || (NIL == csome_list_var_23)); csome_list_var_23 = csome_list_var_23.rest() , plural_pred = csome_list_var_23.first()) {
                                                        {
                                                            SubLObject singular_pred = lexicon_accessors.singular_pred(lexicon_accessors.pos_of_pred(plural_pred));
                                                            if (NIL != singular_pred) {
                                                                ans = lexicon_cache.first_string_of_wordXpred(word, singular_pred, UNPROVIDED);
                                                            }
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
                }
                return NIL != ans ? ((SubLObject) (com.cyc.cycjava.cycl.morphology.correct_capitalization(string, ans))) : NIL;
            }
        }
    }

    public static SubLObject singularize_string_wXlexicon(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != lexicon_initialized_p()) {
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$plural_Generic, T, mt, UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (NIL == ans) {
                    SubLObject csome_list_var = words;
                    SubLObject word = NIL;
                    word = csome_list_var.first();
                    while ((NIL == ans) && (NIL != csome_list_var)) {
                        if (NIL == ans) {
                            SubLObject csome_list_var_$13 = lexicon_accessors.preds_of_stringXword(string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject plural_pred = NIL;
                            plural_pred = csome_list_var_$13.first();
                            while ((NIL == ans) && (NIL != csome_list_var_$13)) {
                                final SubLObject singular_pred = lexicon_accessors.singular_pred(lexicon_accessors.pos_of_pred(plural_pred));
                                if (NIL != singular_pred) {
                                    ans = lexicon_cache.first_string_of_wordXpred(word, singular_pred, UNPROVIDED);
                                }
                                csome_list_var_$13 = csome_list_var_$13.rest();
                                plural_pred = csome_list_var_$13.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        word = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != ans ? correct_capitalization(string, ans) : NIL;
    }

    /**
     *
     *
     * @return boolean; T iff there is a word-unit mapping to STRING for POS-KEYWORD
     * @unknown This restricts the check to syntactic predicates that typically represent root forms (e.g., infinitive, singular)
     */
    @LispMethod(comment = "@return boolean; T iff there is a word-unit mapping to STRING for POS-KEYWORD\r\n@unknown This restricts the check to syntactic predicates that typically represent root forms (e.g., infinitive, singular)")
    public static final SubLObject has_word_for_string_and_pos_alt(SubLObject string, SubLObject pos_keyword) {
        {
            SubLObject word_units = NIL;
            if (NIL == string_utilities.non_empty_string_p(string)) {
                return NIL;
            }
            if (NIL == word_units) {
                {
                    SubLObject csome_list_var = lexification_utilities.basic_preds_for_part_of_speech(pos_keyword);
                    SubLObject pred = NIL;
                    for (pred = csome_list_var.first(); !((NIL != word_units) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                        word_units = lexicon_accessors.words_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return word_units;
        }
    }

    /**
     *
     *
     * @return boolean; T iff there is a word-unit mapping to STRING for POS-KEYWORD
     * @unknown This restricts the check to syntactic predicates that typically represent root forms (e.g., infinitive, singular)
     */
    @LispMethod(comment = "@return boolean; T iff there is a word-unit mapping to STRING for POS-KEYWORD\r\n@unknown This restricts the check to syntactic predicates that typically represent root forms (e.g., infinitive, singular)")
    public static SubLObject has_word_for_string_and_pos(final SubLObject string, final SubLObject pos_keyword) {
        SubLObject word_units = NIL;
        if (NIL == string_utilities.non_empty_string_p(string)) {
            return NIL;
        }
        if (NIL == word_units) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = lexification_utilities.basic_preds_for_part_of_speech(pos_keyword), pred = NIL, pred = csome_list_var.first(); (NIL == word_units) && (NIL != csome_list_var); word_units = lexicon_accessors.words_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return word_units;
    }

    /**
     *
     *
     * @return boolean; T iff theere is a word-unit mapping to STRING for POS-KEYWORD
     */
    @LispMethod(comment = "@return boolean; T iff theere is a word-unit mapping to STRING for POS-KEYWORD")
    public static final SubLObject has_word_for_string_and_pos_list_alt(SubLObject string, SubLObject pos_keyword_list) {
        {
            SubLObject has_mapping = NIL;
            if (NIL == has_mapping) {
                {
                    SubLObject csome_list_var = pos_keyword_list;
                    SubLObject pos = NIL;
                    for (pos = csome_list_var.first(); !((NIL != has_mapping) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
                        has_mapping = com.cyc.cycjava.cycl.morphology.has_word_for_string_and_pos(string, pos);
                    }
                }
            }
            return has_mapping;
        }
    }

    /**
     *
     *
     * @return boolean; T iff theere is a word-unit mapping to STRING for POS-KEYWORD
     */
    @LispMethod(comment = "@return boolean; T iff theere is a word-unit mapping to STRING for POS-KEYWORD")
    public static SubLObject has_word_for_string_and_pos_list(final SubLObject string, final SubLObject pos_keyword_list) {
        SubLObject has_mapping = NIL;
        if (NIL == has_mapping) {
            SubLObject csome_list_var;
            SubLObject pos;
            for (csome_list_var = pos_keyword_list, pos = NIL, pos = csome_list_var.first(); (NIL == has_mapping) && (NIL != csome_list_var); has_mapping = has_word_for_string_and_pos(string, pos) , csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
            }
        }
        return has_mapping;
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string")
    public static final SubLObject is_word_alt(SubLObject string) {
        return lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string")
    public static SubLObject is_word(final SubLObject string) {
        return lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string as a noun
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string as a noun")
    public static final SubLObject is_noun_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.has_word_for_string_and_pos_list(string, $list_alt115);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string as a noun
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string as a noun")
    public static SubLObject is_noun(final SubLObject string) {
        return has_word_for_string_and_pos_list(string, $list111);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string as a verb
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string as a verb")
    public static final SubLObject is_verb_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.has_word_for_string_and_pos(string, $VERB);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string as a verb
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string as a verb")
    public static SubLObject is_verb(final SubLObject string) {
        return has_word_for_string_and_pos(string, $VERB);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string as a noun or verb
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string as a noun or verb")
    public static final SubLObject is_noun_or_verb_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.has_word_for_string_and_pos_list(string, $list_alt117);
    }

    /**
     *
     *
     * @return boolean; T iff there is a word unit mapping to the string as a noun or verb
     */
    @LispMethod(comment = "@return boolean; T iff there is a word unit mapping to the string as a noun or verb")
    public static SubLObject is_noun_or_verb(final SubLObject string) {
        return has_word_for_string_and_pos_list(string, $list113);
    }

    public static final SubLObject clear_find_stem_memoized_alt() {
        {
            SubLObject cs = $find_stem_memoized_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_find_stem_memoized() {
        final SubLObject cs = $find_stem_memoized_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_find_stem_memoized_alt(SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        return memoization_state.caching_state_remove_function_results_with_args($find_stem_memoized_caching_state$.getGlobalValue(), list(word, pos_keyword), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_find_stem_memoized(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        return memoization_state.caching_state_remove_function_results_with_args($find_stem_memoized_caching_state$.getGlobalValue(), list(word, pos_keyword), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject find_stem_memoized_internal_alt(SubLObject word, SubLObject pos_keyword) {
        return com.cyc.cycjava.cycl.morphology.find_stem(word, pos_keyword);
    }

    public static SubLObject find_stem_memoized_internal(final SubLObject word, final SubLObject pos_keyword) {
        return find_stem(word, pos_keyword);
    }

    public static final SubLObject find_stem_memoized_alt(SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        {
            SubLObject caching_state = $find_stem_memoized_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FIND_STEM_MEMOIZED, $find_stem_memoized_caching_state$, $int$16384, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_FIND_STEM_MEMOIZED);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(word, pos_keyword);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw30$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (word.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && pos_keyword.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morphology.find_stem_memoized_internal(word, pos_keyword)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word, pos_keyword));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject find_stem_memoized(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        SubLObject caching_state = $find_stem_memoized_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FIND_STEM_MEMOIZED, $find_stem_memoized_caching_state$, $int$16384, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_FIND_STEM_MEMOIZED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word, pos_keyword);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && pos_keyword.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(find_stem_memoized_internal(word, pos_keyword)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, pos_keyword));
        return memoization_state.caching_results(results3);
    }

    /**
     * Given STRING, return a string which is likely to be its stem.
     * The optional part-of-speech keyword (e.g., :noun) restricts the type of stemming done.
     *
     * @unknown is-noun, is-verb, etc. are used to minimize extraneous stemmings (e.g., 'marches' to 'marche' due to Marche-TheWord proper noun mapping)
     * @unknown Instead of is-verb, use a new function for is-infinitive (e.g., 'ranging' =/=> 'rang')
     * @unknown tom.
     */
    @LispMethod(comment = "Given STRING, return a string which is likely to be its stem.\r\nThe optional part-of-speech keyword (e.g., :noun) restricts the type of stemming done.\r\n\r\n@unknown is-noun, is-verb, etc. are used to minimize extraneous stemmings (e.g., \'marches\' to \'marche\' due to Marche-TheWord proper noun mapping)\r\n@unknown Instead of is-verb, use a new function for is-infinitive (e.g., \'ranging\' =/=> \'rang\')\r\n@unknown tom.\nGiven STRING, return a string which is likely to be its stem.\nThe optional part-of-speech keyword (e.g., :noun) restricts the type of stemming done.")
    public static final SubLObject find_stem_alt(SubLObject string, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        {
            SubLObject stem = NIL;
            if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
                {
                    SubLObject y_stem = string_utilities.post_fix(string_utilities.strip_trailer(string, $$$ies), $$$y);
                    SubLObject minus_s = string_utilities.strip_final(string, UNPROVIDED);
                    if (NIL != com.cyc.cycjava.cycl.morphology.is_noun_or_verb(minus_s)) {
                        stem = minus_s;
                    } else {
                        stem = y_stem;
                    }
                }
            } else {
                if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
                    if (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED)) {
                        {
                            SubLObject minus_s = string_utilities.strip_final(string, UNPROVIDED);
                            SubLObject minus_es = (NIL != string_utilities.ends_with(minus_s, $$$e, UNPROVIDED)) ? ((SubLObject) (string_utilities.strip_final(minus_s, UNPROVIDED))) : NIL;
                            if (NIL != com.cyc.cycjava.cycl.morphology.is_noun_or_verb(minus_s)) {
                                stem = minus_s;
                            } else {
                                if ((NIL != minus_es) && (NIL != com.cyc.cycjava.cycl.morphology.is_noun_or_verb(minus_es))) {
                                    stem = minus_es;
                                } else {
                                    if (NIL != minus_es) {
                                        if (NIL == stem) {
                                            {
                                                SubLObject csome_list_var = $list_alt125;
                                                SubLObject ending = NIL;
                                                for (ending = csome_list_var.first(); !((NIL != stem) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ending = csome_list_var.first()) {
                                                    if (NIL != string_utilities.ends_with(minus_es, ending, UNPROVIDED)) {
                                                        stem = minus_es;
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != string_utilities.ends_with(minus_es, $$$z, UNPROVIDED)) {
                                            {
                                                SubLObject minus_zes = string_utilities.strip_final(minus_es, UNPROVIDED);
                                                if ((NIL != string_utilities.ends_with(minus_zes, $$$z, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphology.is_noun_or_verb(minus_zes))) {
                                                    stem = minus_zes;
                                                }
                                            }
                                        }
                                        if (NIL == stem) {
                                            stem = minus_s;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (((pos_keyword == $ANY) || (pos_keyword == $VERB)) && (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED))) {
                        {
                            SubLObject minus_ing = string_utilities.strip_trailer(string, $$$ing);
                            SubLObject minus_4 = string_utilities.strip_final(minus_ing, UNPROVIDED);
                            SubLObject plus_e = string_utilities.post_fix(minus_ing, $$$e);
                            SubLObject ordered_tests = list(minus_ing, plus_e);
                            if (NIL != com.cyc.cycjava.cycl.morphology.ends_with_doublerP(minus_ing)) {
                                if (NIL != string_utilities.ends_in_geminateP(minus_ing)) {
                                    ordered_tests = cons(minus_4, ordered_tests);
                                    ordered_tests = cons(minus_ing, ordered_tests);
                                }
                                if (NIL != com.cyc.cycjava.cycl.morphology.ends_in_cvcP(minus_ing)) {
                                    ordered_tests = cons(plus_e, ordered_tests);
                                }
                            }
                            if (NIL == stem) {
                                {
                                    SubLObject csome_list_var = ordered_tests;
                                    SubLObject verb_form = NIL;
                                    for (verb_form = csome_list_var.first(); !((NIL != stem) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , verb_form = csome_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.morphology.is_verb(verb_form)) {
                                            stem = verb_form;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (((pos_keyword == $ANY) || (pos_keyword == $VERB)) && (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED))) {
                            {
                                SubLObject minus_d = string_utilities.strip_final(string, UNPROVIDED);
                                SubLObject minus_ed = string_utilities.strip_trailer(string, $$$ed);
                                SubLObject minus_3 = string_utilities.strip_final(minus_ed, UNPROVIDED);
                                if (NIL != com.cyc.cycjava.cycl.morphology.is_verb(minus_d)) {
                                    stem = minus_d;
                                }
                                if (NIL == stem) {
                                    if (NIL != com.cyc.cycjava.cycl.morphology.is_verb(minus_ed)) {
                                        stem = minus_ed;
                                    }
                                }
                                if (NIL == stem) {
                                    if (NIL != com.cyc.cycjava.cycl.morphology.is_word(string)) {
                                        stem = string;
                                    }
                                }
                                if (NIL == stem) {
                                    if ((NIL != com.cyc.cycjava.cycl.morphology.ends_with_doublerP(minus_ed)) && (NIL != string_utilities.ends_in_geminateP(minus_ed))) {
                                        stem = minus_3;
                                    } else {
                                        stem = minus_d;
                                    }
                                }
                            }
                        } else {
                            if (NIL != string_utilities.ends_with(string, $$$z, UNPROVIDED)) {
                                if ((NIL != com.cyc.cycjava.cycl.morphology.is_noun(string_utilities.strip_trailer(string, $$$z))) || (NIL != lexicon_accessors.denots_of_acronym_string(string_utilities.strip_trailer(string, $$$z), UNPROVIDED, UNPROVIDED))) {
                                    stem = string_utilities.strip_trailer(string, $$$z);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == stem) {
                stem = string;
            }
            return stem;
        }
    }

    @LispMethod(comment = "Given STRING, return a string which is likely to be its stem.\r\nThe optional part-of-speech keyword (e.g., :noun) restricts the type of stemming done.\r\n\r\n@unknown is-noun, is-verb, etc. are used to minimize extraneous stemmings (e.g., \'marches\' to \'marche\' due to Marche-TheWord proper noun mapping)\r\n@unknown Instead of is-verb, use a new function for is-infinitive (e.g., \'ranging\' =/=> \'rang\')\r\n@unknown tom.\nGiven STRING, return a string which is likely to be its stem.\nThe optional part-of-speech keyword (e.g., :noun) restricts the type of stemming done.")
    public static SubLObject find_stem(final SubLObject string, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        SubLObject stem = NIL;
        if (NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)) {
            if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
                final SubLObject y_stem = string_utilities.post_fix(string_utilities.strip_trailer(string, $$$ies), $$$y);
                final SubLObject minus_s = string_utilities.strip_final(string, UNPROVIDED);
                if (NIL != is_noun_or_verb(minus_s)) {
                    stem = minus_s;
                } else {
                    stem = y_stem;
                }
            } else
                if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
                    if (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED)) {
                        final SubLObject minus_s2 = string_utilities.strip_final(string, UNPROVIDED);
                        final SubLObject minus_es = (NIL != string_utilities.ends_with(minus_s2, $$$e, UNPROVIDED)) ? string_utilities.strip_final(minus_s2, UNPROVIDED) : NIL;
                        if (NIL != is_noun_or_verb(minus_s2)) {
                            stem = minus_s2;
                        } else
                            if ((NIL != minus_es) && (NIL != is_noun_or_verb(minus_es))) {
                                stem = minus_es;
                            } else
                                if (NIL != minus_es) {
                                    if (NIL == stem) {
                                        SubLObject csome_list_var = $list121;
                                        SubLObject ending = NIL;
                                        ending = csome_list_var.first();
                                        while ((NIL == stem) && (NIL != csome_list_var)) {
                                            if (NIL != string_utilities.ends_with(minus_es, ending, UNPROVIDED)) {
                                                stem = minus_es;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            ending = csome_list_var.first();
                                        } 
                                    }
                                    if (NIL != string_utilities.ends_with(minus_es, $$$z, UNPROVIDED)) {
                                        final SubLObject minus_zes = string_utilities.strip_final(minus_es, UNPROVIDED);
                                        if ((NIL != string_utilities.ends_with(minus_zes, $$$z, UNPROVIDED)) && (NIL != is_noun_or_verb(minus_zes))) {
                                            stem = minus_zes;
                                        }
                                    }
                                    if (NIL == stem) {
                                        stem = minus_s2;
                                    }
                                }


                    }
                } else
                    if (((pos_keyword == $ANY) || (pos_keyword == $VERB)) && (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED))) {
                        final SubLObject minus_ing = string_utilities.strip_trailer(string, $$$ing);
                        final SubLObject minus_4 = string_utilities.strip_final(minus_ing, UNPROVIDED);
                        final SubLObject plus_e = string_utilities.post_fix(minus_ing, $$$e);
                        SubLObject ordered_tests = list(minus_ing, plus_e);
                        if (NIL != ends_with_doublerP(minus_ing)) {
                            if (NIL != string_utilities.ends_in_geminateP(minus_ing)) {
                                ordered_tests = cons(minus_4, ordered_tests);
                                ordered_tests = cons(minus_ing, ordered_tests);
                            }
                            if (NIL != ends_in_cvcP(minus_ing)) {
                                ordered_tests = cons(plus_e, ordered_tests);
                            }
                        }
                        if (NIL == stem) {
                            SubLObject csome_list_var2 = ordered_tests;
                            SubLObject verb_form = NIL;
                            verb_form = csome_list_var2.first();
                            while ((NIL == stem) && (NIL != csome_list_var2)) {
                                if (NIL != is_verb(verb_form)) {
                                    stem = verb_form;
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                verb_form = csome_list_var2.first();
                            } 
                        }
                    } else
                        if (((pos_keyword == $ANY) || (pos_keyword == $VERB)) && (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED))) {
                            final SubLObject minus_d = string_utilities.strip_final(string, UNPROVIDED);
                            final SubLObject minus_ed = string_utilities.strip_trailer(string, $$$ed);
                            final SubLObject minus_5 = string_utilities.strip_final(minus_ed, UNPROVIDED);
                            if (NIL != is_verb(minus_d)) {
                                stem = minus_d;
                            }
                            if ((NIL == stem) && (NIL != is_verb(minus_ed))) {
                                stem = minus_ed;
                            }
                            if ((NIL == stem) && (NIL != is_word(string))) {
                                stem = string;
                            }
                            if (NIL == stem) {
                                if ((NIL != ends_with_doublerP(minus_ed)) && (NIL != string_utilities.ends_in_geminateP(minus_ed))) {
                                    stem = minus_5;
                                } else {
                                    stem = minus_d;
                                }
                            }
                        } else
                            if ((NIL != string_utilities.ends_with(string, $$$z, UNPROVIDED)) && ((NIL != is_noun(string_utilities.strip_trailer(string, $$$z))) || (NIL != lexicon_accessors.denots_of_acronym_string(string_utilities.strip_trailer(string, $$$z), UNPROVIDED, UNPROVIDED)))) {
                                stem = string_utilities.strip_trailer(string, $$$z);
                            }




        }
        if (NIL == stem) {
            stem = string;
        }
        return stem;
    }/**
     * Given STRING, return a string which is likely to be its stem.
     * The optional part-of-speech keyword (e.g., :noun) restricts the type of stemming done.
     *
     * @unknown is-noun, is-verb, etc. are used to minimize extraneous stemmings (e.g., 'marches' to 'marche' due to Marche-TheWord proper noun mapping)
     * @unknown Instead of is-verb, use a new function for is-infinitive (e.g., 'ranging' =/=> 'rang')
     * @unknown tom.
     */


    /**
     * Given a verb STRING, return its infinitive form.
     */
    @LispMethod(comment = "Given a verb STRING, return its infinitive form.")
    public static final SubLObject inflected_verb_to_infinitive_alt(SubLObject string) {
        {
            SubLObject stem = NIL;
            if (NIL != string_utilities.ends_with(string, $$$ied, UNPROVIDED)) {
                stem = string_utilities.strip_trailer(string, $$$ied);
                string = string_utilities.post_fix(stem, $$$y);
                return string;
            }
            if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
                stem = string_utilities.strip_trailer(string, $$$ies);
                string = string_utilities.post_fix(stem, $$$y);
                return string;
            }
            if (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED)) {
                stem = string_utilities.strip_trailer(string, $$$ed);
                if (NIL != string_utilities.ends_with(stem, $$$y, UNPROVIDED)) {
                    return stem;
                }
                if (NIL != string_utilities.ends_in_geminateP(stem)) {
                    if (NIL != string_utilities.ends_with(stem, $$$l, UNPROVIDED)) {
                        return stem;
                    } else {
                        return string_utilities.strip_final(stem, UNPROVIDED);
                    }
                }
                return stem;
            }
            if (NIL != string_utilities.ends_with(string, $$$d, UNPROVIDED)) {
                string = string_utilities.strip_trailer(string, $$$d);
            }
            if (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
                stem = string_utilities.strip_trailer(string, $$$ing);
                if ((NIL != string_utilities.ends_in_geminateP(stem)) && (NIL == string_utilities.ends_with(stem, $$$l, UNPROVIDED))) {
                    return string_utilities.strip_final(stem, UNPROVIDED);
                } else {
                    return stem;
                }
            }
            if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
                string = com.cyc.cycjava.cycl.morphology.third_sg_verb_to_infinitive(string);
            }
            return string;
        }
    }

    @LispMethod(comment = "Given a verb STRING, return its infinitive form.")
    public static SubLObject inflected_verb_to_infinitive(SubLObject string) {
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$ied, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ied);
            string = string_utilities.post_fix(stem, $$$y);
            return string;
        }
        if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ies);
            string = string_utilities.post_fix(stem, $$$y);
            return string;
        }
        if (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ed);
            if (NIL != string_utilities.ends_with(stem, $$$y, UNPROVIDED)) {
                return stem;
            }
            if (NIL == string_utilities.ends_in_geminateP(stem)) {
                return stem;
            }
            if (NIL != string_utilities.ends_with(stem, $$$l, UNPROVIDED)) {
                return stem;
            }
            return string_utilities.strip_final(stem, UNPROVIDED);
        } else {
            if (NIL != string_utilities.ends_with(string, $$$d, UNPROVIDED)) {
                string = string_utilities.strip_trailer(string, $$$d);
            }
            if (NIL == string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
                if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
                    string = third_sg_verb_to_infinitive(string);
                }
                return string;
            }
            stem = string_utilities.strip_trailer(string, $$$ing);
            if ((NIL != string_utilities.ends_in_geminateP(stem)) && (NIL == string_utilities.ends_with(stem, $$$l, UNPROVIDED))) {
                return string_utilities.strip_final(stem, UNPROVIDED);
            }
            return stem;
        }
    }/**
     * Given a verb STRING, return its infinitive form.
     */


    /**
     * Given an agentive noun STRING, return its infinitive verb form.
     */
    @LispMethod(comment = "Given an agentive noun STRING, return its infinitive verb form.")
    public static final SubLObject agentive_to_infinitive_alt(SubLObject string) {
        {
            SubLObject stem = NIL;
            if (NIL != string_utilities.ends_with(string, $$$or, UNPROVIDED)) {
                return string_utilities.strip_trailer(string, $$$or);
            }
            if (NIL != string_utilities.ends_with(string, $$$er, UNPROVIDED)) {
                stem = string_utilities.strip_trailer(string, $$$er);
                if (NIL != nl_trie_accessors.nl_trie_words_of_stringXpred(stem, $$infinitive, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return stem;
                }
                return string_utilities.strip_trailer(string, $$$r);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Given an agentive noun STRING, return its infinitive verb form.")
    public static SubLObject agentive_to_infinitive(final SubLObject string) {
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$or, UNPROVIDED)) {
            return string_utilities.strip_trailer(string, $$$or);
        }
        if (NIL == string_utilities.ends_with(string, $$$er, UNPROVIDED)) {
            return NIL;
        }
        stem = string_utilities.strip_trailer(string, $$$er);
        if (NIL != nl_trie_accessors.nl_trie_words_of_stringXpred(stem, $$infinitive, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return stem;
        }
        return string_utilities.strip_trailer(string, $$$r);
    }/**
     * Given an agentive noun STRING, return its infinitive verb form.
     */


    /**
     * Given a third person singular verb STRING, return its infinitive
     * ;; form.
     *
     * @unknown (third-sg-verb-to-infinitive "waltzes") =>
    "waltz"
     */
    @LispMethod(comment = "Given a third person singular verb STRING, return its infinitive\r\n;; form.\r\n\r\n@unknown (third-sg-verb-to-infinitive \"waltzes\") =>\r\n\"waltz\"\nGiven a third person singular verb STRING, return its infinitive\n;; form.")
    public static final SubLObject third_sg_verb_to_infinitive_alt(SubLObject string) {
        {
            SubLObject stem = NIL;
            if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
                stem = string_utilities.post_fix(string_utilities.strip_trailer(string, $$$ies), $$$y);
                return stem;
            }
            if (NIL != string_utilities.ends_with(string, $$$es, UNPROVIDED)) {
                stem = string_utilities.strip_trailer(string, $$$es);
                {
                    SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
                    SubLObject ending = NIL;
                    for (ending = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ending = cdolist_list_var.first()) {
                        if (NIL != string_utilities.ends_with(stem, ending, UNPROVIDED)) {
                            return stem;
                        }
                    }
                }
            }
            if ((NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED))) {
                return string_utilities.strip_trailer(string, $$$s);
            }
            return string;
        }
    }

    @LispMethod(comment = "Given a third person singular verb STRING, return its infinitive\r\n;; form.\r\n\r\n@unknown (third-sg-verb-to-infinitive \"waltzes\") =>\r\n\"waltz\"\nGiven a third person singular verb STRING, return its infinitive\n;; form.")
    public static SubLObject third_sg_verb_to_infinitive(final SubLObject string) {
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
            stem = string_utilities.post_fix(string_utilities.strip_trailer(string, $$$ies), $$$y);
            return stem;
        }
        if (NIL != string_utilities.ends_with(string, $$$es, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$es);
            SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
            SubLObject ending = NIL;
            ending = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != string_utilities.ends_with(stem, ending, UNPROVIDED)) {
                    return stem;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ending = cdolist_list_var.first();
            } 
        }
        if ((NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED))) {
            return string_utilities.strip_trailer(string, $$$s);
        }
        return string;
    }/**
     * Given a third person singular verb STRING, return its infinitive
     * ;; form.
     *
     * @unknown (third-sg-verb-to-infinitive "waltzes") =>
    "waltz"
     */


    public static final SubLObject plural_noun_to_sg_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        return com.cyc.cycjava.cycl.morphology.singularize_string(string, mt);
    }

    public static SubLObject plural_noun_to_sg(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        return singularize_string(string, mt);
    }

    public static final SubLObject singular_reg_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $preserve_case_in_singular_regP$.getDynamicValue(thread)) {
                string = Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject stem = NIL;
                if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
                    stem = string_utilities.strip_trailer(string, $$$ies);
                    string = string_utilities.post_fix(stem, $$$y);
                    return string;
                }
                if (NIL != string_utilities.ends_with(string, $$$es, UNPROVIDED)) {
                    stem = string_utilities.strip_trailer(string, $$$es);
                    {
                        SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
                        SubLObject ending = NIL;
                        for (ending = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ending = cdolist_list_var.first()) {
                            if (NIL != string_utilities.ends_with(stem, ending, UNPROVIDED)) {
                                string = stem;
                                return string;
                            }
                        }
                    }
                }
                if (NIL != string_utilities.ends_with(string, $$$us, UNPROVIDED)) {
                    if (string.equal($$$us)) {
                        return string;
                    } else {
                        {
                            SubLObject preceding_char = string_utilities.last_char(string_utilities.strip_trailer(string, $$$us));
                            if (NIL != subl_promotions.memberP(preceding_char, $list_alt133, UNPROVIDED, UNPROVIDED)) {
                                return string;
                            }
                        }
                    }
                }
                if ((NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED))) {
                    string = string_utilities.strip_trailer(string, $$$s);
                }
            }
            return string;
        }
    }

    public static SubLObject singular_reg(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $preserve_case_in_singular_regP$.getDynamicValue(thread)) {
            string = Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
        }
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ies);
            string = string_utilities.post_fix(stem, $$$y);
            return string;
        }
        if (NIL != string_utilities.ends_with(string, $$$es, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$es);
            SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
            SubLObject ending = NIL;
            ending = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != string_utilities.ends_with(stem, ending, UNPROVIDED)) {
                    string = stem;
                    return string;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ending = cdolist_list_var.first();
            } 
        }
        if (NIL != string_utilities.ends_with(string, $$$us, UNPROVIDED)) {
            if (string.equal($$$us)) {
                return string;
            }
            final SubLObject preceding_char = string_utilities.last_char(string_utilities.strip_trailer(string, $$$us));
            if (NIL != subl_promotions.memberP(preceding_char, $list129, UNPROVIDED, UNPROVIDED)) {
                return string;
            }
        }
        if ((NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED))) {
            string = string_utilities.strip_trailer(string, $$$s);
        }
        return string;
    }

    /**
     * Is STRING a plural form?
     */
    @LispMethod(comment = "Is STRING a plural form?")
    public static final SubLObject plural_nounP_alt(SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
            {
                SubLObject stem = string_utilities.strip_final(string, UNPROVIDED);
                if (NIL != string_utilities.ends_with(stem, $$$s, UNPROVIDED)) {
                    return NIL;
                } else {
                    if (NIL != string_utilities.ends_with(stem, $$$e, UNPROVIDED)) {
                        return T;
                    } else {
                        {
                            SubLObject ends_with_sibilant = NIL;
                            if (NIL == ends_with_sibilant) {
                                {
                                    SubLObject csome_list_var = $list_alt134;
                                    SubLObject ending = NIL;
                                    for (ending = csome_list_var.first(); !((NIL != ends_with_sibilant) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ending = csome_list_var.first()) {
                                        ends_with_sibilant = string_utilities.ends_with(stem, ending, UNPROVIDED);
                                    }
                                }
                            }
                            return makeBoolean(NIL == ends_with_sibilant);
                        }
                    }
                }
            }
        } else {
            return NIL;
        }
    }

    @LispMethod(comment = "Is STRING a plural form?")
    public static SubLObject plural_nounP(final SubLObject string) {
        if (NIL == string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject stem = string_utilities.strip_final(string, UNPROVIDED);
        if (NIL != string_utilities.ends_with(stem, $$$s, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(stem, $$$e, UNPROVIDED)) {
            return T;
        }
        SubLObject ends_with_sibilant = NIL;
        if (NIL == ends_with_sibilant) {
            SubLObject csome_list_var;
            SubLObject ending;
            for (csome_list_var = $list130, ending = NIL, ending = csome_list_var.first(); (NIL == ends_with_sibilant) && (NIL != csome_list_var); ends_with_sibilant = string_utilities.ends_with(stem, ending, UNPROVIDED) , csome_list_var = csome_list_var.rest() , ending = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == ends_with_sibilant);
    }/**
     * Is STRING a plural form?
     */


    /**
     * Is STRING an infinitive form?
     */
    @LispMethod(comment = "Is STRING an infinitive form?")
    public static final SubLObject infinitive_verbP_alt(SubLObject string) {
        if (string == com.cyc.cycjava.cycl.morphology.inflected_verb_to_infinitive(string)) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING an infinitive form?")
    public static SubLObject infinitive_verbP(final SubLObject string) {
        if (string.eql(inflected_verb_to_infinitive(string))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING an infinitive form?
     */


    /**
     * Is STR a progressive from?
     */
    @LispMethod(comment = "Is STR a progressive from?")
    public static final SubLObject progressive_stringP_alt(SubLObject string) {
        if (NIL == string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject root = com.cyc.cycjava.cycl.morphology.find_stem(string, UNPROVIDED);
            return makeBoolean((NIL == Strings.string_equal(root, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != lexicon_accessors.string_is_posP(root, $$Verb, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    @LispMethod(comment = "Is STR a progressive from?")
    public static SubLObject progressive_stringP(final SubLObject string) {
        if (NIL == string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject root = find_stem(string, UNPROVIDED);
        return makeBoolean((NIL == Strings.string_equal(root, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != lexicon_accessors.string_is_posP(root, $$Verb, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }/**
     * Is STR a progressive from?
     */


    /**
     * Is STRING a perfect participle form?
     */
    @LispMethod(comment = "Is STRING a perfect participle form?")
    public static final SubLObject perfect_stringP_alt(SubLObject string) {
        if ((NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$en, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING a perfect participle form?")
    public static SubLObject perfect_stringP(final SubLObject string) {
        if ((NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$en, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING a perfect participle form?
     */


    /**
     * Is STRING a 3rd person singular form?
     */
    @LispMethod(comment = "Is STRING a 3rd person singular form?")
    public static final SubLObject f_3sg_stringP_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.morphology.plural_nounP(string);
    }

    @LispMethod(comment = "Is STRING a 3rd person singular form?")
    public static SubLObject f_3sg_stringP(final SubLObject string) {
        return plural_nounP(string);
    }/**
     * Is STRING a 3rd person singular form?
     */


    /**
     * Is STRING a string form of a number?
     */
    @LispMethod(comment = "Is STRING a string form of a number?")
    public static final SubLObject numberspp_alt(SubLObject string) {
        if (read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED).isNumber()) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING a string form of a number?")
    public static SubLObject numberspp(final SubLObject string) {
        if (read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED).isNumber()) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING a string form of a number?
     */


    public static final SubLObject comparative_degreeP_alt(SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$er, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject comparative_degreeP(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$er, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject superlative_degreeP_alt(SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$est, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject superlative_degreeP(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$est, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     * Given STEM and word unit WU, check whether WU has irregular forms for the part of speech represented by STEM.
     */
    @LispMethod(comment = "Given STEM and word unit WU, check whether WU has irregular forms for the part of speech represented by STEM.")
    public static final SubLObject irregularP_alt(SubLObject wu, SubLObject stem) {
        {
            SubLObject pos = lexicon_accessors.pos_of_stringXword(stem, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = pos;
            SubLObject pt = NIL;
            for (pt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pt = cdolist_list_var.first()) {
                if (pt == $$CountNoun) {
                    return com.cyc.cycjava.cycl.morphology.irregular_snP(wu);
                } else {
                    if (pt == $$Verb) {
                        return com.cyc.cycjava.cycl.morphology.irregular_verbP(wu);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Given STEM and word unit WU, check whether WU has irregular forms for the part of speech represented by STEM.")
    public static SubLObject irregularP(final SubLObject wu, final SubLObject stem) {
        SubLObject cdolist_list_var;
        final SubLObject pos = cdolist_list_var = lexicon_accessors.pos_of_stringXword(stem, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pt = NIL;
        pt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (pt.eql($$CountNoun)) {
                return irregular_snP(wu);
            }
            if (pt.eql($$Verb)) {
                return irregular_verbP(wu);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pt = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Given STEM and word unit WU, check whether WU has irregular forms for the part of speech represented by STEM.
     */


    /**
     * Does word unit WU have an irregular noun form?
     */
    @LispMethod(comment = "Does word unit WU have an irregular noun form?")
    public static final SubLObject irregular_snP_alt(SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.noun_form_singular(wu, UNPROVIDED)) && (NIL != lexicon_utilities.noun_form_plural(wu, UNPROVIDED)));
    }

    @LispMethod(comment = "Does word unit WU have an irregular noun form?")
    public static SubLObject irregular_snP(final SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.noun_form_singular(wu, UNPROVIDED)) && (NIL != lexicon_utilities.noun_form_plural(wu, UNPROVIDED)));
    }/**
     * Does word unit WU have an irregular noun form?
     */


    /**
     * Does word unit WU have an irregular agentive noun form?
     */
    @LispMethod(comment = "Does word unit WU have an irregular agentive noun form?")
    public static final SubLObject irregular_anP_alt(SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.ag_noun_form_singular(wu, UNPROVIDED)) && (NIL != lexicon_utilities.ag_noun_form_plural(wu, UNPROVIDED)));
    }

    @LispMethod(comment = "Does word unit WU have an irregular agentive noun form?")
    public static SubLObject irregular_anP(final SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.ag_noun_form_singular(wu, UNPROVIDED)) && (NIL != lexicon_utilities.ag_noun_form_plural(wu, UNPROVIDED)));
    }/**
     * Does word unit WU have an irregular agentive noun form?
     */


    /**
     * Does word unit WU have an irregular verb form?
     */
    @LispMethod(comment = "Does word unit WU have an irregular verb form?")
    public static final SubLObject irregular_verbP_alt(SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.verb_form_infinitive(wu, UNPROVIDED)) && (NIL != lexicon_utilities.verb_form_perfect(wu, UNPROVIDED)));
    }

    @LispMethod(comment = "Does word unit WU have an irregular verb form?")
    public static SubLObject irregular_verbP(final SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.verb_form_infinitive(wu, UNPROVIDED)) && (NIL != lexicon_utilities.verb_form_perfect(wu, UNPROVIDED)));
    }/**
     * Does word unit WU have an irregular verb form?
     */


    /**
     * Given STRING, return a list of possible parts of speech. If *use-wn-links?* is t, then WordNet will be consulted for pos information. Otherwise, morphological heuristics will be used.
     */
    @LispMethod(comment = "Given STRING, return a list of possible parts of speech. If *use-wn-links?* is t, then WordNet will be consulted for pos information. Otherwise, morphological heuristics will be used.")
    public static final SubLObject pos_of_unknown_word_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject speech_parts = NIL;
                if (NIL != com.cyc.cycjava.cycl.morphology.numberspp(string)) {
                    {
                        SubLObject item_var = $$Number_SP;
                        if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                            speech_parts = cons(item_var, speech_parts);
                        }
                    }
                }
                if (NIL != $use_wn_linksP$.getGlobalValue()) {
                    {
                        SubLObject pos_keywords = wordnet.pos_according_to_wn(string);
                        SubLObject cdolist_list_var = pos_keywords;
                        SubLObject key = NIL;
                        for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                            speech_parts = cons(assoc(key, lexicon_vars.$wn_pos_cyc_pos_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest(), speech_parts);
                        }
                    }
                }
                if (NIL == speech_parts) {
                    if (NIL != com.cyc.cycjava.cycl.morphology.proper_nounp(string)) {
                        {
                            SubLObject item_var = $$ProperCountNoun;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.morphology.nounp(string)) {
                        {
                            SubLObject item_var = $$CountNoun;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.morphology.adjectivep(string)) {
                        {
                            SubLObject item_var = $$Adjective;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.morphology.verbp(string)) {
                        {
                            SubLObject item_var = $$Verb;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.morphology.adverbp(string)) {
                        {
                            SubLObject item_var = $$Adverb;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                    }
                    if (NIL == speech_parts) {
                        {
                            SubLObject item_var = $$Verb;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                        {
                            SubLObject item_var = $$Adjective;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                        {
                            SubLObject item_var = $$CountNoun;
                            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                speech_parts = cons(item_var, speech_parts);
                            }
                        }
                    }
                }
                return speech_parts;
            }
        }
    }

    @LispMethod(comment = "Given STRING, return a list of possible parts of speech. If *use-wn-links?* is t, then WordNet will be consulted for pos information. Otherwise, morphological heuristics will be used.")
    public static SubLObject pos_of_unknown_word(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject speech_parts = NIL;
        if (NIL != numberspp(string)) {
            final SubLObject item_var = $$Number_SP;
            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                speech_parts = cons(item_var, speech_parts);
            }
        }
        if (NIL != $use_wn_linksP$.getGlobalValue()) {
            SubLObject cdolist_list_var;
            final SubLObject pos_keywords = cdolist_list_var = wordnet.pos_according_to_wn(string);
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                speech_parts = cons(assoc(key, lexicon_vars.$wn_pos_cyc_pos_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest(), speech_parts);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
        }
        if (NIL == speech_parts) {
            if (NIL != proper_nounp(string)) {
                final SubLObject item_var = $$ProperCountNoun;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != nounp(string)) {
                final SubLObject item_var = $$CountNoun;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != adjectivep(string)) {
                final SubLObject item_var = $$Adjective;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != verbp(string)) {
                final SubLObject item_var = $$Verb;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != adverbp(string)) {
                final SubLObject item_var = $$Adverb;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL == speech_parts) {
                SubLObject item_var = $$Verb;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
                item_var = $$Adjective;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
                item_var = $$CountNoun;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
        }
        return speech_parts;
    }/**
     * Given STRING, return a list of possible parts of speech. If *use-wn-links?* is t, then WordNet will be consulted for pos information. Otherwise, morphological heuristics will be used.
     */


    /**
     * Is STRING a proper noun?
     */
    @LispMethod(comment = "Is STRING a proper noun?")
    public static final SubLObject proper_nounp_alt(SubLObject string) {
        if (length(string).numG(ZERO_INTEGER) && (NIL != upper_case_p(Strings.sublisp_char(string, ZERO_INTEGER)))) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING a proper noun?")
    public static SubLObject proper_nounp(final SubLObject string) {
        if (length(string).numG(ZERO_INTEGER) && (NIL != upper_case_p(Strings.sublisp_char(string, ZERO_INTEGER)))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING a proper noun?
     */


    /**
     * Is STRING a verb?
     */
    @LispMethod(comment = "Is STRING a verb?")
    public static final SubLObject verbp_alt(SubLObject string) {
        {
            SubLObject string_1 = NIL;
            string_1 = com.cyc.cycjava.cycl.morphology.inflected_verb_to_infinitive(string);
            if (((((((NIL != string_utilities.ends_with(string_1, $$$ate, UNPROVIDED)) || (NIL != string_utilities.ends_with(string_1, $$$ize, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$yze, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$ify, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$en, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING a verb?")
    public static SubLObject verbp(final SubLObject string) {
        SubLObject string_1 = NIL;
        string_1 = inflected_verb_to_infinitive(string);
        if (((((((NIL != string_utilities.ends_with(string_1, $$$ate, UNPROVIDED)) || (NIL != string_utilities.ends_with(string_1, $$$ize, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$yze, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$ify, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$en, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING a verb?
     */


    /**
     * Is STRING a noun?
     */
    @LispMethod(comment = "Is STRING a noun?")
    public static final SubLObject nounp_alt(SubLObject string) {
        string = com.cyc.cycjava.cycl.morphology.plural_noun_to_sg(string, UNPROVIDED);
        if ((((((((((((((((((((((((((((((((((((((((((NIL != string_utilities.ends_with(string, $$$logy, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$ette, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ess, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$eer, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ity, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$omy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ion, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ist, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ics, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$geny, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ium, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$cracy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ism, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$itis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$oma, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$lysis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$hood, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ship, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$lty, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$meter, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$morph, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$morphy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$osis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$stery, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ence, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$tude, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ance, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$graphy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ment, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$age, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$dom, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ery, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ite, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$eer, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$let, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ling, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ster, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ant, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ee, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ity, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ese, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$an, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING a noun?")
    public static SubLObject nounp(SubLObject string) {
        string = plural_noun_to_sg(string, UNPROVIDED);
        if ((((((((((((((((((((((((((((((((((((((((((NIL != string_utilities.ends_with(string, $$$logy, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$ette, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ess, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$eer, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ity, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$omy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ion, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ist, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ics, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$geny, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ium, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$cracy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ism, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$itis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$oma, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$lysis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$hood, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ship, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$lty, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$meter, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$morph, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$morphy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$osis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$stery, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ence, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$tude, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ance, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$graphy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ment, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$age, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$dom, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ery, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ite, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$eer, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$let, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ling, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ster, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ant, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ee, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ity, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ese, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$an, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING a noun?
     */


    /**
     * Is STRING an adjective?
     */
    @LispMethod(comment = "Is STRING an adjective?")
    public static final SubLObject adjectivep_alt(SubLObject string) {
        if (((((((((((((((((((NIL != string_utilities.ends_with(string, $$$ical, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$ous, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$less, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ier, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$est, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ive, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$nant, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$thic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ible, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$able, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$etic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$itic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ful, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ish, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$like, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$y, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ial, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$esque, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ic, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING an adjective?")
    public static SubLObject adjectivep(final SubLObject string) {
        if (((((((((((((((((((NIL != string_utilities.ends_with(string, $$$ical, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$ous, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$less, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ier, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$est, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ive, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$nant, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$thic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ible, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$able, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$etic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$itic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ful, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ish, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$like, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$y, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ial, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$esque, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ic, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING an adjective?
     */


    /**
     * Is STRING an adverb?
     */
    @LispMethod(comment = "Is STRING an adverb?")
    public static final SubLObject adverbp_alt(SubLObject string) {
        if ((((NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$wise, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ward, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$wards, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Is STRING an adverb?")
    public static SubLObject adverbp(final SubLObject string) {
        if ((((NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$wise, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ward, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$wards, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }/**
     * Is STRING an adverb?
     */


    /**
     *
     *
     * @return boolean; t if OBJECT is a part-of-speech keyword, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a part-of-speech keyword, nil otherwise")
    public static final SubLObject pos_keyword_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return member(v_object, $pos_keywords$.getDynamicValue(thread), EQ, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a part-of-speech keyword, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a part-of-speech keyword, nil otherwise")
    public static SubLObject pos_keyword_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(v_object, $pos_keywords$.getDynamicValue(thread), EQL, UNPROVIDED);
    }

    /**
     *
     *
     * @param POS
    pos-keyword-p;
     * 		
     * @return predicate-p; the predicate to use to find the root form of POS
     */
    @LispMethod(comment = "@param POS\npos-keyword-p;\r\n\t\t\r\n@return predicate-p; the predicate to use to find the root form of POS")
    public static final SubLObject root_predicate_alt(SubLObject pos) {
        {
            SubLObject pcase_var = pos;
            if (pcase_var.eql($PROPER_NOUN)) {
                return $$pnSingular;
            } else {
                if (pcase_var.eql($NOUN)) {
                    return $$singular;
                } else {
                    if (pcase_var.eql($VERB)) {
                        return $$infinitive;
                    } else {
                        if (pcase_var.eql($ADJECTIVE)) {
                            return $$regularDegree;
                        } else {
                            if (pcase_var.eql($ADVERB)) {
                                return $$regularAdverb;
                            } else {
                                if (pcase_var.eql($PREPOSITION)) {
                                    return $$prepositionStrings;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param POS
    pos-keyword-p;
     * 		
     * @return predicate-p; the predicate to use to find the root form of POS
     */
    @LispMethod(comment = "@param POS\npos-keyword-p;\r\n\t\t\r\n@return predicate-p; the predicate to use to find the root form of POS")
    public static SubLObject root_predicate(final SubLObject pos) {
        if (pos.eql($PROPER_NOUN)) {
            return $$pnSingular;
        }
        if (pos.eql($NOUN)) {
            return $$singular;
        }
        if (pos.eql($VERB)) {
            return $$infinitive;
        }
        if (pos.eql($ADJECTIVE)) {
            return $$regularDegree;
        }
        if (pos.eql($ADVERB)) {
            return $$regularAdverb;
        }
        if (pos.eql($PREPOSITION)) {
            return $$prepositionStrings;
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD
     * 		stringp; @see get-root
     * @param POS-KEYWORD
     * 		pos-keyword-p ; @see get-root
     * @return stringp; @see get-root
    This is a wrapper function around get-root to quickly return answers for heads
    which are known to be special case. The proximal motivation was the contraction 's
    which was always interpreted as #$Have-Contraction (for 3rd person singular),
    even though it's contracted only when it's a modal.
     * @unknown twylie
     */
    @LispMethod(comment = "@param WORD\r\n\t\tstringp; @see get-root\r\n@param POS-KEYWORD\r\n\t\tpos-keyword-p ; @see get-root\r\n@return stringp; @see get-root\r\nThis is a wrapper function around get-root to quickly return answers for heads\r\nwhich are known to be special case. The proximal motivation was the contraction \'s\r\nwhich was always interpreted as #$Have-Contraction (for 3rd person singular),\r\neven though it\'s contracted only when it\'s a modal.\r\n@unknown twylie")
    public static final SubLObject get_root_of_head_alt(SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        if ((NIL != Strings.string_equal(word, $str_alt108$_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL == pos_keyword) || pos_keyword.eql($VERB))) {
            return $$$be;
        } else {
            return com.cyc.cycjava.cycl.morphology.get_root(word, pos_keyword);
        }
    }

    /**
     *
     *
     * @param WORD
     * 		stringp; @see get-root
     * @param POS-KEYWORD
     * 		pos-keyword-p ; @see get-root
     * @return stringp; @see get-root
    This is a wrapper function around get-root to quickly return answers for heads
    which are known to be special case. The proximal motivation was the contraction 's
    which was always interpreted as #$Have-Contraction (for 3rd person singular),
    even though it's contracted only when it's a modal.
     * @unknown twylie
     */
    @LispMethod(comment = "@param WORD\r\n\t\tstringp; @see get-root\r\n@param POS-KEYWORD\r\n\t\tpos-keyword-p ; @see get-root\r\n@return stringp; @see get-root\r\nThis is a wrapper function around get-root to quickly return answers for heads\r\nwhich are known to be special case. The proximal motivation was the contraction \'s\r\nwhich was always interpreted as #$Have-Contraction (for 3rd person singular),\r\neven though it\'s contracted only when it\'s a modal.\r\n@unknown twylie")
    public static SubLObject get_root_of_head(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        if ((NIL != Strings.string_equal(word, $str104$_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL == pos_keyword) || pos_keyword.eql($VERB))) {
            return $$$be;
        }
        return get_root(word, pos_keyword);
    }

    /**
     *
     *
     * @param WORD
     * 		stringp; an English word
     * @param POS-KEYWORD
    pos-keyword-p;
     * 		
     * @return stringp; the root form of WORD for part-of-speech POS-KEYWORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\tstringp; an English word\r\n@param POS-KEYWORD\npos-keyword-p;\r\n\t\t\r\n@return stringp; the root form of WORD for part-of-speech POS-KEYWORD")
    public static final SubLObject get_root_alt(SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(word, STRINGP);
            if (NIL != pos_keyword) {
                SubLTrampolineFile.checkType(pos_keyword, POS_KEYWORD_P);
            }
            {
                SubLObject pos_keywords = (NIL != pos_keyword) ? ((SubLObject) (list(pos_keyword))) : $pos_keywords$.getDynamicValue(thread);
                SubLObject wu = NIL;
                SubLObject assertion = NIL;
                if (NIL == wu) {
                    {
                        SubLObject csome_list_var = pos_keywords;
                        SubLObject pos = NIL;
                        for (pos = csome_list_var.first(); !((NIL != wu) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
                            wu = lexicon_accessors.words_of_stringXpos(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                            {
                                SubLObject expanded_wu = com.cyc.cycjava.cycl.morphology.expand_contracted_root(wu);
                                wu = (NIL != expanded_wu) ? ((SubLObject) (expanded_wu)) : wu;
                            }
                            assertion = (NIL != wu) ? ((SubLObject) (kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, com.cyc.cycjava.cycl.morphology.root_predicate(pos), $$GeneralEnglishMt, UNPROVIDED).first())) : NIL;
                        }
                    }
                }
                if (NIL != assertion) {
                    return assertions_high.gaf_arg2(assertion);
                }
                {
                    SubLObject root = NIL;
                    if (NIL == root) {
                        {
                            SubLObject csome_list_var = pos_keywords;
                            SubLObject pos = NIL;
                            for (pos = csome_list_var.first(); !((NIL != root) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
                                root = com.cyc.cycjava.cycl.morphology.find_stem(word, pos);
                            }
                        }
                    }
                    return root;
                }
            }
        }
    }

    /**
     *
     *
     * @param WORD
     * 		stringp; an English word
     * @param POS-KEYWORD
    pos-keyword-p;
     * 		
     * @return stringp; the root form of WORD for part-of-speech POS-KEYWORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\tstringp; an English word\r\n@param POS-KEYWORD\npos-keyword-p;\r\n\t\t\r\n@return stringp; the root form of WORD for part-of-speech POS-KEYWORD")
    public static SubLObject get_root(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word) : "! stringp(word) " + ("Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) ") + word;
        if (((NIL != pos_keyword) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == pos_keyword_p(pos_keyword))) {
            throw new AssertionError(pos_keyword);
        }
        final SubLObject pos_keywords = (NIL != pos_keyword) ? list(pos_keyword) : $pos_keywords$.getDynamicValue(thread);
        SubLObject wu = NIL;
        SubLObject assertion = NIL;
        if (NIL == wu) {
            SubLObject csome_list_var;
            SubLObject pos;
            SubLObject expanded_wu;
            for (csome_list_var = pos_keywords, pos = NIL, pos = csome_list_var.first(); (NIL == wu) && (NIL != csome_list_var); wu = lexicon_accessors.words_of_stringXpos(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED).first() , expanded_wu = expand_contracted_root(wu) , wu = (NIL != expanded_wu) ? expanded_wu : wu , assertion = (NIL != wu) ? kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, root_predicate(pos), $$GeneralEnglishMt, UNPROVIDED).first() : NIL , csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
            }
        }
        if (NIL != assertion) {
            return assertions_high.gaf_arg2(assertion);
        }
        SubLObject root = NIL;
        if (NIL == root) {
            SubLObject csome_list_var2;
            SubLObject pos2;
            for (csome_list_var2 = pos_keywords, pos2 = NIL, pos2 = csome_list_var2.first(); (NIL == root) && (NIL != csome_list_var2); root = find_stem(word, pos2) , csome_list_var2 = csome_list_var2.rest() , pos2 = csome_list_var2.first()) {
            }
        }
        return root;
    }

    /**
     *
     *
     * @param VALID-CONSTANT?
     * 		; an #$<AUX>-Contracted
     * @return VALID-CONSTANT? ; the appropriate -TheWord or -TheModal, if any
     */
    @LispMethod(comment = "@param VALID-CONSTANT?\r\n\t\t; an #$<AUX>-Contracted\r\n@return VALID-CONSTANT? ; the appropriate -TheWord or -TheModal, if any")
    public static final SubLObject expand_contracted_root_alt(SubLObject wu) {
        if (NIL == lexicon_accessors.quick_lexical_wordP(wu, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject pcase_var = wu;
            if (pcase_var.eql($$Be_Contracted)) {
                return $$Be_TheWord;
            } else {
                if (pcase_var.eql($$Will_Contracted)) {
                    return $$Will_TheModal;
                } else {
                    if (pcase_var.eql($$Have_Contracted)) {
                        return $$Have_TheWord;
                    } else {
                        if (pcase_var.eql($$Would_Contracted)) {
                            return $$Would_TheWord;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param VALID-CONSTANT?
     * 		; an #$<AUX>-Contracted
     * @return VALID-CONSTANT? ; the appropriate -TheWord or -TheModal, if any
     */
    @LispMethod(comment = "@param VALID-CONSTANT?\r\n\t\t; an #$<AUX>-Contracted\r\n@return VALID-CONSTANT? ; the appropriate -TheWord or -TheModal, if any")
    public static SubLObject expand_contracted_root(final SubLObject wu) {
        if (NIL == lexicon_accessors.quick_lexical_wordP(wu, UNPROVIDED)) {
            return NIL;
        }
        if (wu.eql($$Be_Contracted)) {
            return $$Be_TheWord;
        }
        if (wu.eql($$Will_Contracted)) {
            return $$Will_TheModal;
        }
        if (wu.eql($$Have_Contracted)) {
            return $$Have_TheWord;
        }
        if (wu.eql($$Would_Contracted)) {
            return $$Would_TheWord;
        }
        return NIL;
    }

    public static final SubLObject declare_morphology_file_alt() {
        declareFunction("get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false);
        declareFunction("estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false);
        declareFunction("monosyllabicP", "MONOSYLLABIC?", 1, 0, false);
        declareFunction("polysyllabicP", "POLYSYLLABIC?", 1, 1, false);
        declareFunction("vowel_charP", "VOWEL-CHAR?", 1, 1, false);
        declareFunction("consonant_charP", "CONSONANT-CHAR?", 1, 0, false);
        declareFunction("get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false);
        declareFunction("ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false);
        declareFunction("starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false);
        declareFunction("ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false);
        declareFunction("starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false);
        declareFunction("single_c_codaP", "SINGLE-C-CODA?", 1, 0, false);
        declareFunction("ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false);
        declareFunction("starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false);
        declareFunction("ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false);
        declareFunction("ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false);
        declareFunction("make_geminate", "MAKE-GEMINATE", 2, 0, false);
        declareFunction("geminate_last", "GEMINATE-LAST", 1, 0, false);
        declareFunction("correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false);
        declareFunction("regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false);
        declareFunction("pos_preds_derivable_from_pred", "POS-PREDS-DERIVABLE-FROM-PRED", 1, 1, false);
        declareFunction("clear_pos_preds_derivable_from_pred_int", "CLEAR-POS-PREDS-DERIVABLE-FROM-PRED-INT", 0, 0, false);
        declareFunction("remove_pos_preds_derivable_from_pred_int", "REMOVE-POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        declareFunction("pos_preds_derivable_from_pred_int_internal", "POS-PREDS-DERIVABLE-FROM-PRED-INT-INTERNAL", 3, 0, false);
        declareFunction("pos_preds_derivable_from_pred_int", "POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        declareFunction("singular_form_for_pred", "SINGULAR-FORM-FOR-PRED", 1, 0, false);
        declareFunction("plural_predP", "PLURAL-PRED?", 1, 1, false);
        declareFunction("singular_predP", "SINGULAR-PRED?", 1, 1, false);
        declareFunction("generate_z_form", "GENERATE-Z-FORM", 2, 0, false);
        declareFunction("suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false);
        declareFunction("generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false);
        declareFunction("generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false);
        declareFunction("generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false);
        declareFunction("add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false);
        declareFunction("find_stale_base_forms", "FIND-STALE-BASE-FORMS", 0, 0, false);
        declareFunction("try_to_fix_stale_base_form_gafs", "TRY-TO-FIX-STALE-BASE-FORM-GAFS", 0, 0, false);
        declareFunction("base_form_gaf_staleP", "BASE-FORM-GAF-STALE?", 1, 0, false);
        declareFunction("try_to_fix_stale_base_form_gaf", "TRY-TO-FIX-STALE-BASE-FORM-GAF", 1, 0, false);
        declareFunction("aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false);
        declareFunction("aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false);
        declareFunction("aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false);
        declareFunction("ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false);
        declareFunction("aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_add_e_before_s$BinaryFunction();
        declareFunction("aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_change_y_to_i$BinaryFunction();
        declareFunction("aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_ble_to_bil_before_ity$BinaryFunction();
        declareFunction("aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_change_aic_to_ac$BinaryFunction();
        declareFunction("aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_strip_final_e$BinaryFunction();
        declareFunction("aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_strip_final_vowels_before_ic$BinaryFunction();
        declareFunction("aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_change_ie_to_y$BinaryFunction();
        declareFunction("aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_change_ism_to_ist$BinaryFunction();
        declareFunction("aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_change_ceive_to_cept$BinaryFunction();
        declareFunction("aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_remove_able_le_before_ly$BinaryFunction();
        declareFunction("aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_geminate_last$BinaryFunction();
        declareFunction("aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false);
        new com.cyc.cycjava.cycl.morphology.$aes_able_to_ate$BinaryFunction();
        declareFunction("try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false);
        declareFunction("most_form", "MOST-FORM", 1, 0, false);
        declareFunction("more_form", "MORE-FORM", 1, 0, false);
        declareFunction("most_form_p", "MOST-FORM-P", 1, 0, false);
        declareFunction("more_form_p", "MORE-FORM-P", 1, 0, false);
        declareFunction("more_or_most_form", "MORE-OR-MOST-FORM", 2, 0, false);
        declareFunction("more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false);
        declareFunction("comparative_reg", "COMPARATIVE-REG", 1, 0, false);
        declareFunction("comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false);
        declareFunction("superlative_reg", "SUPERLATIVE-REG", 1, 0, false);
        declareFunction("superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false);
        declareFunction("test_comp_reg", "TEST-COMP-REG", 0, 0, false);
        declareFunction("past_tense_reg", "PAST-TENSE-REG", 1, 0, false);
        declareFunction("gerund_reg", "GERUND-REG", 1, 0, false);
        declareFunction("third_sg_reg", "THIRD-SG-REG", 1, 0, false);
        declareFunction("plural_reg", "PLURAL-REG", 1, 0, false);
        declareFunction("pn_plural_reg", "PN-PLURAL-REG", 1, 0, false);
        declareFunction("infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false);
        declareFunction("infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
        declareFunction("possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false);
        declareFunction("english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false);
        declareFunction("english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false);
        declareFunction("locativize_string", "LOCATIVIZE-STRING", 2, 0, false);
        declareFunction("not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false);
        declareFunction("english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false);
        declareFunction("pluralize_string", "PLURALIZE-STRING", 1, 1, false);
        declareFunction("pluralize_string_wXlexicon", "PLURALIZE-STRING-W/LEXICON", 2, 0, false);
        declareFunction("singularize_string", "SINGULARIZE-STRING", 1, 1, false);
        declareFunction("singularize_string_wXlexicon", "SINGULARIZE-STRING-W/LEXICON", 2, 0, false);
        declareFunction("has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false);
        declareFunction("has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false);
        declareFunction("is_word", "IS-WORD", 1, 0, false);
        declareFunction("is_noun", "IS-NOUN", 1, 0, false);
        declareFunction("is_verb", "IS-VERB", 1, 0, false);
        declareFunction("is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false);
        declareFunction("clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false);
        declareFunction("remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false);
        declareFunction("find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false);
        declareFunction("find_stem", "FIND-STEM", 1, 1, false);
        declareFunction("inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction("agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false);
        declareFunction("third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction("plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false);
        declareFunction("singular_reg", "SINGULAR-REG", 1, 0, false);
        declareFunction("plural_nounP", "PLURAL-NOUN?", 1, 0, false);
        declareFunction("infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false);
        declareFunction("progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false);
        declareFunction("perfect_stringP", "PERFECT-STRING?", 1, 0, false);
        declareFunction("f_3sg_stringP", "3SG-STRING?", 1, 0, false);
        declareFunction("numberspp", "NUMBERSPP", 1, 0, false);
        declareFunction("comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false);
        declareFunction("superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false);
        declareFunction("irregularP", "IRREGULAR?", 2, 0, false);
        declareFunction("irregular_snP", "IRREGULAR-SN?", 1, 0, false);
        declareFunction("irregular_anP", "IRREGULAR-AN?", 1, 0, false);
        declareFunction("irregular_verbP", "IRREGULAR-VERB?", 1, 0, false);
        declareFunction("pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false);
        declareFunction("proper_nounp", "PROPER-NOUNP", 1, 0, false);
        declareFunction("verbp", "VERBP", 1, 0, false);
        declareFunction("nounp", "NOUNP", 1, 0, false);
        declareFunction("adjectivep", "ADJECTIVEP", 1, 0, false);
        declareFunction("adverbp", "ADVERBP", 1, 0, false);
        declareFunction("pos_keyword_p", "POS-KEYWORD-P", 1, 0, false);
        declareFunction("root_predicate", "ROOT-PREDICATE", 1, 0, false);
        declareFunction("get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false);
        declareFunction("get_root", "GET-ROOT", 1, 1, false);
        declareFunction("expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_morphology_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false);
            declareFunction("estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false);
            declareFunction("monosyllabicP", "MONOSYLLABIC?", 1, 0, false);
            declareFunction("polysyllabicP", "POLYSYLLABIC?", 1, 1, false);
            declareFunction("vowel_charP", "VOWEL-CHAR?", 1, 1, false);
            declareFunction("consonant_charP", "CONSONANT-CHAR?", 1, 0, false);
            declareFunction("get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false);
            declareFunction("ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false);
            declareFunction("starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false);
            declareFunction("ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false);
            declareFunction("starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false);
            declareFunction("single_c_codaP", "SINGLE-C-CODA?", 1, 0, false);
            declareFunction("ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false);
            declareFunction("starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false);
            declareFunction("ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false);
            declareFunction("ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false);
            declareFunction("make_geminate", "MAKE-GEMINATE", 2, 0, false);
            declareFunction("geminate_last", "GEMINATE-LAST", 1, 0, false);
            declareFunction("correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false);
            declareFunction("regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false);
            declareFunction("pos_preds_derivable_from_pred", "POS-PREDS-DERIVABLE-FROM-PRED", 1, 1, false);
            declareFunction("clear_pos_preds_derivable_from_pred_int", "CLEAR-POS-PREDS-DERIVABLE-FROM-PRED-INT", 0, 0, false);
            declareFunction("remove_pos_preds_derivable_from_pred_int", "REMOVE-POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
            declareFunction("pos_preds_derivable_from_pred_int_internal", "POS-PREDS-DERIVABLE-FROM-PRED-INT-INTERNAL", 3, 0, false);
            declareFunction("pos_preds_derivable_from_pred_int", "POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
            declareFunction("singular_form_for_pred", "SINGULAR-FORM-FOR-PRED", 1, 0, false);
            declareFunction("plural_predP", "PLURAL-PRED?", 1, 1, false);
            declareFunction("singular_predP", "SINGULAR-PRED?", 1, 1, false);
            declareFunction("generate_z_form", "GENERATE-Z-FORM", 2, 0, false);
            declareFunction("suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false);
            declareFunction("generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false);
            declareFunction("generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false);
            declareFunction("generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false);
            declareFunction("add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false);
            declareFunction("aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false);
            declareFunction("aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false);
            declareFunction("aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false);
            declareFunction("ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false);
            declareFunction("aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false);
            new morphology.$aes_add_e_before_s$BinaryFunction();
            declareFunction("aes_ion_to_ation", "AES-ION-TO-ATION", 2, 0, false);
            declareFunction("aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false);
            new morphology.$aes_change_y_to_i$BinaryFunction();
            declareFunction("aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false);
            new morphology.$aes_ble_to_bil_before_ity$BinaryFunction();
            declareFunction("aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false);
            new morphology.$aes_change_aic_to_ac$BinaryFunction();
            declareFunction("aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false);
            new morphology.$aes_strip_final_e$BinaryFunction();
            declareFunction("aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false);
            new morphology.$aes_strip_final_vowels_before_ic$BinaryFunction();
            declareFunction("aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false);
            new morphology.$aes_change_ie_to_y$BinaryFunction();
            declareFunction("aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false);
            new morphology.$aes_change_ism_to_ist$BinaryFunction();
            declareFunction("aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false);
            new morphology.$aes_change_ceive_to_cept$BinaryFunction();
            declareFunction("aes_change_vert_to_vers", "AES-CHANGE-VERT-TO-VERS", 2, 0, false);
            declareFunction("aes_change_duce_to_duct", "AES-CHANGE-DUCE-TO-DUCT", 2, 0, false);
            declareFunction("aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false);
            new morphology.$aes_remove_able_le_before_ly$BinaryFunction();
            declareFunction("aes_de_to_se", "AES-DE-TO-SE", 2, 0, false);
            declareFunction("aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false);
            new morphology.$aes_geminate_last$BinaryFunction();
            declareFunction("dont_geminate_beforeP", "DONT-GEMINATE-BEFORE?", 1, 0, false);
            declareFunction("aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false);
            new morphology.$aes_able_to_ate$BinaryFunction();
            declareFunction("try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false);
            declareFunction("most_form", "MOST-FORM", 1, 0, false);
            declareFunction("more_form", "MORE-FORM", 1, 0, false);
            declareFunction("most_form_p", "MOST-FORM-P", 1, 0, false);
            declareFunction("more_form_p", "MORE-FORM-P", 1, 0, false);
            declareFunction("more_or_most_form", "MORE-OR-MOST-FORM", 2, 0, false);
            declareFunction("more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false);
            declareFunction("comparative_reg", "COMPARATIVE-REG", 1, 0, false);
            declareFunction("comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false);
            declareFunction("superlative_reg", "SUPERLATIVE-REG", 1, 0, false);
            declareFunction("superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false);
            declareFunction("past_tense_reg", "PAST-TENSE-REG", 1, 0, false);
            declareFunction("gerund_reg", "GERUND-REG", 1, 0, false);
            declareFunction("third_sg_reg", "THIRD-SG-REG", 1, 0, false);
            declareFunction("plural_reg", "PLURAL-REG", 1, 0, false);
            declareFunction("pn_plural_reg", "PN-PLURAL-REG", 1, 0, false);
            declareFunction("infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false);
            declareFunction("infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
            declareFunction("possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false);
            declareFunction("english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false);
            declareFunction("english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false);
            declareFunction("locativize_string", "LOCATIVIZE-STRING", 2, 0, false);
            declareFunction("not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false);
            declareFunction("english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false);
            declareFunction("pluralize_string", "PLURALIZE-STRING", 1, 1, false);
            declareFunction("pluralize_string_wXlexicon", "PLURALIZE-STRING-W/LEXICON", 2, 0, false);
            declareFunction("singularize_string", "SINGULARIZE-STRING", 1, 1, false);
            declareFunction("singularize_string_wXlexicon", "SINGULARIZE-STRING-W/LEXICON", 2, 0, false);
            declareFunction("has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false);
            declareFunction("has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false);
            declareFunction("is_word", "IS-WORD", 1, 0, false);
            declareFunction("is_noun", "IS-NOUN", 1, 0, false);
            declareFunction("is_verb", "IS-VERB", 1, 0, false);
            declareFunction("is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false);
            declareFunction("clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false);
            declareFunction("remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false);
            declareFunction("find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false);
            declareFunction("find_stem", "FIND-STEM", 1, 1, false);
            declareFunction("inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
            declareFunction("agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false);
            declareFunction("third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false);
            declareFunction("plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false);
            declareFunction("singular_reg", "SINGULAR-REG", 1, 0, false);
            declareFunction("plural_nounP", "PLURAL-NOUN?", 1, 0, false);
            declareFunction("infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false);
            declareFunction("progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false);
            declareFunction("perfect_stringP", "PERFECT-STRING?", 1, 0, false);
            declareFunction("f_3sg_stringP", "3SG-STRING?", 1, 0, false);
            declareFunction("numberspp", "NUMBERSPP", 1, 0, false);
            declareFunction("comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false);
            declareFunction("superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false);
            declareFunction("irregularP", "IRREGULAR?", 2, 0, false);
            declareFunction("irregular_snP", "IRREGULAR-SN?", 1, 0, false);
            declareFunction("irregular_anP", "IRREGULAR-AN?", 1, 0, false);
            declareFunction("irregular_verbP", "IRREGULAR-VERB?", 1, 0, false);
            declareFunction("pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false);
            declareFunction("proper_nounp", "PROPER-NOUNP", 1, 0, false);
            declareFunction("verbp", "VERBP", 1, 0, false);
            declareFunction("nounp", "NOUNP", 1, 0, false);
            declareFunction("adjectivep", "ADJECTIVEP", 1, 0, false);
            declareFunction("adverbp", "ADVERBP", 1, 0, false);
            declareFunction("pos_keyword_p", "POS-KEYWORD-P", 1, 0, false);
            declareFunction("root_predicate", "ROOT-PREDICATE", 1, 0, false);
            declareFunction("get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false);
            declareFunction("get_root", "GET-ROOT", 1, 1, false);
            declareFunction("expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("find_stale_base_forms", "FIND-STALE-BASE-FORMS", 0, 0, false);
            declareFunction("try_to_fix_stale_base_form_gafs", "TRY-TO-FIX-STALE-BASE-FORM-GAFS", 0, 0, false);
            declareFunction("base_form_gaf_staleP", "BASE-FORM-GAF-STALE?", 1, 0, false);
            declareFunction("try_to_fix_stale_base_form_gaf", "TRY-TO-FIX-STALE-BASE-FORM-GAF", 1, 0, false);
            declareFunction("test_comp_reg", "TEST-COMP-REG", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_morphology_file_Previous() {
        declareFunction("get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false);
        declareFunction("estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false);
        declareFunction("monosyllabicP", "MONOSYLLABIC?", 1, 0, false);
        declareFunction("polysyllabicP", "POLYSYLLABIC?", 1, 1, false);
        declareFunction("vowel_charP", "VOWEL-CHAR?", 1, 1, false);
        declareFunction("consonant_charP", "CONSONANT-CHAR?", 1, 0, false);
        declareFunction("get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false);
        declareFunction("ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false);
        declareFunction("starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false);
        declareFunction("ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false);
        declareFunction("starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false);
        declareFunction("single_c_codaP", "SINGLE-C-CODA?", 1, 0, false);
        declareFunction("ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false);
        declareFunction("starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false);
        declareFunction("ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false);
        declareFunction("ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false);
        declareFunction("make_geminate", "MAKE-GEMINATE", 2, 0, false);
        declareFunction("geminate_last", "GEMINATE-LAST", 1, 0, false);
        declareFunction("correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false);
        declareFunction("regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false);
        declareFunction("pos_preds_derivable_from_pred", "POS-PREDS-DERIVABLE-FROM-PRED", 1, 1, false);
        declareFunction("clear_pos_preds_derivable_from_pred_int", "CLEAR-POS-PREDS-DERIVABLE-FROM-PRED-INT", 0, 0, false);
        declareFunction("remove_pos_preds_derivable_from_pred_int", "REMOVE-POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        declareFunction("pos_preds_derivable_from_pred_int_internal", "POS-PREDS-DERIVABLE-FROM-PRED-INT-INTERNAL", 3, 0, false);
        declareFunction("pos_preds_derivable_from_pred_int", "POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        declareFunction("singular_form_for_pred", "SINGULAR-FORM-FOR-PRED", 1, 0, false);
        declareFunction("plural_predP", "PLURAL-PRED?", 1, 1, false);
        declareFunction("singular_predP", "SINGULAR-PRED?", 1, 1, false);
        declareFunction("generate_z_form", "GENERATE-Z-FORM", 2, 0, false);
        declareFunction("suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false);
        declareFunction("generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false);
        declareFunction("generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false);
        declareFunction("generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false);
        declareFunction("add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false);
        declareFunction("aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false);
        declareFunction("aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false);
        declareFunction("aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false);
        declareFunction("ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false);
        declareFunction("aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false);
        new morphology.$aes_add_e_before_s$BinaryFunction();
        declareFunction("aes_ion_to_ation", "AES-ION-TO-ATION", 2, 0, false);
        declareFunction("aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false);
        new morphology.$aes_change_y_to_i$BinaryFunction();
        declareFunction("aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false);
        new morphology.$aes_ble_to_bil_before_ity$BinaryFunction();
        declareFunction("aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false);
        new morphology.$aes_change_aic_to_ac$BinaryFunction();
        declareFunction("aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false);
        new morphology.$aes_strip_final_e$BinaryFunction();
        declareFunction("aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false);
        new morphology.$aes_strip_final_vowels_before_ic$BinaryFunction();
        declareFunction("aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false);
        new morphology.$aes_change_ie_to_y$BinaryFunction();
        declareFunction("aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false);
        new morphology.$aes_change_ism_to_ist$BinaryFunction();
        declareFunction("aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false);
        new morphology.$aes_change_ceive_to_cept$BinaryFunction();
        declareFunction("aes_change_vert_to_vers", "AES-CHANGE-VERT-TO-VERS", 2, 0, false);
        declareFunction("aes_change_duce_to_duct", "AES-CHANGE-DUCE-TO-DUCT", 2, 0, false);
        declareFunction("aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false);
        new morphology.$aes_remove_able_le_before_ly$BinaryFunction();
        declareFunction("aes_de_to_se", "AES-DE-TO-SE", 2, 0, false);
        declareFunction("aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false);
        new morphology.$aes_geminate_last$BinaryFunction();
        declareFunction("dont_geminate_beforeP", "DONT-GEMINATE-BEFORE?", 1, 0, false);
        declareFunction("aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false);
        new morphology.$aes_able_to_ate$BinaryFunction();
        declareFunction("try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false);
        declareFunction("most_form", "MOST-FORM", 1, 0, false);
        declareFunction("more_form", "MORE-FORM", 1, 0, false);
        declareFunction("most_form_p", "MOST-FORM-P", 1, 0, false);
        declareFunction("more_form_p", "MORE-FORM-P", 1, 0, false);
        declareFunction("more_or_most_form", "MORE-OR-MOST-FORM", 2, 0, false);
        declareFunction("more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false);
        declareFunction("comparative_reg", "COMPARATIVE-REG", 1, 0, false);
        declareFunction("comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false);
        declareFunction("superlative_reg", "SUPERLATIVE-REG", 1, 0, false);
        declareFunction("superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false);
        declareFunction("past_tense_reg", "PAST-TENSE-REG", 1, 0, false);
        declareFunction("gerund_reg", "GERUND-REG", 1, 0, false);
        declareFunction("third_sg_reg", "THIRD-SG-REG", 1, 0, false);
        declareFunction("plural_reg", "PLURAL-REG", 1, 0, false);
        declareFunction("pn_plural_reg", "PN-PLURAL-REG", 1, 0, false);
        declareFunction("infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false);
        declareFunction("infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
        declareFunction("possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false);
        declareFunction("english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false);
        declareFunction("english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false);
        declareFunction("locativize_string", "LOCATIVIZE-STRING", 2, 0, false);
        declareFunction("not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false);
        declareFunction("english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false);
        declareFunction("pluralize_string", "PLURALIZE-STRING", 1, 1, false);
        declareFunction("pluralize_string_wXlexicon", "PLURALIZE-STRING-W/LEXICON", 2, 0, false);
        declareFunction("singularize_string", "SINGULARIZE-STRING", 1, 1, false);
        declareFunction("singularize_string_wXlexicon", "SINGULARIZE-STRING-W/LEXICON", 2, 0, false);
        declareFunction("has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false);
        declareFunction("has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false);
        declareFunction("is_word", "IS-WORD", 1, 0, false);
        declareFunction("is_noun", "IS-NOUN", 1, 0, false);
        declareFunction("is_verb", "IS-VERB", 1, 0, false);
        declareFunction("is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false);
        declareFunction("clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false);
        declareFunction("remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false);
        declareFunction("find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false);
        declareFunction("find_stem", "FIND-STEM", 1, 1, false);
        declareFunction("inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction("agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false);
        declareFunction("third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction("plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false);
        declareFunction("singular_reg", "SINGULAR-REG", 1, 0, false);
        declareFunction("plural_nounP", "PLURAL-NOUN?", 1, 0, false);
        declareFunction("infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false);
        declareFunction("progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false);
        declareFunction("perfect_stringP", "PERFECT-STRING?", 1, 0, false);
        declareFunction("f_3sg_stringP", "3SG-STRING?", 1, 0, false);
        declareFunction("numberspp", "NUMBERSPP", 1, 0, false);
        declareFunction("comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false);
        declareFunction("superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false);
        declareFunction("irregularP", "IRREGULAR?", 2, 0, false);
        declareFunction("irregular_snP", "IRREGULAR-SN?", 1, 0, false);
        declareFunction("irregular_anP", "IRREGULAR-AN?", 1, 0, false);
        declareFunction("irregular_verbP", "IRREGULAR-VERB?", 1, 0, false);
        declareFunction("pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false);
        declareFunction("proper_nounp", "PROPER-NOUNP", 1, 0, false);
        declareFunction("verbp", "VERBP", 1, 0, false);
        declareFunction("nounp", "NOUNP", 1, 0, false);
        declareFunction("adjectivep", "ADJECTIVEP", 1, 0, false);
        declareFunction("adverbp", "ADVERBP", 1, 0, false);
        declareFunction("pos_keyword_p", "POS-KEYWORD-P", 1, 0, false);
        declareFunction("root_predicate", "ROOT-PREDICATE", 1, 0, false);
        declareFunction("get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false);
        declareFunction("get_root", "GET-ROOT", 1, 1, false);
        declareFunction("expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_morphology_file_alt() {
        defconstant("*VOWELS*", $$$aeiou);
        defconstant("*BIGRAPH-VOWELS*", $list_alt4);
        defconstant("*SIBILANT-ENDINGS*", $list_alt5);
        defconstant("*CONSONANTS*", $$$bcdfghjklmnprstvxz);
        defconstant("*DOUBLERS*", $$$bdfgklmnprtvz);
        defconstant("*UNSTRESSED-LATIN-PFXS*", $list_alt8);
        defconstant("*SPECIAL-ATE-CASES*", $list_alt9);
        defconstant("*LIQUIDS*", $list_alt10);
        defconstant("*VOWELS*-PLUS-Y*", cconcatenate($vowels$.getGlobalValue(), $$$y));
        deflexical("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*", NIL);
        deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list_alt58);
        deflexical("*COMPARATIVE-SYLLABLE-CUTOFF*", TWO_INTEGER);
        defconstant("*MORE-PREFIX*", $str_alt91$more_);
        defconstant("*MOST-PREFIX*", $str_alt92$most_);
        defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", $list_alt105);
        deflexical("*FIND-STEM-MEMOIZED-CACHING-STATE*", NIL);
        defparameter("*PRESERVE-CASE-IN-SINGULAR-REG?*", NIL);
        defparameter("*POS-KEYWORDS*", $list_alt197);
        return NIL;
    }

    public static SubLObject init_morphology_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*VOWELS*", $$$aeiou);
            defconstant("*BIGRAPH-VOWELS*", $list4);
            defconstant("*SIBILANT-ENDINGS*", $list5);
            defconstant("*CONSONANTS*", $$$bcdfghjklmnprstvxz);
            defconstant("*DOUBLERS*", $$$bdfgklmnprtvz);
            defconstant("*UNSTRESSED-LATIN-PFXS*", $list8);
            defconstant("*SPECIAL-ATE-CASES*", $list9);
            defconstant("*LIQUIDS*", $list10);
            defconstant("*VOWELS*-PLUS-Y*", cconcatenate($vowels$.getGlobalValue(), $$$y));
            deflexical("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*", NIL);
            deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list46);
            deflexical("*COMPARATIVE-SYLLABLE-CUTOFF*", TWO_INTEGER);
            defconstant("*MORE-PREFIX*", $$$more_);
            defconstant("*MOST-PREFIX*", $$$most_);
            defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", $list101);
            deflexical("*FIND-STEM-MEMOIZED-CACHING-STATE*", NIL);
            defparameter("*PRESERVE-CASE-IN-SINGULAR-REG?*", NIL);
            defparameter("*POS-KEYWORDS*", $list193);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list_alt58);
            defconstant("*MORE-PREFIX*", $str_alt91$more_);
            defconstant("*MOST-PREFIX*", $str_alt92$most_);
            defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", $list_alt105);
            defparameter("*POS-KEYWORDS*", $list_alt197);
        }
        return NIL;
    }

    public static SubLObject init_morphology_file_Previous() {
        defconstant("*VOWELS*", $$$aeiou);
        defconstant("*BIGRAPH-VOWELS*", $list4);
        defconstant("*SIBILANT-ENDINGS*", $list5);
        defconstant("*CONSONANTS*", $$$bcdfghjklmnprstvxz);
        defconstant("*DOUBLERS*", $$$bdfgklmnprtvz);
        defconstant("*UNSTRESSED-LATIN-PFXS*", $list8);
        defconstant("*SPECIAL-ATE-CASES*", $list9);
        defconstant("*LIQUIDS*", $list10);
        defconstant("*VOWELS*-PLUS-Y*", cconcatenate($vowels$.getGlobalValue(), $$$y));
        deflexical("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*", NIL);
        deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list46);
        deflexical("*COMPARATIVE-SYLLABLE-CUTOFF*", TWO_INTEGER);
        defconstant("*MORE-PREFIX*", $$$more_);
        defconstant("*MOST-PREFIX*", $$$most_);
        defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", $list101);
        deflexical("*FIND-STEM-MEMOIZED-CACHING-STATE*", NIL);
        defparameter("*PRESERVE-CASE-IN-SINGULAR-REG?*", NIL);
        defparameter("*POS-KEYWORDS*", $list193);
        return NIL;
    }

    public static final SubLObject setup_morphology_file_alt() {
        lexicon_vars.$morphology_code_revision$.setGlobalValue($str_alt0$_Revision__127214__);
        lexicon_vars.declare_noop_updates_for_lexicon_global($morphology_code_revision$, $list_alt2);
        memoization_state.note_globally_cached_function(POS_PREDS_DERIVABLE_FROM_PRED_INT);
        memoization_state.note_globally_cached_function(FIND_STEM_MEMOIZED);
        register_external_symbol(PLURAL_NOUN_TO_SG);
        return NIL;
    }

    public static SubLObject setup_morphology_file() {
        if (SubLFiles.USE_V1) {
            lexicon_vars.$morphology_code_revision$.setGlobalValue($str0$_Revision__149757__);
            lexicon_vars.declare_noop_updates_for_lexicon_global($morphology_code_revision$, $list2);
            memoization_state.note_globally_cached_function(POS_PREDS_DERIVABLE_FROM_PRED_INT);
            memoization_state.note_globally_cached_function(FIND_STEM_MEMOIZED);
            register_external_symbol(PLURAL_NOUN_TO_SG);
        }
        if (SubLFiles.USE_V2) {
            lexicon_vars.$morphology_code_revision$.setGlobalValue($str_alt0$_Revision__127214__);
        }
        return NIL;
    }

    public static SubLObject setup_morphology_file_Previous() {
        lexicon_vars.$morphology_code_revision$.setGlobalValue($str0$_Revision__149757__);
        lexicon_vars.declare_noop_updates_for_lexicon_global($morphology_code_revision$, $list2);
        memoization_state.note_globally_cached_function(POS_PREDS_DERIVABLE_FROM_PRED_INT);
        memoization_state.note_globally_cached_function(FIND_STEM_MEMOIZED);
        register_external_symbol(PLURAL_NOUN_TO_SG);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_morphology_file();
    }

    @Override
    public void initializeVariables() {
        init_morphology_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_morphology_file();
    }

    static {
    }

    public static final class $aes_add_e_before_s$BinaryFunction extends BinaryFunction {
        public $aes_add_e_before_s$BinaryFunction() {
            super(extractFunctionNamed("AES-ADD-E-BEFORE-S"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_add_e_before_s(arg1, arg2);
        }
    }

    public static final class $aes_change_y_to_i$BinaryFunction extends BinaryFunction {
        public $aes_change_y_to_i$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-Y-TO-I"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_y_to_i(arg1, arg2);
        }
    }

    public static final class $aes_ble_to_bil_before_ity$BinaryFunction extends BinaryFunction {
        public $aes_ble_to_bil_before_ity$BinaryFunction() {
            super(extractFunctionNamed("AES-BLE-TO-BIL-BEFORE-ITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_ble_to_bil_before_ity(arg1, arg2);
        }
    }

    public static final class $aes_change_aic_to_ac$BinaryFunction extends BinaryFunction {
        public $aes_change_aic_to_ac$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-AIC-TO-AC"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_aic_to_ac(arg1, arg2);
        }
    }

    public static final class $aes_strip_final_e$BinaryFunction extends BinaryFunction {
        public $aes_strip_final_e$BinaryFunction() {
            super(extractFunctionNamed("AES-STRIP-FINAL-E"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_strip_final_e(arg1, arg2);
        }
    }

    public static final class $aes_strip_final_vowels_before_ic$BinaryFunction extends BinaryFunction {
        public $aes_strip_final_vowels_before_ic$BinaryFunction() {
            super(extractFunctionNamed("AES-STRIP-FINAL-VOWELS-BEFORE-IC"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_strip_final_vowels_before_ic(arg1, arg2);
        }
    }

    public static final class $aes_change_ie_to_y$BinaryFunction extends BinaryFunction {
        public $aes_change_ie_to_y$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-IE-TO-Y"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_ie_to_y(arg1, arg2);
        }
    }

    public static final class $aes_change_ism_to_ist$BinaryFunction extends BinaryFunction {
        public $aes_change_ism_to_ist$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-ISM-TO-IST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_ism_to_ist(arg1, arg2);
        }
    }

    public static final class $aes_change_ceive_to_cept$BinaryFunction extends BinaryFunction {
        public $aes_change_ceive_to_cept$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-CEIVE-TO-CEPT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_ceive_to_cept(arg1, arg2);
        }
    }

    public static final class $aes_remove_able_le_before_ly$BinaryFunction extends BinaryFunction {
        public $aes_remove_able_le_before_ly$BinaryFunction() {
            super(extractFunctionNamed("AES-REMOVE-ABLE-LE-BEFORE-LY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_remove_able_le_before_ly(arg1, arg2);
        }
    }

    public static final class $aes_geminate_last$BinaryFunction extends BinaryFunction {
        public $aes_geminate_last$BinaryFunction() {
            super(extractFunctionNamed("AES-GEMINATE-LAST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_geminate_last(arg1, arg2);
        }
    }

    public static final class $aes_able_to_ate$BinaryFunction extends BinaryFunction {
        public $aes_able_to_ate$BinaryFunction() {
            super(extractFunctionNamed("AES-ABLE-TO-ATE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_able_to_ate(arg1, arg2);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_Revision__127214__ = makeString("$Revision: 127214 $");

    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeString("1.137"), makeString("1.138")), list(makeString("1.138"), makeString("1.139")), list(makeString("1.139"), makeString("1.140")), list(makeString("1.140"), makeString("1.141")), list(makeString("1.141"), makeString("1.142")), list(makeString("1.142"), makeString("1.143")), list(makeString("1.143"), makeString("1.144")), list(makeString("1.145"), makeString("1.146")), list(makeString("1.146"), makeString("1.147")), list(makeString("1.147"), makeString("1.148")), list(makeString("1.148"), makeString("1.149")), list(makeString("1.149"), makeString("1.150")) });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeString("ai"), makeString("au"), makeString("ay"), makeString("ea"), makeString("ee"), makeString("ei"), makeString("eu"), makeString("ie"), makeString("io"), makeString("oa"), makeString("oi"), makeString("oo"), makeString("ou"), makeString("ow"), makeString("oy"), makeString("ui") });

    static private final SubLList $list_alt5 = list(makeString("ss"), makeString("x"), makeString("sh"), makeString("ch"), makeString("z"), makeString("s"));

    static private final SubLList $list_alt8 = list(makeString("re"), makeString("de"), makeString("dis"), makeString("mis"), makeString("un"), makeString("in"), makeString("ex"));

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeString("evaporate"), makeString("appreciate"), makeString("associate"), makeString("accommodate"), makeString("affiliate"), makeString("applicate"), makeString("navigate"), makeString("calculate"), makeString("abdicate"), makeString("estimate"), makeString("emulate"), makeString("educate") });

    static private final SubLList $list_alt10 = list(makeString("l"), makeString("r"));

    public static final SubLSymbol $kw30$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt33 = list(reader_make_constant_shell("plural"), reader_make_constant_shell("pnPlural"), reader_make_constant_shell("agentive-Pl"));

    static private final SubLList $list_alt36 = list(reader_make_constant_shell("regularDegree"), reader_make_constant_shell("regularAdverb"));

    static private final SubLList $list_alt37 = list(reader_make_constant_shell("comparativeDegree"), reader_make_constant_shell("superlativeDegree"), reader_make_constant_shell("comparativeAdverb"), reader_make_constant_shell("superlativeAdverb"));

    static private final SubLList $list_alt40 = list(makeSymbol("RULE-BASE-PRED"), makeSymbol("SUFFIX"));



    static private final SubLString $str_alt48$Failed_to_fix__S__ = makeString("Failed to fix ~S~%");

    static private final SubLString $str_alt49$Fixed__S_of__S_stale___baseForm_G = makeString("Fixed ~S of ~S stale #$baseForm GAFs.");

    static private final SubLList $list_alt51 = list(reader_make_constant_shell("EnglishSuffixationFn"), list($BIND, makeSymbol("BASE")), list($BIND, makeSymbol("SUFFIX")));

    private static final SubLSymbol BASE = makeSymbol("BASE");

    static private final SubLString $str_alt54$_S_is_not_stale = makeString("~S is not stale");



    static private final SubLList $list_alt57 = cons(makeSymbol("CHANGE-FN"), makeSymbol("TYPE"));

    static private final SubLList $list_alt58 = list(new SubLObject[]{ cons(makeSymbol("AES-CHANGE-Y-TO-I"), $BOTH), cons(makeSymbol("AES-ABLE-TO-ATE"), $BASE), cons(makeSymbol("AES-GEMINATE-LAST"), $BASE), cons(makeSymbol("AES-BLE-TO-BIL-BEFORE-ITY"), $BASE), cons(makeSymbol("AES-CHANGE-CEIVE-TO-CEPT"), $BASE), cons(makeSymbol("AES-CHANGE-AIC-TO-AC"), $BASE), cons(makeSymbol("AES-STRIP-FINAL-E"), $BASE), cons(makeSymbol("AES-STRIP-FINAL-VOWELS-BEFORE-IC"), $BASE), cons(makeSymbol("AES-CHANGE-IE-TO-Y"), $BASE), cons(makeSymbol("AES-CHANGE-ISM-TO-IST"), $BASE), cons(makeSymbol("AES-REMOVE-ABLE-LE-BEFORE-LY"), $BASE), cons(makeSymbol("AES-ADD-E-BEFORE-S"), makeKeyword("SUFFIX")) });

    static private final SubLList $list_alt59 = list($BOTH, $BASE);

    static private final SubLList $list_alt60 = list($BOTH, makeKeyword("SUFFIX"));

    static private final SubLList $list_alt88 = list(makeString("n"), makeString("l"), makeString("t"));

    static private final SubLString $str_alt91$more_ = makeString("more ");

    static private final SubLString $str_alt92$most_ = makeString("most ");

    static private final SubLString $str_alt93$Assuming__S_is_comparative__Addin = makeString("Assuming ~S is comparative. Adding ~S to ~S");

    static private final SubLString $str_alt96$___S___S__S__ = makeString("~%~S: ~S ~S~%");

    static private final SubLList $list_alt105 = list(new SubLObject[]{ cons(makeString("I"), makeString("my")), cons(makeString("me"), makeString("my")), cons(makeString("you"), makeString("your")), cons(makeString("he"), makeString("his")), cons(makeString("him"), makeString("his")), cons(makeString("him or her"), makeString("his or her")), cons(makeString("he or she"), makeString("his or her")), cons(makeString("she"), makeString("her")), cons(makeString("her"), makeString("her")), cons(makeString("it"), makeString("its")), cons(makeString("we"), makeString("our")), cons(makeString("us"), makeString("our")), cons(makeString("they"), makeString("their")), cons(makeString("them"), makeString("their")), cons(makeString("there"), makeString("that place's")), cons(makeString("here"), makeString("this place's")) });

    static private final SubLString $str_alt107$_ = makeString("'");

    static private final SubLString $str_alt108$_s = makeString("'s");

    static private final SubLString $str_alt109$_ = makeString(" ");

    static private final SubLList $list_alt115 = list(makeKeyword("PROPER-NOUN"), $NOUN);

    static private final SubLList $list_alt117 = list($NOUN, makeKeyword("PROPER-NOUN"), $VERB);

    static private final SubLList $list_alt125 = list(makeString("o"), makeString("ch"), makeString("x"), makeString("sh"), makeString("z"), makeString("s"));

    static private final SubLList $list_alt133 = list(CHAR_r, CHAR_h, CHAR_t, CHAR_n);

    static private final SubLList $list_alt134 = list(makeString("ch"), makeString("sh"), makeString("x"), makeString("z"));

    static private final SubLList $list_alt197 = list($NOUN, makeKeyword("PROPER-NOUN"), $VERB, makeKeyword("ADJECTIVE"), makeKeyword("ADVERB"), makeKeyword("PREPOSITION"));
}

/**
 * Total time: 672 ms synthetic
 */
