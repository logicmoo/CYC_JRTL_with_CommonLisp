/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MWP-AFFIX-MATCHER
 * source file: /cyc/top/cycl/mwp-affix-matcher.lisp
 * created:     2019/07/03 17:38:23
 */
public final class mwp_affix_matcher extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mwp_affix_matcher();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_suffix_variantsP$ = makeSymbol("*USE-SUFFIX-VARIANTS?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $mwp_suffix_matcher_deriv$ = makeSymbol("*MWP-SUFFIX-MATCHER-DERIV*");

    public static final SubLSymbol $mwp_suffix_matcher_infl$ = makeSymbol("*MWP-SUFFIX-MATCHER-INFL*");

    public static final SubLSymbol $mwp_prefix_matcher_deriv$ = makeSymbol("*MWP-PREFIX-MATCHER-DERIV*");

    public static final SubLSymbol $mwp_prefix_matcher_infl$ = makeSymbol("*MWP-PREFIX-MATCHER-INFL*");



    static private final SubLString $str7$Finding_derivational_suffix_strin = makeString("Finding derivational suffix strings...");











    static private final SubLString $str15$Finding_derivational_prefix_strin = makeString("Finding derivational prefix strings...");



    static private final SubLList $list17 = list(makeSymbol("SUFFIX"), makeSymbol("VALUE"));

    static private final SubLList $list18 = list(makeSymbol("PREFIX"), makeSymbol("VALUE"));

    // Definitions
    public static final SubLObject mwp_suffix_matcher_p_alt(SubLObject obj) {
        return strie.strie_p(obj, UNPROVIDED);
    }

    // Definitions
    public static SubLObject mwp_suffix_matcher_p(final SubLObject obj) {
        return strie.strie_p(obj, UNPROVIDED);
    }

    public static final SubLObject new_mwp_suffix_matcher_alt() {
        return strie.new_strie(symbol_function(EQUALP));
    }

    public static SubLObject new_mwp_suffix_matcher() {
        return strie.new_strie(symbol_function(EQUALP));
    }

    public static final SubLObject mwp_prefix_matcher_p_alt(SubLObject obj) {
        return strie.strie_p(obj, UNPROVIDED);
    }

    public static SubLObject mwp_prefix_matcher_p(final SubLObject obj) {
        return strie.strie_p(obj, UNPROVIDED);
    }

    public static final SubLObject new_mwp_prefix_matcher_alt() {
        return strie.new_strie(symbol_function(EQUALP));
    }

    public static SubLObject new_mwp_prefix_matcher() {
        return strie.new_strie(symbol_function(EQUALP));
    }

    /**
     *
     *
     * @param TYPE
    NL-AFFIX-TYPE-P
     * 		
     * @return MWP-SUFFIX-MATCHER-P appropriate for TYPE.
     */
    @LispMethod(comment = "@param TYPE\nNL-AFFIX-TYPE-P\r\n\t\t\r\n@return MWP-SUFFIX-MATCHER-P appropriate for TYPE.")
    public static final SubLObject mwp_suffix_matcher_alt(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($DERIV)) {
                return $mwp_suffix_matcher_deriv$.getGlobalValue();
            } else {
                if (pcase_var.eql($INFL)) {
                    return $mwp_suffix_matcher_infl$.getGlobalValue();
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TYPE
    NL-AFFIX-TYPE-P
     * 		
     * @return MWP-SUFFIX-MATCHER-P appropriate for TYPE.
     */
    @LispMethod(comment = "@param TYPE\nNL-AFFIX-TYPE-P\r\n\t\t\r\n@return MWP-SUFFIX-MATCHER-P appropriate for TYPE.")
    public static SubLObject mwp_suffix_matcher(final SubLObject type) {
        if (type.eql($DERIV)) {
            return $mwp_suffix_matcher_deriv$.getGlobalValue();
        }
        if (type.eql($INFL)) {
            return $mwp_suffix_matcher_infl$.getGlobalValue();
        }
        return NIL;
    }

    /**
     *
     *
     * @param TYPE
    NL-AFFIX-TYPE-P
     * 		
     * @return MWP-PREFIX-MATCHER-P appropriate for TYPE.
     * @unknown default for english will be :DERIV
     */
    @LispMethod(comment = "@param TYPE\nNL-AFFIX-TYPE-P\r\n\t\t\r\n@return MWP-PREFIX-MATCHER-P appropriate for TYPE.\r\n@unknown default for english will be :DERIV")
    public static final SubLObject mwp_prefix_matcher_alt(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($DERIV)) {
                return $mwp_prefix_matcher_deriv$.getGlobalValue();
            } else {
                if (pcase_var.eql($INFL)) {
                    return $mwp_prefix_matcher_infl$.getGlobalValue();
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TYPE
    NL-AFFIX-TYPE-P
     * 		
     * @return MWP-PREFIX-MATCHER-P appropriate for TYPE.
     * @unknown default for english will be :DERIV
     */
    @LispMethod(comment = "@param TYPE\nNL-AFFIX-TYPE-P\r\n\t\t\r\n@return MWP-PREFIX-MATCHER-P appropriate for TYPE.\r\n@unknown default for english will be :DERIV")
    public static SubLObject mwp_prefix_matcher(final SubLObject type) {
        if (type.eql($DERIV)) {
            return $mwp_prefix_matcher_deriv$.getGlobalValue();
        }
        if (type.eql($INFL)) {
            return $mwp_prefix_matcher_infl$.getGlobalValue();
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of string-token-p; associating suffix strings with mwp-rule-p objects.
     */
    @LispMethod(comment = "@return LISTP of string-token-p; associating suffix strings with mwp-rule-p objects.")
    public static final SubLObject mwp_suffix_matcher_find_matches_alt(SubLObject suffix_matcher, SubLObject word_string) {
        {
            SubLObject ans = NIL;
            if (!((NIL != string_utilities.empty_string_p(word_string)) || (NIL != find(CHAR_vertical, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                {
                    SubLObject tokens = strie.strie_prefixes(suffix_matcher, reverse(word_string));
                    SubLObject cdolist_list_var = tokens;
                    SubLObject token = NIL;
                    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                        {
                            SubLObject suffix = reverse(standard_tokenization.string_token_string(token));
                            SubLObject rules = standard_tokenization.string_token_value(token);
                            ans = cons(standard_tokenization.new_string_token(suffix, rules), ans);
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
     * @return LISTP of string-token-p; associating suffix strings with mwp-rule-p objects.
     */
    @LispMethod(comment = "@return LISTP of string-token-p; associating suffix strings with mwp-rule-p objects.")
    public static SubLObject mwp_suffix_matcher_find_matches(final SubLObject suffix_matcher, final SubLObject word_string) {
        SubLObject ans = NIL;
        if ((NIL == string_utilities.empty_string_p(word_string)) && (NIL == find(CHAR_vertical, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            SubLObject cdolist_list_var;
            final SubLObject tokens = cdolist_list_var = strie.strie_prefixes(suffix_matcher, reverse(word_string));
            SubLObject token = NIL;
            token = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject suffix = reverse(standard_tokenization.string_token_string(token));
                final SubLObject rules = standard_tokenization.string_token_value(token);
                ans = cons(standard_tokenization.new_string_token(suffix, rules), ans);
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    /**
     *
     *
     * @return LISTP of string-token-p; associating prefix strings with mwp-rule-p objects.
     */
    @LispMethod(comment = "@return LISTP of string-token-p; associating prefix strings with mwp-rule-p objects.")
    public static final SubLObject mwp_prefix_matcher_find_matches_alt(SubLObject prefix_matcher, SubLObject word_string) {
        {
            SubLObject ans = NIL;
            if (!((NIL != string_utilities.empty_string_p(word_string)) || (NIL != find(CHAR_vertical, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                {
                    SubLObject tokens = strie.strie_prefixes(prefix_matcher, word_string);
                    SubLObject cdolist_list_var = tokens;
                    SubLObject token = NIL;
                    for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                        {
                            SubLObject prefix = standard_tokenization.string_token_string(token);
                            SubLObject rules = standard_tokenization.string_token_value(token);
                            ans = cons(standard_tokenization.new_string_token(prefix, rules), ans);
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
     * @return LISTP of string-token-p; associating prefix strings with mwp-rule-p objects.
     */
    @LispMethod(comment = "@return LISTP of string-token-p; associating prefix strings with mwp-rule-p objects.")
    public static SubLObject mwp_prefix_matcher_find_matches(final SubLObject prefix_matcher, final SubLObject word_string) {
        SubLObject ans = NIL;
        if ((NIL == string_utilities.empty_string_p(word_string)) && (NIL == find(CHAR_vertical, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            SubLObject cdolist_list_var;
            final SubLObject tokens = cdolist_list_var = strie.strie_prefixes(prefix_matcher, word_string);
            SubLObject token = NIL;
            token = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject prefix = standard_tokenization.string_token_string(token);
                final SubLObject rules = standard_tokenization.string_token_value(token);
                ans = cons(standard_tokenization.new_string_token(prefix, rules), ans);
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    /**
     * Initialize the suffix matchers
     */
    @LispMethod(comment = "Initialize the suffix matchers")
    public static final SubLObject mwp_suffix_matcher_init_alt() {
        {
            SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.mwp_affix_matcher.do_mwp_suffix_matcher_init(type);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Initialize the suffix matchers")
    public static SubLObject mwp_suffix_matcher_init() {
        SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            do_mwp_suffix_matcher_init(type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Initialize the prefix matchers
     */
    @LispMethod(comment = "Initialize the prefix matchers")
    public static final SubLObject mwp_prefix_matcher_init_alt() {
        {
            SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.mwp_affix_matcher.do_mwp_prefix_matcher_init(type);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Initialize the prefix matchers")
    public static SubLObject mwp_prefix_matcher_init() {
        SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            do_mwp_prefix_matcher_init(type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return INTEGERP; How many suffixes of TYPE do we have?
     */
    @LispMethod(comment = "@return INTEGERP; How many suffixes of TYPE do we have?")
    public static final SubLObject mwp_suffix_count_alt(SubLObject type) {
        return strie.strie_size(com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_suffix_matcher(type));
    }

    /**
     *
     *
     * @return INTEGERP; How many suffixes of TYPE do we have?
     */
    @LispMethod(comment = "@return INTEGERP; How many suffixes of TYPE do we have?")
    public static SubLObject mwp_suffix_count(final SubLObject type) {
        return strie.strie_size(mwp_suffix_matcher(type));
    }

    /**
     *
     *
     * @return INTEGERP; How many prefixes of TYPE do we have?
     */
    @LispMethod(comment = "@return INTEGERP; How many prefixes of TYPE do we have?")
    public static final SubLObject mwp_prefix_count_alt(SubLObject type) {
        return strie.strie_size(com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_prefix_matcher(type));
    }

    /**
     *
     *
     * @return INTEGERP; How many prefixes of TYPE do we have?
     */
    @LispMethod(comment = "@return INTEGERP; How many prefixes of TYPE do we have?")
    public static SubLObject mwp_prefix_count(final SubLObject type) {
        return strie.strie_size(mwp_prefix_matcher(type));
    }

    /**
     *
     *
     * @return LISTP; ((<string> <suffix-rule>))
     */
    @LispMethod(comment = "@return LISTP; ((<string> <suffix-rule>))")
    public static final SubLObject mwp_suffixes_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($DERIV)) {
                    {
                        SubLObject suffixes = NIL;
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject reified_affixes = isa.all_fort_instances($$DerivationalSuffix, UNPROVIDED, UNPROVIDED);
                                    SubLObject total = length(reified_affixes);
                                    SubLObject so_far = ZERO_INTEGER;
                                    {
                                        SubLObject _prev_bind_0_1 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_2 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_3 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($str_alt7$Finding_derivational_suffix_strin);
                                            {
                                                SubLObject cdolist_list_var = reified_affixes;
                                                SubLObject reified_suffix = NIL;
                                                for (reified_suffix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reified_suffix = cdolist_list_var.first()) {
                                                    if (NIL == isa.isaP(reified_suffix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject pred_var = $$suffixString;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_suffix, NIL, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_suffix, NIL, pred_var);
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
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_4 = NIL;
                                                                                            SubLObject token_var_5 = NIL;
                                                                                            while (NIL == done_var_4) {
                                                                                                {
                                                                                                    SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                                                    SubLObject valid_6 = makeBoolean(token_var_5 != as);
                                                                                                    if (NIL != valid_6) {
                                                                                                        {
                                                                                                            SubLObject rule = mwp_rule.mwp_rule_from_constant(reified_suffix);
                                                                                                            SubLObject suffix_string = assertions_high.gaf_arg2(as);
                                                                                                            suffixes = cons(list(suffix_string, rule), suffixes);
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_4 = makeBoolean(NIL == valid_6);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
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
                                                        if (NIL != $use_suffix_variantsP$.getDynamicValue(thread)) {
                                                            {
                                                                SubLObject pred_var = $$phoneticVariantOfSuffix;
                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_suffix, NIL, pred_var)) {
                                                                    {
                                                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_suffix, NIL, pred_var);
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
                                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                            {
                                                                                                SubLObject done_var_8 = NIL;
                                                                                                SubLObject token_var_9 = NIL;
                                                                                                while (NIL == done_var_8) {
                                                                                                    {
                                                                                                        SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
                                                                                                        SubLObject valid_10 = makeBoolean(token_var_9 != as);
                                                                                                        if (NIL != valid_10) {
                                                                                                            {
                                                                                                                SubLObject rule = mwp_rule.mwp_rule_from_constant(reified_suffix);
                                                                                                                SubLObject suffix_string = assertions_high.gaf_arg2(as);
                                                                                                                suffixes = cons(list(suffix_string, rule), suffixes);
                                                                                                            }
                                                                                                        }
                                                                                                        done_var_8 = makeBoolean(NIL == valid_10);
                                                                                                    }
                                                                                                } 
                                                                                            }
                                                                                        } finally {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    if (NIL != final_index_iterator) {
                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                    }
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
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
                                                    so_far = add(so_far, ONE_INTEGER);
                                                    note_percent_progress(so_far, total);
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2_3, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return suffixes;
                    }
                } else {
                    if (pcase_var.eql($INFL)) {
                        {
                            SubLObject suffixes = NIL;
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject pred_var = $$regularSuffix;
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
                                                                        SubLObject done_var_12 = NIL;
                                                                        SubLObject token_var_13 = NIL;
                                                                        while (NIL == done_var_12) {
                                                                            {
                                                                                SubLObject rule_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                                                                SubLObject valid_14 = makeBoolean(token_var_13 != rule_as);
                                                                                if (NIL != valid_14) {
                                                                                    {
                                                                                        SubLObject rule = mwp_rule.mwp_rule_from_constant(assertions_high.gaf_arg1(rule_as));
                                                                                        SubLObject suffix = assertions_high.gaf_arg3(rule_as);
                                                                                        suffixes = cons(list(suffix, rule), suffixes);
                                                                                    }
                                                                                }
                                                                                done_var_12 = makeBoolean(NIL == valid_14);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
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
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return suffixes;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return LISTP; ((<string> <suffix-rule>))
     */
    @LispMethod(comment = "@return LISTP; ((<string> <suffix-rule>))")
    public static SubLObject mwp_suffixes(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (type.eql($DERIV)) {
            SubLObject suffixes = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject reified_affixes = isa.all_fort_instances($$DerivationalSuffix, UNPROVIDED, UNPROVIDED);
                final SubLObject total = length(reified_affixes);
                SubLObject so_far = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$1 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($str7$Finding_derivational_suffix_strin);
                        SubLObject cdolist_list_var = reified_affixes;
                        SubLObject reified_suffix = NIL;
                        reified_suffix = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == isa.isaP(reified_suffix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                SubLObject pred_var = $$suffixString;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_suffix, NIL, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_suffix, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$4 = NIL;
                                                final SubLObject token_var_$5 = NIL;
                                                while (NIL == done_var_$4) {
                                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(as));
                                                    if (NIL != valid_$6) {
                                                        final SubLObject rule = mwp_rule.mwp_rule_from_constant(reified_suffix);
                                                        final SubLObject suffix_string = cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(as));
                                                        suffixes = cons(list(suffix_string, rule), suffixes);
                                                    }
                                                    done_var_$4 = makeBoolean(NIL == valid_$6);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                                if (NIL != $use_suffix_variantsP$.getDynamicValue(thread)) {
                                    pred_var = $$phoneticVariantOfSuffix;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_suffix, NIL, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_suffix, NIL, pred_var);
                                        SubLObject done_var = NIL;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    SubLObject done_var_$5 = NIL;
                                                    final SubLObject token_var_$6 = NIL;
                                                    while (NIL == done_var_$5) {
                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(as));
                                                        if (NIL != valid_$7) {
                                                            final SubLObject rule = mwp_rule.mwp_rule_from_constant(reified_suffix);
                                                            final SubLObject suffix_string = cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(as));
                                                            suffixes = cons(list(suffix_string, rule), suffixes);
                                                        }
                                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        } 
                                    }
                                }
                            }
                            so_far = add(so_far, ONE_INTEGER);
                            note_percent_progress(so_far, total);
                            cdolist_list_var = cdolist_list_var.rest();
                            reified_suffix = cdolist_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2_$3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$2, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return suffixes;
        }
        if (type.eql($INFL)) {
            SubLObject suffixes = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var2 = $$regularSuffix;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$4 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject rule_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(rule_as));
                                        if (NIL != valid_$8) {
                                            final SubLObject rule = mwp_rule.mwp_rule_from_constant(assertions_high.gaf_arg1(rule_as));
                                            final SubLObject suffix = assertions_high.gaf_arg3(rule_as);
                                            suffixes = cons(list(suffix, rule), suffixes);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_9, thread);
                        $is_noting_progressP$.rebind(_prev_bind_8, thread);
                        $progress_count$.rebind(_prev_bind_7, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
                        $progress_notification_count$.rebind(_prev_bind_5, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$4, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return suffixes;
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP; ((<string> <prefix-rule>))
     */
    @LispMethod(comment = "@return LISTP; ((<string> <prefix-rule>))")
    public static final SubLObject mwp_prefixes_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($DERIV)) {
                    {
                        SubLObject prefixes = NIL;
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject reified_affixes = isa.all_fort_instances($$DerivationalPrefix, UNPROVIDED, UNPROVIDED);
                                    SubLObject total = length(reified_affixes);
                                    SubLObject so_far = ZERO_INTEGER;
                                    {
                                        SubLObject _prev_bind_0_16 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_17 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_18 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($str_alt15$Finding_derivational_prefix_strin);
                                            {
                                                SubLObject cdolist_list_var = reified_affixes;
                                                SubLObject reified_prefix = NIL;
                                                for (reified_prefix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reified_prefix = cdolist_list_var.first()) {
                                                    if (NIL == isa.isaP(reified_prefix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject pred_var = $$prefixString;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_prefix, NIL, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_prefix, NIL, pred_var);
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
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_19 = NIL;
                                                                                            SubLObject token_var_20 = NIL;
                                                                                            while (NIL == done_var_19) {
                                                                                                {
                                                                                                    SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                                                                    SubLObject valid_21 = makeBoolean(token_var_20 != as);
                                                                                                    if (NIL != valid_21) {
                                                                                                        {
                                                                                                            SubLObject rule = mwp_rule.mwp_rule_from_constant(reified_prefix);
                                                                                                            SubLObject prefix_string = assertions_high.gaf_arg2(as);
                                                                                                            prefixes = cons(list(prefix_string, rule), prefixes);
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_19 = makeBoolean(NIL == valid_21);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
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
                                                    so_far = add(so_far, ONE_INTEGER);
                                                    note_percent_progress(so_far, total);
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2_18, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_17, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return prefixes;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return LISTP; ((<string> <prefix-rule>))
     */
    @LispMethod(comment = "@return LISTP; ((<string> <prefix-rule>))")
    public static SubLObject mwp_prefixes(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (type.eql($DERIV)) {
            SubLObject prefixes = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject reified_affixes = isa.all_fort_instances($$DerivationalPrefix, UNPROVIDED, UNPROVIDED);
                final SubLObject total = length(reified_affixes);
                SubLObject so_far = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$20 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$21 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$22 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($str15$Finding_derivational_prefix_strin);
                        SubLObject cdolist_list_var = reified_affixes;
                        SubLObject reified_prefix = NIL;
                        reified_prefix = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == isa.isaP(reified_prefix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                final SubLObject pred_var = $$prefixString;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_prefix, NIL, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_prefix, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$23 = NIL;
                                                final SubLObject token_var_$24 = NIL;
                                                while (NIL == done_var_$23) {
                                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                                    final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(as));
                                                    if (NIL != valid_$25) {
                                                        final SubLObject rule = mwp_rule.mwp_rule_from_constant(reified_prefix);
                                                        final SubLObject prefix_string = cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(as));
                                                        prefixes = cons(list(prefix_string, rule), prefixes);
                                                    }
                                                    done_var_$23 = makeBoolean(NIL == valid_$25);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            }
                            so_far = add(so_far, ONE_INTEGER);
                            note_percent_progress(so_far, total);
                            cdolist_list_var = cdolist_list_var.rest();
                            reified_prefix = cdolist_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2_$22, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$21, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$20, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return prefixes;
        }
        return NIL;
    }

    public static final SubLObject mwp_suffix_matcher_insert_alt(SubLObject type, SubLObject suffix, SubLObject value) {
        return strie.strie_insert(com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_suffix_matcher(type), reverse(suffix), value);
    }

    public static SubLObject mwp_suffix_matcher_insert(final SubLObject type, final SubLObject suffix, final SubLObject value) {
        return strie.strie_insert(mwp_suffix_matcher(type), reverse(suffix), value);
    }

    public static final SubLObject mwp_prefix_matcher_insert_alt(SubLObject type, SubLObject prefix, SubLObject value) {
        return strie.strie_insert(com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_prefix_matcher(type), prefix, value);
    }

    public static SubLObject mwp_prefix_matcher_insert(final SubLObject type, final SubLObject prefix, final SubLObject value) {
        return strie.strie_insert(mwp_prefix_matcher(type), prefix, value);
    }

    public static final SubLObject do_mwp_suffix_matcher_init_alt(SubLObject type) {
        strie.strie_clear(com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_suffix_matcher(type));
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_suffixes(type);
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject suffix = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    suffix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_suffix_matcher_insert(type, suffix, value);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt17);
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_suffix_matcher(type);
    }

    public static SubLObject do_mwp_suffix_matcher_init(final SubLObject type) {
        strie.strie_clear(mwp_suffix_matcher(type));
        SubLObject cdolist_list_var = mwp_suffixes(type);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject suffix = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list17);
            suffix = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list17);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                mwp_suffix_matcher_insert(type, suffix, value);
            } else {
                cdestructuring_bind_error(datum, $list17);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return mwp_suffix_matcher(type);
    }

    public static final SubLObject do_mwp_prefix_matcher_init_alt(SubLObject type) {
        strie.strie_clear(com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_prefix_matcher(type));
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_prefixes(type);
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject prefix = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_prefix_matcher_insert(type, prefix, value);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt18);
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.mwp_affix_matcher.mwp_prefix_matcher(type);
    }

    public static SubLObject do_mwp_prefix_matcher_init(final SubLObject type) {
        strie.strie_clear(mwp_prefix_matcher(type));
        SubLObject cdolist_list_var = mwp_prefixes(type);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject prefix = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list18);
            prefix = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list18);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                mwp_prefix_matcher_insert(type, prefix, value);
            } else {
                cdestructuring_bind_error(datum, $list18);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return mwp_prefix_matcher(type);
    }

    public static SubLObject declare_mwp_affix_matcher_file() {
        declareFunction("mwp_suffix_matcher_p", "MWP-SUFFIX-MATCHER-P", 1, 0, false);
        declareFunction("new_mwp_suffix_matcher", "NEW-MWP-SUFFIX-MATCHER", 0, 0, false);
        declareFunction("mwp_prefix_matcher_p", "MWP-PREFIX-MATCHER-P", 1, 0, false);
        declareFunction("new_mwp_prefix_matcher", "NEW-MWP-PREFIX-MATCHER", 0, 0, false);
        declareFunction("mwp_suffix_matcher", "MWP-SUFFIX-MATCHER", 1, 0, false);
        declareFunction("mwp_prefix_matcher", "MWP-PREFIX-MATCHER", 1, 0, false);
        declareFunction("mwp_suffix_matcher_find_matches", "MWP-SUFFIX-MATCHER-FIND-MATCHES", 2, 0, false);
        declareFunction("mwp_prefix_matcher_find_matches", "MWP-PREFIX-MATCHER-FIND-MATCHES", 2, 0, false);
        declareFunction("mwp_suffix_matcher_init", "MWP-SUFFIX-MATCHER-INIT", 0, 0, false);
        declareFunction("mwp_prefix_matcher_init", "MWP-PREFIX-MATCHER-INIT", 0, 0, false);
        declareFunction("mwp_suffix_count", "MWP-SUFFIX-COUNT", 1, 0, false);
        declareFunction("mwp_prefix_count", "MWP-PREFIX-COUNT", 1, 0, false);
        declareFunction("mwp_suffixes", "MWP-SUFFIXES", 1, 0, false);
        declareFunction("mwp_prefixes", "MWP-PREFIXES", 1, 0, false);
        declareFunction("mwp_suffix_matcher_insert", "MWP-SUFFIX-MATCHER-INSERT", 3, 0, false);
        declareFunction("mwp_prefix_matcher_insert", "MWP-PREFIX-MATCHER-INSERT", 3, 0, false);
        declareFunction("do_mwp_suffix_matcher_init", "DO-MWP-SUFFIX-MATCHER-INIT", 1, 0, false);
        declareFunction("do_mwp_prefix_matcher_init", "DO-MWP-PREFIX-MATCHER-INIT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mwp_affix_matcher_file_alt() {
        deflexical("*MWP-SUFFIX-MATCHER-DERIV*", NIL != boundp($mwp_suffix_matcher_deriv$) ? ((SubLObject) ($mwp_suffix_matcher_deriv$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_suffix_matcher());
        deflexical("*MWP-SUFFIX-MATCHER-INFL*", NIL != boundp($mwp_suffix_matcher_infl$) ? ((SubLObject) ($mwp_suffix_matcher_infl$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_suffix_matcher());
        deflexical("*MWP-PREFIX-MATCHER-DERIV*", NIL != boundp($mwp_prefix_matcher_deriv$) ? ((SubLObject) ($mwp_prefix_matcher_deriv$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_prefix_matcher());
        deflexical("*MWP-PREFIX-MATCHER-INFL*", NIL != boundp($mwp_prefix_matcher_infl$) ? ((SubLObject) ($mwp_prefix_matcher_infl$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_prefix_matcher());
        defparameter("*USE-SUFFIX-VARIANTS?*", NIL);
        return NIL;
    }

    public static SubLObject init_mwp_affix_matcher_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*MWP-SUFFIX-MATCHER-DERIV*", SubLTrampolineFile.maybeDefault($mwp_suffix_matcher_deriv$, $mwp_suffix_matcher_deriv$, () -> new_mwp_suffix_matcher()));
            deflexical("*MWP-SUFFIX-MATCHER-INFL*", SubLTrampolineFile.maybeDefault($mwp_suffix_matcher_infl$, $mwp_suffix_matcher_infl$, () -> new_mwp_suffix_matcher()));
            deflexical("*MWP-PREFIX-MATCHER-DERIV*", SubLTrampolineFile.maybeDefault($mwp_prefix_matcher_deriv$, $mwp_prefix_matcher_deriv$, () -> new_mwp_prefix_matcher()));
            deflexical("*MWP-PREFIX-MATCHER-INFL*", SubLTrampolineFile.maybeDefault($mwp_prefix_matcher_infl$, $mwp_prefix_matcher_infl$, () -> new_mwp_prefix_matcher()));
            defparameter("*USE-SUFFIX-VARIANTS?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MWP-SUFFIX-MATCHER-DERIV*", NIL != boundp($mwp_suffix_matcher_deriv$) ? ((SubLObject) ($mwp_suffix_matcher_deriv$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_suffix_matcher());
            deflexical("*MWP-SUFFIX-MATCHER-INFL*", NIL != boundp($mwp_suffix_matcher_infl$) ? ((SubLObject) ($mwp_suffix_matcher_infl$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_suffix_matcher());
            deflexical("*MWP-PREFIX-MATCHER-DERIV*", NIL != boundp($mwp_prefix_matcher_deriv$) ? ((SubLObject) ($mwp_prefix_matcher_deriv$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_prefix_matcher());
            deflexical("*MWP-PREFIX-MATCHER-INFL*", NIL != boundp($mwp_prefix_matcher_infl$) ? ((SubLObject) ($mwp_prefix_matcher_infl$.getGlobalValue())) : com.cyc.cycjava.cycl.mwp_affix_matcher.new_mwp_prefix_matcher());
        }
        return NIL;
    }

    public static SubLObject init_mwp_affix_matcher_file_Previous() {
        deflexical("*MWP-SUFFIX-MATCHER-DERIV*", SubLTrampolineFile.maybeDefault($mwp_suffix_matcher_deriv$, $mwp_suffix_matcher_deriv$, () -> new_mwp_suffix_matcher()));
        deflexical("*MWP-SUFFIX-MATCHER-INFL*", SubLTrampolineFile.maybeDefault($mwp_suffix_matcher_infl$, $mwp_suffix_matcher_infl$, () -> new_mwp_suffix_matcher()));
        deflexical("*MWP-PREFIX-MATCHER-DERIV*", SubLTrampolineFile.maybeDefault($mwp_prefix_matcher_deriv$, $mwp_prefix_matcher_deriv$, () -> new_mwp_prefix_matcher()));
        deflexical("*MWP-PREFIX-MATCHER-INFL*", SubLTrampolineFile.maybeDefault($mwp_prefix_matcher_infl$, $mwp_prefix_matcher_infl$, () -> new_mwp_prefix_matcher()));
        defparameter("*USE-SUFFIX-VARIANTS?*", NIL);
        return NIL;
    }

    public static SubLObject setup_mwp_affix_matcher_file() {
        declare_defglobal($mwp_suffix_matcher_deriv$);
        declare_defglobal($mwp_suffix_matcher_infl$);
        declare_defglobal($mwp_prefix_matcher_deriv$);
        declare_defglobal($mwp_prefix_matcher_infl$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mwp_affix_matcher_file();
    }

    @Override
    public void initializeVariables() {
        init_mwp_affix_matcher_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mwp_affix_matcher_file();
    }

    static {
    }

    static private final SubLString $str_alt7$Finding_derivational_suffix_strin = makeString("Finding derivational suffix strings...");

    static private final SubLString $str_alt15$Finding_derivational_prefix_strin = makeString("Finding derivational prefix strings...");

    static private final SubLList $list_alt17 = list(makeSymbol("SUFFIX"), makeSymbol("VALUE"));

    static private final SubLList $list_alt18 = list(makeSymbol("PREFIX"), makeSymbol("VALUE"));
}

/**
 * Total time: 382 ms
 */
