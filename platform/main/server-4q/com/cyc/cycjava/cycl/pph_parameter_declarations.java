/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-PARAMETER-DECLARATIONS
 * source file: /cyc/top/cycl/pph-parameter-declarations.lisp
 * created:     2019/07/03 17:37:51
 */
public final class pph_parameter_declarations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new pph_parameter_declarations();

 public static final String myName = "com.cyc.cycjava.cycl.pph_parameter_declarations";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SET_PPH_LEXICAL_CONTEXT_INTERNAL = makeSymbol("SET-PPH-LEXICAL-CONTEXT-INTERNAL");

    private static final SubLSymbol SET_PPH_LEXICAL_CONTEXT = makeSymbol("SET-PPH-LEXICAL-CONTEXT");

    private static final SubLSymbol LEXICAL_CONTEXT_P = makeSymbol("LEXICAL-CONTEXT-P");

    private static final SubLSymbol PPH_MUTABLE_API_PARAMS_P = makeSymbol("PPH-MUTABLE-API-PARAMS-P");

    private static final SubLSymbol $PPH_LEXICAL_CONTEXT = makeKeyword("PPH-LEXICAL-CONTEXT");

    static private final SubLList $list5 = list(makeSymbol("PARAMS-FORM"), makeSymbol("VALUE"));

    static private final SubLSymbol $sym6$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list7 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-LANGUAGE-MT*"), makeKeyword("CHECK-TYPE"), makeSymbol("LEXICAL-CONTEXT-P"), makeKeyword("DOCUMENTATION"), makeString("The context from which to look up lexical information and paraphrase templates."));

    private static final SubLSymbol SET_PPH_SEMANTIC_MT_INTERNAL = makeSymbol("SET-PPH-SEMANTIC-MT-INTERNAL");

    private static final SubLSymbol SET_PPH_SEMANTIC_MT = makeSymbol("SET-PPH-SEMANTIC-MT");

    private static final SubLSymbol $PPH_SEMANTIC_MT = makeKeyword("PPH-SEMANTIC-MT");

    static private final SubLSymbol $sym13$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list14 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-DOMAIN-MT*"), makeKeyword("CHECK-TYPE"), makeSymbol("HLMT-P"), makeKeyword("DOCUMENTATION"), makeString("The context from which to look up information about the domain of discourse."));

    private static final SubLSymbol SET_PPH_BACKGROUND_DISCOURSE_INTERNAL = makeSymbol("SET-PPH-BACKGROUND-DISCOURSE-INTERNAL");

    private static final SubLSymbol SET_PPH_BACKGROUND_DISCOURSE = makeSymbol("SET-PPH-BACKGROUND-DISCOURSE");

    private static final SubLSymbol $PPH_BACKGROUND_DISCOURSE = makeKeyword("PPH-BACKGROUND-DISCOURSE");

    static private final SubLSymbol $sym19$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list20 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("TRUE"), makeKeyword("DOCUMENTATION"), makeString("The background discourse for paraphrasing."), makeKeyword("DEFAULT-VALUE-FORM"), NIL);

    private static final SubLSymbol SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL = makeSymbol("SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE-INTERNAL");

    private static final SubLSymbol SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE = makeSymbol("SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");

    private static final SubLSymbol $PPH_DISCOURSE_CONTEXTS_TO_UPDATE = makeKeyword("PPH-DISCOURSE-CONTEXTS-TO-UPDATE");

    static private final SubLSymbol $sym24$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list25 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("TRUE"), makeKeyword("DOCUMENTATION"), makeString("Discourse contexts that should be updated with information from this paraphrase."), makeKeyword("DEFAULT-VALUE-FORM"), NIL);

    private static final SubLSymbol SET_PPH_GENERATION_COUNT_INTERNAL = makeSymbol("SET-PPH-GENERATION-COUNT-INTERNAL");

    private static final SubLSymbol SET_PPH_GENERATION_COUNT = makeSymbol("SET-PPH-GENERATION-COUNT");

    private static final SubLSymbol POSITIVE_POTENTIALLY_INFINITE_INTEGER_P = makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P");

    private static final SubLSymbol $PPH_GENERATION_COUNT = makeKeyword("PPH-GENERATION-COUNT");

    static private final SubLSymbol $sym30$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list31 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("The maximum number of paraphrases to generate."), makeKeyword("DEFAULT-VALUE-FORM"), ONE_INTEGER);

    private static final SubLSymbol SET_PPH_AGREEMENT_INTERNAL = makeSymbol("SET-PPH-AGREEMENT-INTERNAL");

    private static final SubLSymbol SET_PPH_AGREEMENT = makeSymbol("SET-PPH-AGREEMENT");

    static private final SubLSymbol $sym34$VALID_EXTERNAL_PPH_NL_PREDS_ = makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?");

    static private final SubLSymbol $sym36$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list37 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?"), makeKeyword("DOCUMENTATION"), makeString("Which agreement predicates are preferred for the head of this phrase? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), makeKeyword("DEFAULT-VALUE-FORM"), makeKeyword("DEFAULT"));

    private static final SubLSymbol SET_PPH_SENTENTIAL_FORCE_INTERNAL = makeSymbol("SET-PPH-SENTENTIAL-FORCE-INTERNAL");

    private static final SubLSymbol SET_PPH_SENTENTIAL_FORCE = makeSymbol("SET-PPH-SENTENTIAL-FORCE");

    private static final SubLSymbol PPH_FORCE_P = makeSymbol("PPH-FORCE-P");

    private static final SubLSymbol $PPH_SENTENTIAL_FORCE = makeKeyword("PPH-SENTENTIAL-FORCE");

    static private final SubLSymbol $sym42$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list43 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("PPH-FORCE-P"), makeKeyword("DOCUMENTATION"), makeString("What sentential force should be used for paraphrases? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), makeKeyword("DEFAULT-VALUE-FORM"), makeKeyword("DEFAULT"));

    private static final SubLSymbol SET_PPH_TIMEOUT_INTERNAL = makeSymbol("SET-PPH-TIMEOUT-INTERNAL");

    private static final SubLSymbol SET_PPH_TIMEOUT = makeSymbol("SET-PPH-TIMEOUT");

    static private final SubLSymbol $sym47$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list48 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("After how many seconds should we give up? Granularity is the internal time unit of the image, typically millisecond or microsecond."), makeKeyword("DEFAULT-VALUE-FORM"), list(makeSymbol("POSITIVE-INFINITY")));

    private static final SubLSymbol TOP_LEVEL_PPH_API_PARAM_P = makeSymbol("TOP-LEVEL-PPH-API-PARAM-P");

    private static final SubLSymbol SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL = makeSymbol("SET-MAX-DIGITS-WITHOUT-COMMA-INTERNAL");

    private static final SubLSymbol SET_MAX_DIGITS_WITHOUT_COMMA = makeSymbol("SET-MAX-DIGITS-WITHOUT-COMMA");

    private static final SubLSymbol $MAX_DIGITS_WITHOUT_COMMA = makeKeyword("MAX-DIGITS-WITHOUT-COMMA");

    static private final SubLSymbol $sym54$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list55 = list($TYPE, makeKeyword("PPH-FORMAT"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("max number of digits a number can have and still generate with no commas."), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-MAX-NO-COMMA-LENGTH*"));

    private static final SubLSymbol SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL = makeSymbol("SET-SIGNIFICANT-DIGITS-CUTOFF-INTERNAL");

    private static final SubLSymbol SET_SIGNIFICANT_DIGITS_CUTOFF = makeSymbol("SET-SIGNIFICANT-DIGITS-CUTOFF");

    private static final SubLSymbol $SIGNIFICANT_DIGITS_CUTOFF = makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");

    static private final SubLSymbol $sym59$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list60 = list($TYPE, makeKeyword("PPH-FORMAT"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("To how many significant digits should we truncate the display of numbers?"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*"));

    static private final SubLSymbol $sym61$SET_USE_INDEXICAL_DATES__INTERNAL = makeSymbol("SET-USE-INDEXICAL-DATES?-INTERNAL");

    static private final SubLSymbol $sym62$SET_USE_INDEXICAL_DATES_ = makeSymbol("SET-USE-INDEXICAL-DATES?");

    private static final SubLSymbol $kw64$USE_INDEXICAL_DATES_ = makeKeyword("USE-INDEXICAL-DATES?");

    static private final SubLSymbol $sym65$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list66 = list($TYPE, makeKeyword("PPH-FORMAT"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we use 'yesterday', etc. for dates that we can identify?"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"));

    private static final SubLSymbol PPH_FORMAT_PARAM_P = makeSymbol("PPH-FORMAT-PARAM-P");

    private static final SubLSymbol SET_DEMERIT_CUTOFF_INTERNAL = makeSymbol("SET-DEMERIT-CUTOFF-INTERNAL");

    private static final SubLSymbol SET_DEMERIT_CUTOFF = makeSymbol("SET-DEMERIT-CUTOFF");

    private static final SubLSymbol NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P");

    static private final SubLSymbol $sym73$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list74 = list(new SubLObject[]{ $TYPE, makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-DEMERIT-CUTOFF*"), makeKeyword("CHECK-TYPE"), makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P"), makeKeyword("DOCUMENTATION"), makeString("What is the worst paraphase quality we should tolerate before returning NIL instead of a string.\nDefault is to consider any string better than nothing.\nSee @xref *PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value."), makeKeyword("DEFAULT-VALUE-FORM"), makeSymbol("*PPH-DEMERIT-CUTOFF*") });

    static private final SubLSymbol $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL = makeSymbol("SET-USE-SMART-VARIABLE-REPLACEMENT?-INTERNAL");

    static private final SubLSymbol $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_ = makeSymbol("SET-USE-SMART-VARIABLE-REPLACEMENT?");

    private static final SubLSymbol $kw77$USE_SMART_VARIABLE_REPLACEMENT_ = makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");

    static private final SubLSymbol $sym78$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list79 = list($TYPE, makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should the paraphrase code 'intelligently' use NL phrases for variables that look like they need it?"));

    private static final SubLSymbol SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL = makeSymbol("SET-GENLPREDS-BACKOFF-LIMIT-INTERNAL");

    private static final SubLSymbol SET_GENLPREDS_BACKOFF_LIMIT = makeSymbol("SET-GENLPREDS-BACKOFF-LIMIT");

    private static final SubLSymbol $GENLPREDS_BACKOFF_LIMIT = makeKeyword("GENLPREDS-BACKOFF-LIMIT");

    static private final SubLSymbol $sym84$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list85 = list($TYPE, makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-SEARCH-LIMIT*"), makeKeyword("CHECK-TYPE"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("When traversing the genl-preds hierarchy looking for alternative preds with which to paraphrase the input, stop looking after you've looked this many times -- then meaning starts getting lost."));

    private static final SubLSymbol PPH_GOODNESS_PARAM_P = makeSymbol("PPH-GOODNESS-PARAM-P");

    static private final SubLSymbol $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL = makeSymbol("SET-PREFER-TERSE-PARAPHRASE?-INTERNAL");

    static private final SubLSymbol $sym89$SET_PREFER_TERSE_PARAPHRASE_ = makeSymbol("SET-PREFER-TERSE-PARAPHRASE?");

    private static final SubLSymbol $kw90$PREFER_TERSE_PARAPHRASE_ = makeKeyword("PREFER-TERSE-PARAPHRASE?");

    static private final SubLSymbol $sym91$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list92 = list($TYPE, makeKeyword("PPH-PRECISION"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-TERSE-MODE?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we prefer terse paraphrases?"));

    static private final SubLSymbol $sym93$SET_MAXIMIZE_LINKS__INTERNAL = makeSymbol("SET-MAXIMIZE-LINKS?-INTERNAL");

    static private final SubLSymbol $sym94$SET_MAXIMIZE_LINKS_ = makeSymbol("SET-MAXIMIZE-LINKS?");

    private static final SubLSymbol $kw95$MAXIMIZE_LINKS_ = makeKeyword("MAXIMIZE-LINKS?");

    static private final SubLSymbol $sym96$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list97 = list($TYPE, makeKeyword("PPH-PRECISION"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we link as much of the input CycL to output strings as we can? The tradeoff for this is typically terseness and readability."));

    private static final SubLSymbol PPH_PRECISION_PARAM_P = makeSymbol("PPH-PRECISION-PARAM-P");

    private static final SubLSymbol PPH_FORMALITY_PARAM_P = makeSymbol("PPH-FORMALITY-PARAM-P");

    static private final SubLSymbol $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL = makeSymbol("SET-USE-TITLE-CAPITALIZATION?-INTERNAL");

    static private final SubLSymbol $sym103$SET_USE_TITLE_CAPITALIZATION_ = makeSymbol("SET-USE-TITLE-CAPITALIZATION?");

    private static final SubLSymbol $kw104$USE_TITLE_CAPITALIZATION_ = makeKeyword("USE-TITLE-CAPITALIZATION?");

    static private final SubLSymbol $sym105$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list106 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we capitalize the output like a book, etc., title?"));

    static private final SubLSymbol $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL = makeSymbol("SET-ADD-DETERMINERS-BEFORE-VARIABLES?-INTERNAL");

    static private final SubLSymbol $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_ = makeSymbol("SET-ADD-DETERMINERS-BEFORE-VARIABLES?");

    private static final SubLSymbol $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_ = makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");

    static private final SubLSymbol $sym110$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list111 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Shall we try to put the correct determiner before variables, too?"));

    static private final SubLSymbol $sym112$SET_QUANTIFY_VARIABLES__INTERNAL = makeSymbol("SET-QUANTIFY-VARIABLES?-INTERNAL");

    static private final SubLSymbol $sym113$SET_QUANTIFY_VARIABLES_ = makeSymbol("SET-QUANTIFY-VARIABLES?");

    private static final SubLSymbol $kw114$QUANTIFY_VARIABLES_ = makeKeyword("QUANTIFY-VARIABLES?");

    static private final SubLSymbol $sym115$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list116 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should the paraphrase code 'intelligently' add quantification for variables that look like they need it?"));

    static private final SubLSymbol $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL = makeSymbol("SET-HIDE-EXPLICIT-UNIVERSALS?-INTERNAL");

    static private final SubLSymbol $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_ = makeSymbol("SET-HIDE-EXPLICIT-UNIVERSALS?");

    private static final SubLSymbol $kw119$HIDE_EXPLICIT_UNIVERSALS_ = makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");

    static private final SubLSymbol $sym120$PARAMS = makeUninternedSymbol("PARAMS");

    static private final SubLList $list121 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-HIDE-EXPLICIT-UNIVERSALS?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we skip the 'For every X, Y, and Z'?"));

    private static final SubLSymbol PPH_MISC_PARAM_P = makeSymbol("PPH-MISC-PARAM-P");

    // Definitions
    /**
     * Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.")
    public static final SubLObject set_pph_lexical_context_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, LEXICAL_CONTEXT_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_LEXICAL_CONTEXT, value);
        return params;
    }

    // Definitions
    /**
     * Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.")
    public static SubLObject set_pph_lexical_context_internal(final SubLObject params, final SubLObject value) {
        assert NIL != nl_generation_api.lexical_context_p(value) : "! nl_generation_api.lexical_context_p(value) " + ("nl_generation_api.lexical_context_p(value) " + "CommonSymbols.NIL != nl_generation_api.lexical_context_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_LEXICAL_CONTEXT, value);
        return params;
    }

    /**
     * Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.")
    public static final SubLObject set_pph_lexical_context_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym6$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_LEXICAL_CONTEXT_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-LEXICAL-CONTEXT in PARAMS to VALUE.")
    public static SubLObject set_pph_lexical_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym6$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_LEXICAL_CONTEXT_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.")
    public static final SubLObject set_pph_semantic_mt_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, HLMT_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_SEMANTIC_MT, value);
        return params;
    }

    /**
     * Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.")
    public static SubLObject set_pph_semantic_mt_internal(final SubLObject params, final SubLObject value) {
        assert NIL != hlmt.hlmt_p(value) : "! hlmt.hlmt_p(value) " + ("hlmt.hlmt_p(value) " + "CommonSymbols.NIL != hlmt.hlmt_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_SEMANTIC_MT, value);
        return params;
    }

    /**
     * Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.")
    public static final SubLObject set_pph_semantic_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym13$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_SEMANTIC_MT_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SEMANTIC-MT in PARAMS to VALUE.")
    public static SubLObject set_pph_semantic_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym13$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_SEMANTIC_MT_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.")
    public static final SubLObject set_pph_background_discourse_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, TRUE);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_BACKGROUND_DISCOURSE, value);
        return params;
    }

    /**
     * Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.")
    public static SubLObject set_pph_background_discourse_internal(final SubLObject params, final SubLObject value) {
        assert NIL != sublisp_true(value) : "! sublisp_true(value) " + ("Types.sublisp_true(value) " + "CommonSymbols.NIL != Types.sublisp_true(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_BACKGROUND_DISCOURSE, value);
        return params;
    }

    /**
     * Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.")
    public static final SubLObject set_pph_background_discourse_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym19$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_BACKGROUND_DISCOURSE_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-BACKGROUND-DISCOURSE in PARAMS to VALUE.")
    public static SubLObject set_pph_background_discourse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym19$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_BACKGROUND_DISCOURSE_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.")
    public static final SubLObject set_pph_discourse_contexts_to_update_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, TRUE);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_DISCOURSE_CONTEXTS_TO_UPDATE, value);
        return params;
    }

    /**
     * Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.")
    public static SubLObject set_pph_discourse_contexts_to_update_internal(final SubLObject params, final SubLObject value) {
        assert NIL != sublisp_true(value) : "! sublisp_true(value) " + ("Types.sublisp_true(value) " + "CommonSymbols.NIL != Types.sublisp_true(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_DISCOURSE_CONTEXTS_TO_UPDATE, value);
        return params;
    }

    /**
     * Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.")
    public static final SubLObject set_pph_discourse_contexts_to_update_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym24$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-DISCOURSE-CONTEXTS-TO-UPDATE in PARAMS to VALUE.")
    public static SubLObject set_pph_discourse_contexts_to_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym24$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.")
    public static final SubLObject set_pph_generation_count_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, POSITIVE_POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_GENERATION_COUNT, value);
        return params;
    }

    /**
     * Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.")
    public static SubLObject set_pph_generation_count_internal(final SubLObject params, final SubLObject value) {
        assert NIL != number_utilities.positive_potentially_infinite_integer_p(value) : "! number_utilities.positive_potentially_infinite_integer_p(value) " + ("number_utilities.positive_potentially_infinite_integer_p(value) " + "CommonSymbols.NIL != number_utilities.positive_potentially_infinite_integer_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_GENERATION_COUNT, value);
        return params;
    }

    /**
     * Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.")
    public static final SubLObject set_pph_generation_count_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym30$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_GENERATION_COUNT_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-GENERATION-COUNT in PARAMS to VALUE.")
    public static SubLObject set_pph_generation_count(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym30$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_GENERATION_COUNT_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-AGREEMENT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-AGREEMENT in PARAMS to VALUE.")
    public static final SubLObject set_pph_agreement_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, $sym34$VALID_EXTERNAL_PPH_NL_PREDS_);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_AGREEMENT, value);
        return params;
    }

    /**
     * Set value of :PPH-AGREEMENT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-AGREEMENT in PARAMS to VALUE.")
    public static SubLObject set_pph_agreement_internal(final SubLObject params, final SubLObject value) {
        assert NIL != pph_utilities.valid_external_pph_nl_predsP(value) : "! pph_utilities.valid_external_pph_nl_predsP(value) " + ("pph_utilities.valid_external_pph_nl_predsP(value) " + "CommonSymbols.NIL != pph_utilities.valid_external_pph_nl_predsP(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_AGREEMENT, value);
        return params;
    }

    /**
     * Set value of :PPH-AGREEMENT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-AGREEMENT in PARAMS to VALUE.")
    public static final SubLObject set_pph_agreement_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym36$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_AGREEMENT_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-AGREEMENT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-AGREEMENT in PARAMS to VALUE.")
    public static SubLObject set_pph_agreement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym36$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_AGREEMENT_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.")
    public static final SubLObject set_pph_sentential_force_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, PPH_FORCE_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_SENTENTIAL_FORCE, value);
        return params;
    }

    /**
     * Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.")
    public static SubLObject set_pph_sentential_force_internal(final SubLObject params, final SubLObject value) {
        assert NIL != pph_speech_act.pph_force_p(value) : "! pph_speech_act.pph_force_p(value) " + ("pph_speech_act.pph_force_p(value) " + "CommonSymbols.NIL != pph_speech_act.pph_force_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_SENTENTIAL_FORCE, value);
        return params;
    }

    /**
     * Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.")
    public static final SubLObject set_pph_sentential_force_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym42$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_SENTENTIAL_FORCE_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-SENTENTIAL-FORCE in PARAMS to VALUE.")
    public static SubLObject set_pph_sentential_force(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym42$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_SENTENTIAL_FORCE_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :PPH-TIMEOUT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-TIMEOUT in PARAMS to VALUE.")
    public static final SubLObject set_pph_timeout_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, POSITIVE_POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_TIMEOUT, value);
        return params;
    }

    /**
     * Set value of :PPH-TIMEOUT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-TIMEOUT in PARAMS to VALUE.")
    public static SubLObject set_pph_timeout_internal(final SubLObject params, final SubLObject value) {
        assert NIL != number_utilities.positive_potentially_infinite_integer_p(value) : "! number_utilities.positive_potentially_infinite_integer_p(value) " + ("number_utilities.positive_potentially_infinite_integer_p(value) " + "CommonSymbols.NIL != number_utilities.positive_potentially_infinite_integer_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $PPH_TIMEOUT, value);
        return params;
    }

    /**
     * Set value of :PPH-TIMEOUT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-TIMEOUT in PARAMS to VALUE.")
    public static final SubLObject set_pph_timeout_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym47$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_TIMEOUT_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PPH-TIMEOUT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PPH-TIMEOUT in PARAMS to VALUE.")
    public static SubLObject set_pph_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym47$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_PPH_TIMEOUT_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject top_level_pph_api_param_p_alt(SubLObject param_name) {
        return eq($TOP_LEVEL, pph_parameter_declaration.get_pph_param_type(param_name));
    }

    public static SubLObject top_level_pph_api_param_p(final SubLObject param_name) {
        return eq($TOP_LEVEL, pph_parameter_declaration.get_pph_param_type(param_name));
    }

    public static final SubLObject top_level_pph_api_param_list_p_alt(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, TOP_LEVEL_PPH_API_PARAM_P);
    }

    public static SubLObject top_level_pph_api_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, TOP_LEVEL_PPH_API_PARAM_P);
    }

    /**
     * Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.")
    public static final SubLObject set_max_digits_without_comma_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, POSITIVE_POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $MAX_DIGITS_WITHOUT_COMMA, value);
        return params;
    }

    /**
     * Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.")
    public static SubLObject set_max_digits_without_comma_internal(final SubLObject params, final SubLObject value) {
        assert NIL != number_utilities.positive_potentially_infinite_integer_p(value) : "! number_utilities.positive_potentially_infinite_integer_p(value) " + ("number_utilities.positive_potentially_infinite_integer_p(value) " + "CommonSymbols.NIL != number_utilities.positive_potentially_infinite_integer_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $MAX_DIGITS_WITHOUT_COMMA, value);
        return params;
    }

    /**
     * Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.")
    public static final SubLObject set_max_digits_without_comma_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym54$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAX-DIGITS-WITHOUT-COMMA in PARAMS to VALUE.")
    public static SubLObject set_max_digits_without_comma(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym54$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.")
    public static final SubLObject set_significant_digits_cutoff_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, POSITIVE_POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $SIGNIFICANT_DIGITS_CUTOFF, value);
        return params;
    }

    /**
     * Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.")
    public static SubLObject set_significant_digits_cutoff_internal(final SubLObject params, final SubLObject value) {
        assert NIL != number_utilities.positive_potentially_infinite_integer_p(value) : "! number_utilities.positive_potentially_infinite_integer_p(value) " + ("number_utilities.positive_potentially_infinite_integer_p(value) " + "CommonSymbols.NIL != number_utilities.positive_potentially_infinite_integer_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $SIGNIFICANT_DIGITS_CUTOFF, value);
        return params;
    }

    /**
     * Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.")
    public static final SubLObject set_significant_digits_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym59$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :SIGNIFICANT-DIGITS-CUTOFF in PARAMS to VALUE.")
    public static SubLObject set_significant_digits_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym59$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.")
    public static final SubLObject set_use_indexical_datesP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw64$USE_INDEXICAL_DATES_, value);
        return params;
    }

    /**
     * Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.")
    public static SubLObject set_use_indexical_datesP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw64$USE_INDEXICAL_DATES_, value);
        return params;
    }

    /**
     * Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.")
    public static final SubLObject set_use_indexical_datesP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym65$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym61$SET_USE_INDEXICAL_DATES__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-INDEXICAL-DATES? in PARAMS to VALUE.")
    public static SubLObject set_use_indexical_datesP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym65$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym61$SET_USE_INDEXICAL_DATES__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject pph_format_param_p_alt(SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_FORMAT);
    }

    public static SubLObject pph_format_param_p(final SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_FORMAT);
    }

    public static final SubLObject pph_format_param_list_p_alt(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_FORMAT_PARAM_P);
    }

    public static SubLObject pph_format_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_FORMAT_PARAM_P);
    }

    /**
     * Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.")
    public static final SubLObject set_demerit_cutoff_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $DEMERIT_CUTOFF, value);
        return params;
    }

    /**
     * Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.")
    public static SubLObject set_demerit_cutoff_internal(final SubLObject params, final SubLObject value) {
        assert NIL != number_utilities.non_negative_potentially_infinite_number_p(value) : "! number_utilities.non_negative_potentially_infinite_number_p(value) " + ("number_utilities.non_negative_potentially_infinite_number_p(value) " + "CommonSymbols.NIL != number_utilities.non_negative_potentially_infinite_number_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $DEMERIT_CUTOFF, value);
        return params;
    }

    /**
     * Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.")
    public static final SubLObject set_demerit_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym73$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_DEMERIT_CUTOFF_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :DEMERIT-CUTOFF in PARAMS to VALUE.")
    public static SubLObject set_demerit_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym73$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_DEMERIT_CUTOFF_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.")
    public static final SubLObject set_use_smart_variable_replacementP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw77$USE_SMART_VARIABLE_REPLACEMENT_, value);
        return params;
    }

    /**
     * Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.")
    public static SubLObject set_use_smart_variable_replacementP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw77$USE_SMART_VARIABLE_REPLACEMENT_, value);
        return params;
    }

    /**
     * Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.")
    public static final SubLObject set_use_smart_variable_replacementP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym78$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-SMART-VARIABLE-REPLACEMENT? in PARAMS to VALUE.")
    public static SubLObject set_use_smart_variable_replacementP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym78$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.")
    public static final SubLObject set_genlpreds_backoff_limit_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $GENLPREDS_BACKOFF_LIMIT, value);
        return params;
    }

    /**
     * Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.")
    public static SubLObject set_genlpreds_backoff_limit_internal(final SubLObject params, final SubLObject value) {
        assert NIL != subl_promotions.non_negative_integer_p(value) : "! subl_promotions.non_negative_integer_p(value) " + ("subl_promotions.non_negative_integer_p(value) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $GENLPREDS_BACKOFF_LIMIT, value);
        return params;
    }

    /**
     * Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.")
    public static final SubLObject set_genlpreds_backoff_limit_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym84$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :GENLPREDS-BACKOFF-LIMIT in PARAMS to VALUE.")
    public static SubLObject set_genlpreds_backoff_limit(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym84$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject pph_goodness_param_p_alt(SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_GOODNESS);
    }

    public static SubLObject pph_goodness_param_p(final SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_GOODNESS);
    }

    public static final SubLObject pph_goodness_param_list_p_alt(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_GOODNESS_PARAM_P);
    }

    public static SubLObject pph_goodness_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_GOODNESS_PARAM_P);
    }

    /**
     * Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.")
    public static final SubLObject set_prefer_terse_paraphraseP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw90$PREFER_TERSE_PARAPHRASE_, value);
        return params;
    }

    /**
     * Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.")
    public static SubLObject set_prefer_terse_paraphraseP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw90$PREFER_TERSE_PARAPHRASE_, value);
        return params;
    }

    /**
     * Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.")
    public static final SubLObject set_prefer_terse_paraphraseP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym91$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :PREFER-TERSE-PARAPHRASE? in PARAMS to VALUE.")
    public static SubLObject set_prefer_terse_paraphraseP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym91$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.")
    public static final SubLObject set_maximize_linksP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw95$MAXIMIZE_LINKS_, value);
        return params;
    }

    /**
     * Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.")
    public static SubLObject set_maximize_linksP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw95$MAXIMIZE_LINKS_, value);
        return params;
    }

    /**
     * Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.")
    public static final SubLObject set_maximize_linksP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym96$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym93$SET_MAXIMIZE_LINKS__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :MAXIMIZE-LINKS? in PARAMS to VALUE.")
    public static SubLObject set_maximize_linksP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym96$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym93$SET_MAXIMIZE_LINKS__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject pph_precision_param_p_alt(SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_PRECISION);
    }

    public static SubLObject pph_precision_param_p(final SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_PRECISION);
    }

    public static final SubLObject pph_precision_param_list_p_alt(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_PRECISION_PARAM_P);
    }

    public static SubLObject pph_precision_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_PRECISION_PARAM_P);
    }

    public static final SubLObject pph_formality_param_p_alt(SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_FORMALITY);
    }

    public static SubLObject pph_formality_param_p(final SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_FORMALITY);
    }

    public static final SubLObject pph_formality_param_list_p_alt(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_FORMALITY_PARAM_P);
    }

    public static SubLObject pph_formality_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_FORMALITY_PARAM_P);
    }

    /**
     * Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.")
    public static final SubLObject set_use_title_capitalizationP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw104$USE_TITLE_CAPITALIZATION_, value);
        return params;
    }

    /**
     * Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.")
    public static SubLObject set_use_title_capitalizationP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw104$USE_TITLE_CAPITALIZATION_, value);
        return params;
    }

    /**
     * Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.")
    public static final SubLObject set_use_title_capitalizationP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym105$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :USE-TITLE-CAPITALIZATION? in PARAMS to VALUE.")
    public static SubLObject set_use_title_capitalizationP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym105$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.")
    public static final SubLObject set_add_determiners_before_variablesP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, value);
        return params;
    }

    /**
     * Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.")
    public static SubLObject set_add_determiners_before_variablesP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, value);
        return params;
    }

    /**
     * Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.")
    public static final SubLObject set_add_determiners_before_variablesP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym110$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :ADD-DETERMINERS-BEFORE-VARIABLES? in PARAMS to VALUE.")
    public static SubLObject set_add_determiners_before_variablesP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym110$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.")
    public static final SubLObject set_quantify_variablesP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw114$QUANTIFY_VARIABLES_, value);
        return params;
    }

    /**
     * Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.")
    public static SubLObject set_quantify_variablesP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw114$QUANTIFY_VARIABLES_, value);
        return params;
    }

    /**
     * Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.")
    public static final SubLObject set_quantify_variablesP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym115$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym112$SET_QUANTIFY_VARIABLES__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :QUANTIFY-VARIABLES? in PARAMS to VALUE.")
    public static SubLObject set_quantify_variablesP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym115$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym112$SET_QUANTIFY_VARIABLES__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.")
    public static final SubLObject set_hide_explicit_universalsP_internal_alt(SubLObject params, SubLObject value) {
        SubLTrampolineFile.checkType(value, BOOLEANP);
        SubLTrampolineFile.checkType(params, PPH_MUTABLE_API_PARAMS_P);
        pph_parameter_declaration.set_pph_parameter_value(params, $kw119$HIDE_EXPLICIT_UNIVERSALS_, value);
        return params;
    }

    /**
     * Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.")
    public static SubLObject set_hide_explicit_universalsP_internal(final SubLObject params, final SubLObject value) {
        assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
        assert NIL != nl_generation_api.pph_mutable_api_params_p(params) : "! nl_generation_api.pph_mutable_api_params_p(params) " + ("nl_generation_api.pph_mutable_api_params_p(params) " + "CommonSymbols.NIL != nl_generation_api.pph_mutable_api_params_p(params) ") + params;
        pph_parameter_declaration.set_pph_parameter_value(params, $kw119$HIDE_EXPLICIT_UNIVERSALS_, value);
        return params;
    }

    /**
     * Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.")
    public static final SubLObject set_hide_explicit_universalsP_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject params_form = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            params_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject params = $sym120$PARAMS;
                    return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.
     */
    @LispMethod(comment = "Set value of :HIDE-EXPLICIT-UNIVERSALS? in PARAMS to VALUE.")
    public static SubLObject set_hide_explicit_universalsP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        params_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject params = $sym120$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL);
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject pph_misc_param_p_alt(SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_MISC);
    }

    public static SubLObject pph_misc_param_p(final SubLObject param_name) {
        return eq(pph_parameter_declaration.get_pph_param_type(param_name), $PPH_MISC);
    }

    public static final SubLObject pph_misc_param_list_p_alt(SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_MISC_PARAM_P);
    }

    public static SubLObject pph_misc_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, PPH_MISC_PARAM_P);
    }

    public static SubLObject declare_pph_parameter_declarations_file() {
        declareFunction("set_pph_lexical_context_internal", "SET-PPH-LEXICAL-CONTEXT-INTERNAL", 2, 0, false);
        declareMacro("set_pph_lexical_context", "SET-PPH-LEXICAL-CONTEXT");
        declareFunction("set_pph_semantic_mt_internal", "SET-PPH-SEMANTIC-MT-INTERNAL", 2, 0, false);
        declareMacro("set_pph_semantic_mt", "SET-PPH-SEMANTIC-MT");
        declareFunction("set_pph_background_discourse_internal", "SET-PPH-BACKGROUND-DISCOURSE-INTERNAL", 2, 0, false);
        declareMacro("set_pph_background_discourse", "SET-PPH-BACKGROUND-DISCOURSE");
        declareFunction("set_pph_discourse_contexts_to_update_internal", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE-INTERNAL", 2, 0, false);
        declareMacro("set_pph_discourse_contexts_to_update", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        declareFunction("set_pph_generation_count_internal", "SET-PPH-GENERATION-COUNT-INTERNAL", 2, 0, false);
        declareMacro("set_pph_generation_count", "SET-PPH-GENERATION-COUNT");
        declareFunction("set_pph_agreement_internal", "SET-PPH-AGREEMENT-INTERNAL", 2, 0, false);
        declareMacro("set_pph_agreement", "SET-PPH-AGREEMENT");
        declareFunction("set_pph_sentential_force_internal", "SET-PPH-SENTENTIAL-FORCE-INTERNAL", 2, 0, false);
        declareMacro("set_pph_sentential_force", "SET-PPH-SENTENTIAL-FORCE");
        declareFunction("set_pph_timeout_internal", "SET-PPH-TIMEOUT-INTERNAL", 2, 0, false);
        declareMacro("set_pph_timeout", "SET-PPH-TIMEOUT");
        declareFunction("top_level_pph_api_param_p", "TOP-LEVEL-PPH-API-PARAM-P", 1, 0, false);
        declareFunction("top_level_pph_api_param_list_p", "TOP-LEVEL-PPH-API-PARAM-LIST-P", 1, 0, false);
        declareFunction("set_max_digits_without_comma_internal", "SET-MAX-DIGITS-WITHOUT-COMMA-INTERNAL", 2, 0, false);
        declareMacro("set_max_digits_without_comma", "SET-MAX-DIGITS-WITHOUT-COMMA");
        declareFunction("set_significant_digits_cutoff_internal", "SET-SIGNIFICANT-DIGITS-CUTOFF-INTERNAL", 2, 0, false);
        declareMacro("set_significant_digits_cutoff", "SET-SIGNIFICANT-DIGITS-CUTOFF");
        declareFunction("set_use_indexical_datesP_internal", "SET-USE-INDEXICAL-DATES?-INTERNAL", 2, 0, false);
        declareMacro("set_use_indexical_datesP", "SET-USE-INDEXICAL-DATES?");
        declareFunction("pph_format_param_p", "PPH-FORMAT-PARAM-P", 1, 0, false);
        declareFunction("pph_format_param_list_p", "PPH-FORMAT-PARAM-LIST-P", 1, 0, false);
        declareFunction("set_demerit_cutoff_internal", "SET-DEMERIT-CUTOFF-INTERNAL", 2, 0, false);
        declareMacro("set_demerit_cutoff", "SET-DEMERIT-CUTOFF");
        declareFunction("set_use_smart_variable_replacementP_internal", "SET-USE-SMART-VARIABLE-REPLACEMENT?-INTERNAL", 2, 0, false);
        declareMacro("set_use_smart_variable_replacementP", "SET-USE-SMART-VARIABLE-REPLACEMENT?");
        declareFunction("set_genlpreds_backoff_limit_internal", "SET-GENLPREDS-BACKOFF-LIMIT-INTERNAL", 2, 0, false);
        declareMacro("set_genlpreds_backoff_limit", "SET-GENLPREDS-BACKOFF-LIMIT");
        declareFunction("pph_goodness_param_p", "PPH-GOODNESS-PARAM-P", 1, 0, false);
        declareFunction("pph_goodness_param_list_p", "PPH-GOODNESS-PARAM-LIST-P", 1, 0, false);
        declareFunction("set_prefer_terse_paraphraseP_internal", "SET-PREFER-TERSE-PARAPHRASE?-INTERNAL", 2, 0, false);
        declareMacro("set_prefer_terse_paraphraseP", "SET-PREFER-TERSE-PARAPHRASE?");
        declareFunction("set_maximize_linksP_internal", "SET-MAXIMIZE-LINKS?-INTERNAL", 2, 0, false);
        declareMacro("set_maximize_linksP", "SET-MAXIMIZE-LINKS?");
        declareFunction("pph_precision_param_p", "PPH-PRECISION-PARAM-P", 1, 0, false);
        declareFunction("pph_precision_param_list_p", "PPH-PRECISION-PARAM-LIST-P", 1, 0, false);
        declareFunction("pph_formality_param_p", "PPH-FORMALITY-PARAM-P", 1, 0, false);
        declareFunction("pph_formality_param_list_p", "PPH-FORMALITY-PARAM-LIST-P", 1, 0, false);
        declareFunction("set_use_title_capitalizationP_internal", "SET-USE-TITLE-CAPITALIZATION?-INTERNAL", 2, 0, false);
        declareMacro("set_use_title_capitalizationP", "SET-USE-TITLE-CAPITALIZATION?");
        declareFunction("set_add_determiners_before_variablesP_internal", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?-INTERNAL", 2, 0, false);
        declareMacro("set_add_determiners_before_variablesP", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?");
        declareFunction("set_quantify_variablesP_internal", "SET-QUANTIFY-VARIABLES?-INTERNAL", 2, 0, false);
        declareMacro("set_quantify_variablesP", "SET-QUANTIFY-VARIABLES?");
        declareFunction("set_hide_explicit_universalsP_internal", "SET-HIDE-EXPLICIT-UNIVERSALS?-INTERNAL", 2, 0, false);
        declareMacro("set_hide_explicit_universalsP", "SET-HIDE-EXPLICIT-UNIVERSALS?");
        declareFunction("pph_misc_param_p", "PPH-MISC-PARAM-P", 1, 0, false);
        declareFunction("pph_misc_param_list_p", "PPH-MISC-PARAM-LIST-P", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt5 = list(makeSymbol("PARAMS-FORM"), makeSymbol("VALUE"));

    static private final SubLList $list_alt7 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-LANGUAGE-MT*"), makeKeyword("CHECK-TYPE"), makeSymbol("LEXICAL-CONTEXT-P"), makeKeyword("DOCUMENTATION"), makeString("The context from which to look up lexical information and paraphrase templates."));

    static private final SubLList $list_alt14 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-DOMAIN-MT*"), makeKeyword("CHECK-TYPE"), makeSymbol("HLMT-P"), makeKeyword("DOCUMENTATION"), makeString("The context from which to look up information about the domain of discourse."));

    static private final SubLList $list_alt20 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("TRUE"), makeKeyword("DOCUMENTATION"), makeString("The background discourse for paraphrasing."), makeKeyword("DEFAULT-VALUE-FORM"), NIL);

    static private final SubLList $list_alt25 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("TRUE"), makeKeyword("DOCUMENTATION"), makeString("Discourse contexts that should be updated with information from this paraphrase."), makeKeyword("DEFAULT-VALUE-FORM"), NIL);

    public static SubLObject init_pph_parameter_declarations_file() {
        return NIL;
    }

    public static final SubLObject setup_pph_parameter_declarations_file_alt() {
        register_macro_helper(SET_PPH_LEXICAL_CONTEXT_INTERNAL, SET_PPH_LEXICAL_CONTEXT);
        register_external_symbol(SET_PPH_LEXICAL_CONTEXT);
        {
            SubLObject v_properties = $list_alt7;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_LEXICAL_CONTEXT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
        }
        register_macro_helper(SET_PPH_SEMANTIC_MT_INTERNAL, SET_PPH_SEMANTIC_MT);
        register_external_symbol(SET_PPH_SEMANTIC_MT);
        {
            SubLObject v_properties = $list_alt14;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SEMANTIC_MT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
        }
        register_macro_helper(SET_PPH_BACKGROUND_DISCOURSE_INTERNAL, SET_PPH_BACKGROUND_DISCOURSE);
        register_external_symbol(SET_PPH_BACKGROUND_DISCOURSE);
        {
            SubLObject v_properties = $list_alt20;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_BACKGROUND_DISCOURSE));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
        }
        register_macro_helper(SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL, SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
        register_external_symbol(SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
        {
            SubLObject v_properties = $list_alt25;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_DISCOURSE_CONTEXTS_TO_UPDATE));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
        }
        register_macro_helper(SET_PPH_GENERATION_COUNT_INTERNAL, SET_PPH_GENERATION_COUNT);
        register_external_symbol(SET_PPH_GENERATION_COUNT);
        {
            SubLObject v_properties = $list_alt31;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_GENERATION_COUNT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
        }
        register_macro_helper(SET_PPH_AGREEMENT_INTERNAL, SET_PPH_AGREEMENT);
        register_external_symbol(SET_PPH_AGREEMENT);
        {
            SubLObject v_properties = $list_alt37;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_AGREEMENT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
        }
        register_macro_helper(SET_PPH_SENTENTIAL_FORCE_INTERNAL, SET_PPH_SENTENTIAL_FORCE);
        register_external_symbol(SET_PPH_SENTENTIAL_FORCE);
        {
            SubLObject v_properties = $list_alt43;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SENTENTIAL_FORCE));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
        }
        register_macro_helper(SET_PPH_TIMEOUT_INTERNAL, SET_PPH_TIMEOUT);
        register_external_symbol(SET_PPH_TIMEOUT);
        {
            SubLObject v_properties = $list_alt48;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_TIMEOUT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
        }
        register_macro_helper(SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL, SET_MAX_DIGITS_WITHOUT_COMMA);
        register_external_symbol(SET_MAX_DIGITS_WITHOUT_COMMA);
        {
            SubLObject v_properties = $list_alt55;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($MAX_DIGITS_WITHOUT_COMMA));
            pph_parameter_declaration.validate_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
        }
        register_macro_helper(SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL, SET_SIGNIFICANT_DIGITS_CUTOFF);
        register_external_symbol(SET_SIGNIFICANT_DIGITS_CUTOFF);
        {
            SubLObject v_properties = $list_alt60;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($SIGNIFICANT_DIGITS_CUTOFF));
            pph_parameter_declaration.validate_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
        }
        register_macro_helper($sym61$SET_USE_INDEXICAL_DATES__INTERNAL, $sym62$SET_USE_INDEXICAL_DATES_);
        register_external_symbol($sym62$SET_USE_INDEXICAL_DATES_);
        {
            SubLObject v_properties = $list_alt66;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw64$USE_INDEXICAL_DATES_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
        }
        register_macro_helper(SET_DEMERIT_CUTOFF_INTERNAL, SET_DEMERIT_CUTOFF);
        register_external_symbol(SET_DEMERIT_CUTOFF);
        {
            SubLObject v_properties = $list_alt74;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($DEMERIT_CUTOFF));
            pph_parameter_declaration.validate_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
        }
        register_macro_helper($sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL, $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
        register_external_symbol($sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
        {
            SubLObject v_properties = $list_alt79;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw77$USE_SMART_VARIABLE_REPLACEMENT_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
        }
        register_macro_helper(SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL, SET_GENLPREDS_BACKOFF_LIMIT);
        register_external_symbol(SET_GENLPREDS_BACKOFF_LIMIT);
        {
            SubLObject v_properties = $list_alt85;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($GENLPREDS_BACKOFF_LIMIT));
            pph_parameter_declaration.validate_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
        }
        register_macro_helper($sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL, $sym89$SET_PREFER_TERSE_PARAPHRASE_);
        register_external_symbol($sym89$SET_PREFER_TERSE_PARAPHRASE_);
        {
            SubLObject v_properties = $list_alt92;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw90$PREFER_TERSE_PARAPHRASE_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
        }
        register_macro_helper($sym93$SET_MAXIMIZE_LINKS__INTERNAL, $sym94$SET_MAXIMIZE_LINKS_);
        register_external_symbol($sym94$SET_MAXIMIZE_LINKS_);
        {
            SubLObject v_properties = $list_alt97;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw95$MAXIMIZE_LINKS_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
        }
        register_macro_helper($sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL, $sym103$SET_USE_TITLE_CAPITALIZATION_);
        register_external_symbol($sym103$SET_USE_TITLE_CAPITALIZATION_);
        {
            SubLObject v_properties = $list_alt106;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw104$USE_TITLE_CAPITALIZATION_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
        }
        register_macro_helper($sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL, $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
        register_external_symbol($sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
        {
            SubLObject v_properties = $list_alt111;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
        }
        register_macro_helper($sym112$SET_QUANTIFY_VARIABLES__INTERNAL, $sym113$SET_QUANTIFY_VARIABLES_);
        register_external_symbol($sym113$SET_QUANTIFY_VARIABLES_);
        {
            SubLObject v_properties = $list_alt116;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw114$QUANTIFY_VARIABLES_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
        }
        register_macro_helper($sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL, $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
        register_external_symbol($sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
        {
            SubLObject v_properties = $list_alt121;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw119$HIDE_EXPLICIT_UNIVERSALS_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
        }
        return NIL;
    }

    public static SubLObject setup_pph_parameter_declarations_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(SET_PPH_LEXICAL_CONTEXT_INTERNAL, SET_PPH_LEXICAL_CONTEXT);
            register_external_symbol(SET_PPH_LEXICAL_CONTEXT);
            SubLObject v_properties = $list7;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_LEXICAL_CONTEXT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
            register_macro_helper(SET_PPH_SEMANTIC_MT_INTERNAL, SET_PPH_SEMANTIC_MT);
            register_external_symbol(SET_PPH_SEMANTIC_MT);
            v_properties = $list14;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SEMANTIC_MT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
            register_macro_helper(SET_PPH_BACKGROUND_DISCOURSE_INTERNAL, SET_PPH_BACKGROUND_DISCOURSE);
            register_external_symbol(SET_PPH_BACKGROUND_DISCOURSE);
            v_properties = $list20;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_BACKGROUND_DISCOURSE));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
            register_macro_helper(SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL, SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
            register_external_symbol(SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
            v_properties = $list25;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_DISCOURSE_CONTEXTS_TO_UPDATE));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
            register_macro_helper(SET_PPH_GENERATION_COUNT_INTERNAL, SET_PPH_GENERATION_COUNT);
            register_external_symbol(SET_PPH_GENERATION_COUNT);
            v_properties = $list31;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_GENERATION_COUNT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
            register_macro_helper(SET_PPH_AGREEMENT_INTERNAL, SET_PPH_AGREEMENT);
            register_external_symbol(SET_PPH_AGREEMENT);
            v_properties = $list37;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_AGREEMENT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
            register_macro_helper(SET_PPH_SENTENTIAL_FORCE_INTERNAL, SET_PPH_SENTENTIAL_FORCE);
            register_external_symbol(SET_PPH_SENTENTIAL_FORCE);
            v_properties = $list43;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SENTENTIAL_FORCE));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
            register_macro_helper(SET_PPH_TIMEOUT_INTERNAL, SET_PPH_TIMEOUT);
            register_external_symbol(SET_PPH_TIMEOUT);
            v_properties = $list48;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_TIMEOUT));
            pph_parameter_declaration.validate_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
            register_macro_helper(SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL, SET_MAX_DIGITS_WITHOUT_COMMA);
            register_external_symbol(SET_MAX_DIGITS_WITHOUT_COMMA);
            v_properties = $list55;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($MAX_DIGITS_WITHOUT_COMMA));
            pph_parameter_declaration.validate_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
            register_macro_helper(SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL, SET_SIGNIFICANT_DIGITS_CUTOFF);
            register_external_symbol(SET_SIGNIFICANT_DIGITS_CUTOFF);
            v_properties = $list60;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($SIGNIFICANT_DIGITS_CUTOFF));
            pph_parameter_declaration.validate_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
            register_macro_helper($sym61$SET_USE_INDEXICAL_DATES__INTERNAL, $sym62$SET_USE_INDEXICAL_DATES_);
            register_external_symbol($sym62$SET_USE_INDEXICAL_DATES_);
            v_properties = $list66;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw64$USE_INDEXICAL_DATES_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
            register_macro_helper(SET_DEMERIT_CUTOFF_INTERNAL, SET_DEMERIT_CUTOFF);
            register_external_symbol(SET_DEMERIT_CUTOFF);
            v_properties = $list74;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($DEMERIT_CUTOFF));
            pph_parameter_declaration.validate_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
            register_macro_helper($sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL, $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
            register_external_symbol($sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
            v_properties = $list79;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw77$USE_SMART_VARIABLE_REPLACEMENT_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
            register_macro_helper(SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL, SET_GENLPREDS_BACKOFF_LIMIT);
            register_external_symbol(SET_GENLPREDS_BACKOFF_LIMIT);
            v_properties = $list85;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($GENLPREDS_BACKOFF_LIMIT));
            pph_parameter_declaration.validate_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
            register_macro_helper($sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL, $sym89$SET_PREFER_TERSE_PARAPHRASE_);
            register_external_symbol($sym89$SET_PREFER_TERSE_PARAPHRASE_);
            v_properties = $list92;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw90$PREFER_TERSE_PARAPHRASE_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
            register_macro_helper($sym93$SET_MAXIMIZE_LINKS__INTERNAL, $sym94$SET_MAXIMIZE_LINKS_);
            register_external_symbol($sym94$SET_MAXIMIZE_LINKS_);
            v_properties = $list97;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw95$MAXIMIZE_LINKS_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
            register_macro_helper($sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL, $sym103$SET_USE_TITLE_CAPITALIZATION_);
            register_external_symbol($sym103$SET_USE_TITLE_CAPITALIZATION_);
            v_properties = $list106;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw104$USE_TITLE_CAPITALIZATION_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
            register_macro_helper($sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL, $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
            register_external_symbol($sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
            v_properties = $list111;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
            register_macro_helper($sym112$SET_QUANTIFY_VARIABLES__INTERNAL, $sym113$SET_QUANTIFY_VARIABLES_);
            register_external_symbol($sym113$SET_QUANTIFY_VARIABLES_);
            v_properties = $list116;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw114$QUANTIFY_VARIABLES_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
            register_macro_helper($sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL, $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
            register_external_symbol($sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
            v_properties = $list121;
            v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw119$HIDE_EXPLICIT_UNIVERSALS_));
            pph_parameter_declaration.validate_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
            pph_parameter_declaration.enter_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject v_properties = $list_alt7;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_LEXICAL_CONTEXT));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
            }
            {
                SubLObject v_properties = $list_alt14;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SEMANTIC_MT));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
            }
            {
                SubLObject v_properties = $list_alt20;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_BACKGROUND_DISCOURSE));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
            }
            {
                SubLObject v_properties = $list_alt25;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_DISCOURSE_CONTEXTS_TO_UPDATE));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
            }
            {
                SubLObject v_properties = $list_alt31;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_GENERATION_COUNT));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
            }
            {
                SubLObject v_properties = $list_alt37;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_AGREEMENT));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
            }
            {
                SubLObject v_properties = $list_alt43;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SENTENTIAL_FORCE));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
            }
            {
                SubLObject v_properties = $list_alt48;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_TIMEOUT));
                pph_parameter_declaration.validate_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
            }
            {
                SubLObject v_properties = $list_alt55;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($MAX_DIGITS_WITHOUT_COMMA));
                pph_parameter_declaration.validate_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
            }
            {
                SubLObject v_properties = $list_alt60;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($SIGNIFICANT_DIGITS_CUTOFF));
                pph_parameter_declaration.validate_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
            }
            {
                SubLObject v_properties = $list_alt66;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw64$USE_INDEXICAL_DATES_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt74;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($DEMERIT_CUTOFF));
                pph_parameter_declaration.validate_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
            }
            {
                SubLObject v_properties = $list_alt79;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw77$USE_SMART_VARIABLE_REPLACEMENT_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt85;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($GENLPREDS_BACKOFF_LIMIT));
                pph_parameter_declaration.validate_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
            }
            {
                SubLObject v_properties = $list_alt92;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw90$PREFER_TERSE_PARAPHRASE_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt97;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw95$MAXIMIZE_LINKS_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt106;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw104$USE_TITLE_CAPITALIZATION_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt111;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt116;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw114$QUANTIFY_VARIABLES_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
            }
            {
                SubLObject v_properties = $list_alt121;
                v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw119$HIDE_EXPLICIT_UNIVERSALS_));
                pph_parameter_declaration.validate_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
                pph_parameter_declaration.enter_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
            }
        }
        return NIL;
    }

    public static SubLObject setup_pph_parameter_declarations_file_Previous() {
        register_macro_helper(SET_PPH_LEXICAL_CONTEXT_INTERNAL, SET_PPH_LEXICAL_CONTEXT);
        register_external_symbol(SET_PPH_LEXICAL_CONTEXT);
        SubLObject v_properties = $list7;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_LEXICAL_CONTEXT));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_LEXICAL_CONTEXT, v_properties);
        register_macro_helper(SET_PPH_SEMANTIC_MT_INTERNAL, SET_PPH_SEMANTIC_MT);
        register_external_symbol(SET_PPH_SEMANTIC_MT);
        v_properties = $list14;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SEMANTIC_MT));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SEMANTIC_MT, v_properties);
        register_macro_helper(SET_PPH_BACKGROUND_DISCOURSE_INTERNAL, SET_PPH_BACKGROUND_DISCOURSE);
        register_external_symbol(SET_PPH_BACKGROUND_DISCOURSE);
        v_properties = $list20;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_BACKGROUND_DISCOURSE));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_BACKGROUND_DISCOURSE, v_properties);
        register_macro_helper(SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL, SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
        register_external_symbol(SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
        v_properties = $list25;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_DISCOURSE_CONTEXTS_TO_UPDATE));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
        register_macro_helper(SET_PPH_GENERATION_COUNT_INTERNAL, SET_PPH_GENERATION_COUNT);
        register_external_symbol(SET_PPH_GENERATION_COUNT);
        v_properties = $list31;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_GENERATION_COUNT));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_GENERATION_COUNT, v_properties);
        register_macro_helper(SET_PPH_AGREEMENT_INTERNAL, SET_PPH_AGREEMENT);
        register_external_symbol(SET_PPH_AGREEMENT);
        v_properties = $list37;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_AGREEMENT));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_AGREEMENT, v_properties);
        register_macro_helper(SET_PPH_SENTENTIAL_FORCE_INTERNAL, SET_PPH_SENTENTIAL_FORCE);
        register_external_symbol(SET_PPH_SENTENTIAL_FORCE);
        v_properties = $list43;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_SENTENTIAL_FORCE));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_SENTENTIAL_FORCE, v_properties);
        register_macro_helper(SET_PPH_TIMEOUT_INTERNAL, SET_PPH_TIMEOUT);
        register_external_symbol(SET_PPH_TIMEOUT);
        v_properties = $list48;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($PPH_TIMEOUT));
        pph_parameter_declaration.validate_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($PPH_TIMEOUT, v_properties);
        register_macro_helper(SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL, SET_MAX_DIGITS_WITHOUT_COMMA);
        register_external_symbol(SET_MAX_DIGITS_WITHOUT_COMMA);
        v_properties = $list55;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($MAX_DIGITS_WITHOUT_COMMA));
        pph_parameter_declaration.validate_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($MAX_DIGITS_WITHOUT_COMMA, v_properties);
        register_macro_helper(SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL, SET_SIGNIFICANT_DIGITS_CUTOFF);
        register_external_symbol(SET_SIGNIFICANT_DIGITS_CUTOFF);
        v_properties = $list60;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($SIGNIFICANT_DIGITS_CUTOFF));
        pph_parameter_declaration.validate_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($SIGNIFICANT_DIGITS_CUTOFF, v_properties);
        register_macro_helper($sym61$SET_USE_INDEXICAL_DATES__INTERNAL, $sym62$SET_USE_INDEXICAL_DATES_);
        register_external_symbol($sym62$SET_USE_INDEXICAL_DATES_);
        v_properties = $list66;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw64$USE_INDEXICAL_DATES_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw64$USE_INDEXICAL_DATES_, v_properties);
        register_macro_helper(SET_DEMERIT_CUTOFF_INTERNAL, SET_DEMERIT_CUTOFF);
        register_external_symbol(SET_DEMERIT_CUTOFF);
        v_properties = $list74;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($DEMERIT_CUTOFF));
        pph_parameter_declaration.validate_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($DEMERIT_CUTOFF, v_properties);
        register_macro_helper($sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL, $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
        register_external_symbol($sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
        v_properties = $list79;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw77$USE_SMART_VARIABLE_REPLACEMENT_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
        register_macro_helper(SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL, SET_GENLPREDS_BACKOFF_LIMIT);
        register_external_symbol(SET_GENLPREDS_BACKOFF_LIMIT);
        v_properties = $list85;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($GENLPREDS_BACKOFF_LIMIT));
        pph_parameter_declaration.validate_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($GENLPREDS_BACKOFF_LIMIT, v_properties);
        register_macro_helper($sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL, $sym89$SET_PREFER_TERSE_PARAPHRASE_);
        register_external_symbol($sym89$SET_PREFER_TERSE_PARAPHRASE_);
        v_properties = $list92;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw90$PREFER_TERSE_PARAPHRASE_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
        register_macro_helper($sym93$SET_MAXIMIZE_LINKS__INTERNAL, $sym94$SET_MAXIMIZE_LINKS_);
        register_external_symbol($sym94$SET_MAXIMIZE_LINKS_);
        v_properties = $list97;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw95$MAXIMIZE_LINKS_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw95$MAXIMIZE_LINKS_, v_properties);
        register_macro_helper($sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL, $sym103$SET_USE_TITLE_CAPITALIZATION_);
        register_external_symbol($sym103$SET_USE_TITLE_CAPITALIZATION_);
        v_properties = $list106;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw104$USE_TITLE_CAPITALIZATION_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw104$USE_TITLE_CAPITALIZATION_, v_properties);
        register_macro_helper($sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL, $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
        register_external_symbol($sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
        v_properties = $list111;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
        register_macro_helper($sym112$SET_QUANTIFY_VARIABLES__INTERNAL, $sym113$SET_QUANTIFY_VARIABLES_);
        register_external_symbol($sym113$SET_QUANTIFY_VARIABLES_);
        v_properties = $list116;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw114$QUANTIFY_VARIABLES_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw114$QUANTIFY_VARIABLES_, v_properties);
        register_macro_helper($sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL, $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
        register_external_symbol($sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
        v_properties = $list121;
        v_properties = putf(v_properties, $SETTER, pph_parameter_declaration.pph_parameter_setter_name($kw119$HIDE_EXPLICIT_UNIVERSALS_));
        pph_parameter_declaration.validate_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration($kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
        return NIL;
    }

    static private final SubLList $list_alt31 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("The maximum number of paraphrases to generate."), makeKeyword("DEFAULT-VALUE-FORM"), ONE_INTEGER);

    static private final SubLList $list_alt37 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?"), makeKeyword("DOCUMENTATION"), makeString("Which agreement predicates are preferred for the head of this phrase? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), makeKeyword("DEFAULT-VALUE-FORM"), makeKeyword("DEFAULT"));

    static private final SubLList $list_alt43 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("PPH-FORCE-P"), makeKeyword("DOCUMENTATION"), makeString("What sentential force should be used for paraphrases? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), makeKeyword("DEFAULT-VALUE-FORM"), makeKeyword("DEFAULT"));

    static private final SubLList $list_alt48 = list($TYPE, makeKeyword("TOP-LEVEL"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("After how many seconds should we give up? Granularity is the internal time unit of the image, typically millisecond or microsecond."), makeKeyword("DEFAULT-VALUE-FORM"), list(makeSymbol("POSITIVE-INFINITY")));

    static private final SubLList $list_alt55 = list($TYPE, makeKeyword("PPH-FORMAT"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("max number of digits a number can have and still generate with no commas."), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-MAX-NO-COMMA-LENGTH*"));

    static private final SubLList $list_alt60 = list($TYPE, makeKeyword("PPH-FORMAT"), makeKeyword("CHECK-TYPE"), makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("To how many significant digits should we truncate the display of numbers?"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*"));

    static private final SubLList $list_alt66 = list($TYPE, makeKeyword("PPH-FORMAT"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we use 'yesterday', etc. for dates that we can identify?"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"));

    static private final SubLList $list_alt74 = list(new SubLObject[]{ $TYPE, makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-DEMERIT-CUTOFF*"), makeKeyword("CHECK-TYPE"), makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P"), makeKeyword("DOCUMENTATION"), makeString("What is the worst paraphase quality we should tolerate before returning NIL instead of a string.\nDefault is to consider any string better than nothing.\nSee @xref *PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value."), makeKeyword("DEFAULT-VALUE-FORM"), makeSymbol("*PPH-DEMERIT-CUTOFF*") });

    static private final SubLList $list_alt79 = list($TYPE, makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should the paraphrase code 'intelligently' use NL phrases for variables that look like they need it?"));

    static private final SubLList $list_alt85 = list($TYPE, makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-SEARCH-LIMIT*"), makeKeyword("CHECK-TYPE"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeKeyword("DOCUMENTATION"), makeString("When traversing the genl-preds hierarchy looking for alternative preds with which to paraphrase the input, stop looking after you've looked this many times -- then meaning starts getting lost."));

    static private final SubLList $list_alt92 = list($TYPE, makeKeyword("PPH-PRECISION"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-TERSE-MODE?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we prefer terse paraphrases?"));

    static private final SubLList $list_alt97 = list($TYPE, makeKeyword("PPH-PRECISION"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we link as much of the input CycL to output strings as we can? The tradeoff for this is typically terseness and readability."));

    @Override
    public void declareFunctions() {
        declare_pph_parameter_declarations_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_parameter_declarations_file();
    }

    static private final SubLList $list_alt106 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we capitalize the output like a book, etc., title?"));

    @Override
    public void runTopLevelForms() {
        setup_pph_parameter_declarations_file();
    }

    static {
    }

    static private final SubLList $list_alt111 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Shall we try to put the correct determiner before variables, too?"));

    static private final SubLList $list_alt116 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should the paraphrase code 'intelligently' add quantification for variables that look like they need it?"));

    static private final SubLList $list_alt121 = list($TYPE, makeKeyword("PPH-MISC"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("*PPH-HIDE-EXPLICIT-UNIVERSALS?*"), makeKeyword("CHECK-TYPE"), makeSymbol("BOOLEANP"), makeKeyword("DOCUMENTATION"), makeString("Should we skip the 'For every X, Y, and Z'?"));
}

/**
 * Total time: 212 ms
 */
