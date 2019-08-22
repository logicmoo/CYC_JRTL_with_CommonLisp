package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class nl_generation_api extends SubLTranslatedFile {
    public static final SubLFile me = new nl_generation_api();

    public static final String myName = "com.cyc.cycjava.cycl.nl_generation_api";

    public static final String myFingerPrint = "dc5e53aff6d968e695f9e96cfc6c021007411aa0208d3bf33a62dbc10d244850";

    // Internal Constants
    public static final SubLSymbol NEW_PPH_PARAMETERS = makeSymbol("NEW-PPH-PARAMETERS");

    public static final SubLSymbol PPH_API_PARAM_LIST_P = makeSymbol("PPH-API-PARAM-LIST-P");

    public static final SubLSymbol PPH_MUTABLE_API_PARAMS_P = makeSymbol("PPH-MUTABLE-API-PARAMS-P");



    public static final SubLSymbol PPH_API_PARAM_P = makeSymbol("PPH-API-PARAM-P");

    public static final SubLList $list5 = list(makeSymbol("PARAM-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym6$TIMED_OUT_ = makeUninternedSymbol("TIMED-OUT?");

    public static final SubLSymbol $sym7$PARAMS = makeUninternedSymbol("PARAMS");

    public static final SubLSymbol GET_PPH_PARAM = makeSymbol("GET-PPH-PARAM");

    public static final SubLSymbol $sym9$TERM__ = makeSymbol("TERM-<");





    public static final SubLList $list12 = list(NIL);

    public static final SubLSymbol WITH_PPH_TIMEOUT = makeSymbol("WITH-PPH-TIMEOUT");

    public static final SubLList $list14 = list(makeKeyword("PPH-TIMEOUT"));



    public static final SubLSymbol PPH_API_PARAMS_P = makeSymbol("PPH-API-PARAMS-P");





    public static final SubLSymbol LEXICAL_CONTEXT_P = makeSymbol("LEXICAL-CONTEXT-P");

    public static final SubLSymbol CYCL_TERM_TO_NL_STRING_INTERNAL = makeSymbol("CYCL-TERM-TO-NL-STRING-INTERNAL");

    public static final SubLSymbol CYCL_TERM_TO_NL_STRING = makeSymbol("CYCL-TERM-TO-NL-STRING");

    public static final SubLSymbol CYCL_TERM_TO_NL_INTERNAL = makeSymbol("CYCL-TERM-TO-NL-INTERNAL");

    public static final SubLSymbol CYCL_TERM_TO_NL = makeSymbol("CYCL-TERM-TO-NL");



    private static final SubLSymbol $PPH_SENTENTIAL_FORCE = makeKeyword("PPH-SENTENTIAL-FORCE");

    private static final SubLSymbol $PPH_LEXICAL_CONTEXT = makeKeyword("PPH-LEXICAL-CONTEXT");

    private static final SubLSymbol $PPH_SEMANTIC_MT = makeKeyword("PPH-SEMANTIC-MT");

    private static final SubLSymbol $PPH_GENERATION_COUNT = makeKeyword("PPH-GENERATION-COUNT");

    private static final SubLSymbol $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_ = makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");



    private static final SubLSymbol $kw31$HIDE_EXPLICIT_UNIVERSALS_ = makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");

    private static final SubLSymbol $MAX_DIGITS_WITHOUT_COMMA = makeKeyword("MAX-DIGITS-WITHOUT-COMMA");

    private static final SubLSymbol $kw33$MAXIMIZE_LINKS_ = makeKeyword("MAXIMIZE-LINKS?");

    private static final SubLSymbol $kw34$QUANTIFY_VARIABLES_ = makeKeyword("QUANTIFY-VARIABLES?");

    private static final SubLSymbol $GENLPREDS_BACKOFF_LIMIT = makeKeyword("GENLPREDS-BACKOFF-LIMIT");

    private static final SubLSymbol $SIGNIFICANT_DIGITS_CUTOFF = makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");

    private static final SubLSymbol $kw37$PREFER_TERSE_PARAPHRASE_ = makeKeyword("PREFER-TERSE-PARAPHRASE?");

    private static final SubLSymbol $kw38$USE_INDEXICAL_DATES_ = makeKeyword("USE-INDEXICAL-DATES?");

    private static final SubLSymbol $kw39$USE_SMART_VARIABLE_REPLACEMENT_ = makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");

    private static final SubLSymbol $kw40$USE_TITLE_CAPITALIZATION_ = makeKeyword("USE-TITLE-CAPITALIZATION?");







    public static final SubLSymbol CYCL_TERMS_TO_NL_STRINGS_INTERNAL = makeSymbol("CYCL-TERMS-TO-NL-STRINGS-INTERNAL");

    public static final SubLSymbol CYCL_TERMS_TO_NL_STRINGS = makeSymbol("CYCL-TERMS-TO-NL-STRINGS");

    public static final SubLSymbol CYCL_TERMS_TO_NL_INTERNAL = makeSymbol("CYCL-TERMS-TO-NL-INTERNAL");

    public static final SubLSymbol CYCL_TERMS_TO_NL = makeSymbol("CYCL-TERMS-TO-NL");



    public static final SubLSymbol CYCL_TERM_TO_SEARCH_QUERY_INTERNAL = makeSymbol("CYCL-TERM-TO-SEARCH-QUERY-INTERNAL");

    public static final SubLSymbol CYCL_TERM_TO_SEARCH_QUERY = makeSymbol("CYCL-TERM-TO-SEARCH-QUERY");

    public static final SubLSymbol PPH_OUTPUT_MAP_TO_TEXT_INTERNAL = makeSymbol("PPH-OUTPUT-MAP-TO-TEXT-INTERNAL");

    public static final SubLSymbol PPH_OUTPUT_MAP_TO_TEXT = makeSymbol("PPH-OUTPUT-MAP-TO-TEXT");

    public static final SubLSymbol PPH_OUTPUT_MAP_TO_HTML_INTERNAL = makeSymbol("PPH-OUTPUT-MAP-TO-HTML-INTERNAL");

    public static final SubLSymbol PPH_OUTPUT_MAP_TO_HTML = makeSymbol("PPH-OUTPUT-MAP-TO-HTML");

    public static final SubLSymbol PPH_OUTPUT_MAPS_P = makeSymbol("PPH-OUTPUT-MAPS-P");

    public static final SubLSymbol PPH_OUTPUT_MAP_P = makeSymbol("PPH-OUTPUT-MAP-P");

    public static final SubLList $list57 = list(makeKeyword("OR"), list(list(makeKeyword("TEST"), makeSymbol("CYCL-TERM-P")), list(makeKeyword("TEST"), makeSymbol("PPH-JAVALIST-P"))), list(makeKeyword("TEST"), makeSymbol("PPH-JAVALIST-ITEM-P")));

    public static final SubLSymbol PPH_OUTPUT_MAP_GET_ITEMS = makeSymbol("PPH-OUTPUT-MAP-GET-ITEMS");

    public static final SubLSymbol PPH_OUTPUT_MAP_GET_STRING = makeSymbol("PPH-OUTPUT-MAP-GET-STRING");

    public static final SubLSymbol PPH_OUTPUT_MAP_GET_CYCL = makeSymbol("PPH-OUTPUT-MAP-GET-CYCL");

    public static final SubLSymbol PPH_OUTPUT_MAP_GET_STRING_OFFSET = makeSymbol("PPH-OUTPUT-MAP-GET-STRING-OFFSET");

    public static final SubLSymbol PPH_OUTPUT_MAP_GET_ARG_POSITION = makeSymbol("PPH-OUTPUT-MAP-GET-ARG-POSITION");

    public static SubLObject new_pph_parameters(SubLObject param_values) {
        if (param_values == UNPROVIDED) {
            param_values = NIL;
        }
        SubLTrampolineFile.enforceType(param_values, PPH_API_PARAM_LIST_P);
        final SubLObject pph_params = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject remainder;
        SubLObject param;
        SubLObject value;
        for (remainder = NIL, remainder = param_values; NIL != remainder; remainder = cddr(remainder)) {
            param = remainder.first();
            value = cadr(remainder);
            dictionary.dictionary_enter(pph_params, param, value);
        }
        assert NIL != pph_mutable_api_params_p(pph_params) : "nl_generation_api.pph_mutable_api_params_p(pph_params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(pph_params) " + pph_params;
        return pph_params;
    }

    public static SubLObject pph_api_param_p(final SubLObject param_name) {
        return keywordp(pph_parameter_declaration.get_pph_param_type(param_name));
    }

    public static SubLObject pph_api_params_p(final SubLObject v_object) {
        return makeBoolean(v_object.eql($DEFAULT) || (NIL != pph_mutable_api_params_p(v_object)));
    }

    public static SubLObject pph_mutable_api_params_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject pph_api_param_list_p(final SubLObject v_object) {
        SubLObject ans = NIL;
        if (NIL != list_utilities.plist_of_type_p(v_object, PPH_API_PARAM_P)) {
            SubLObject violationP = NIL;
            SubLObject remainder;
            SubLObject param;
            SubLObject value;
            for (remainder = NIL, remainder = v_object; NIL != remainder; remainder = cddr(remainder)) {
                param = remainder.first();
                value = cadr(remainder);
                if (NIL == pph_parameter_declaration.valid_pph_param_value_pair_p(param, value)) {
                    violationP = T;
                }
            }
            if (NIL == violationP) {
                ans = T;
            }
        }
        return ans;
    }

    public static SubLObject with_pph_api_params(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject param_list = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        param_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject timed_outP = $sym6$TIMED_OUT_;
        final SubLObject params = $sym7$PARAMS;
        SubLObject global_bindings = NIL;
        final SubLObject iterator_var = pph_parameter_declaration.new_pph_api_param_iterator();
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject tuple = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject param = tuple.first();
                final SubLObject corresponding_global = pph_parameter_declaration.get_pph_param_corresponding_global(param);
                if (NIL != corresponding_global) {
                    global_bindings = cons(list(corresponding_global, list(GET_PPH_PARAM, params, param)), global_bindings);
                }
            }
        }
        global_bindings = Sort.sort(global_bindings, symbol_function($sym9$TERM__), symbol_function(FIRST));
        return list(CLET, bq_cons(list(params, param_list), append(global_bindings, list(bq_cons(timed_outP, $list12)))), listS(WITH_PPH_TIMEOUT, list(timed_outP, listS(GET_PPH_PARAM, params, $list14)), append(body, NIL)), list(IGNORE, timed_outP));
    }

    public static SubLObject get_pph_param(final SubLObject params, final SubLObject param, SubLObject use_defaultP) {
        if (use_defaultP == UNPROVIDED) {
            use_defaultP = T;
        }
        assert NIL != pph_api_params_p(params) : "nl_generation_api.pph_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_api_params_p(params) " + params;
        final SubLObject unspecified = $UNSPECIFIED;
        final SubLObject value_from_specification = (NIL != dictionary.dictionary_p(params)) ? dictionary.dictionary_lookup_without_values(params, param, unspecified) : unspecified;
        if (!value_from_specification.eql(unspecified)) {
            return value_from_specification;
        }
        if ((NIL != use_defaultP) || params.eql($DEFAULT)) {
            return pph_parameter_declaration.pph_default_for_param(param);
        }
        return $NO_VALUE;
    }

    public static SubLObject lexical_context_p(final SubLObject v_object) {
        return hlmt.hlmt_p(v_object);
    }

    public static SubLObject cycl_term_to_nl_string_internal(final SubLObject cycl_term, final SubLObject pph_params) {
        final SubLObject maps = cycl_term_to_nl_internal(cycl_term, pph_params);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = maps;
        SubLObject map = NIL;
        map = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL), result);
            cdolist_list_var = cdolist_list_var.rest();
            map = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject cycl_term_to_nl_internal(final SubLObject cycl_term, final SubLObject pph_params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nl_preds = get_pph_param(pph_params, $PPH_AGREEMENT, T);
        final SubLObject force = get_pph_param(pph_params, $PPH_SENTENTIAL_FORCE, T);
        final SubLObject language_mt = get_pph_param(pph_params, $PPH_LEXICAL_CONTEXT, T);
        final SubLObject domain_mt = get_pph_param(pph_params, $PPH_SEMANTIC_MT, T);
        final SubLObject max = get_pph_param(pph_params, $PPH_GENERATION_COUNT, T);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            final SubLObject _prev_bind_0_$1 = pph_vars.$determiners_before_variables$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding(thread);
            final SubLObject _prev_bind_6 = pph_vars.$pph_max_no_comma_length$.currentBinding(thread);
            final SubLObject _prev_bind_7 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = pph_vars.$pph_search_limit$.currentBinding(thread);
            final SubLObject _prev_bind_10 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_11 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
            final SubLObject _prev_bind_13 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
            final SubLObject _prev_bind_14 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
            try {
                pph_vars.$determiners_before_variables$.bind(get_pph_param(pph_params, $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_, UNPROVIDED), thread);
                pph_vars.$pph_demerit_cutoff$.bind(get_pph_param(pph_params, $DEMERIT_CUTOFF, UNPROVIDED), thread);
                pph_vars.$pph_domain_mt$.bind(get_pph_param(pph_params, $PPH_SEMANTIC_MT, UNPROVIDED), thread);
                pph_vars.$pph_hide_explicit_universalsP$.bind(get_pph_param(pph_params, $kw31$HIDE_EXPLICIT_UNIVERSALS_, UNPROVIDED), thread);
                pph_vars.$pph_language_mt$.bind(get_pph_param(pph_params, $PPH_LEXICAL_CONTEXT, UNPROVIDED), thread);
                pph_vars.$pph_max_no_comma_length$.bind(get_pph_param(pph_params, $MAX_DIGITS_WITHOUT_COMMA, UNPROVIDED), thread);
                pph_vars.$pph_maximize_linksP$.bind(get_pph_param(pph_params, $kw33$MAXIMIZE_LINKS_, UNPROVIDED), thread);
                pph_vars.$pph_quantify_varsP$.bind(get_pph_param(pph_params, $kw34$QUANTIFY_VARIABLES_, UNPROVIDED), thread);
                pph_vars.$pph_search_limit$.bind(get_pph_param(pph_params, $GENLPREDS_BACKOFF_LIMIT, UNPROVIDED), thread);
                pph_vars.$pph_significant_digits_cutoff$.bind(get_pph_param(pph_params, $SIGNIFICANT_DIGITS_CUTOFF, UNPROVIDED), thread);
                pph_vars.$pph_terse_modeP$.bind(get_pph_param(pph_params, $kw37$PREFER_TERSE_PARAPHRASE_, UNPROVIDED), thread);
                pph_vars.$pph_use_indexical_datesP$.bind(get_pph_param(pph_params, $kw38$USE_INDEXICAL_DATES_, UNPROVIDED), thread);
                pph_vars.$pph_use_smart_variable_replacementP$.bind(get_pph_param(pph_params, $kw39$USE_SMART_VARIABLE_REPLACEMENT_, UNPROVIDED), thread);
                pph_vars.$pph_use_title_capitalizationP$.bind(get_pph_param(pph_params, $kw40$USE_TITLE_CAPITALIZATION_, UNPROVIDED), thread);
                SubLObject timed_outP = NIL;
                final SubLObject _prev_bind_0_$2 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$4 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                try {
                    pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                    pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(get_pph_param(pph_params, $PPH_TIMEOUT, UNPROVIDED)), thread);
                    pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                    pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                    if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                        if (((force == $NONE) || ((force == $DEFAULT) && ($NONE == pph_utilities.pph_default_force_for_term(cycl_term)))) && (NIL != number_utilities.potentially_infinite_integer_G(max, ONE_INTEGER))) {
                            final SubLObject allow_morphological_variantsP = NIL;
                            final SubLObject allow_nested_variantsP = NIL;
                            final SubLObject output_lists = pph_main.generate_pph_output_lists_for_term(cycl_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, UNPROVIDED);
                            SubLObject doneP = makeBoolean(max.isInteger() && (NIL != list_utilities.lengthGE(result, max, UNPROVIDED)));
                            if (NIL == doneP) {
                                SubLObject csome_list_var = output_lists;
                                SubLObject output_list = NIL;
                                output_list = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject javalist = pph_utilities.pph_output_list_to_javalist(output_list);
                                    final SubLObject item_var;
                                    final SubLObject output_map = item_var = pph_utilities.pph_javalist_to_output_map(javalist, cycl_term);
                                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                    doneP = makeBoolean(max.isInteger() && (NIL != list_utilities.lengthGE(result, max, UNPROVIDED)));
                                    csome_list_var = csome_list_var.rest();
                                    output_list = csome_list_var.first();
                                } 
                            }
                        } else {
                            final SubLObject output_list2 = pph_main.generate_pph_output_list(cycl_term, nl_preds, language_mt, domain_mt, $HTML, force);
                            final SubLObject javalist2 = pph_utilities.pph_output_list_to_javalist(output_list2);
                            final SubLObject item_var2;
                            final SubLObject output_map2 = item_var2 = pph_utilities.pph_javalist_to_output_map(javalist2, cycl_term);
                            if (NIL == member(item_var2, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                result = cons(item_var2, result);
                            }
                        }
                    }
                    timed_outP = pph_macros.pph_timeout_time_reachedP();
                } finally {
                    pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_2_$4, thread);
                    pph_macros.$pph_timeout_time$.rebind(_prev_bind_1_$3, thread);
                    pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_14, thread);
                pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_13, thread);
                pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
                pph_vars.$pph_terse_modeP$.rebind(_prev_bind_11, thread);
                pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_10, thread);
                pph_vars.$pph_search_limit$.rebind(_prev_bind_9, thread);
                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_8, thread);
                pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_7, thread);
                pph_vars.$pph_max_no_comma_length$.rebind(_prev_bind_6, thread);
                pph_vars.$pph_language_mt$.rebind(_prev_bind_5, thread);
                pph_vars.$pph_hide_explicit_universalsP$.rebind(_prev_bind_4, thread);
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                pph_vars.$determiners_before_variables$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject cycl_terms_to_nl_strings_internal(final SubLObject cycl_terms, final SubLObject pph_params) {
        final SubLObject maps = cycl_terms_to_nl_internal(cycl_terms, pph_params);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = maps;
        SubLObject map = NIL;
        map = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL), result);
            cdolist_list_var = cdolist_list_var.rest();
            map = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject cycl_terms_to_nl_internal(final SubLObject cycl_term_list, final SubLObject pph_params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nl_preds = get_pph_param(pph_params, $PPH_AGREEMENT, T);
        final SubLObject force = get_pph_param(pph_params, $PPH_SENTENTIAL_FORCE, T);
        final SubLObject language_mt = get_pph_param(pph_params, $PPH_LEXICAL_CONTEXT, T);
        final SubLObject domain_mt = get_pph_param(pph_params, $PPH_SEMANTIC_MT, T);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            final SubLObject _prev_bind_0_$5 = pph_vars.$determiners_before_variables$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding(thread);
            final SubLObject _prev_bind_6 = pph_vars.$pph_max_no_comma_length$.currentBinding(thread);
            final SubLObject _prev_bind_7 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = pph_vars.$pph_search_limit$.currentBinding(thread);
            final SubLObject _prev_bind_10 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_11 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
            final SubLObject _prev_bind_13 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
            final SubLObject _prev_bind_14 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
            try {
                pph_vars.$determiners_before_variables$.bind(get_pph_param(pph_params, $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_, UNPROVIDED), thread);
                pph_vars.$pph_demerit_cutoff$.bind(get_pph_param(pph_params, $DEMERIT_CUTOFF, UNPROVIDED), thread);
                pph_vars.$pph_domain_mt$.bind(get_pph_param(pph_params, $PPH_SEMANTIC_MT, UNPROVIDED), thread);
                pph_vars.$pph_hide_explicit_universalsP$.bind(get_pph_param(pph_params, $kw31$HIDE_EXPLICIT_UNIVERSALS_, UNPROVIDED), thread);
                pph_vars.$pph_language_mt$.bind(get_pph_param(pph_params, $PPH_LEXICAL_CONTEXT, UNPROVIDED), thread);
                pph_vars.$pph_max_no_comma_length$.bind(get_pph_param(pph_params, $MAX_DIGITS_WITHOUT_COMMA, UNPROVIDED), thread);
                pph_vars.$pph_maximize_linksP$.bind(get_pph_param(pph_params, $kw33$MAXIMIZE_LINKS_, UNPROVIDED), thread);
                pph_vars.$pph_quantify_varsP$.bind(get_pph_param(pph_params, $kw34$QUANTIFY_VARIABLES_, UNPROVIDED), thread);
                pph_vars.$pph_search_limit$.bind(get_pph_param(pph_params, $GENLPREDS_BACKOFF_LIMIT, UNPROVIDED), thread);
                pph_vars.$pph_significant_digits_cutoff$.bind(get_pph_param(pph_params, $SIGNIFICANT_DIGITS_CUTOFF, UNPROVIDED), thread);
                pph_vars.$pph_terse_modeP$.bind(get_pph_param(pph_params, $kw37$PREFER_TERSE_PARAPHRASE_, UNPROVIDED), thread);
                pph_vars.$pph_use_indexical_datesP$.bind(get_pph_param(pph_params, $kw38$USE_INDEXICAL_DATES_, UNPROVIDED), thread);
                pph_vars.$pph_use_smart_variable_replacementP$.bind(get_pph_param(pph_params, $kw39$USE_SMART_VARIABLE_REPLACEMENT_, UNPROVIDED), thread);
                pph_vars.$pph_use_title_capitalizationP$.bind(get_pph_param(pph_params, $kw40$USE_TITLE_CAPITALIZATION_, UNPROVIDED), thread);
                SubLObject timed_outP = NIL;
                final SubLObject _prev_bind_0_$6 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$8 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                try {
                    pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                    pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(get_pph_param(pph_params, $PPH_TIMEOUT, UNPROVIDED)), thread);
                    pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                    pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                    if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                        SubLObject javalist = NIL;
                        SubLObject javalist_$9 = NIL;
                        SubLObject cycl_term = NIL;
                        SubLObject cycl_term_$10 = NIL;
                        javalist = pph_main.generate_disambiguation_phrases_for_java(cycl_term_list, force, nl_preds, language_mt, domain_mt, NIL, $PREFERRED);
                        javalist_$9 = javalist.first();
                        cycl_term = cycl_term_list;
                        cycl_term_$10 = cycl_term.first();
                        while ((NIL != cycl_term) || (NIL != javalist)) {
                            result = cons(pph_utilities.pph_javalist_to_output_map(javalist_$9, cycl_term_$10), result);
                            javalist = javalist.rest();
                            javalist_$9 = javalist.first();
                            cycl_term = cycl_term.rest();
                            cycl_term_$10 = cycl_term.first();
                        } 
                    }
                    timed_outP = pph_macros.pph_timeout_time_reachedP();
                } finally {
                    pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_2_$8, thread);
                    pph_macros.$pph_timeout_time$.rebind(_prev_bind_1_$7, thread);
                    pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$6, thread);
                }
            } finally {
                pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_14, thread);
                pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_13, thread);
                pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
                pph_vars.$pph_terse_modeP$.rebind(_prev_bind_11, thread);
                pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_10, thread);
                pph_vars.$pph_search_limit$.rebind(_prev_bind_9, thread);
                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_8, thread);
                pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_7, thread);
                pph_vars.$pph_max_no_comma_length$.rebind(_prev_bind_6, thread);
                pph_vars.$pph_language_mt$.rebind(_prev_bind_5, thread);
                pph_vars.$pph_hide_explicit_universalsP$.rebind(_prev_bind_4, thread);
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                pph_vars.$determiners_before_variables$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject cycl_term_to_search_query_internal(final SubLObject cycl_term, final SubLObject engine, final SubLObject max_words, final SubLObject pph_params) {
        SubLObject result = NIL;
        result = qua_query.qua_query_string_for_cycl_sentence(cycl_term, engine, UNPROVIDED);
        return result;
    }

    public static SubLObject pph_output_map_to_text_internal(final SubLObject map, final SubLObject use_bulleted_listsP, final SubLObject bulleted_list_indent_level, final SubLObject allow_utf8P, final SubLObject use_blanks_for_varsP) {
        if (NIL != pph_utilities.pph_javalist_item_p(map)) {
            return pph_utilities.pph_javalist_item_string(map);
        }
        return pph_utilities.pph_javalist_string_as_utf8(pph_utilities.pph_output_map_javalist(map));
    }

    public static SubLObject pph_output_map_to_html_internal(final SubLObject map, final SubLObject tag_function, final SubLObject use_bulleted_listsP, final SubLObject bulleted_list_indent_level, final SubLObject link_arg0P, final SubLObject use_blanks_for_varsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_link_arg0P$.bind(link_arg0P, thread);
            if (NIL != pph_utilities.pph_javalist_item_p(map)) {
                result = pph_utilities.pph_javalist_item_html_string(map);
            } else {
                result = pph_utilities.pph_javalist_html_string(pph_utilities.pph_output_map_javalist(map), UNPROVIDED);
            }
        } finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject pph_output_maps_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(PPH_OUTPUT_MAP_P, v_object);
    }

    public static SubLObject pph_output_map_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(pattern_match.tree_matches_pattern(v_object, $list57));
    }

    public static SubLObject pph_output_map_get_items(final SubLObject map) {
        SubLTrampolineFile.enforceType(map, PPH_OUTPUT_MAP_P);
        if (NIL != pph_utilities.pph_javalist_item_p(map)) {
            return NIL;
        }
        return pph_utilities.pph_javalist_items(pph_utilities.pph_output_map_javalist(map));
    }

    public static SubLObject pph_output_map_get_string(final SubLObject map) {
        SubLTrampolineFile.enforceType(map, PPH_OUTPUT_MAP_P);
        if (NIL != pph_utilities.pph_javalist_item_p(map)) {
            return pph_utilities.pph_javalist_item_string(map);
        }
        return pph_utilities.pph_javalist_string(pph_utilities.pph_output_map_javalist(map));
    }

    public static SubLObject pph_output_map_get_cycl(final SubLObject map) {
        SubLTrampolineFile.enforceType(map, PPH_OUTPUT_MAP_P);
        if (NIL != pph_utilities.pph_javalist_item_p(map)) {
            return pph_utilities.pph_javalist_item_cycl(map);
        }
        return map.first();
    }

    public static SubLObject pph_output_map_get_string_offset(final SubLObject map) {
        SubLTrampolineFile.enforceType(map, PPH_OUTPUT_MAP_P);
        if (NIL != pph_utilities.pph_javalist_item_p(map)) {
            return pph_utilities.pph_javalist_item_start_char(map);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject pph_output_map_get_arg_position(final SubLObject map) {
        SubLTrampolineFile.enforceType(map, PPH_OUTPUT_MAP_P);
        if (NIL != pph_utilities.pph_javalist_item_p(map)) {
            return pph_utilities.pph_javalist_item_arg_position(map);
        }
        return pph_utilities.pph_top_level_arg_position(pph_utilities.pph_identity_map());
    }

    public static SubLObject declare_nl_generation_api_file() {
        declareFunction(me, "new_pph_parameters", "NEW-PPH-PARAMETERS", 0, 1, false);
        declareFunction(me, "pph_api_param_p", "PPH-API-PARAM-P", 1, 0, false);
        declareFunction(me, "pph_api_params_p", "PPH-API-PARAMS-P", 1, 0, false);
        declareFunction(me, "pph_mutable_api_params_p", "PPH-MUTABLE-API-PARAMS-P", 1, 0, false);
        declareFunction(me, "pph_api_param_list_p", "PPH-API-PARAM-LIST-P", 1, 0, false);
        declareMacro(me, "with_pph_api_params", "WITH-PPH-API-PARAMS");
        declareFunction(me, "get_pph_param", "GET-PPH-PARAM", 2, 1, false);
        declareFunction(me, "lexical_context_p", "LEXICAL-CONTEXT-P", 1, 0, false);
        declareFunction(me, "cycl_term_to_nl_string_internal", "CYCL-TERM-TO-NL-STRING-INTERNAL", 2, 0, false);
        declareFunction(me, "cycl_term_to_nl_internal", "CYCL-TERM-TO-NL-INTERNAL", 2, 0, false);
        declareFunction(me, "cycl_terms_to_nl_strings_internal", "CYCL-TERMS-TO-NL-STRINGS-INTERNAL", 2, 0, false);
        declareFunction(me, "cycl_terms_to_nl_internal", "CYCL-TERMS-TO-NL-INTERNAL", 2, 0, false);
        declareFunction(me, "cycl_term_to_search_query_internal", "CYCL-TERM-TO-SEARCH-QUERY-INTERNAL", 4, 0, false);
        declareFunction(me, "pph_output_map_to_text_internal", "PPH-OUTPUT-MAP-TO-TEXT-INTERNAL", 5, 0, false);
        declareFunction(me, "pph_output_map_to_html_internal", "PPH-OUTPUT-MAP-TO-HTML-INTERNAL", 6, 0, false);
        declareFunction(me, "pph_output_maps_p", "PPH-OUTPUT-MAPS-P", 1, 0, false);
        declareFunction(me, "pph_output_map_p", "PPH-OUTPUT-MAP-P", 1, 0, false);
        declareFunction(me, "pph_output_map_get_items", "PPH-OUTPUT-MAP-GET-ITEMS", 1, 0, false);
        declareFunction(me, "pph_output_map_get_string", "PPH-OUTPUT-MAP-GET-STRING", 1, 0, false);
        declareFunction(me, "pph_output_map_get_cycl", "PPH-OUTPUT-MAP-GET-CYCL", 1, 0, false);
        declareFunction(me, "pph_output_map_get_string_offset", "PPH-OUTPUT-MAP-GET-STRING-OFFSET", 1, 0, false);
        declareFunction(me, "pph_output_map_get_arg_position", "PPH-OUTPUT-MAP-GET-ARG-POSITION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nl_generation_api_file() {
        return NIL;
    }

    public static SubLObject setup_nl_generation_api_file() {
        register_external_symbol(NEW_PPH_PARAMETERS);
        register_external_symbol(LEXICAL_CONTEXT_P);
        register_macro_helper(CYCL_TERM_TO_NL_STRING_INTERNAL, CYCL_TERM_TO_NL_STRING);
        register_macro_helper(CYCL_TERM_TO_NL_INTERNAL, CYCL_TERM_TO_NL);
        register_macro_helper(CYCL_TERMS_TO_NL_STRINGS_INTERNAL, CYCL_TERMS_TO_NL_STRINGS);
        register_macro_helper(CYCL_TERMS_TO_NL_INTERNAL, CYCL_TERMS_TO_NL);
        register_macro_helper(CYCL_TERM_TO_SEARCH_QUERY_INTERNAL, CYCL_TERM_TO_SEARCH_QUERY);
        register_macro_helper(PPH_OUTPUT_MAP_TO_TEXT_INTERNAL, PPH_OUTPUT_MAP_TO_TEXT);
        register_macro_helper(PPH_OUTPUT_MAP_TO_HTML_INTERNAL, PPH_OUTPUT_MAP_TO_HTML);
        register_external_symbol(PPH_OUTPUT_MAPS_P);
        register_external_symbol(PPH_OUTPUT_MAP_P);
        register_external_symbol(PPH_OUTPUT_MAP_GET_ITEMS);
        register_external_symbol(PPH_OUTPUT_MAP_GET_STRING);
        register_external_symbol(PPH_OUTPUT_MAP_GET_CYCL);
        register_external_symbol(PPH_OUTPUT_MAP_GET_STRING_OFFSET);
        register_external_symbol(PPH_OUTPUT_MAP_GET_ARG_POSITION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_generation_api_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_generation_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_generation_api_file();
    }

    
}

/**
 * Total time: 145 ms
 */
